package ies.jandula.EmpleadosConsultas.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadosPorDepartamentoDTO {
	
    private String nombreDepartamento;
    
    private long cantidadEmpleados;

}
