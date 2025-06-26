package prueba.uno;

import javax.swing.JOptionPane;

public class CreaPersona {
	
	static String nombre;
	static String apellidoPaterno;
	static String apellidoMaterno;
	static Integer edad;

	public static void main(String[] args) {
		nombre = JOptionPane.showInputDialog(null, "Dame tu nombre: ");
		apellidoPaterno = JOptionPane.showInputDialog(null, "Dame tu apellido paterno: ");
		apellidoMaterno = JOptionPane.showInputDialog(null, "Dame tu apellido materno: ");
		edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame tu edad: "));
		
		String datos = datosPersona(nombre, apellidoPaterno, apellidoMaterno, edad);
		System.out.println(datos);
		
		Integer obtenerEdad = cacularEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Año de nacimiento: ")));
		System.out.println("Tu edad calculada es: " + obtenerEdad);
	}
	
	// Metodo que obtiene datos completos de persona
	public static String datosPersona(String nom, String aP, String aM, Integer edad) {
		// System.out.println("Tu nombre es " + nom + " " + aP + " " +aM);
		// System.out.println("Y tienes " + edad + " años");
		return "Tu nombre es " + nom + " " + aP + " " + aM + " y tienes " + edad + " años.";
	}
	
	// Metodo que calcula la edad
	public static Integer cacularEdad(Integer anioNacimiento) {
		Integer anioActual = Integer.parseInt(JOptionPane.showInputDialog(null, "En que año estamos: "));
		return anioActual - anioNacimiento;
	}
}
