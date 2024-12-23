package es.iesjandula.EjerciciobbddAlumno.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.iesjandula.EjerciciobbddAlumno.repositories.AlumnoRepository;
import jakarta.annotation.PostConstruct;

@Service
public class Controller {
	
	@Autowired
	AlumnoRepository alumnoRepository;
	
	@PostConstruct
	public void init()
	{
		System.out.println(this.alumnoRepository.findByNif("55879523Z"));
		System.out.println(this.alumnoRepository.findByNifContaining("1"));
		System.out.println(this.alumnoRepository.findByAprobadoTrue());
		System.out.println(this.alumnoRepository.findByAprobadoFalse());
		System.out.println(this.alumnoRepository.findByEdadOrderByEdadAsc(10));
		System.out.println(this.alumnoRepository.findByTop10ByNifOrderByEdadDesc("50"));
		System.out.println(this.alumnoRepository.findByEdadBetween(15,18));
	}

}
