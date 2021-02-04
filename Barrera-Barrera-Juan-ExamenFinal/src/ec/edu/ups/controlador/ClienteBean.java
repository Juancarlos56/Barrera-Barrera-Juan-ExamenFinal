package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.ClienteFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class ClienteBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@EJB
	private ClienteFacade ejbCliente;
	
	public ClienteBean() {
		
	}
	
}
