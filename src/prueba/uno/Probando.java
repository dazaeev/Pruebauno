package prueba.uno;

import javax.swing.JOptionPane;

public class Probando {
	
	public static void main(String []args) {
		
		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame un numero"));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame un numero"));
		
		System.out.println("El resultado es: " + (n1 + n2));
		
		if (n1 > n2) {
			System.out.println("N1 es mayor que N2");
		} else {
			if (n1 == n2) {
				System.out.println("N1 es igual a N2");
			} else {
				System.out.println("N1 es menor que N2");
			}
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("El varlor de i = " + i);
		}
	}
}