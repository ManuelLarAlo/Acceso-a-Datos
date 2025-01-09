package ies.jandula.EmpleadosConsultas.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoConDepartamentoSalarioDTO {

    private String nombreEmpleado;
    
    private String apellidoEmpleado;
    
    private double salario;
    
    private String nombreDepartamento;

}


