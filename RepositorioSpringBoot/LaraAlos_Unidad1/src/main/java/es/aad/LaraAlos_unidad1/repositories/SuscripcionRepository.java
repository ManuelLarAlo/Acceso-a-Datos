package es.aad.LaraAlos_unidad1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.aad.LaraAlos_unidad1.models.Suscripcion;
import es.aad.LaraAlos_unidad1.models.SuscripcionId;

public interface SuscripcionRepository extends JpaRepository<Suscripcion,SuscripcionId>
{

}
