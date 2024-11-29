package es.iesjandula.ejercicio.utils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Paco Benítez
 */
public class DatesUtil
{
	/**
	 * https://www.javatpoint.com/java-simpledateformat
	 * 
	 * @param fechaString fecha como cadena de texto
	 * @return un Date
	 * @throws ProyectoFinalException con una excepcion
	 */
	public static Date crearFechaDesdeString(String fechaString) throws UniversidadException
	{
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy") ;  
	    
	    try
	    {
			return formatter.parse(fechaString) ;
		}
	    catch (ParseException parseException)
	    {
			throw new UniversidadException(404,"Fecha con formato incorrecto: " + fechaString, parseException) ;
		}  
	}
}