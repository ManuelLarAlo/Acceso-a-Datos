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
public class LibroId 
{
	
	@Column(name = "titulo", length = 100)
	private String titulo;
	
	@Column(name = "autor", length = 50)
	private String autor;

}
