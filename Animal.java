package labPrograms;

class Animal {
	// Method in the Animal class
	public void makeSound() {
	System.out.println("The animal makes a sound.");
	}
	}
	// Create a subclass called Dog that inherits from Animal
	class Dog extends Animal {
	// Override the makeSound method in Dog class
	@Override
	public void makeSound() {
	System.out.println("The dog barks.");
	}
	}
	// Create a subclass called Cat that inherits from Animal
	class Cat extends Animal {
	// Override the makeSound method in Cat class
	@Override
	public void makeSound() {
	System.out.println("The cat meows.");
	}
	}