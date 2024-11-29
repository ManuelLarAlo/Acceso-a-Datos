package es.iesjandula.ejercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.ejercicio.models.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor,Long> {

}
