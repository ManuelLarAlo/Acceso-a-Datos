package es.iesjandula.ejercicio6;

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
public class Departamento {

	@Id
	private int codigo;
	
	@Column
	private String nombre;
	
	@OneToMany(mappedBy = "departamento")
	private List<Empleado> empleado;
	
}
