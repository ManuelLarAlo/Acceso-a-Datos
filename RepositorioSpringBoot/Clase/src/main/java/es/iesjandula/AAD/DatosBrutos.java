package es.iesjandula.AAD;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Datos_Bruto_Alumno_Matricula")
public class DatosBrutos {

	@Id
	@Column
	private long id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String apellidos;
	
	@Column(nullable = false)
	private String asignatura;
	
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "curso", referencedColumnName = "curso"),
        @JoinColumn(name = "etapa", referencedColumnName = "etapa")
    })
    private CursoEtapa cursoEtapa;

	
}
