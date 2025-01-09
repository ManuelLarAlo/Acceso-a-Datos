package ies.jandula.EmpleadosConsultas.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "empleados")
public class Empleado {

    @Id
    private Long idEmpleado;
    
    @Column
    private String nombre;
    
    @Column
    private String apellido;
    
    @Column
    private String email;
    
    @Column
    private String telefono;
    
    @Column
    private String fechaContrato;
    
    @Column
    private Long salario;
    
    @Column
    private Double comisionPct;

    @ManyToOne
    @JoinColumn(name = "id_puesto")
    private Puesto puesto;  

    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;

    @ManyToOne
    @JoinColumn(name = "id_gerente")
    private Empleado gerente;  

}
