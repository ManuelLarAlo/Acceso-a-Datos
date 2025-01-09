package ies.jandula.EmpleadosConsultas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ies.jandula.EmpleadosConsultas.dtos.DepartamentoConUbicacionDTO;
import ies.jandula.EmpleadosConsultas.dtos.EmpleadosPorDepartamentoDTO;
import ies.jandula.EmpleadosConsultas.dtos.SalarioPromedioPorDepartamentoDTO;
import ies.jandula.EmpleadosConsultas.dtos.SumaSalariosPorDepartamentoDTO;
import ies.jandula.EmpleadosConsultas.models.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

    @Query("SELECT new ies.jandula.EmpleadosConsultas.dtos.DepartamentoConUbicacionDTO(d.nombreDepartamento, u.direccion) FROM Departamento d JOIN d.ubicacion u")
    List<DepartamentoConUbicacionDTO> obtenerDepartamentosConUbicaciones();
    
    @Query("SELECT DISTINCT d FROM Departamento d JOIN d.historialPuestos hp JOIN hp.empleado e WHERE e.salario > 10000")
    List<Departamento> findDepartamentosConEmpleadosSalarioMayorA10000();
    
    @Query("SELECT d FROM Departamento d LEFT JOIN d.historialPuestos hp GROUP BY d ORDER BY COUNT(hp.empleado) DESC")
    List<Departamento> findDepartamentosOrdenadosPorCantidadEmpleados();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.EmpleadosPorDepartamentoDTO(d.nombreDepartamento, COUNT(e)) FROM Departamento d LEFT JOIN d.historialPuestos hp LEFT JOIN hp.empleado e GROUP BY d.nombreDepartamento")
     List<EmpleadosPorDepartamentoDTO> findCantidadEmpleadosPorDepartamento();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.SalarioPromedioPorDepartamentoDTO(d.nombreDepartamento, AVG(e.salario)) FROM Departamento d LEFT JOIN d.historialPuestos hp LEFT JOIN hp.empleado e GROUP BY d.nombreDepartamento")
     List<SalarioPromedioPorDepartamentoDTO> findSalarioPromedioPorDepartamento();
    
    @Query("SELECT d.nombreDepartamento FROM Departamento d JOIN d.historialPuestos hp JOIN hp.empleado e GROUP BY d.nombreDepartamento HAVING COUNT(e) > 5")
    List<String> findDepartamentosConMasDe5Empleados();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.SumaSalariosPorDepartamentoDTO(d.nombreDepartamento, SUM(e.salario)) FROM Departamento d LEFT JOIN d.historialPuestos hp LEFT JOIN hp.empleado e GROUP BY d.nombreDepartamento")
     List<SumaSalariosPorDepartamentoDTO> findSumaSalariosPorDepartamento();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.SalarioPromedioPorDepartamentoDTO(d.nombreDepartamento, AVG(e.salario)) FROM Departamento d LEFT JOIN d.historialPuestos hp LEFT JOIN hp.empleado e GROUP BY d.nombreDepartamento HAVING AVG(e.salario) > 8000")
     List<SalarioPromedioPorDepartamentoDTO> findDepartamentosConSalarioPromedioMayorA8000();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.DepartamentosConMasDe5EmpleadosDTO(d.nombreDepartamento) FROM Departamento d JOIN d.historialPuestos hp JOIN hp.empleado e GROUP BY d.nombreDepartamento HAVING COUNT(e) > 10")
     List<String> findDepartamentosConMasDe10Empleados();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.SumaSalariosPorDepartamentoDTO(d.nombreDepartamento, SUM(e.salario)) FROM Departamento d LEFT JOIN d.historialPuestos hp LEFT JOIN hp.empleado e GROUP BY d.nombreDepartamento HAVING SUM(e.salario) > 50000")
     List<SumaSalariosPorDepartamentoDTO> findDepartamentosConSumaSalariosMayorA50000();
}
