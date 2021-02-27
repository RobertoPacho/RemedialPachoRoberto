package ec.edu.ups.remedialPachoRoberto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Autor")
public class Autor {
	@Id
    @Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;

}
