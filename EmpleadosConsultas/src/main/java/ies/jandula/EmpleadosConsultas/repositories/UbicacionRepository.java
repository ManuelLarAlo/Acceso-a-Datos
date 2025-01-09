package ies.jandula.EmpleadosConsultas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ies.jandula.EmpleadosConsultas.dtos.PaisesYCantidadUbicacionesDTO;
import ies.jandula.EmpleadosConsultas.dtos.UbicacionConCiudadYPaisDTO;
import ies.jandula.EmpleadosConsultas.dtos.UbicacionConPaisDTO;
import ies.jandula.EmpleadosConsultas.models.Ubicacion;

@Repository
public interface UbicacionRepository extends JpaRepository<Ubicacion, Long> {

    @Query("SELECT new ies.jandula.EmpleadosConsultas.dtos.UbicacionConCiudadYPaisDTO(u.direccion, u.ciudad, p.nombrePais) FROM Ubicacion u JOIN u.pais p")
    List<UbicacionConCiudadYPaisDTO> obtenerUbicacionesConCiudadesYPaises();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.dtos.UbicacionConPaisDTO(u.direccion, p.nombrePais) FROM Ubicacion u JOIN u.pais p")
     List<UbicacionConPaisDTO> obtenerUbicacionesConPaises();
    
    @Query("SELECT u FROM Ubicacion u JOIN u.pais p WHERE p.nombrePais LIKE 'C%'")
    List<Ubicacion> findUbicacionesEnPaisesConC();
    
    @Query("SELECT u FROM Ubicacion u ORDER BY u.ciudad ASC, u.pais.nombrePais ASC")
    List<Ubicacion> findUbicacionesOrdenadasPorCiudadYPais();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.dtos.PaisesYCantidadUbicacionesDTO(u.ciudad, COUNT(u)) FROM Ubicacion u GROUP BY u.ciudad HAVING COUNT(u) > 2")
     List<PaisesYCantidadUbicacionesDTO> findCiudadesConMasDe2Ubicaciones();
}
