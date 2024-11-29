package es.iesjandula.ejercicioSwager.services;

import java.util.Scanner;

import es.iesjandula.ejercicioSwager.utils.VideoClubException;

public interface IParseoPeliculas {

	void parseaFichero(Scanner scanner) throws VideoClubException;

}
