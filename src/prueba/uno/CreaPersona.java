package prueba.uno;

import javax.swing.JOptionPane;

public class CreaPersona {
	
	static String nombre;
	static String apellidoPaterno;
	static String apellidoMaterno;
	static Integer edad;
	static String sexo;
	static String nacionalidad;
	static String estadoCivil;

	public static void main(String[] args) {
		
		nombre = JOptionPane.showInputDialog(null, "Dame tu nombre: ");
		apellidoPaterno = JOptionPane.showInputDialog(null, "Dame tu apellido paterno: ");
		apellidoMaterno = JOptionPane.showInputDialog(null, "Dame tu apellido materno: ");
		edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame tu edad: "));
		sexo = JOptionPane.showInputDialog(null, "Que sexo eres");
		nacionalidad = JOptionPane.showInputDialog(null, "Cual su nacionalidad");
		estadoCivil = JOptionPane.showInputDialog(null, "Cual es tu estado civil");
		

	
		String datos = datosPersonales (nombre, apellidoPaterno, apellidoMaterno, edad, sexo, nacionalidad, estadoCivil);
		System.out.println(datos);
	
		Integer obtenerEdad = cacularEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Año de nacimiento: ")));
		System.out.println("Tu edad calculada es: " + obtenerEdad);
	}
	
	// Metodo que obtiene datos completos de persona
	
	
	public static String datosPersonales(String nombre, String aP, String aM, Integer edad, String sexo, String nac, String eC){
		
		String resultado = "Tu nombre es: " + nombre + " " + aP + " " + aM + "\n";
	    resultado += "Tienes: " + edad + " años\n";
	    resultado += "Tu sexo es: " + sexo + "\n";
	    resultado += "Con una nacionalidad: "+ nac + "\n";
	    resultado += "Tu estado civil es: " + eC;

	    return resultado;
	}
	
	// Metodo que calcula la edad
	public static Integer cacularEdad(Integer anioNacimiento) {
		Integer anioActual = Integer.parseInt(JOptionPane.showInputDialog(null, "En que año estamos: "));
		return anioActual - anioNacimiento;
	}
}
