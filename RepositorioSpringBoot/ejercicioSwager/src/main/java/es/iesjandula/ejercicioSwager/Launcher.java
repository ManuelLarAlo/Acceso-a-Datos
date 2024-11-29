package es.iesjandula.ejercicioSwager;

import java.io.File;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import es.iesjandula.ejercicioSwager.services.IParseoPeliculas;
import es.iesjandula.ejercicioSwager.services.IParseoUsuarios;
import es.iesjandula.ejercicioSwager.utils.VideoClubException;

@SpringBootApplication
public class Launcher implements CommandLineRunner{


	@Autowired
	private IParseoUsuarios iParseoUsuarios;
	
	@Autowired
	private IParseoPeliculas iParseoPeliculas;
	
	public static void main(String[] args) throws VideoClubException{
		SpringApplication.run(Launcher.class, args);
	}
	
	@Transactional(readOnly = false)
	public void run(String... args) throws Exception {

		
		File fileUsuarios = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"asignatura.csv");
		Scanner scannerUsuarios = new Scanner(fileUsuarios);
		iParseoUsuarios.parseaFichero(scannerUsuarios);
		
		File filePeliculas = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"matricula.csv");
		Scanner scannerPeliculas = new Scanner(filePeliculas);
		iParseoPeliculas.parseaFichero(scannerPeliculas);
		
	}

}
