package ec.edu.ups.remedialPachoRoberto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Categoria")
public class Categoria {
	@Id
    @Column(name = "id")
	private int id;
	
	@Column(name = "tipo")
	private String tipo;

}
