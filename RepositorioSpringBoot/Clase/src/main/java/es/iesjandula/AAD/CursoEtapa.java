package es.iesjandula.AAD;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Curso_Etapa")
public class CursoEtapa {

	@EmbeddedId
	private CursoEtapaId cursoEtapa;


}
