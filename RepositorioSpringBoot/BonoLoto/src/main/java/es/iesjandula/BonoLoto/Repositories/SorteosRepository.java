package es.iesjandula.BonoLoto.Repositories;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.BonoLoto.models.Sorteos;

public interface SorteosRepository extends JpaRepository<Sorteos, Date> {

}
