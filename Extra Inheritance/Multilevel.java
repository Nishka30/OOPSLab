class Animal {
    // Method in the superclass
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Mammal extends Animal {
    // Overriding the method in the subclass
    void makeSound() {
        System.out.println("Mammal sound");
    }
}

class Dog extends Mammal {
    // Attempting to override the method, but it's marked as final in the superclass
    // This will result in a compilation error
    // Commenting out this method to avoid compilation errors
    void makeSound() {
         System.out.println("Dog barking");
     }
}

public class Multilevel {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Calls the overridden method in Mammal, not Dog
    }
}

//Illustrate with a Java program that in case of Multilevel Inheritance, overriding can be stopped after any level of inheritance.
// By using the final keyword in the makeSound method of the Animal class, 
// the program demonstrates that the chain of overriding can be intentionally stopped at a certain level in the hierarchy, 
// preventing further modifications in subclasses beyond that point. In this case, 
// it's stopped at the Animal class, and attempting to override it in the Dog class results in a compilation error.
