package es.aad.LaraAlosManuel.Unidad3.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reparaciones")
public class Reparacion {

	@EmbeddedId
	private ReparacionId ReparacionId;
	
    @ManyToOne
    @MapsId("mecanicoDni") 
    @JoinColumn(name = "mecanico_dni")
    private Mecanico mecanico;
	
    @ManyToOne
    @MapsId("cocheMatricula") 
    @JoinColumn(name = "coche_matricula")
    private Coche coche;
	
    @Column(nullable = false)
	private Date fechaReparación;
	
    @Column(nullable = false)
	private String horasArreglo;
	
}

