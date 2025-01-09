package ies.jandula.EmpleadosConsultas.models;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "historial_puestos")
public class HistorialPuesto {
    
    @Id
    @Column
    private Date fechaInicio;
    
    @Column
    private Date fechaFin;

    @ManyToOne
    @JoinColumn(name = "id_puesto", referencedColumnName = "idPuesto")
    private Puesto puesto;

    @ManyToOne
    @JoinColumn(name = "id_departamento", referencedColumnName = "idDepartamento")
    private Departamento departamento;
    
    @ManyToOne
    @JoinColumn(name = "id_empleado", referencedColumnName = "idEmpleado")
    private Empleado empleado;

}
