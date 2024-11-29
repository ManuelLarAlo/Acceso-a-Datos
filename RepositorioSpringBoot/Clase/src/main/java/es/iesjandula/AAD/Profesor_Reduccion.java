package es.iesjandula.AAD;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profesor_Reduccion {

	@EmbeddedId
	private Profesor_ReduccionId profesor_reduccionid;
	
	@ManyToOne
	@MapsId("profesorEmail")
    @JoinColumn(name = "profesor_email", referencedColumnName = "email")
	private Profesor profesor;
	
	@ManyToOne
	@MapsId("reduccionNombre")
    @JoinColumn(name = "reduccion_nombre", referencedColumnName = "nombre")
	private Reduccion reduccion;
}
