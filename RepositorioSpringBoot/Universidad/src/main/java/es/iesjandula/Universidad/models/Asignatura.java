package es.iesjandula.Universidad.models;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Asignatura")
public class Asignatura {
	
	@Id
	private long id;
	
	@Column
	private Double creditos;
	
	@Column
	private int cuatrimestre;
	
	@Column
	private String curso;

	@Column(length = 80)
	private String nombre;
	
	@Column(length = 45)
	private String tipo;
	
	@ManyToOne
	@JoinColumn(name = "id_grado",referencedColumnName = "id")
	private Grado grado;
	
	@ManyToOne
	@JoinColumn(name = "id_profesor",referencedColumnName = "id")
	private Profesor profesor;
	
	@OneToMany(mappedBy = "idAsignatura")
	private List<Matricula>matricula;
}
