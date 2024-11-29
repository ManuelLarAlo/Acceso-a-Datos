package es.aad.LaraAlos_unidad1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.aad.LaraAlos_unidad1.models.Evento;
import es.aad.LaraAlos_unidad1.models.EventoId;

public interface EventoCulturalRepository extends JpaRepository<Evento,EventoId>
{


}
