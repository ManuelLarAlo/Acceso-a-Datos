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
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "clientes")
public class Cliente extends Persona {
	
	@Column(nullable = false, length = 100)
	private String dirección;
	
	@Column(nullable = false, length = 15)
	private String teléfono;
	
    @OneToMany(mappedBy = "cliente")
    private List<Coche> coches = new ArrayList<>();
	
    @OneToOne(mappedBy = "cliente")
    private Descuento descuento;
}
