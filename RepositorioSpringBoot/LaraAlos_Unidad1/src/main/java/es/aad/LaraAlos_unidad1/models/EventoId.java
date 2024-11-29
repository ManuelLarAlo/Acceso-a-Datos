package es.aad.LaraAlos_unidad1.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class EventoId 
{
	
	@Column(name = "nombreEvento", length = 100)
	private String nombreEvento;
	
	@Column(name = "fechaEvento", length = 50)
	private Date fechaEvento;

}
