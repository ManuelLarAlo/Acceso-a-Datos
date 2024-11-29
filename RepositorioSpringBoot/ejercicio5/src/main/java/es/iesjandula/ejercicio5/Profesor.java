package es.iesjandula.ejercicio5;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profesor {

	@Id
	@Column(name = "id_profesor")
	private int idProfesor;
	
	@Column
	private String nif;
	
	@Column
	private String nombre;
	
	@Column
	private String especialidad;
	
	@Column
	private int telefono;
	
	@OneToMany(mappedBy = "profesor")
	private List<Asignatura> asignatura;
	
}
