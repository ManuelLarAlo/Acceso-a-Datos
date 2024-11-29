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
public class Localidad {

	@Id
	@Column(name = "codigo_localidad")
	private String codigoLocalidad;
	
	@Column
	private String nombre;

	@ManyToOne
	private Provincia provincia;
	
	@OneToMany(mappedBy = "localidad")
	private List<Empleado> empleado;
	
}
