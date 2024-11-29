package es.iesjandula.ejercicio5;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class AlumnoAsignaturaId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8812631489042079442L;
	
	private int numMatricula;
	
	private int codigoAsignatura;

}
