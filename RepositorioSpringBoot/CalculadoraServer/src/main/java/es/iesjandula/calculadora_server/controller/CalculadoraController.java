package es.iesjandula.calculadora_server.controller;

import java.io.IOException;
import java.util.StringTokenizer;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import es.iesjandula.calculadora_server.dto.Parametros;
import es.iesjandula.calculadora_server.dto.Resultado;
import es.iesjandula.calculadora_server.utils.CalculadoraServerEcxeption;

@RestController
@RequestMapping(value="/calculadora")
public class CalculadoraController {
	
	@RequestMapping(method = RequestMethod.GET, value="/sumar/{a}/{b}")
	public int sumar(
			//@RequestParam(value="a")int a,
			//@RequestParam(value="b")int b
			//@RequestHeader(value="a")int a,
			//@RequestHeader(value="b")int b
			@PathVariable(value="a")int a,
			@PathVariable(value="b")int b
			) {
		return a+b;
	}
	@RequestMapping(method = RequestMethod.GET, value="/restar/{a}/{b}")
	public int restar(
			//@RequestParam(value="a")int a,
			//@RequestParam(value="b")int b
			//@RequestHeader(value="a")int a,
			//@RequestHeader(value="b")int b
			@PathVariable(value="a")int a,
			@PathVariable(value="b")int b
			) {
		return a-b;
	}
	@RequestMapping(method = RequestMethod.GET, value="/multiplicar/{a}/{b}")
	public int multiplicar(
			//@RequestParam(value="a")int a,
			//@RequestParam(value="b")int b
			//@RequestHeader(value="a")int a,
			//@RequestHeader(value="b")int b
			@PathVariable(value="a")int a,
			@PathVariable(value="b")int b
			) {
		return a*b;
	}
	@RequestMapping(method = RequestMethod.GET, value="/dividir/{a}/{b}")
	public int dividir(
			//@RequestParam(value="a")int a,
			//@RequestParam(value="b")int b
			//@RequestHeader(value="a")int a,
			//@RequestHeader(value="b")int b
			@PathVariable(value="a")int a,
			@PathVariable(value="b")int b
			) {
		return a%b;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/mayor/{a}/{b}/{c}")
	public int mayor(
			@PathVariable(value="a")int a,@PathVariable(value="b")int b,@PathVariable(value="c")int c
			) {
		//comprobamos si a es mayor que b
		if(a>=b) 
		{
			//en caso afirmativo la comparamos con c si tambien es mayor o igual que c entonces podemos devolver a como el numero mayor
			if(a>=c) 
			{
				return a;
			}
			//en el caso de que c sea mayor que a devolvemos c ya que si a es mayor que b y c es mayor que a entonces c es mayor que b
			else 
			{
				return c;
			}
		}
		//Si b es mayor que a entonces procedemos a compararla con c
		else 
		{
			//si b es mayor o igual que c podemos devolver b como la mayor
			if(b>=c) 
			{
				return b;
			}
			//en caso de que c sea mayor que b podemos devolverla como la mayor ya que b es mayor que a
			else 
			{
				return c;
			}
		}
	}
	
	
	/*@RequestMapping(method = RequestMethod.GET, value="/factorial/{a}")
	public int factorial(
			@PathVariable(value="a")int a
			) {
			int resultado=1;
			for(int i=1;i<=a;i++) {
				resultado=resultado*i;
			}
			return resultado;
	}*/
	
	@RequestMapping(method = RequestMethod.GET, value="/factorial/{a}")
	public ResponseEntity<?> factorial(
			@PathVariable(value="a")int a
			) {
		try {
			if (a<0) {
				throw new CalculadoraServerEcxeption(500,"Debes dar un numero positivo no negativo");
			}
			int resultado=1;
			for(int i=1;i<=a;i++) {
				resultado=resultado*i;
			}
			return ResponseEntity.ok().body(resultado);
		}catch (CalculadoraServerEcxeption calculadoraServerException) {
			return ResponseEntity.status(400).body(calculadoraServerException.getBodyExceptionMessage());
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/fibonacci/{a}")
	public int fibonacci(
			@PathVariable(value="a")int a
			) {
		int numero1=0;
		int numero2=1;
		int numero3=0;
		for(int i=1;i<=a;i++) {
			numero3=numero2+numero1;
			numero1=numero2;
			numero2=numero3;
		}
		return numero3;
	}
	@RequestMapping(method = RequestMethod.GET, value="/perfecto/{a}")
	public boolean perfecto(
			@PathVariable(value="a")int a
			) {
		int divisores=0;
		for(int i=1;i<=a/2;i++) {
			if (a % i == 0) {
				divisores+=i;
            }
		}
		return divisores==a;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/pares/{a}")
	public int[] pares(
			@PathVariable(value="a")int a
			) {
		int [] pares= new int[a];
		for(int i=0;i<a;i++) {
			pares[i]=i*2;
		}
		return pares;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/impares/{a}")
	public int[] impares(
			@PathVariable(value="a")int a
			) {
		int [] impares= new int[a];
		for(int i=0;i<a;i++) {
					impares[i]=i*2+1;
		}
		return impares;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/primos/{a}")
	public int[] primos(
			@PathVariable(value="a")int a
			) {
		int [] primos= new int[a];
		int cont=0;
		int numero=1;
		boolean primo = true;
		while(cont<a) {
			for(int i=2;i<numero&&primo;i++) {
				primo=!(numero%i==0);
			}
			if(primo) {
				primos[cont]=numero;
				cont++;
			}
			primo=true;
			numero++;
		}
		
		return primos;
	}
	@RequestMapping(value="/exponencial", method = RequestMethod.POST, consumes = "application/json")
	public Resultado exponencial(@RequestBody Parametros parametros) {
		Resultado resultado = new Resultado();
		resultado.setResultado((int) Math.pow(parametros.getNumero1(), parametros.getNumero2()));
		return resultado;
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/by_file/", 
			consumes = {"multipart/form-data"}, produces = {"multipart/form-data"})
	public ResponseEntity<?> sumarConFicheros(@RequestParam(value="fichero", required=false) MultipartFile fichero)
	{
		try {
			String ficheroString = new String(fichero.getBytes());
			StringTokenizer stringTokenizer = new StringTokenizer(ficheroString," ");
			int numero1=Integer.valueOf(stringTokenizer.nextToken());
			int numero2=Integer.valueOf(stringTokenizer.nextToken());
			int resultado=numero1+numero2;
			String resultadoString=String.valueOf(resultado);
			InputStreamResource outcomeInputStreamResource = new InputStreamResource(new java.io.ByteArrayInputStream(resultadoString.getBytes()));
			HttpHeaders headers = new HttpHeaders();
			headers.set("Content-Disposition", "attachment; filename=miNuevoFichero.txt");   
		    return ResponseEntity.ok().headers(headers).body(outcomeInputStreamResource) ;


			
		} /*catch (CalculadoraServerEcxeption calculadoraExeption) {
			return ResponseEntity.status(400).body(calculadoraExeption.getBodyExceptionMessage()) ;
		}*/
		catch (IOException ioExeption) {
			CalculadoraServerEcxeption miPrimerMicroservicio = new CalculadoraServerEcxeption(3, ioExeption.getMessage(), ioExeption) ;
			return ResponseEntity.status(500).body(miPrimerMicroservicio.getBodyExceptionMessage()) ;

		}
	}
	}
	
