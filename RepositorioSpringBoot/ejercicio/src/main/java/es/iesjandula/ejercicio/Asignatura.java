package es.iesjandula.ejercicio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Asignatura {
	
	@Id
	@Column(name = "id", length = 10)
	private Long id;
	
	@Column(name = "creditos")
	private Double creditos;
	
	@Column(name = "cuatrimestre")
	private int cuatrimestre;
	
	@Column(name = "curso")
	private int curso;
	
	@Column(name = "nombre", length = 80)
	private String nombre;
	
	@Column(name = "tipo", length = 45)
	private String tipo;
	
	@ManyToOne
	private Grado idGrado;
	
	@ManyToOne
	private Profesor idProfesor;
	
}
