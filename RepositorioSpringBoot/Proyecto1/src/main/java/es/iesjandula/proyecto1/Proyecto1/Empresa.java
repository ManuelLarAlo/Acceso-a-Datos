package es.iesjandula.proyecto1.Proyecto1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {
	
    @Id
    private String nif;

    private String nombre;
    private String direccion;

}
