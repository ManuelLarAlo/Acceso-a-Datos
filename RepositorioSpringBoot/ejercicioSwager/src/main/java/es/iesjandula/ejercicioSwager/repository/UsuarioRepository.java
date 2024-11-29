package es.iesjandula.ejercicioSwager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.iesjandula.ejercicioSwager.models.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios,Long> {

}
