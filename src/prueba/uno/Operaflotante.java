package prueba.uno;


import javax.swing.JOptionPane;

public class Operaflotante {
	
	static Integer num1;
	static Integer num2;
	
	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame un numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame un numero"));
		
		String operacionTexto = JOptionPane.showInputDialog(null,"Seleccione la operacion(+,-,*,/):");
	
		char operacion = operacionTexto.charAt(0);
	
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
			if (n2 != 0) {
				resultado = (double)
				n1/n2;
			} else {
				JOptionPane.showMessageDialog(null, "no se puede dividir entre cero.");
				return;
			}
			break;
			default:
				JOptionPane.showMessageDialog(null, "Operacion no valida.");
				return;
		}
		JOptionPane.showMessageDialog(null, "El resultado es:" + resultado);			
	}
}
	



