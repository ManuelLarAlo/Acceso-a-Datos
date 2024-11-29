package es.iesjandula.ejercicio.services;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.iesjandula.ejercicio.models.Departamento;
import es.iesjandula.ejercicio.repository.DepartamentoRepository;
import es.iesjandula.ejercicio.utils.Constants;
import es.iesjandula.ejercicio.utils.UniversidadException;

@Service
public class ParseoDepartamentoImpl implements IParseoDepartamento {

	@Autowired
	private DepartamentoRepository departamentoRepository;
	
	@Override
	public void parseaFichero(Scanner scanner) throws UniversidadException{
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			
			String lineaDelFichero = scanner.nextLine();
			
			String[] lineaDelFicheroTroceada= lineaDelFichero.split(Constants.DELIMITADOR_CSV);
			
			Departamento departamento = new Departamento();
			
			departamento.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			departamento.setNombre(lineaDelFicheroTroceada[1]);
			
			this.departamentoRepository.saveAndFlush(departamento);
		}
	}
	
	
}
