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
