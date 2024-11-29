package es.iesjandula.ejercicio.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "profesor")
public class Profesor {

	@Id
	@Column(name = "id", length = 10)
		private Long id;
	
	@Column(name = "fecha_nacimiento", nullable = false)
		private Date fecha_nacimiento;
	
	@Column(name = "apellido1", length = 100)
		private String apellido1;
	
	@Column(name = "apellido2", length = 100)
		private String apellido2;
	
	@Column(name = "ciudad", length = 100)
		private String ciudad;
	
	@Column(name = "direccion", length = 100)
		private String direccion;
	
	@Column(name = "nif", length = 10)
		private String nif;
	
	@Column(name = "nombre", length = 100)
		private String nombre;
	
	@Column(name = "sexo", length = 100)
		private String sexo;
	
	@Column(name = "telefono", length = 100)
		private String telefono;
	
	@ManyToOne
	private Departamento idDepartamento;
	
}
