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
@Table(name = "prestamos")
public class Prestamo 
{
	
	@EmbeddedId
	private PrestamoId prestamoId;
	
    @Column()
	private Date fechaPrestamo;
    
    @Column()
	private Date fechaDevolucion;
    
    @Column()
	private String estado;
    
   @ManyToOne 
    @MapsId("libros")
    @JoinColumn(name = "libros")
    private Libro libroId;
    
    @ManyToOne
    @MapsId("usuario")
    @JoinColumn(name = "usuario")
    private Usuario usuario;
}
