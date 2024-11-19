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
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mecanicos")
public class Mecanico extends Persona {
	
	@Column(nullable = false)
	private Date fechaAlta;
	
	@Column(nullable = false)
	private Double salario;
	
    @OneToMany(mappedBy = "mecanico")
    private List<Reparacion> reparaciones = new ArrayList<>();
}
