package ies.jandula.EmpleadosConsultas.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UbicacionConCiudadYPaisDTO {

    private String direccion;
    
    private String ciudad;
    
    private String nombrePais;

}
