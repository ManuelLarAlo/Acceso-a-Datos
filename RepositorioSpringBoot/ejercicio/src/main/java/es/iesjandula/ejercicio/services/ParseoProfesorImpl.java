package es.iesjandula.ejercicio.services;

import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.iesjandula.ejercicio.models.Alumno;
import es.iesjandula.ejercicio.models.Asignatura;
import es.iesjandula.ejercicio.models.Departamento;
import es.iesjandula.ejercicio.models.Grado;
import es.iesjandula.ejercicio.models.Profesor;
import es.iesjandula.ejercicio.repository.AlumnoRepository;
import es.iesjandula.ejercicio.repository.AsignaturaRepository;
import es.iesjandula.ejercicio.repository.DepartamentoRepository;
import es.iesjandula.ejercicio.repository.GradoRepository;
import es.iesjandula.ejercicio.repository.ProfesorRepository;
import es.iesjandula.ejercicio.utils.Constants;
import es.iesjandula.ejercicio.utils.DatesUtil;
import es.iesjandula.ejercicio.utils.UniversidadException;

@Service
public class ParseoProfesorImpl implements IParseoProfesor {
	
	@Autowired
	private ProfesorRepository profesorRepository;
	
	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	@Override
	public void parseaFichero(Scanner scanner) throws UniversidadException{
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			
			String lineaDelFichero = scanner.nextLine();
			
			String[] lineaDelFicheroTroceada= lineaDelFichero.split(Constants.DELIMITADOR_CSV);
			
			Profesor profesor = new Profesor();
			
			profesor.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			profesor.setFecha_nacimiento(DatesUtil.crearFechaDesdeString(lineaDelFicheroTroceada[8]));
			profesor.setApellido1(lineaDelFicheroTroceada[3]);
			profesor.setApellido2(lineaDelFicheroTroceada[4]);
			profesor.setCiudad(lineaDelFicheroTroceada[5]);
			profesor.setDireccion(lineaDelFicheroTroceada[6]);			
			profesor.setNif(lineaDelFicheroTroceada[1]);
			profesor.setNombre(lineaDelFicheroTroceada[2]);
			profesor.setSexo(lineaDelFicheroTroceada[9]);
			profesor.setTelefono(lineaDelFicheroTroceada[7]);
			Optional<Departamento>optionalDepartamento = this.departamentoRepository.findById(Long.valueOf(lineaDelFicheroTroceada[10]));
			if(!optionalDepartamento.isEmpty()) {
			profesor.setIdDepartamento(optionalDepartamento.get());
			}
			this.profesorRepository.saveAndFlush(profesor);
		}
		
	}
	
	
}
