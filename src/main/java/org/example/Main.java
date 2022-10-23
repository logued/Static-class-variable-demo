package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dog object Counter - using static variable");

        // create two instances of the Dog class (i.e. two objects)
        Dog dog1 = new Dog("Spot",6);
        Dog dog2 = new Dog("Lassie",7);

        // To access a class method (static method we use the following syntax:
        //  ClassName.methodName,   so here, Dog.getCount() accesses the static method.

        System.out.println("Number of Dog objects = " + Dog.getCount());

        // We can NOT call getCount() on a Dog instance (object)
        // i.e.  dog1.getCount() - is an ERROR
        // because, the getCount method does not exist for an object,
        // it exists only for the class.

    }
}