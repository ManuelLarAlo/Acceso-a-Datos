package ies.jandula.EmpleadosConsultas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ies.jandula.EmpleadosConsultas.dtos.EmpleadosPorPuestoDTO;
import ies.jandula.EmpleadosConsultas.models.Puesto;

@Repository
public interface PuestoRepository extends JpaRepository<Puesto, String> {

    @Query("SELECT p FROM Puesto p JOIN p.empleados e GROUP BY p")
    List<Puesto> findPuestosConEmpleadosAsignados();
    
    @Query("SELECT p FROM Puesto p ORDER BY p.salarioMax DESC")
    List<Puesto> findPuestosOrdenadosPorSalarioMaximo();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.dtos.EmpleadosPorPuestoDTO(p.tituloPuesto, COUNT(e)) FROM Puesto p LEFT JOIN p.empleados e GROUP BY p.tituloPuesto")
     List<EmpleadosPorPuestoDTO> findCantidadEmpleadosPorPuesto();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.dtos.EmpleadosPorPuestoDTO(p.tituloPuesto, COUNT(e)) FROM Puesto p LEFT JOIN p.empleados e WHERE p.salarioMin > 4000 GROUP BY p.tituloPuesto")
     List<EmpleadosPorPuestoDTO> findPuestosConSalarioMinimoMayorA4000YEmpleados();
}
