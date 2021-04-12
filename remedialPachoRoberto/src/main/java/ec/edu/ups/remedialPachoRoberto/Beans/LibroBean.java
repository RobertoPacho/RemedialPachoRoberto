/**
 * 
 */
package ec.edu.ups.remedialPachoRoberto.Beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ec.edu.ups.remedialPachoRoberto.ON.LibroON;
import ec.edu.ups.remedialPachoRoberto.modelo.Autor;
import ec.edu.ups.remedialPachoRoberto.modelo.Categoria;
import ec.edu.ups.remedialPachoRoberto.modelo.Libro;


/**
 * @author RobertoPacho
 *
 */
@Named
@RequestScoped
public class LibroBean {
	@Inject
	private LibroON libroON;
	
	@Inject
	private Libro libro;
	
	private String nombre;
	private String nombrea;
	private String categoria;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getNombrea() {
		return nombrea;
	}

	public void setNombrea(String nombrea) {
		this.nombrea = nombrea;
	}

	public List<String> categorias() throws Exception{
		List<Categoria> listac=libroON.listaCategoria();
		List<String> categorias=new ArrayList<>();
		categorias.add(listac.get(0).getTipo());
		categorias.add(listac.get(1).getTipo());
		return categorias;
	}
	
	

	public List<String> autores() throws Exception{
		List<Autor> listac=libroON.listaAutor();
		List<String> categorias=new ArrayList<>();
		categorias.add(listac.get(0).getNombre());
		categorias.add(listac.get(1).getNombre());
		return categorias;
	}
	
	
	
	public String guardar() throws Exception {
		libro.setId(1);
		libro.setNombre(nombre);
		
		
		
		return null;
	}

}
