package es.iesjandula.BonoLoto.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sorteos {
	
	@Id
	@Column
	private Date fecha;
	
	@Column
	private int numero1;
	
	@Column
	private int numero2;
	
	@Column
	private int numero3;
	
	@Column
	private int numero4;
	
	@Column
	private int numero5;
	
	@Column
	private int numero6;
	
	@Column
	private int numeroComplementario;
	
	@Column
	private int numeroReintegro;
	
}
