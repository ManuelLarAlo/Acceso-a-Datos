package es.iesjandula.BonoLoto.RestController;

import java.io.IOException;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import es.iesjandula.BonoLoto.Repositories.SorteosRepository;
import es.iesjandula.BonoLoto.models.Sorteos;

@RestController
public class Controller {
	
	@Autowired
	SorteosRepository sorteosRepository;
	
	@RequestMapping(method = RequestMethod.POST, value = "/sorteos/cargaHistorial")
	public ResponseEntity<?> cargarHistorial (MultipartFile csvFile) throws IOException  
	{
		try 
		{
			String stringContent = new String (csvFile.getBytes());
			
			String[] elementos = stringContent.split(",");
			
			Sorteos sorteo = new Sorteos();
			
			sorteo.setFecha(Date.valueOf(elementos[0]));
			
			sorteo.setNumero1(Integer.valueOf(elementos[1]));
			
			sorteo.setNumero2(Integer.valueOf(elementos[2]));
			
			sorteo.setNumero3(Integer.valueOf(elementos[3]));
			
			sorteo.setNumero4(Integer.valueOf(elementos[4]));
			
			sorteo.setNumero5(Integer.valueOf(elementos[5]));
			
			sorteo.setNumero6(Integer.valueOf(elementos[6]));
			
			sorteo.setNumeroComplementario(Integer.valueOf(elementos[7]));
			
			sorteo.setNumeroReintegro(Integer.valueOf(elementos[8]));
			
			this.sorteosRepository.saveAndFlush(sorteo);
			
			return (ResponseEntity<?>) ResponseEntity.ok();
		} 
		catch (IOException ioExeption) 
		{
			throw new IOException();
		}

	}
	
	@RequestMapping(method = RequestMethod.GET, value="/premios/{numero1}/{numero2}/{numero3}/{numero4}/{numero5}/{numero6}")
	public String premio()
	{
		return null;
		
	}
}
