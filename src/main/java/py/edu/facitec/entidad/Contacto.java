package py.edu.facitec.entidad;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Contacto extends General {

	private String nombre;
	private Integer numero;

	@ManyToOne
	@JsonBackReference(value = "CA")
	private Agenda agenda;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", numero=" + numero + "]";
	}

}
