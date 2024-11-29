package es.iesjandula.Universidad.models;

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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Grado")
public class Grado {

	@Id
	private long id;
	
	@Column(length = 100)
	private String nombre;
	
	@OneToMany(mappedBy = "grado")
	private List<Asignatura>asignatura;
}
