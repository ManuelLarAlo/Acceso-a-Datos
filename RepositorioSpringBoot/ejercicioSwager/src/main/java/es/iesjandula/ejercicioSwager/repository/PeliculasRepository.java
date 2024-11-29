package es.iesjandula.ejercicioSwager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.ejercicioSwager.models.Peliculas;

public interface PeliculasRepository extends JpaRepository<Peliculas,Long> {

}
