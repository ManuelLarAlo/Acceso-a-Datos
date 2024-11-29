package es.iesjandula.ejercicio.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "grado")
public class Grado {

	@Id
	@Column(name = "id", length = 10)
		private Long id;
	
	
	@Column(name = "nombre", length = 100)
		private String nombre;
	
	
	
}
