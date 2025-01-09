package ies.jandula.EmpleadosConsultas.models;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "puestos")
public class Puesto {

    @Id
    private String idPuesto;
    
    @Column
    private String tituloPuesto;
    
    @Column
    private Double salarioMin;
    
    @Column
    private Double salarioMax;
    
    @OneToMany(mappedBy = "puesto")
    private Set<Empleado> empleados;

}
