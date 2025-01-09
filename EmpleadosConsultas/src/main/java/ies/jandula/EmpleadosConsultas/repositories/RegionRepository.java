package ies.jandula.EmpleadosConsultas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ies.jandula.EmpleadosConsultas.dtos.RegionConCantidadPaisesDTO;
import ies.jandula.EmpleadosConsultas.dtos.RegionesYCantidadPaisesDTO;
import ies.jandula.EmpleadosConsultas.models.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {

    @Query("SELECT new ies.jandula.EmpleadosConsultas.dtos.RegionConCantidadPaisesDTO(r.nombreRegion, COUNT(p)) FROM Region r LEFT JOIN r.paises p GROUP BY r.nombreRegion")
    List<RegionConCantidadPaisesDTO> obtenerRegionesConCantidadDePaises();
    
    @Query("SELECT r FROM Region r LEFT JOIN r.paises p GROUP BY r ORDER BY COUNT(p) DESC")
    List<Region> findRegionesOrdenadasPorCantidadPaises();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.RegionesYCantidadPaisesDTO(r.nombreRegion, COUNT(p)) FROM Region r LEFT JOIN r.paises p GROUP BY r.nombreRegion")
     List<RegionesYCantidadPaisesDTO> findRegionesYCantidadPaises();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.RegionesYCantidadPaisesDTO(r.nombreRegion, COUNT(p)) FROM Region r LEFT JOIN r.paises p GROUP BY r.nombreRegion HAVING COUNT(p) > 3")
     List<RegionesYCantidadPaisesDTO> findRegionesConMasDe3Paises();
}
