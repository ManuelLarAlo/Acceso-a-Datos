package es.iesjandula.ejercicio.services;

import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.iesjandula.ejercicio.models.Alumno;
import es.iesjandula.ejercicio.models.Asignatura;
import es.iesjandula.ejercicio.models.Departamento;
import es.iesjandula.ejercicio.repository.AlumnoRepository;
import es.iesjandula.ejercicio.repository.AsignaturaRepository;
import es.iesjandula.ejercicio.repository.DepartamentoRepository;
import es.iesjandula.ejercicio.repository.GradoRepository;
import es.iesjandula.ejercicio.repository.ProfesorRepository;
import es.iesjandula.ejercicio.utils.Constants;
import es.iesjandula.ejercicio.utils.DatesUtil;
import es.iesjandula.ejercicio.utils.UniversidadException;

@Service
public class ParseoAlumnoImpl implements IParseoAlumno {
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Override
	public void parseaFichero(Scanner scanner) throws UniversidadException{
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			
			String lineaDelFichero = scanner.nextLine();
			
			String[] lineaDelFicheroTroceada= lineaDelFichero.split(Constants.DELIMITADOR_CSV);
			
			Alumno alumno = new Alumno();
			
			alumno.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			alumno.setFecha_nacimiento(DatesUtil.crearFechaDesdeString(lineaDelFicheroTroceada[8]));
			alumno.setApellido1(lineaDelFicheroTroceada[3]);
			alumno.setApellido2(lineaDelFicheroTroceada[4]);
			alumno.setCiudad(lineaDelFicheroTroceada[5]);
			alumno.setDireccion(lineaDelFicheroTroceada[6]);			
			alumno.setNif(lineaDelFicheroTroceada[1]);
			alumno.setNombre(lineaDelFicheroTroceada[2]);
			alumno.setSexo(lineaDelFicheroTroceada[9]);
			alumno.setTelefono(lineaDelFicheroTroceada[7]);
			
			this.alumnoRepository.saveAndFlush(alumno);
		}
	}
	
	
}
