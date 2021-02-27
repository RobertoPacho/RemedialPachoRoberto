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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", tipo=" + tipo + "]";
	}
	
	

}
