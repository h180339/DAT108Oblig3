package no.hvl.dat108;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Paamelding", urlPatterns = "/paamelding")
public class Paamelding extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    private BrukerEAO brukerEAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        paamelingsObjekt skjema = new paamelingsObjekt(request);
        Bruker bruker = new Bruker(request);

        if(skjema.isAllInputGyldig()){

            brukerEAO.leggTilbruker(bruker);
            request.getSession().removeAttribute("skjema");
            response.sendRedirect("/paameldingsBekreftelse");
        }else{
            skjema.settOppFeilmeldinger();

            request.getSession().setAttribute("skjema", skjema);
            response.sendRedirect("/paamelding");
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/Paamelding.jsp")
                .forward(request, response);
    }
}
