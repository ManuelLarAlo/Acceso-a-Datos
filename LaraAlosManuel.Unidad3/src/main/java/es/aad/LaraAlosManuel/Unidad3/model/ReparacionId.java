package es.aad.LaraAlosManuel.Unidad3.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ReparacionId {
	
	@Column(name = "coche_matricula", length = 10)
	private String cocheMatricula;
	
	@Column(name = "mecanico_dni", length = 10)
	private String mecanicoDni;
	
	@Column()
	private Date fechaReparacion;

}
