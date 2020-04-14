package py.edu.facitec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.facitec.entidad.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
