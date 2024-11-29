package es.aad.LaraAlos_unidad1.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "libros")
public class Libro 
{
	
	@EmbeddedId
	private LibroId libroId;
    
    @Column()
	private int anioPublicacion;
    
	@ManyToOne
	@JoinColumn(name = "nombre_sala")
	private Sala sala;
	
	@OneToMany(mappedBy = "libro")
	private List<Prestamo> prestamos = new ArrayList<>();

}
