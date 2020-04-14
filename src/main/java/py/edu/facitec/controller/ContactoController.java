package py.edu.facitec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.facitec.entidad.Contacto;
import py.edu.facitec.repository.ContactoRepository;

@RestController
@CrossOrigin
@RequestMapping({ "/contacto" })
public class ContactoController {

	@Autowired
	private ContactoRepository contactoRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Contacto> getContactos() {
		List<Contacto> lista = contactoRepository.findAll();
		return lista;
	}

	@PostMapping("/guardar")
	public ResponseEntity<Contacto> guardar(@RequestBody Contacto contacto) {
		contacto = contactoRepository.save(contacto);
		return ResponseEntity.ok(contacto);
	}

}
