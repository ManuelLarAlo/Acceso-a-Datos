package es.aad.LaraAlosManuel.Unidad3.services;

import java.util.Scanner;

import es.aad.LaraAlosManuel.Unidad3.utils.ConcesionarioException;

public interface IParseoClientes {
	
	void parseaFichero(Scanner scanner) throws ConcesionarioException;

}
