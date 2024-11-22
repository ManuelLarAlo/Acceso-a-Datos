package es.aad.LaraAlosManuel.Unidad3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.aad.LaraAlosManuel.Unidad3.model.Reparacion;
import es.aad.LaraAlosManuel.Unidad3.model.ReparacionId;

public interface ReparacionRepository extends JpaRepository<Reparacion,ReparacionId> {

}
