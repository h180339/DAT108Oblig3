package no.hvl.dat108;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BrukerEAO {
    @PersistenceContext(name = "DeltakerPU")
    private EntityManager em;

    public void leggTilbruker(Bruker s) {
        em.persist(s);
    }
}