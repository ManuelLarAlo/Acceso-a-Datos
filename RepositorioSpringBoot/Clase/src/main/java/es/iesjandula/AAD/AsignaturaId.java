package es.iesjandula.AAD;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class AsignaturaId implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4785852293303715915L;
	int curso;
	String etapa;
	String grupo;
	String nombre;
	
	
}
