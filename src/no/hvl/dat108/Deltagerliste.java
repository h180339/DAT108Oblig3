package no.hvl.dat108;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Deltagerliste", urlPatterns = "/deltagerliste")
public class Deltagerliste extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BrukerEAO eao = new BrukerEAO();
        List<Bruker> brukere = eao.hentBrukere();
        request.setAttribute("brukere", brukere);

       request.getRequestDispatcher("WEB-INF/Deltagerliste.jsp").forward(request, response);
    }
}
