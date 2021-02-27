/**
 * 
 */
package ec.edu.ups.remedialPachoRoberto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author RobertoPacho
 *
 */
@Entity
@Table(name = "Libro")
public class Libro {
	@Id
    @Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
	private Autor autor;
	
	@ManyToOne
	private Categoria categoria;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	} 
	
	

}
