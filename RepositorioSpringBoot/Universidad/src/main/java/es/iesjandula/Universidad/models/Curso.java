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
@Table(name="Curso")
public class Curso {

	@Id
	private long id;
	
	@Column
	private int anyoFin;
	
	@Column
	private int anyoInicio;
	
	@OneToMany(mappedBy = "idCurso")
	private List<Matricula>matricula;
}
