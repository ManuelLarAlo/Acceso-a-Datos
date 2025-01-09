package ies.jandula.EmpleadosConsultas.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "paises")
public class Pais {

    @Id
    private String idPais;
    
    @Column
    private String nombrePais;

    @ManyToOne
    @JoinColumn(name = "id_region")
    private Region region;

}
