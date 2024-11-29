package es.iesjandula.ejercicio6;

import java.sql.Date;

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
public class Empleado {

	@Id
	private String nif;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column(name = "fecha de nacimiento")
	private Date fechaNacimiento;
	
	@Column
	private int telefono;
	
	@Column
	private String titulacion;
	
	@ManyToOne
	private Departamento departamento;
}
