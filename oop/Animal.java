package oop;
 // Method overriding - Run Time polymorphism.

class Dog extends Animal {

    @Override
    public void makeSound(){                // Same method in child class.
        System.out.println("Dog barks");
    }
}
public class Animal {

    public void makeSound(){ // Same method in parent class.
        System.out.println("Animal makes sound.");

    }

    public static void main(String[] args) {
        //Dog dog = new Dog();
       // dog.makeSound();

        Animal dog = new Dog(); // method overriding - condition: parents class should have same method of child class.
                                // in method overriding we should practice mentioning @override.
        dog. makeSound();
        }

       // Animal animal = new Animal();
        //animal.makeSound();
}


