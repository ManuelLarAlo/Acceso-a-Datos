package es.iesjandula.AAD;

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
public class Profesor {

	@Id
	private String email;
	
	@Column(length = 100,nullable = false)
	private String nombre;
	
	@Column(length = 100,nullable = false)
	private String apellidos;
	
	@ManyToOne
	private Departamento departamento;
	
	@OneToMany(mappedBy = "profesor")
	private List<Profesor_Reduccion>profesorReduccion;
}
