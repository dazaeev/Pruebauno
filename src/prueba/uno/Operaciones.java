package prueba.uno;

import java.util.Scanner;



public class Operaciones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese el primer numero:");
		double num1 = scanner.nextDouble();
		
		System.out.println("Ingrese el segundo numero:");
		double num2 = scanner.nextDouble();
		
		System.out.println ("Seleccione la operacion(+,-,*,/):");
		char operacion = scanner.next().charAt(0);
	
		
		double resultado = 0;
		
		switch (operacion) {
		case '+':
			resultado = num1 + num2;
			break;
		case'-':
			resultado = num1 - num2;
			break;
		case'*':
			resultado = num1 * num2;
			break;
		case'/':
			if (num2 != 0) {
			resultado = num1 / num2;
			}else {
				System.out.println("Error: no se puede dividir por cero");
				return;
			}
			break;
			default:
				System.out.println ("Operacion Invalida.");
				return;
				
		}
		
		System.out.println ("El resultado es:"+ resultado);
		scanner.close();
		
				
			}
			
		}
		
		
		
		// TODO Auto-generated method stub
