package es.aad.LaraAlosManuel.Unidad3.services;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.aad.LaraAlosManuel.Unidad3.model.Cliente;
import es.aad.LaraAlosManuel.Unidad3.model.Coche;
import es.aad.LaraAlosManuel.Unidad3.model.Descuento;
import es.aad.LaraAlosManuel.Unidad3.repositories.ClienteRepository;
import es.aad.LaraAlosManuel.Unidad3.repositories.CocheRepository;
import es.aad.LaraAlosManuel.Unidad3.repositories.DescuentoRepository;
import es.aad.LaraAlosManuel.Unidad3.utils.ConcesionarioException;
import es.aad.LaraAlosManuel.Unidad3.utils.Constants;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ParseoClientesImpl implements IParseoClientes 
{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private CocheRepository cocheRepository;
	
	@Autowired
	private DescuentoRepository descuentoRepository;

	@Override
	public void parseaFichero(Scanner scanner) throws ConcesionarioException 
	{
		scanner.nextLine();
		
		while(scanner.hasNextLine())
		{
			String lineaDelFichero = scanner.nextLine();
			
			String[] lineaDelFicheroTroceada = lineaDelFichero.split(Constants.DELIMITADOR_CSV);
			
			Cliente cliente = new Cliente();
			
			cliente.setDni(lineaDelFicheroTroceada[0]);
			cliente.setNombre(lineaDelFicheroTroceada[1]);
			cliente.setApellidos(lineaDelFicheroTroceada[3]);
			cliente.setDireccion(lineaDelFicheroTroceada[4]);
			cliente.setTelefono(lineaDelFicheroTroceada[5]);
			
	        String[] cocheIds = lineaDelFicheroTroceada[6].split(","); // Supongamos que están separados por comas
	        List<Coche> coches = cocheRepository.findAllById(List.of(cocheIds));
	        cliente.setCoches(coches);
			
	        
	        Long idDescuento = Long.parseLong(lineaDelFicheroTroceada[7]); // Si el id es Long
	        Optional<Descuento> optionalDescuento = descuentoRepository.findById(idDescuento);
	        
	        if (optionalDescuento.isEmpty())
	        {
	        	String Error = "Error";
	        	
	        	log.error(Error);
	        	
	        	throw new ConcesionarioException(400,Error);
	        	
	        }
	        cliente.setDescuento(optionalDescuento.get()); 
			
			this.clienteRepository.saveAndFlush(cliente);

		}
	}

}
