package es.aad.LaraAlos_unidad1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class SuscripcionId 
{
	
	@Column(name = "usuario", length = 100)
	private String usuario;
	
	@Column(name = "revista", length = 100)
	private String revista;
	


}
