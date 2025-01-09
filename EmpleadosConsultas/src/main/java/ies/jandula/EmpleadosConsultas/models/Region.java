package ies.jandula.EmpleadosConsultas.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "regiones")
public class Region {

    @Id
    private Long idRegion;
    
    @Column
    private String nombreRegion;
    
    @OneToMany(mappedBy = "region")
    private Set<Pais> paises;

}


