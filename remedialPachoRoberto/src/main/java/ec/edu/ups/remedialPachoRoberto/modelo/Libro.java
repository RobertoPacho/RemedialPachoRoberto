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
	
	

}
