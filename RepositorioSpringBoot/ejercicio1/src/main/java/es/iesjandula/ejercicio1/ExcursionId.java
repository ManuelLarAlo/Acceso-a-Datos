package es.iesjandula.ejercicio1;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ExcursionId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8255509875091182554L;

	
	@ManyToOne
	@JoinColumns({
	    @JoinColumn(name = "identificador", referencedColumnName = "identificador"),
	    @JoinColumn(name = "año_academico", referencedColumnName = "anyoAcademico")
    })
	private Curso idCurso;
	
	@ManyToOne
    @JoinColumn(name = "empresa_nif", referencedColumnName = "nif")
	private Empresa empresa;
	
	
	
	
	
}
