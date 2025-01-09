package ies.jandula.EmpleadosConsultas.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ubicaciones")
public class Ubicacion {

    @Id
    private Long idUbicacion;
    
    @Column
    private String direccion;
    
    @Column
    private String codigoPostal;
    
    @Column
    private String ciudad;
    
    @Column
    private String estadoProvincia;

    @ManyToOne
    private Pais pais;

}
