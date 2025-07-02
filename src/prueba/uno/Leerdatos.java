package prueba.uno;

import java.util.Scanner;

public class Leerdatos {

	public static void main(String [] args) 
	{
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("por favor, ingrese su nombre");
		String nombre = sc.nextLine();
		
		System.out.println("por favor, ingresa su edad");
		int edad = sc.nextInt();
		
		System.out.println (nombre + " en 10 años tendra " + (edad + 10) + "años");
		
			
		// TODO Auto-generated method stub

	}

}
