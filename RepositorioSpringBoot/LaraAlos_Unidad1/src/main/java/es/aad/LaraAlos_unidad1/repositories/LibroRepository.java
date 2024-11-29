package es.aad.LaraAlos_unidad1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.aad.LaraAlos_unidad1.models.Libro;
import es.aad.LaraAlos_unidad1.models.LibroId;

public interface LibroRepository extends JpaRepository<Libro,LibroId> 
{

}
