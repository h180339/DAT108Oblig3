package no.hvl.dat108;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class BrukerEAO {
    @PersistenceContext(name = "DeltakerPU")
    private EntityManager em;

    public void leggTil(Bruker b) {
        em.persist(b);
    }
}