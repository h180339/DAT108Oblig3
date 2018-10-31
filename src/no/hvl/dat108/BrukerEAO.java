package no.hvl.dat108;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class BrukerEAO {
    @PersistenceContext(name = "DeltakerPU")
    private EntityManager em;

    public void leggTilbruker(Bruker s) {
        em.persist(s);
    }

    public Bruker hentBruker(String mobil) {
        return em.find(Bruker.class, mobil);
    }

    public List<Bruker> hentBrukere() {
        return em.createQuery("SELECT b FROM Brukere b").getResultList();
    }
}