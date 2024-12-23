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
@Table(name="Departamento")
public class Departamento {

	
	@Id
	private long id;
	
	@Column(length = 45)
	private String nombre;
	
	@OneToMany(mappedBy = "departamento")
	private List<Profesor>profesor;
}
