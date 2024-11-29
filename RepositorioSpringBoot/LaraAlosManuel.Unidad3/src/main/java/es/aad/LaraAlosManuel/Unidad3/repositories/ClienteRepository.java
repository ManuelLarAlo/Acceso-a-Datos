package es.aad.LaraAlosManuel.Unidad3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.aad.LaraAlosManuel.Unidad3.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,String> {

}
