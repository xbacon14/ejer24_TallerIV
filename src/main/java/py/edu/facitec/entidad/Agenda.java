package py.edu.facitec.entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Agenda extends General {

	private String usuario;

	@OneToMany(mappedBy = "agenda")
	@JsonManagedReference(value = "CA")
	private List<Contacto> contacto;

	public List<Contacto> getContacto() {
		return contacto;
	}

	public void setContacto(List<Contacto> contacto) {
		this.contacto = contacto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Agenda [usuario=" + usuario + "]";
	}

}
