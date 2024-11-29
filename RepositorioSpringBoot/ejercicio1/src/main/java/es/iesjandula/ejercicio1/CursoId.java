package es.iesjandula.ejercicio1;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CursoId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 962558627164214233L;

	private String identificador;
	
	private Date anyoAcademico;
	
}
