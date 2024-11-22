package es.aad.LaraAlosManuel.Unidad3.model;

import jakarta.persistence.Column;
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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reparaciones")
public class Reparacion {
	
	@EmbeddedId
	private ReparacionId ReparacionId;
	
    @Column(nullable = false)
	private String horasArreglo;
    
    @ManyToOne
    @MapsId("mecanicoDni")
    @JoinColumn(name = "mecanico_dni")
    private Mecanico mecanico;
    
    @ManyToOne
    @MapsId("clienteDni")
    @JoinColumn(name = "coche_matricula")
    private Cliente cliente;

}
