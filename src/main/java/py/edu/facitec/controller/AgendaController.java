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

import py.edu.facitec.entidad.Agenda;
import py.edu.facitec.entidad.Contacto;
import py.edu.facitec.repository.AgendaRepository;

@RestController
@CrossOrigin
@RequestMapping({ "/agenda" })
public class AgendaController {

	@Autowired
	private AgendaRepository agendaRepository;

	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public List<Agenda> getContactos() {
		List<Agenda> lista = agendaRepository.findAll();
		return lista;
	}

	@PostMapping("/guardar")
	public ResponseEntity<Agenda> guardar(@RequestBody Agenda agenda) {
		agenda = agendaRepository.save(agenda);
		return ResponseEntity.ok(agenda);

	}
}
