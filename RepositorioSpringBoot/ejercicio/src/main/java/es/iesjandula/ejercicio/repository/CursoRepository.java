package es.iesjandula.ejercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.ejercicio.models.Curso;

public interface CursoRepository extends JpaRepository<Curso,Long> {

}
