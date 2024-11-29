package es.aad.LaraAlosManuel.Unidad3.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente")
public class Cliente extends Persona{
	
	@Column(length = 100)
	private String direccion;
	
	@Column(length = 15)
	private String telefono;
	
	@OneToMany(mappedBy = "cliente")
	private List<Coche> coches = new ArrayList<>();
	
	@OneToOne(mappedBy = "cliente")
	private Descuento descuento;

}
