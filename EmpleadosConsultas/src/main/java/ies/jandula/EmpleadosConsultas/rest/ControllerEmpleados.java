package ies.jandula.EmpleadosConsultas.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ies.jandula.EmpleadosConsultas.repositories.DepartamentoRepository;
import ies.jandula.EmpleadosConsultas.repositories.EmpleadoRepository;
import ies.jandula.EmpleadosConsultas.repositories.PaisRepository;
import ies.jandula.EmpleadosConsultas.repositories.PuestoRepository;
import ies.jandula.EmpleadosConsultas.repositories.RegionRepository;
import ies.jandula.EmpleadosConsultas.repositories.UbicacionRepository;
import jakarta.annotation.PostConstruct;

@Service
public class ControllerEmpleados
{
    @Autowired
    private DepartamentoRepository departamentoRepository;
    
    @Autowired
    private EmpleadoRepository empleadoRepository;
    
    @Autowired
    private PaisRepository paisRepository;
    
    @Autowired
    private PuestoRepository puestoRepository;
    
    @Autowired
    private RegionRepository regionRepository;
    
    @Autowired
    private UbicacionRepository ubicacionRepository;

    @PostConstruct
    public void init() {
    	
        System.out.println("Departamentos con ubicaciones:\n" + 
            this.departamentoRepository.obtenerDepartamentosConUbicaciones() + "\n");

        System.out.println("Departamentos con empleados con salario mayor a 10000:\n" + 
            this.departamentoRepository.findDepartamentosConEmpleadosSalarioMayorA10000() + "\n");

        System.out.println("Departamentos ordenados por cantidad de empleados:\n" + 
            this.departamentoRepository.findDepartamentosOrdenadosPorCantidadEmpleados() + "\n");

        System.out.println("Cantidad de empleados por departamento:\n" + 
            this.departamentoRepository.findCantidadEmpleadosPorDepartamento() + "\n");

        System.out.println("Salario promedio por departamento:\n" + 
            this.departamentoRepository.findSalarioPromedioPorDepartamento() + "\n");

        System.out.println("Departamentos con más de 5 empleados:\n" + 
            this.departamentoRepository.findDepartamentosConMasDe5Empleados() + "\n");

        /*System.out.println("Suma de salarios por departamento:\n" + 
            this.departamentoRepository.findSumaSalariosPorDepartamento() + "\n");*/

        System.out.println("Departamentos con salario promedio mayor a 8000:\n" + 
            this.departamentoRepository.findDepartamentosConSalarioPromedioMayorA8000() + "\n");

        System.out.println("Departamentos con más de 10 empleados:\n" + 
            this.departamentoRepository.findDepartamentosConMasDe10Empleados() + "\n");

        System.out.println("Departamentos con suma de salarios mayor a 50000:\n" + 
            this.departamentoRepository.findDepartamentosConSumaSalariosMayorA50000() + "\n");
        
        System.out.println("Empleados con departamentos:\n" +
            this.empleadoRepository.obtenerEmpleadosConDepartamentos() + "\n");

        System.out.println("Empleados con puestos:\n" +
            this.empleadoRepository.obtenerEmpleadosConPuestos() + "\n");

        System.out.println("Empleados con gerentes:\n" +
            this.empleadoRepository.obtenerEmpleadosConGerentes() + "\n");

        System.out.println("Empleados por departamento (ID: 1):\n" +
            this.empleadoRepository.obtenerEmpleadosPorDepartamento(1L) + "\n");

        System.out.println("Empleados con salario mayor a 5000:\n" +
            this.empleadoRepository.findEmpleadosConSalarioMayorA5000() + "\n");

        System.out.println("Empleados y gerentes por título de puesto 'Programador':\n" +
            this.empleadoRepository.findEmpleadosYGerentesPorTitulo() + "\n");

        System.out.println("Empleados contratados después del 2000:\n" +
            this.empleadoRepository.findEmpleadosContratadosDespuesDel2000() + "\n");

        System.out.println("Empleados sin gerente:\n" +
            this.empleadoRepository.findEmpleadosSinGerente() + "\n");

        System.out.println("Empleados con comisiones:\n" +
            this.empleadoRepository.findEmpleadosConComisiones() + "\n");

        System.out.println("Empleados de Ventas con salario mayor a 7000:\n" +
            this.empleadoRepository.findEmpleadosVentasConSalarioMayorA7000() + "\n");

        System.out.println("Empleados ordenados por salario y departamento:\n" +
            this.empleadoRepository.findEmpleadosOrdenadosPorSalarioYDepartamento() + "\n");

        System.out.println("Empleados ordenados por fecha y salario:\n" +
            this.empleadoRepository.findEmpleadosOrdenadosPorFechaYSalario() + "\n");

        System.out.println("Empleados y gerentes ordenados por apellido del gerente:\n" +
            this.empleadoRepository.findEmpleadosYGerentesOrdenadosPorApellidoGerente() + "\n");

        System.out.println("Empleados de país IT ordenados por salario:\n" +
            this.empleadoRepository.findEmpleadosDePaisITOrdenadosPorSalario() + "\n");

        System.out.println("Empleados sin gerente ordenados alfabéticamente:\n" +
            this.empleadoRepository.findEmpleadosSinGerenteOrdenadosAlfabeticamente() + "\n");

        System.out.println("Cantidad de empleados contratados por año:\n" +
            this.empleadoRepository.findCantidadEmpleadosContratadosPorAno() + "\n");

        System.out.println("Empleados agrupados por gerente y cantidad:\n" +
            this.empleadoRepository.findEmpleadosAgrupadosPorGerenteYCantidad() + "\n");

        System.out.println("Gerentes con más de 5 empleados:\n" +
            this.empleadoRepository.findGerentesConMasDe5Empleados() + "\n");

        System.out.println("Empleados agrupados por puesto con salario promedio mayor a 6000:\n" +
            this.empleadoRepository.findEmpleadosAgrupadosPorPuestoConSalarioPromedioMayorA6000() + "\n");

        System.out.println("Departamentos con salario promedio mayor a 9000:\n" +
            this.empleadoRepository.findDepartamentosConSalarioPromedioMayorA9000() + "\n");
        
        System.out.println("Paises con regiones:\n" +
            this.paisRepository.obtenerPaisesConRegiones() + "\n");

        System.out.println("Paises de la región 'Europa':\n" +
            this.paisRepository.findPaisesPorRegion() + "\n");

        System.out.println("Paises ordenados por región:\n" +
            this.paisRepository.findPaisesOrdenadosPorRegion() + "\n");

        System.out.println("Paises y cantidad de ubicaciones:\n" +
            this.paisRepository.findPaisesYCantidadDeUbicaciones() + "\n");

        System.out.println("Paises con más de 2 ubicaciones:\n" +
            this.paisRepository.findPaisesConMasDe2Ubicaciones() + "\n");

        System.out.println("Paises con más de 3 empleados:\n" +
            this.paisRepository.findPaisesConMasDe3Empleados() + "\n");
        
        System.out.println("Puestos con empleados asignados:\n" +
            this.puestoRepository.findPuestosConEmpleadosAsignados() + "\n");

        System.out.println("Puestos ordenados por salario máximo:\n" +
            this.puestoRepository.findPuestosOrdenadosPorSalarioMaximo() + "\n");

        System.out.println("Cantidad de empleados por puesto:\n" +
            this.puestoRepository.findCantidadEmpleadosPorPuesto() + "\n");

        System.out.println("Puestos con salario mínimo mayor a 4000 y cantidad de empleados:\n" +
            this.puestoRepository.findPuestosConSalarioMinimoMayorA4000YEmpleados() + "\n");
        
        System.out.println("Regiones con cantidad de países:\n" +
            this.regionRepository.obtenerRegionesConCantidadDePaises() + "\n");

        System.out.println("Regiones ordenadas por cantidad de países:\n" +
            this.regionRepository.findRegionesOrdenadasPorCantidadPaises() + "\n");

        System.out.println("Regiones y cantidad de países:\n" +
            this.regionRepository.findRegionesYCantidadPaises() + "\n");

        System.out.println("Regiones con más de 3 países:\n" +
            this.regionRepository.findRegionesConMasDe3Paises() + "\n");
        
        System.out.println("Ubicaciones con ciudades y países:\n" +
            this.ubicacionRepository.obtenerUbicacionesConCiudadesYPaises() + "\n");

        System.out.println("Ubicaciones con países:\n" +
            this.ubicacionRepository.obtenerUbicacionesConPaises() + "\n");

        System.out.println("Ubicaciones en países cuyo nombre comienza con 'C':\n" +
            this.ubicacionRepository.findUbicacionesEnPaisesConC() + "\n");

        System.out.println("Ubicaciones ordenadas por ciudad y país:\n" +
            this.ubicacionRepository.findUbicacionesOrdenadasPorCiudadYPais() + "\n");

        System.out.println("Ciudades con más de 2 ubicaciones:\n" +
            this.ubicacionRepository.findCiudadesConMasDe2Ubicaciones() + "\n");
    }
}
