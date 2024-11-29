package es.iesjandula.ejercicio5;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Asignatura {

	@Id
	@Column(name = "codigo_asignatura")
	private int codigoAsignatura;
	
	@Column
	private String nombre;
	
	@ManyToOne
	private Profesor profesor;
}
