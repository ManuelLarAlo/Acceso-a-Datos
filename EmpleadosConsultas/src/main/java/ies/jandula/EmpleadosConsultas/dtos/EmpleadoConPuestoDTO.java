package ies.jandula.EmpleadosConsultas.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoConPuestoDTO {

    private String nombreEmpleado;
    
    private String apellidoEmpleado;
    
    private String tituloPuesto;

}
