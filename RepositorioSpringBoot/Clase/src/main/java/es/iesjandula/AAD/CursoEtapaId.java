package es.iesjandula.AAD;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CursoEtapaId implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1565606519117332299L;
	private int curso;
    private String etapa;


}