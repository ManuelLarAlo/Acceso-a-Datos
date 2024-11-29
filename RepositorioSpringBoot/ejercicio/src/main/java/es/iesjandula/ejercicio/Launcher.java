package es.iesjandula.ejercicio;

import java.io.File;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import es.iesjandula.ejercicio.services.IParseoAlumno;
import es.iesjandula.ejercicio.services.IParseoAsignatura;
import es.iesjandula.ejercicio.services.IParseoCurso;
import es.iesjandula.ejercicio.services.IParseoDepartamento;
import es.iesjandula.ejercicio.services.IParseoGrado;
import es.iesjandula.ejercicio.services.IParseoMatricula;
import es.iesjandula.ejercicio.services.IParseoProfesor;

@SpringBootApplication
public class Launcher implements CommandLineRunner{

	@Autowired
	private IParseoDepartamento iParseoDepartamento;
	
	@Autowired
	private IParseoAlumno iParseoAlumno;
	
	@Autowired
	private IParseoProfesor iParseoProfesor;
	
	@Autowired
	private IParseoAsignatura iParseoAsignatura;
	
	@Autowired
	private IParseoCurso iParseoCurso;
	
	@Autowired
	private IParseoGrado iParseoGrado;
	
	@Autowired
	private IParseoMatricula iParseoMatricula;
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(Launcher.class, args);
	}
	
	@Transactional(readOnly = false)
	public void run(String... args) throws Exception {

		File fileDepartamentos = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"departamento.csv");
		Scanner scannerDepartamentos = new Scanner(fileDepartamentos);
		iParseoDepartamento.parseaFichero(scannerDepartamentos);
		
		File fileAlumno = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"alumno.csv");
		Scanner scannerAlumno = new Scanner(fileAlumno);
		iParseoAlumno.parseaFichero(scannerAlumno);
		
		File fileGrado = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"grado.csv");
		Scanner scannerGrado = new Scanner(fileGrado);
		iParseoGrado.parseaFichero(scannerGrado);
		
		File fileCurso = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"curso.csv");
		Scanner scannerCurso = new Scanner(fileCurso);
		iParseoCurso.parseaFichero(scannerCurso);
		
		File fileProfesor = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"profesor.csv");
		Scanner scannerProfesor = new Scanner(fileProfesor);
		iParseoProfesor.parseaFichero(scannerProfesor);
		
		File fileAsignatura = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"asignatura.csv");
		Scanner scannerAsignatura = new Scanner(fileAsignatura);
		iParseoAsignatura.parseaFichero(scannerAsignatura);
		
		File fileMatricula = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"matricula.csv");
		Scanner scannerMatricula = new Scanner(fileMatricula);
		iParseoMatricula.parseaFichero(scannerMatricula);
		
	}

}
