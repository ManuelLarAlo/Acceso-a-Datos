package es.iesjandula.Universidad.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class MatriculaId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7764851841123129557L;

	
	private Long idAlumno;
	
	private Long idAsignatura;
	
	private Long idCurso;
	
}
