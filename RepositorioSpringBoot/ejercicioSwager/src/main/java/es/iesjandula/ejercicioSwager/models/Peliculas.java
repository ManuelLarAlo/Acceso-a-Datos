package es.iesjandula.ejercicioSwager.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
@Table(name = "peliculas")
public class Peliculas {

    @Id
    @Column(length= 100)  
    private Long id;

    @Column
    private String titulo;
    
    @Column
    private String duracion;

}
