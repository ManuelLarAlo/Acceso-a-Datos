package ies.jandula.EmpleadosConsultas.models;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "departamentos")
public class Departamento {

    @Id
    private Long idDepartamento;
    
    @Column
    private String nombreDepartamento;
    
    @ManyToOne
    @JoinColumn(name = "id_gerente")  // Define la columna de la relación
    private Empleado gerente;

    @ManyToOne
    private Ubicacion ubicacion;
    
    @OneToMany(mappedBy = "departamento")
    private Set<HistorialPuesto> historialPuestos; 

}
