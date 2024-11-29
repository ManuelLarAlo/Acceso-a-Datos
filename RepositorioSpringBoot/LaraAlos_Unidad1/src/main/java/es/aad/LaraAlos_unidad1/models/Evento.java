package es.aad.LaraAlos_unidad1.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Evento 
{
	
	public Evento(Evento evento)
	{
		this.eventoId = evento.getEventoId();
	}
	
	@EmbeddedId
	private EventoId eventoId;
	
	@OneToOne
	@JoinColumn(name = "sala")
	private Sala sala;

}
