package es.aad.LaraAlosManuel.Unidad3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "coche_nuevo")
public class CocheNuevo extends Coche {
	
	public CocheNuevo(Coche coche)
	{
		super(coche);
	}
	
	@Column()
	private int unidades;

}
