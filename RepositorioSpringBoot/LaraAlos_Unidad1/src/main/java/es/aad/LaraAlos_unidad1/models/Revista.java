package es.aad.LaraAlos_unidad1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "revistas")
public class Revista 
{
	
	@Id
	@Column
	private String titulo;
	
	private String editorial;
	
	private String frecuenciaPublicacion;

}
