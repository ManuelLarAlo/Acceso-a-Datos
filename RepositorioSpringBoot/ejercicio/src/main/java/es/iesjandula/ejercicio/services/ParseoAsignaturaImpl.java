package es.iesjandula.ejercicio.services;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.iesjandula.ejercicio.models.Asignatura;
import es.iesjandula.ejercicio.models.Grado;
import es.iesjandula.ejercicio.models.Profesor;
import es.iesjandula.ejercicio.repository.AsignaturaRepository;
import es.iesjandula.ejercicio.repository.GradoRepository;
import es.iesjandula.ejercicio.repository.ProfesorRepository;
import es.iesjandula.ejercicio.utils.Constants;
import es.iesjandula.ejercicio.utils.UniversidadException;

@Service
public class ParseoAsignaturaImpl implements IParseoAsignatura {

	@Autowired
	private AsignaturaRepository asignaturaRepository;

	@Autowired
	private ProfesorRepository profesorRepository;
	
	@Autowired
	private GradoRepository gradoRepository;
	
	@Override
	public void parseaFichero(Scanner scanner) throws UniversidadException{
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			
			String lineaDelFichero = scanner.nextLine();
			
			String[] lineaDelFicheroTroceada= lineaDelFichero.split(Constants.DELIMITADOR_CSV);
			
			Asignatura asignatura = new Asignatura();
			
			asignatura.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			asignatura.setCreditos(Double.valueOf(lineaDelFicheroTroceada[2]));
			asignatura.setCuatrimestre(Integer.valueOf(lineaDelFicheroTroceada[5]));
			asignatura.setCurso(Integer.valueOf(lineaDelFicheroTroceada[4]));
			asignatura.setNombre(lineaDelFicheroTroceada[1]);
			asignatura.setTipo(lineaDelFicheroTroceada[3]);
			

			Optional<Grado>optionalGrado = this.gradoRepository.findById(Long.valueOf(lineaDelFicheroTroceada[7]));
			if(!optionalGrado.isEmpty()){	
			asignatura.setIdGrado(optionalGrado.get());		
			}
			Optional<Profesor>optionalProfesor = this.profesorRepository.findById(Long.valueOf(lineaDelFicheroTroceada[6]));
			if(!optionalProfesor.isEmpty()) {
			asignatura.setIdProfesor(optionalProfesor.get());
			}
			this.asignaturaRepository.saveAndFlush(asignatura);
		}
	}
	
	
}
