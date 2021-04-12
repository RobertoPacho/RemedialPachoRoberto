/**
 * 
 */
package ec.edu.ups.remedialPachoRoberto.ON;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.remedialPachoRoberto.Dao.LibroDAO;
import ec.edu.ups.remedialPachoRoberto.modelo.Autor;
import ec.edu.ups.remedialPachoRoberto.modelo.Categoria;
import ec.edu.ups.remedialPachoRoberto.modelo.Libro;

/**
 * @author RobertoPacho
 *
 */
@Stateless
public class LibroON {
	@Inject
	private LibroDAO libroDAO;
	
	public boolean insert(Libro libro) throws SQLException {
		return libroDAO.insert(libro);
	}
	
	public List<Autor> listaAutor() throws Exception {
		
		return libroDAO.findAutor();
	}
	
	public List<Categoria> listaCategoria() throws Exception {
		
		return libroDAO.findCategorias();
	}

}
