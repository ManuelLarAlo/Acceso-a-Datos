package es.aad.LaraAlos_unidad1.models;

import java.sql.Date;

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
@Table(name = "suscripciones")
public class Suscripcion 
{
	
	@EmbeddedId
	private SuscripcionId suscripcionId;
	
    @Column()
	private Date fechaInicio;
    
    @Column()
	private String estado;
    
    @ManyToOne
    @MapsId("usuario")
    @JoinColumn(name = "usuario")
    private Usuario usuario;
    
    @ManyToOne
    @MapsId("revista")
    @JoinColumn(name = "revista")
    private Revista revista;
    


}
