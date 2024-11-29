package es.iesjandula.ejercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.ejercicio.models.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento,Long> {

}
