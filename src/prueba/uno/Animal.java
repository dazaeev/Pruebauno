package prueba.uno;

public class Animal {
	static String nombre;
	Float peso;
	String raza;
	
	Animal(String nombreDelAnimal, float pesoDelAnimal, String razaDelAnimal)
	{
		
		nombre = nombreDelAnimal;
		peso = pesoDelAnimal;
		raza = razaDelAnimal;
		
	}

	public static void main(String[] args) {
		Animal Animal1;
		
		Animal animal1 = new Animal ("Bambi", 1.5f, "chihuahua");
		
		Animal animal2 = new Animal ("kalid", 5, "criollo");
		
		System.out.println(animal1.nombre);
		System.out.println(animal2.peso);
		
		
		
	}
}
