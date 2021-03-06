package ec.edu.ups.remedialPachoRoberto.Dao;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.remedialPachoRoberto.modelo.Autor;
import ec.edu.ups.remedialPachoRoberto.modelo.Categoria;
import ec.edu.ups.remedialPachoRoberto.modelo.Libro;



@Stateless
public class LibroDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public boolean insert(Libro libro) throws SQLException {
		em.persist(libro);
		return true;
	}
	
	public List<Categoria> findCategorias() throws Exception {
		String jpql="Select c from Categoria c";
		Query q = em.createQuery(jpql,Categoria.class);
		return (List<Categoria>) q.getResultList();
	}
	
	public List<Autor> findAutor() throws Exception {
		String jpql="Select a from Autor a";
		Query q = em.createQuery(jpql,Autor.class);
		return (List<Autor>) q.getResultList();
	}


}
