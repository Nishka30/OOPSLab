class Animal {
    // Static method in the superclass
    static void printInfo() {
        System.out.println("Info from Animal");
    }
}

class Mammal extends Animal {
    // Hiding the static method in the subclass
    static void printInfo() {
        System.out.println("Info from Mammal");
    }
}

public class AnimalHiding {
    public static void main(String[] args) {
        // Accessing static method from the superclass
        Animal.printInfo();  // Output: Info from Animal

        // Accessing static method from the subclass
        Mammal.printInfo();  // Output: Info from Mammal

        // Accessing static method from the superclass using reference to subclass
        Animal animal = new Mammal();
        animal.printInfo();  // Output: Info from Animal (not overridden, as it's a static method)
    }
}


// E6.2. Illustrate with a Java Program that if the static method is redefined by a derived class, then it is not overriding, it is hiding.
// In conclusion, the program illustrates that if a static method is redefined (provided with a new implementation) in a derived class, 
// it is not considered overriding; it is method hiding. The choice of which method to call is determined at compile time based on the 
// reference type, not the actual object type, as is the case with method overriding for instance methods.





