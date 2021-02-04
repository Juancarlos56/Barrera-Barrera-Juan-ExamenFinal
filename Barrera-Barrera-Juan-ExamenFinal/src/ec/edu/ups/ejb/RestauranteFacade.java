package ec.edu.ups.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Cliente;
import ec.edu.ups.entidades.Restuarante;

/**
 * Session Bean implementation class RestauranteFacade
 */
@Stateless
public class RestauranteFacade extends AbstractFacade<Restuarante>{

	@PersistenceContext(unitName = "Barrera-Barrera-Juan-ExamenFinal")
	private EntityManager em;
	
    public RestauranteFacade() {
    	super(Restuarante.class);
    }

	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

}
