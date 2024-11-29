package es.iesjandula.ejercicio5;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AlumnoAsignatura {

	@EmbeddedId
	private AlumnoAsignaturaId alumnoAsignatura;
	
	@ManyToOne
	@JoinColumn(name = "num_matricula",referencedColumnName = "num_matricula")
	@MapsId("numMatricula")
	private Alumno numMatricula;
	
	@ManyToOne
	@JoinColumn(name = "codigo_asignatura",referencedColumnName = "codigo_asignatura")
	@MapsId("codigoAsignatura")
	private Asignatura codigoAsignatura;
	
	@Column
	private int curso;
	
}
