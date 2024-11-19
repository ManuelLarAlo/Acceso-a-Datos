package es.aad.LaraAlosManuel.Unidad3.model;

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
public class ReparacionId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "coche_matricula", nullable = false, length = 10)
    private String cocheMatricula;
	
    @Column(name = "mecanico_dni", nullable = false, length = 10)
    private String mecanicoDni;

}
