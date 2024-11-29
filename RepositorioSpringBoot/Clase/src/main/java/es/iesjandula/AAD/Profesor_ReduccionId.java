package es.iesjandula.AAD;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Profesor_ReduccionId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2863918762821989213L;

	private String profesorEmail;
	
	private String reduccionNombre;
	
}
