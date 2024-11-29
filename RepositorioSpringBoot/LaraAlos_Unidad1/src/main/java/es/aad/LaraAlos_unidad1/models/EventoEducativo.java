package es.aad.LaraAlos_unidad1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "evento_educativo")
public class EventoEducativo extends Evento 
{
	
	public EventoEducativo(Evento evento)
	{
		super(evento);
	}
	
	@Column(length = 100)
	private String nivelEducativo;

}
