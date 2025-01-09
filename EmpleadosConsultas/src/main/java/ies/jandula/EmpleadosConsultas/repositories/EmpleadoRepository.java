package ies.jandula.EmpleadosConsultas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ies.jandula.EmpleadosConsultas.dtos.EmpleadoConDepartamentoDTO;
import ies.jandula.EmpleadosConsultas.dtos.EmpleadoConGerenteDTO;
import ies.jandula.EmpleadosConsultas.dtos.EmpleadoConPuestoDTO;
import ies.jandula.EmpleadosConsultas.dtos.EmpleadosContratadosPorAnoDTO;
import ies.jandula.EmpleadosConsultas.dtos.EmpleadosPorGerenteDTO;
import ies.jandula.EmpleadosConsultas.dtos.EmpleadosPorPuestoDTO;
import ies.jandula.EmpleadosConsultas.dtos.SalarioPromedioPorDepartamentoDTO;
import ies.jandula.EmpleadosConsultas.models.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

    @Query("SELECT new ies.jandula.EmpleadosConsultas.dtos.EmpleadoConDepartamentoDTO(e.nombre, d.nombreDepartamento) FROM Empleado e JOIN e.departamento d")
    List<EmpleadoConDepartamentoDTO> obtenerEmpleadosConDepartamentos();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.dtos.EmpleadoConPuestoDTO(e.nombre, e.apellido, p.tituloPuesto) FROM Empleado e JOIN e.puesto p")
     List<EmpleadoConPuestoDTO> obtenerEmpleadosConPuestos();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.dtos.EmpleadoConGerenteDTO(e.nombre, e.apellido, g.nombre, g.apellido) FROM Empleado e LEFT JOIN e.gerente g")
     List<EmpleadoConGerenteDTO> obtenerEmpleadosConGerentes();
    
    @Query("SELECT e FROM Empleado e WHERE e.departamento.idDepartamento = :idDepartamento")
    List<Empleado> obtenerEmpleadosPorDepartamento(@Param("idDepartamento") Long idDepartamento);
    
    @Query("SELECT e FROM Empleado e JOIN e.departamento d WHERE e.salario > 5000")
    List<Empleado> findEmpleadosConSalarioMayorA5000();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.dto.EmpleadoConGerenteDTO(e.nombre, e.gerente.nombre) FROM Empleado e WHERE e.puesto.tituloPuesto = 'Programador'")
    List<EmpleadoConGerenteDTO> findEmpleadosYGerentesPorTitulo();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.dto.EmpleadoConDepartamentoDTO(e.nombre, e.apellido, e.salario, e.departamento.nombreDepartamento) FROM Empleado e WHERE e.fechaContrato > '2000-01-01'")
    List<EmpleadoConDepartamentoDTO> findEmpleadosContratadosDespuesDel2000();
    
    @Query("SELECT e FROM Empleado e WHERE e.gerente IS NULL")
    List<Empleado> findEmpleadosSinGerente();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.dto.EmpleadoConDepartamentoDTO(e.nombre, e.apellido, e.salario, e.departamento.nombreDepartamento) FROM Empleado e WHERE e.comisionPct IS NOT NULL")
    List<EmpleadoConDepartamentoDTO> findEmpleadosConComisiones();
    
    @Query("SELECT e FROM Empleado e WHERE e.departamento.nombreDepartamento = 'Ventas' AND e.salario > 7000")
    List<Empleado> findEmpleadosVentasConSalarioMayorA7000();
    
    @Query("SELECT e FROM Empleado e ORDER BY e.salario DESC, e.departamento.nombreDepartamento ASC")
    List<Empleado> findEmpleadosOrdenadosPorSalarioYDepartamento();
    
    @Query("SELECT e FROM Empleado e ORDER BY e.fechaContrato ASC, e.salario DESC")
    List<Empleado> findEmpleadosOrdenadosPorFechaYSalario();
    
    @Query("SELECT e FROM Empleado e WHERE e.gerente IS NOT NULL ORDER BY e.gerente.apellido ASC")
    List<Empleado> findEmpleadosYGerentesOrdenadosPorApellidoGerente();
    
    @Query("SELECT e FROM Empleado e JOIN e.departamento d JOIN d.ubicacion u JOIN u.pais p WHERE p.nombrePais = 'IT' ORDER BY e.salario DESC")
    List<Empleado> findEmpleadosDePaisITOrdenadosPorSalario();
    
    @Query("SELECT e FROM Empleado e WHERE e.gerente IS NULL ORDER BY e.nombre ASC, e.apellido ASC")
    List<Empleado> findEmpleadosSinGerenteOrdenadosAlfabeticamente();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.EmpleadosContratadosPorAnoDTO(EXTRACT(YEAR FROM e.fechaContrato), COUNT(e)) FROM Empleado e GROUP BY EXTRACT(YEAR FROM e.fechaContrato)")
     List<EmpleadosContratadosPorAnoDTO> findCantidadEmpleadosContratadosPorAno();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.EmpleadosPorGerenteDTO(e.gerente.nombre, COUNT(e)) FROM Empleado e WHERE e.gerente IS NOT NULL GROUP BY e.gerente")
     List<EmpleadosPorGerenteDTO> findEmpleadosAgrupadosPorGerenteYCantidad();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.EmpleadosPorGerenteDTO(e.gerente.nombre, COUNT(e)) FROM Empleado e WHERE e.gerente IS NOT NULL GROUP BY e.gerente HAVING COUNT(e) > 5")
     List<EmpleadosPorGerenteDTO> findGerentesConMasDe5Empleados();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.EmpleadosPorPuestoDTO(e.puesto.tituloPuesto, AVG(e.salario)) FROM Empleado e GROUP BY e.puesto HAVING AVG(e.salario) > 6000")
     List<EmpleadosPorPuestoDTO> findEmpleadosAgrupadosPorPuestoConSalarioPromedioMayorA6000();
    
    @Query("SELECT new ies.jandula.EmpleadosConsultas.models.SalarioPromedioPorDepartamentoDTO(d.nombreDepartamento, AVG(e.salario)) FROM Departamento d LEFT JOIN d.historialPuestos hp LEFT JOIN hp.empleado e GROUP BY d.nombreDepartamento HAVING AVG(e.salario) > 9000")
     List<SalarioPromedioPorDepartamentoDTO> findDepartamentosConSalarioPromedioMayorA9000();
}
