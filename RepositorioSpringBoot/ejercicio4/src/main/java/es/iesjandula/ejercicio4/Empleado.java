package es.iesjandula.ejercicio4;

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
public class Empleado {

	@Id
	@Column(name = "id_empleado")
	private String idEmpleado;
	
	@Column(name= "dni_empleado")
	private String dniEmpleado;
	
	@Column
	private int telefono;
	
	@Column
	private int salario;
	
	@ManyToOne
	private Localidad localidad;
	
}
