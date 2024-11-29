package es.iesjandula.ejercicio6;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class EmpleadoProyectoId implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6857126617350300096L;

	private String nifEmpleado;
	
	private int codigoProyecto;

}
