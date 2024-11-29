package es.iesjandula.ejercicio1;

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
public class Empresa {

	@Id
	private String nif;
	
	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@OneToMany(mappedBy = "empresa")
	private List<Evento> evento;
}
