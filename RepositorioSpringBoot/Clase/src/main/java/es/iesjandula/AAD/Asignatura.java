package es.iesjandula.AAD;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Asignatura")
public class Asignatura {

	@EmbeddedId
	private AsignaturaId asignaturaId;
	

	@ManyToOne
    @JoinColumn(name = "departamento_propietario", referencedColumnName = "nombre")
	private Departamento departamentoPropietario;

	@ManyToOne
    @JoinColumn(name = "departamento_receptor", referencedColumnName = "nombre")
	private Departamento departamentoReceptor;
	
	@ManyToOne
    @JoinColumn(name = "bloque_id", referencedColumnName = "id")
	private Bloque bloque;
	
	
}
