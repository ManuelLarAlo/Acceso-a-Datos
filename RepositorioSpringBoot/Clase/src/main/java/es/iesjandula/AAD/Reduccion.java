package es.iesjandula.AAD;

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
public class Reduccion {

	@Id
	@Column(length = 100)
	private String nombre;
	
	private int horas;
	
	@Column
	private boolean direccion;
	
	@OneToMany(mappedBy = "reduccion")
	private List<Profesor_Reduccion> profesorReduccion;
}
