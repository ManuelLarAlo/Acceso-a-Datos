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
public class Region {

	@Id
	@Column(name = "nombre_region")
	private String nombreRegion;
	
	@OneToMany(mappedBy = "region")
	private List<Provincia> provincia;
	
}
