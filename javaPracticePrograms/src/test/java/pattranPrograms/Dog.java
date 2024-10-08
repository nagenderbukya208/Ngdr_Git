package pattranPrograms;


	class Animal {
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

public	class Dog extends Animal {
	public static void main(String[] args) {
		Dog a1= new Dog();
		a1.sound();
	}
	    void sound() {
	    	super.sound();
	        System.out.println("Dog barks");

	}
}



