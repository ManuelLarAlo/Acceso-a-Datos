package es.iesjandula.EjerciciobbddAlumno.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.EjerciciobbddAlumno.models.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
	
	
	List<Alumno> findByNif(String nif);
	
	List<Alumno> findByNifContaining(String nif);
	
	List<Alumno> findByEdadLessThan(Integer edad);
	
	List<Alumno> findByAprobadoTrue();
	
	List<Alumno> findByAprobadoFalse();
	
	List<Alumno> findByNifAndEdad(String nif, Integer edad);
	
	List<Alumno> findByEdadOrderByEdadAsc(Integer edad);
	
	List<Alumno> findByTop10ByNifOrderByEdadDesc(String nif);
	
	List<Alumno> findDistincByNif(String nif);
	
	List<Alumno> findByEdadBetween(Integer edad1, Integer edad2);
	
	
}
