package no.hvl.dat108;
import javax.servlet.http.HttpServletRequest;


public class paamelingsObjekt {
    private String fornavn;
    private String etternavn;
    private String mobil;
    private String kjonn;
    private String passord;
    private String gjenntattPassord;

    public paamelingsObjekt(HttpServletRequest request) {
        this.fornavn = request.getParameter("fornavn");
        this.etternavn = request.getParameter("etternavn");
        this.mobil = request.getParameter("mobil");
        this.kjonn = request.getParameter("kjoenn");
        this.passord = request.getParameter("passord");
        this.gjenntattPassord = request.getParameter("passordRepetert");
    }


    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getMobil() {
        return mobil;
    }

    public String getKjonn() {
        return kjonn;
    }

    public String getPassord() {
        return passord;
    }

    public String getGjenntattPassord() {
        return gjenntattPassord;
    }

    public boolean isAllInputGyldig() {
        return true;
    }

}
