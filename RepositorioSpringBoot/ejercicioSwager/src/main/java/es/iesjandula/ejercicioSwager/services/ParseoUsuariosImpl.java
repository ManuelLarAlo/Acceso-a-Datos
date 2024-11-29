package es.iesjandula.ejercicioSwager.services;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.iesjandula.ejercicioSwager.models.Usuarios;
import es.iesjandula.ejercicioSwager.repository.UsuarioRepository;
import es.iesjandula.ejercicioSwager.utils.Constants;
import es.iesjandula.ejercicioSwager.utils.VideoClubException;

@Service
public class ParseoUsuariosImpl implements IParseoUsuarios {

	@Autowired
	private UsuarioRepository usuariosRepository;
	
	@Override
	public void parseaFichero(Scanner scanner) throws VideoClubException{
		scanner.nextLine();
		
		while(scanner.hasNextLine()) {
			
			String lineaDelFichero = scanner.nextLine();
			
			String[] lineaDelFicheroTroceada= lineaDelFichero.split(Constants.DELIMITADOR_CSV);
			
			Usuarios usuario = new Usuarios();
			
			usuario.setId(Long.valueOf(lineaDelFicheroTroceada[0]));
			usuario.setNombre(lineaDelFicheroTroceada[1]);
			
			this.usuariosRepository.saveAndFlush(usuario);
		}
	}
	
	
}
