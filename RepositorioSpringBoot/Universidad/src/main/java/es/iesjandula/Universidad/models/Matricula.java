package es.iesjandula.Universidad.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Matricula")
public class Matricula {

	@EmbeddedId
	private MatriculaId matriculaid;
	
	@ManyToOne
	@MapsId("idAlumno")
	@JoinColumn(name = "id_alumno",referencedColumnName = "id")
	private Alumno idAlumno;
	
	@ManyToOne
	@MapsId("idAsignatura")
	@JoinColumn(name = "id_asignatura",referencedColumnName = "id")
	private Asignatura idAsignatura;
	
	@ManyToOne
	@MapsId("idCurso")
	@JoinColumn(name = "id_curso",referencedColumnName = "id")
	private Curso idCurso;
	
}
