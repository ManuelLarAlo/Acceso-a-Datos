
package es.iesjandula.calculadora;

public class App extends Calculadora {
	
	public static void main(String[] args) {
		
		//se instancia la calculadora
		Calculadora cal=new Calculadora();
		
		int a=7;
		int b=5;
		
		System.out.println("el resultado de 7 + 5 es: "+ cal.suma(a, b));
		System.out.println("el resultado de 7 - 5 es: "+ cal.resta(a, b));
		System.out.println("el resultado de 7 * 5 es: "+ cal.multiplicacion(a, b));
		System.out.println("el resultado de 7 / 5 es: "+ cal.division(a, b));
	}
	
}
