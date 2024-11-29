package es.aad.LaraAlos_unidad1.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "salas")
public class Sala 
{
	
	@Id
	@Column
	private String nombreSala;
	
	@Column
	private int capacidad;
	
	@OneToMany(mappedBy = "sala")
	private List<Libro> libros = new ArrayList<>();
	
	@OneToMany(mappedBy = "sala")
	private List<Evento> evento = new ArrayList<>();

}
