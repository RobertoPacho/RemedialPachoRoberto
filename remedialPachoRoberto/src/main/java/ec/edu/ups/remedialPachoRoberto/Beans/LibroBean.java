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


/**
 * @author RobertoPacho
 *
 */
@Named
@RequestScoped
public class LibroBean {
	@Inject
	private LibroON libroON;
	
	private String nombre;
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





	public List<String> categorias() throws Exception{
		
		List<Categoria>  cat=libroON.listaCategoria();
		System.out.print("hay " +cat.get(0).getTipo());
		List<String> rol=new ArrayList<String>();
		for(int i=0; i>=cat.size();i++) {
			rol.add(cat.get(i).getTipo());
			
		}
		
		return rol;
	}
	
	public String pruba() throws Exception {
		List<Autor>  cat=libroON.listaAutor();
		System.out.print("Autores " +cat.toString());
		for(int i=0;i>=cat.size();i++) {
			System.out.print("sdjshdjhsdhs "+cat.get(i).getNombre());
		}
		return null;
	}

}
