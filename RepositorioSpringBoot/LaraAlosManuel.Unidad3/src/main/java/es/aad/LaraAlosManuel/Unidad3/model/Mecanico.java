package es.aad.LaraAlosManuel.Unidad3.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mecanico")
public class Mecanico extends Persona{
	
	@Column(length = 100)
	private Date fechaAlta;
	
	@Column(length = 15)
	private String salario;
	
	@OneToMany(mappedBy = "mecanico")
	private List<Reparacion> reparaciones = new ArrayList<>();

}
