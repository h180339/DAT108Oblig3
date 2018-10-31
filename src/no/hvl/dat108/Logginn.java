package no.hvl.dat108;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Logginn", urlPatterns = "/logginn")
public class Logginn extends HttpServlet {

    @EJB
    private BrukerEAO brukerEAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mobil = request.getParameter("mobil");
        String passord = request.getParameter("passord");

            if (PassordUtil.sjekkPassord(passord, brukerEAO.hentBruker(mobil).getPasswordHash())) {
                response.sendRedirect("/deltagerliste");
            } else {
                response.sendRedirect("/logginn");
            }
        }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/Logginn.jsp")
                .forward(request, response);
    }
}
