package es.aad.LaraAlosManuel.Unidad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import es.aad.LaraAlosManuel.Unidad3.services.ParseoClientesImpl;
import es.aad.LaraAlosManuel.Unidad3.utils.ConcesionarioException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
    @Transactional
    public void run(String... args) throws ConcesionarioException 
    {
        // Asumiendo que tienes un archivo CSV para el parseo
        File archivo = new File("src/main/resources/archivo.csv");
        try (Scanner scanner = new Scanner(archivo)) {
        	
            ParseoClientesImpl parseoClientesImpl = new ParseoClientesImpl();
            
			// Llamar al método del servicio de parseo, que se ejecutará dentro de una transacción
            parseoClientesImpl.parseaFichero(scanner);
            
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (ConcesionarioException e) {
            
        	String errorMessage = "Error, no se puede parsear";
        	log.error(errorMessage);
        	throw new ConcesionarioException(500, errorMessage);
        }
    }

}
