package es.iesjandula.ejercicio6;

import java.sql.Date;

import jakarta.persistence.Column;
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
public class EmpleadoProyecto {

	@EmbeddedId
	private EmpleadoProyectoId empleadoProyectoId;
	
	@ManyToOne
	@JoinColumn(name = "nif_empleado",referencedColumnName = "nif")
	@MapsId("nifEmpleado")
	private Empleado empleado;
	
	@ManyToOne
	@JoinColumn(name = "codigo_proyecto",referencedColumnName = "codigo")
	@MapsId("codigoProyecto")
	private Proyecto proyecto;
	
	@Column
	private Date fechaIncorporacion;
	
	@Column
	private String funcionesCoordinacion;
	
}
