package ies.jandula.EmpleadosConsultas.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoConGerenteDTO {

    private String nombreEmpleado;
    
    private String apellidoEmpleado;
    
    private String nombreGerente;
    
    private String apellidoGerente;

}
