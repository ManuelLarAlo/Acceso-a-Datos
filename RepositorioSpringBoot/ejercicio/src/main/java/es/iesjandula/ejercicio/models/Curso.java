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
@Table(name = "curso")
public class Curso {
	
	@Id
	@Column(name = "id", length = 10)
	private Long id;
	
	@Column(name = "any_inicio")
	private int any_inicio;
	
	@Column(name = "any_fin")
	private int any_fin;
	
	
	

}
