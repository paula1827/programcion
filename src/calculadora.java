import java.io.*;
import java.text.BreakIterator;
import java.util.Scanner;

public class calculadora {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
			int num1,num2,num3,num4,num5,resultado,opcion,porc;
								
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
				porc = entrada.nextInt();
				resultado = num1+porc/2;
				System.out.println("El promedio de los numeros es: " + resultado);
			
				break;
				
			case 6:
				System.out.println("Ingrese el primer valor: ");
				num1 = entrada.nextInt();
				System.out.println("Ingrese el segundo valor: ");
				num2 = entrada.nextInt();
				System.out.println("Ingrese el tercer valor: ");
				num3 = entrada.nextInt();
					if(num1>num2) {
						if (num1>num3) {
							System.out.println("El mayor es:"+num1);
						} 
						else {
							System.out.println("El mayor es:"+num3);
						}
					}
						else
							if	(num2>num3) {
								System.out.println("El mayor es:"+num2);
							} else {
								System.out.println("El mayor es:"+num3);
									}
				break;
				
			case 7:
				System.out.println("Ingrese el primer valor: ");
				num1 = entrada.nextInt();
				System.out.println("Ingrese el segundo valor: ");
				num2 = entrada.nextInt();
				System.out.println("Ingrese el tercer valor: ");
				num3 = entrada.nextInt();
				System.out.println("Ingrese el cuarto valor: ");
				num4 = entrada.nextInt();
				System.out.println("Ingrese el quinto valor: ");
				num5 = entrada.nextInt();
					resultado = num1+num2+num3+num4+num5/5;
					System.out.println("El resultado del porcentaje es: " + resultado);
				break;
								
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}
		
}
	}
--------------------------------------------------------------------------------------------------------------------------
	
public class pi {

	public int suma (int num1, int num2) {
		int resultado = 0;
		resultado = num1 + num2;
		return resultado;
	}
	public int resta (int num1, int num2) {
		int resultado = 0;
		resultado = num1 - num2;
		return resultado;
	}
	public int multiplicacion (int num1, int num2) {
		int resultado = 0;
		for (int i=1; i<=num2;i++) {
			resultado = resultado + num1;	
		}
		return resultado;
	}
	public double division(int num1, int num2) {
		if(num2 !=0) {
			return num1/(num2+1.0);
		}
		else {
			return Double.NaN;
		}
	}
	public double porcentaje(int num, double porc) {
		if(porc >= 0.0 && porc <= 1.0) {
			return num*porc;
		}
		else {
			return Double.NaN;
		}
	}
	public int maximo (int num1, int num2, int num3) {
		if(num1>num2) {
			if (num1>num3) {
				System.out.println("El mayor es:"+num1);
			} 
			else {
				System.out.println("El mayor es:"+num3);
				}
					 }
			else
				if	(num2>num3) {
					System.out.println("El mayor es:"+num2);
								} 
			else {
				System.out.println("El mayor es:"+num3);
				}
			return num1*num2*num3;
	}
	public int promedio_valores(int num1, int num2, int num3, int num4, int num5) {
		return num1+num2+num3+num4+num5/5;
	}
}
--------------------------------------------------------------------------------------------------------------------------
	package uri_ejercicios;
import java.io.*;

public class ejercicios {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try
		{
			//Aca debe estar la logica que usted propone para resolver el problema
			//Leer de entero: int x = Integer.parseInt( br.readLine() )		
			int matriz [][] = new int [22][4]; //matriz de 4 columnas y 22 filas
			for (int i=0;i<22;i++) { //22 es la cantidad de estudiantes
				for(int j=0;j<4;j++) { //son 4 las notas de los estudiantes
					
					if(i==0 || i==21) { //asignar el valor en cada fila
						matriz[i][j] = 0;
					}
					else
						if (j==0 || j==3) { //asignar el valor en cada columna
						matriz[i][j] = 1;
					}
					else {
						matriz [i][j] = 0;
					}
				}
			}
			
			System.out.println("La matriz es: \n");
			for (int i=0;i<22;i++) {
				for (int j=0;j<4;j++) {
					System.out.print(matriz[i][j]+" ");
				}
				System.out.println(" ");
			}
			bw.flush();
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}
		
}
