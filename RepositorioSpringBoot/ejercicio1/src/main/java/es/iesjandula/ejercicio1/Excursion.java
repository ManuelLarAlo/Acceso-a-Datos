package es.iesjandula.ejercicio1;


import java.sql.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Excursion {

	@EmbeddedId
	private ExcursionId excursionId;
	
	private Date fecha;
}
