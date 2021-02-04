package ec.edu.ups.controlador;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.ClienteFacade;
import ec.edu.ups.ejb.ReservaFacade;
import ec.edu.ups.entidades.Cliente;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class ReservaBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@EJB
	private ReservaFacade ejbReserva;
	@EJB
	private ClienteFacade ejbCliente;
	
	private String nombre;
	private String apellido;
    private String direccion;
    private String telefono;
    private String cedula;
    private String correo;
    private String password;
    private Cliente cliente; 
    
   
	public ReservaBean() {
		
	}
	
	 public void buscarPersonaCedulaCliente() {
	    	cliente = ejbCliente.buscarPorCedula(cedula);
	    	System.out.println("Cliente: ");
	    	if (cliente != null) {
	    		this.setNombre(cliente.getNombre());
		    	this.setApellido(cliente.getApellido());
		    	this.setDireccion(cliente.getDireccion());
		    	this.setTelefono(cliente.getTelefono());
		    	this.setCorreo(cliente.getCorreo());
			}else {
				System.out.println("Cedula: "+cedula);
				
			}
	    	
	 }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	 
	 
	
}
