package es.iesjandula.ejercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.ejercicio.models.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno,Long> {

}
