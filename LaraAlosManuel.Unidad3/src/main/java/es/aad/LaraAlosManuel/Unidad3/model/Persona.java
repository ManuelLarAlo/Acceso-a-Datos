package es.aad.LaraAlosManuel.Unidad3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Persona {
	
    @Id
    @Column(nullable = false, unique = true, length = 10)
	private String dni;
	
    @Column(nullable = false, length = 50)
	private String nombre;
	
    @Column(nullable = false, length = 50)
	private String apellidos;

}
