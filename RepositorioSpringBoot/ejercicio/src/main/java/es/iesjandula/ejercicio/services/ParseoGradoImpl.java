package es.iesjandula.ejercicio.services;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.iesjandula.ejercicio.models.Departamento;
import es.iesjandula.ejercicio.models.Grado;
import es.iesjandula.ejercicio.repository.DepartamentoRepository;
import es.iesjandula.ejercicio.repository.GradoRepository;
import es.iesjandula.ejercicio.utils.Constants;
import es.iesjandula.ejercicio.utils.UniversidadException;

@Service
public class ParseoGradoImpl implements IParseoGrado {

	@Autowired
	private GradoRepository gradoRepository;
	
	@Override
	public void parseaFichero(Scanner scanner) throws UniversidadException{
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			
			String lineaDelFichero = scanner.nextLine();
			
			String[] lineaDelFicheroTroceada= lineaDelFichero.split(Constants.DELIMITADOR_CSV);
			
			Grado grado = new Grado();
			
			grado.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			grado.setNombre(lineaDelFicheroTroceada[1]);
			
			this.gradoRepository.saveAndFlush(grado);
		}
	}
	
	
}
