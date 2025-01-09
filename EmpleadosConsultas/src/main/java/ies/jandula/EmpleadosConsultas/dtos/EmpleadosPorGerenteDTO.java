package ies.jandula.EmpleadosConsultas.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadosPorGerenteDTO {
	
    private String nombreGerente;
    
    private long cantidadEmpleados;

}
