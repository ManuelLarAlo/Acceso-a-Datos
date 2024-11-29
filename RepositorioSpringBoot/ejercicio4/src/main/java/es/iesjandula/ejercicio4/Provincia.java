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
public class Provincia {

	@Id
	@Column(name = "codigo_provincia")
	private String codigoProvincia;
	
	@Column(name = "nombre_provincia")
	private String nombreProvincia;
	
	@ManyToOne
	private Region region;
	
	@OneToMany(mappedBy = "provincia")
	private List<Localidad> localidad;
	
}
