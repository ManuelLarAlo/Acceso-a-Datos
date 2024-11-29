package es.iesjandula.ejercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.ejercicio.models.Matricula;
import es.iesjandula.ejercicio.models.MatriculaId;

public interface MatriculaRepository extends JpaRepository<Matricula,MatriculaId>{

}
