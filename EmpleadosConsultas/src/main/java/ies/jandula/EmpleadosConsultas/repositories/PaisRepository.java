package ies.jandula.EmpleadosConsultas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ies.jandula.EmpleadosConsultas.dtos.PaisConRegionDTO;
import ies.jandula.EmpleadosConsultas.dtos.PaisesYCantidadUbicacionesDTO;
import ies.jandula.EmpleadosConsultas.models.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, String> {

    @Query("SELECT new ies.jandula.EmpleadosConsultas.dtos.PaisConRegionDTO(p.nombrePais, r.nombreRegion) FROM Pais p JOIN p.region r")
    List<PaisConRegionDTO> obtenerPaisesConRegiones();
    
    @Query("SELECT p FROM Pais p JOIN p.region r WHERE r.nombreRegion = 'Europa'")
    List<Pais> findPaisesPorRegion();
    
    @Query("SELECT p FROM Pais p ORDER BY p.region.nombreRegion ASC")
    List<Pais> findPaisesOrdenadosPorRegion();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.PaisesYCantidadUbicacionesDTO(p.nombrePais, COUNT(u)) FROM Pais p LEFT JOIN p.ubicaciones u GROUP BY p.nombrePais")
     List<PaisesYCantidadUbicacionesDTO> findPaisesYCantidadDeUbicaciones();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.PaisesYCantidadUbicacionesDTO(p.nombrePais, COUNT(u)) FROM Pais p LEFT JOIN p.ubicaciones u GROUP BY p.nombrePais HAVING COUNT(u) > 2")
     List<PaisesYCantidadUbicacionesDTO> findPaisesConMasDe2Ubicaciones();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.PaisesYCantidadUbicacionesDTO(p.nombrePais, COUNT(e)) FROM Pais p LEFT JOIN p.ubicaciones u LEFT JOIN u.empleados e GROUP BY p.nombrePais HAVING COUNT(e) > 3")
     List<PaisesYCantidadUbicacionesDTO> findPaisesConMasDe3Empleados();
}
