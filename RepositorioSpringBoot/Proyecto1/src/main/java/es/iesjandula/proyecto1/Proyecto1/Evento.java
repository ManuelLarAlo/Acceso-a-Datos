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
public class Evento {
	
    @Id
    private String nombre;

    private String duracion;

}
