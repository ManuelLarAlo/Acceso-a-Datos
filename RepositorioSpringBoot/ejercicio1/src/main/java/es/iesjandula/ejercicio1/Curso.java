package es.iesjandula.ejercicio1;

import java.util.List;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curso {

	@EmbeddedId
	private CursoId cursoId;
	
	@OneToMany(mappedBy = "curso")
	private List<Alumno> alumno;
	
}
