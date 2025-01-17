package es.aad.LaraAlosManuel.Unidad3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Coche 
{
	
	public Coche(Coche coche)
	{
		this.matricula = coche.getMatricula();
		this.modelo = coche.getModelo();
		this.marca = coche.getMarca();
		this.color = coche.getColor();
	}
	
	@Id
	@Column(length = 10)
	private String matricula;
	
	@Column(length = 50)
	private String modelo;
	
	@Column(length = 50)
	private String marca;
	
	@Column(length = 20)
	private String color;
	
	@ManyToOne
	@JoinColumn(name = "cliente_dni")
	private Cliente cliente;

}
