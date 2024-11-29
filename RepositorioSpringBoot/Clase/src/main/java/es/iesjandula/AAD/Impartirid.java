package es.iesjandula.AAD;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Impartirid implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1955088830609704132L;

	@ManyToOne
	@JoinColumns({
	    @JoinColumn(name = "asignatura_curso", referencedColumnName = "curso"),
	    @JoinColumn(name = "asignatura_etapa", referencedColumnName = "etapa"),
	    @JoinColumn(name = "asignatura_grupo", referencedColumnName = "grupo"),
	    @JoinColumn(name = "asignatura_nombre", referencedColumnName = "nombre")
    })
	private Asignatura asignaturaId;
	
	@ManyToOne
    @JoinColumn(name = "profesor_email", referencedColumnName = "email")
	private Profesor profesor;}
