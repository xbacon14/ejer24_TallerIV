package py.edu.facitec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.facitec.entidad.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Long> {

}
