package es.iesjandula.ejercicio1;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Alumno {

	@Id
	private String dni;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@ManyToOne
	private Curso curso;
}
