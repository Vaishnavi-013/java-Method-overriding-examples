package labPrograms;

public class AnimalMain {
	
	public static void main(String[] args) {
		// Create objects of each class
		Animal genericAnimal = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();
		// Display the sounds made by each object
		System.out.println("Generic Animal sound:");
		genericAnimal.makeSound();
		System.out.println("Dog sound:");
		dog.makeSound();
		System.out.println("Cat sound:");
		cat.makeSound();
		}

}
