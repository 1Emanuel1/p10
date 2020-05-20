
package org.glassfish.samples.entities;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MicroMarketSessionBean {

    @PersistenceContext(unitName = "JPAfirstPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    public List<MicroMarket> getMicroMarket () {
        return (List<MicroMarket>) em.createNamedQuery("MicroMarket.findAll").getResultList();
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
