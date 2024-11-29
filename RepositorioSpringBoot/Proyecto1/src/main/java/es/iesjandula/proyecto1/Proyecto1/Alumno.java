package es.iesjandula.proyecto1.Proyecto1;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Alumno {
	
	@Id
	private String dni;
	
	private String nombre;
	private String apellidos;

}
