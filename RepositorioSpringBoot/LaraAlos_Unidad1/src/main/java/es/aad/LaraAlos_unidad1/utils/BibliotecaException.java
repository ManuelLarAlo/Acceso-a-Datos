package es.aad.LaraAlos_unidad1.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;

public class BibliotecaException extends Exception
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int code;
	
	private String message;
	
	private Exception exception;
	
	public BibliotecaException(int code, String message)
	{
		this.code = code;
		this.message = message;
	}
	
	public BibliotecaException(int code, String message, Exception exception) 
	{
		super(message,exception) ;
		
		this.code 	   = code ;
		this.message   = message ;
		this.exception = exception ;
	}
	
	public Map<String,String> getBodyExceptionMessage()
	{
		Map<String,String> messageMap = new HashMap<String,String>() ;
		
		messageMap.put("code", String.valueOf(this.code)) ;
		messageMap.put("message", this.message) ;
		
		if (this.exception != null)
		{
			String stackTrace = ExceptionUtils.getStackTrace(this.exception) ;
			messageMap.put("exception", stackTrace) ;
		}
		
		return messageMap ;
	}
	

}
