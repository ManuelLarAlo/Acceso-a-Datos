package ies.jandula.EmpleadosConsultas.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SumaSalariosPorDepartamentoDTO {
	
    private String nombreDepartamento;
    
    private Double sumaSalarios;

}
