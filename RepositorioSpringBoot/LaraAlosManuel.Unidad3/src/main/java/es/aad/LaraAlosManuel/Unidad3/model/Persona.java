package es.aad.LaraAlosManuel.Unidad3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Persona {
	
	@Id
	@Column(length = 8)
	private String dni;
	
	@Column(length = 50)
	private String nombre;
	
	@Column(length = 100)
	private String apellidos;

}
