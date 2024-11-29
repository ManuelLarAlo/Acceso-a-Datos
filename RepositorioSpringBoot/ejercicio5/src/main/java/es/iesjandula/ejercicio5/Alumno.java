package es.iesjandula.ejercicio5;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Alumno {

	@Id
	@Column(name = "num_matricula")
	private int numMatricula;
	
	@Column
	private String nombre;
	
	@Column
	private Date fecha;
	
	@Column
	private int telefono;
}
