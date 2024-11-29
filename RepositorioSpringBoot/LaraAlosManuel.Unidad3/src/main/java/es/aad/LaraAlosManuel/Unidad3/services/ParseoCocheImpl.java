package es.aad.LaraAlosManuel.Unidad3.services;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.aad.LaraAlosManuel.Unidad3.model.Cliente;
import es.aad.LaraAlosManuel.Unidad3.model.Coche;
import es.aad.LaraAlosManuel.Unidad3.model.CocheNuevo;
import es.aad.LaraAlosManuel.Unidad3.repositories.ClienteRepository;
import es.aad.LaraAlosManuel.Unidad3.repositories.CocheNuevoRepository;
import es.aad.LaraAlosManuel.Unidad3.utils.ConcesionarioException;

@Service
public class ParseoCocheImpl implements IParseoCocheNuevo{
	
	@Autowired
	private CocheNuevoRepository cocheNuevoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private IParseoCoche iParseoCoche;
	
	@Override
	public void parseaFichero(Scanner scanner) throws ConcesionarioException {
	
		scanner.nextLine();
		
		while(scanner.hasNextLine())
		{
			String lineaDelFichero = scanner.nextLine();
			String [] lineaDelFicheroTroceado = lineaDelFichero.split(",");
					
			Coche coche = iParseoCoche.parseaFichero(lineaDelFicheroTroceado);
			
			CocheNuevo cocheNuevo = new CocheNuevo(coche);
			Optional<Cliente> optionalCliente = this.clienteRepository.findById(lineaDelFicheroTroceado[4]);
			if(!optionalCliente.isEmpty())
			{
				cocheNuevo.setCliente(optionalCliente.get());
			}
			
			cocheNuevo.setUnidades(Integer.valueOf(lineaDelFicheroTroceado[5]));
		}
		
	}

}
