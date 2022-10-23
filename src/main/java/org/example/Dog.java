package org.example;

/**
 * Demonstrates use of a "class variable", which is a variable that is declared
 * using the "static" keyword.  e.g. "static int count"
 * Static variables belong to the class, and are NOT created as fields in each object when
 * we instantiate the class. So, when we create Dog objects below, the Dog objects will
 * NOT have count instance fields in them.  Instead, there is only one variable called
 * count, and it belongs to the class. The class exists as a structure in its own right,
 * independent of the objects (instances) that are created based on the class.
 *
 * We can use the static count variable to count the number of Dog objects created by
 * incrementing the count by one each time the Dog constructor is called.
 *
 */

public class Dog {

    // instance variables appear in every instance of a class
    private String name;
    private int age;
    // a static class variable exists only once in the class, but NOT in th objects created
    private static int count=0; // class variable used to count the number of instances created

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        count++;        // add 1 to static class variable each time a Dog object is constructed
    }

    // We create a static method to access the static variable count.
    // The static method belongs to the class, so we have to call the method
    // using the syntax:  ClassName.methodName()    (See the call in main())
    public static int getCount() {
        return count;
    }
}
