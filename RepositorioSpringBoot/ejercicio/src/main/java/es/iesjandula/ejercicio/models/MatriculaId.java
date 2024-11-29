package es.iesjandula.ejercicio.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class MatriculaId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long idAlumno ;
	
	private Long idAsignatura ;
	
	private Long idCurso ;

	
	


}
