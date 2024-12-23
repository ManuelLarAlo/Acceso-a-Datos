package es.iesjandula.Universidad.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.el.util.ExceptionUtils;

public class UniversidadException {

	private int code;
	
	private String message;
	
	private Exception exception;
	
	public UniversidadException(int code, String message)
	{
		this.code = code;
		this.message = message;
	}
	
	public UniversidadException(int code, String message, Exception exception) 
	{
		super();
		
		this.code 	   = code ;
		this.message   = message ;
		this.exception = exception ;
	}
	
	public Object getBodyExceptionMessage()
	{
		Map<String,String> messageMap = new HashMap<String,String>() ;
		
		messageMap.put("code", String.valueOf(this.code)) ;
		messageMap.put("message", this.message) ;
		
		if (this.exception != null)
		{
			String stackTrace = ExceptionUtils.getStackTrace(this.exception) ;
			messageMap.put("exception", stackTrace) ;
			mapBodyException.put("excepcion", ExceptionUtils)
		}
		
		return messageMap ;
	}
	

}
