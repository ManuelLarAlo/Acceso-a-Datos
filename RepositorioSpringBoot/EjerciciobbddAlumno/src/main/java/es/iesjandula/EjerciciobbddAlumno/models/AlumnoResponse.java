package es.iesjandula.EjerciciobbddAlumno.models;

public class AlumnoResponse {
	
	private String nombre;
	
	public AlumnoResponse(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}

}
