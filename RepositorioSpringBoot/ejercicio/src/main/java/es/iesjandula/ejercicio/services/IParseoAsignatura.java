package es.iesjandula.ejercicio.services;

import java.util.Scanner;

import es.iesjandula.ejercicio.utils.UniversidadException;

public interface IParseoAsignatura {

	void parseaFichero(Scanner scanner) throws UniversidadException;

}
