package es.iesjandula.ejercicioSwager.services;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.iesjandula.ejercicioSwager.models.Peliculas;
import es.iesjandula.ejercicioSwager.repository.PeliculasRepository;
import es.iesjandula.ejercicioSwager.utils.Constants;
import es.iesjandula.ejercicioSwager.utils.VideoClubException;

@Service
public class ParseoPeliculasImpl implements IParseoPeliculas {
	
	@Autowired
	private PeliculasRepository peliculasRepository;
	
	@Override
	public void parseaFichero(Scanner scanner) throws VideoClubException{
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			
			String lineaDelFichero = scanner.nextLine();
			
			String[] lineaDelFicheroTroceada= lineaDelFichero.split(Constants.DELIMITADOR_CSV);
			
			Peliculas peliculas = new Peliculas();
			
			peliculas.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			peliculas.setTitulo(lineaDelFicheroTroceada[1]);
			peliculas.setDuracion(lineaDelFicheroTroceada[2]);
			
			this.peliculasRepository.saveAndFlush(peliculas);
		}
	}
	
	
}
