package es.iesjandula.ejercicio.controller;

import java.io.FileNotFoundException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.iesjandula.ejercicio.utils.UniversidadException;

@RestController
@Service
public class Controller {
	
	@RequestMapping(method = RequestMethod.POST, value="/Universidad/Matriculas/{alumnoId}/{cursoId}/{asignaturaId}")
	public ResponseEntity<?> crearMatricula(@PathVariable(value="alumnoId") Integer alumnoId,
											@PathVariable(value="cursoId") Integer cursoId,
											@PathVariable(value="asignaturaId") Integer asignaturaId) 
	{
		try
		{
			this.matriculaService.insertarMatricula(alumnoId, asignaturaId, cursoId);
			return ResponseEntity.ok().build();	
		}
		catch (UniversidadException universidadException)
		{
			return ResponseEntity.status(400).body(universidadException.getBodyExceptionMessage());
		}
		catch (FileNotFoundException fileNotFoundException)
		{
			
		}

		
	}

}