package rg.glassfish.samples.entities;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@Stateless
public class CustomerSessionBean {

    @PersistenceContext(unitName = "JPAfirstPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    public List<Customer> getCustomer () {
        return (List<Customer>) em.createNamedQuery("Customer.findAll").getResultList();
    }
    public List<Customer> getCustomer_city (String city) {
        return (List<Customer>) em.createNamedQuery("Customer.findByCity").setParameter("city", city).getResultList();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")Customer.findByCity
    
}
