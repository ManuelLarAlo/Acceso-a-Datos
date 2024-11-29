package es.aad.LaraAlos_unidad1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.aad.LaraAlos_unidad1.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,String> 
{

}
