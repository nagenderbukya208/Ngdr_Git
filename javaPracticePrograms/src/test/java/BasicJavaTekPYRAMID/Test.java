package BasicJavaTekPYRAMID;
class Parent {
    static void display() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Static method in Child class");
    }
}
public class Test {
	public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();

        parent.display(); // Calls Parent's display method
        child.display();  // Still calls Parent's display method
    }
}

