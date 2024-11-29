package es.iesjandula.ejercicio.services;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.iesjandula.ejercicio.models.Alumno;
import es.iesjandula.ejercicio.models.Asignatura;
import es.iesjandula.ejercicio.models.Curso;
import es.iesjandula.ejercicio.models.Departamento;
import es.iesjandula.ejercicio.models.Grado;
import es.iesjandula.ejercicio.models.Matricula;
import es.iesjandula.ejercicio.models.Profesor;
import es.iesjandula.ejercicio.repository.AlumnoRepository;
import es.iesjandula.ejercicio.repository.AsignaturaRepository;
import es.iesjandula.ejercicio.repository.CursoRepository;
import es.iesjandula.ejercicio.repository.DepartamentoRepository;
import es.iesjandula.ejercicio.repository.GradoRepository;
import es.iesjandula.ejercicio.repository.MatriculaRepository;
import es.iesjandula.ejercicio.repository.ProfesorRepository;
import es.iesjandula.ejercicio.utils.Constants;
import es.iesjandula.ejercicio.utils.UniversidadException;

@Service
public class ParseoMatriculaImpl implements IParseoMatricula {

	@Autowired
	private MatriculaRepository matriculaRepository;

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public void parseaFichero(Scanner scanner) throws UniversidadException{
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			
			String lineaDelFichero = scanner.nextLine();
			
			String[] lineaDelFicheroTroceada= lineaDelFichero.split(Constants.DELIMITADOR_CSV);
			
			Matricula matricula = new Matricula();

			Optional<Alumno>optionalAlumno = this.alumnoRepository.findById(Long.valueOf(lineaDelFicheroTroceada[0]));
			if(!optionalAlumno.isEmpty()){	
			matricula.setIdAlumno(optionalAlumno.get());		
			}
			Optional<Asignatura>optionalAsignatura = this.asignaturaRepository.findById(Long.valueOf(lineaDelFicheroTroceada[1]));
			if(!optionalAsignatura.isEmpty()) {
			matricula.setIdAsignatura(optionalAsignatura.get());
			}
			Optional<Curso>optionalCurso = this.cursoRepository.findById(Long.valueOf(lineaDelFicheroTroceada[2]));
			if(!optionalCurso.isEmpty()) {
			matricula.setIdCurso(optionalCurso.get());
			}
			this.matriculaRepository.saveAndFlush(matricula);
		}
	}
	
	
}
