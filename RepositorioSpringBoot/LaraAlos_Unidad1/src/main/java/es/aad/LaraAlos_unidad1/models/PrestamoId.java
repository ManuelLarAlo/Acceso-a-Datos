package es.aad.LaraAlos_unidad1.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PrestamoId implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "libro_id", length = 100)
	private LibroId libro;
	
	@Column(name = "usuario", length = 100)
	private String usuario;

}
