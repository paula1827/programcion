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
