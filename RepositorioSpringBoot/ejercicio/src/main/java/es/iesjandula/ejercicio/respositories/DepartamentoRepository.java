package es.iesjandula.ejercicio.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.ejercicio.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{
	
}
