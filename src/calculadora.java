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
