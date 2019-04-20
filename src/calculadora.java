import java.io.*;

public class calculadora {
	
	public static void main(String[] args){
		BufferedWriter bw=new BufferedWriter (new OutputStreamWriter(System.out)) {
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in)) {
				
		public int suma(int num1, int num2){
			return num1+num2;
		}
		public int Resta(int num1, int num2) {
			return num1-num2;
		}
		public int Multiplicacion(int num1, int num2){
			int resultado = 0;
			for(int i=1; i<=num2;i++) {
				resultado=resultado + num1;
			}
		return resultado;
		}
		public double division(int num1, int num2) {
				if(num2 !=0) {
				return num1/(num2*1.0);
				}
				else {
				return Double.NaN;
					}
		}
		public double porcentaje(int num,double porc) {
			if (porc >=0.0 && porc <=1.0) {
			return num*porc;
			}
				else {
				return Double.NaN;
					}	
		}
	}
	}
	}
}








import java.io.*;
import java.text.BreakIterator;
import java.util.Scanner;

public class calculadora {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner(System.in);
			
			int num1 = 0;
			int num2 = 0;
	
		System.out.println("Introduce el primer número:");			
		num1 = reader.nextInt();
			 
		System.out.println("Introduce el segundo número:");
		num2 = reader.nextInt();
		
		public static int suma(int num1, int num2) {
		return num1+num2;
		System.out.print("La suma es " + num1 + " + " + num2 + " = " + suma);
		}
		public static int resta(int num1, int num2) {
		return num1-num2;
		System.out.print("La resta es " + num1 + " + " + num2 + " = " +resta);
		}
		public int multiplicacion(int num1, int num2) {
		int resultado = 0;
		for(int i=1; i<=num2;i++) { 
			resultado=resultado + num1;
		}
		{
			return resultado;
		}
		}
	public static double division (int num1, int num2) { 
			if(num2 !=0)
			return num1/(num2*1.0);
	}
	        {
			return Double.NaN;	
			}
	public static double porcentaje (int num,double porc) { 
		if (porc >=0.0 && porc <=1.0) 
		return num*porc;
		}
	{
			else  
			return Double.NaN;
	}
		
		
	}
}	

__________________________________________________________________________________________
import java.io.*;
import java.text.BreakIterator;
import java.util.Scanner;

public class calculadora {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
			int num1, num2,resultado,opcion;
						
		System.out.println("Menú");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Porcentaje");
		System.out.println("6. Calcular el valor maximo entre tres valores");
		System.out.println("7. Calcular el promedio entre cinco valores");
		System.out.println("8. Salir\n");
		System.out.println("Ingrese la opción que desea");
		opcion = entrada.nextInt();
		
		if (opcion==8) {
			System.out.println("Salir");
		} else {
			switch(opcion) {
			case 1:
				System.out.println("Ingrese el primer valor: ");
				num1 = entrada.nextInt();
				System.out.println("Ingrese el segundo valor: ");
				num2 = entrada.nextInt();
				resultado= num1+num2;
				System.out.println("El resultado de la suma es: " + resultado);
				break;
			case 2:
				System.out.println("Ingrese el primer valor: ");
				num1 = entrada.nextInt();
				System.out.println("Ingrese el segundo valor: ");
				num2 = entrada.nextInt();
				resultado = num1-num2;
				System.out.println("El resultado de la resta es: " + resultado);
				break;
			case 3:
				System.out.println("Ingrese el primer valor: ");
				num1 = entrada.nextInt();
				System.out.println("Ingrese el segundo valor: ");
				num2 = entrada.nextInt();
				resultado = num1*num2;
				System.out.println("El resultado de la multiplicacion es: " + resultado);
				break;
			case 4:
				System.out.println("Ingrese el primer valor: ");
				num1 = entrada.nextInt();
				System.out.println("Ingrese el segundo valor: ");
				num2 = entrada.nextInt();
				resultado = num1/num2;
				System.out.println("El resultado de la division es: " + resultado);
				break;
			case 5:
				System.out.println("Ingrese el primer valor: ");
				num1 = entrada.nextInt();
				System.out.println("Ingrese el segundo valor: ");
				num2 = entrada.nextInt();
				if (num2 >= 0.0 && num2 <= 1.0) {
					resultado = num1*num2;
					System.out.println("El resultado del porcentaje es: " + resultado);
					break;
				}
				
			}
		}
		
}
	}
