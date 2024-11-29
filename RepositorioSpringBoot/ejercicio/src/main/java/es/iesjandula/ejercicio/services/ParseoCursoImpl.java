package es.iesjandula.ejercicio.services;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.iesjandula.ejercicio.repository.DepartamentoRepository;
import es.iesjandula.ejercicio.models.Curso;
import es.iesjandula.ejercicio.models.Departamento;
import es.iesjandula.ejercicio.models.Grado;
import es.iesjandula.ejercicio.repository.CursoRepository;
import es.iesjandula.ejercicio.utils.Constants;
import es.iesjandula.ejercicio.utils.UniversidadException;

@Service
public class ParseoCursoImpl implements IParseoCurso {

	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public void parseaFichero(Scanner scanner) throws UniversidadException{
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			
			String lineaDelFichero = scanner.nextLine();
			
			String[] lineaDelFicheroTroceada= lineaDelFichero.split(Constants.DELIMITADOR_CSV);
			
			Curso curso = new Curso();
			
			curso.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			curso.setAny_inicio(Integer.valueOf(lineaDelFicheroTroceada[1]));
			curso.setAny_fin(Integer.valueOf(lineaDelFicheroTroceada[2]));
			
			this.cursoRepository.saveAndFlush(curso);
		}
	}
	
	
}
