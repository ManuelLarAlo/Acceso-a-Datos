package es.aad.LaraAlos_unidad1.models;

import java.sql.Date;
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
@Table(name = "usuarios")
public class Usuario 
{
	
	@Id
	@Column(length = 50)
	private String email;
	
	@Column(length = 50)
	private String nombre;
	
	@Column()
	private Date fechaRegistro;
	
	@OneToMany(mappedBy = "usuario")
	private List<Prestamo> prestamos = new ArrayList<>();

}
