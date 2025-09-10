# Class Revision Notes: Object-Oriented Programming in Java

## Introduction to Classes

A class is essentially a blueprint for creating objects (a particular
data structure), providing initial values for state (member variables or
attributes), and implementations of behavior (member functions or
methods). In Java, classes are more than just a collection of data. They
provide the ability to define operations that can be performed on the
data, encapsulate attributes, and implement object-oriented principles
like inheritance and polymorphism.

## Key Concepts in Class Design

-   **Attributes**: These are the properties of the class. For example,
    in a Student class, attributes might include name, email, roll
    number, etc.
-   **Parameterized Constructors**: Constructors are special methods
    used to initialize objects. A parameterized constructor takes
    arguments to initialize the object's attributes.
-   **Dot Operator**: This is used to access the attributes and methods
    of an object. For example, `objectName.methodName()`.
-   **Static vs Non-Static Context**: Static methods belong to the
    class, rather than any object instance, and do not require an
    instance to be executed.

## Object-Oriented Principles

-   **Dynamic Space Allocation**: Java allows dynamic memory allocation
    which provides flexibility in managing memory allocated to variables
    and data structures.
-   **Inheritance**: Inheritance is a mechanism where a new class
    derives properties and behavior (methods) from another class. For
    example, you can have a Student class that is extended by SSTStudent
    and SSBStudent.
-   **Single Responsibility Principle**: Each class should have one
    responsibility or one reason to change, which makes the code more
    understandable and maintainable.
-   **Encapsulation and Abstraction**: Encapsulation refers to the
    bundling of data with methods that operate on the data. Abstraction
    means simplifying complex systems by modeling classes appropriate to
    the problem.
-   **Polymorphism**: Polymorphism allows one interface to be used for a
    general class of actions. It occurs when a parent class reference is
    used to refer to a child class object.

## Implementation Details

### Constructors

-   **Default Constructor**: A constructor which does not take any
    arguments.
-   **Parameterized Constructor**: Initializes objects with certain
    specified values.

### Methods

-   **Getters/Setters**: Functions to access and modify private
    attributes of the class.
-   **Utility Functions**: Functions to perform common tasks, such as
    calculating average grades (CGR), implemented using methods of the
    class.

### Example Implementation

``` java
public class Student {
    private String name;
    private String email;
    private int rollNumber;

    public Student(String name, String email, int rollNumber) {
        this.name = name;
        this.email = email;
        this.rollNumber = rollNumber;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Roll Number: " + this.rollNumber);
    }
}
```

In this example, `Student` class has private attributes and a
parameterized constructor to set initial values. It also has a method to
print the object's information.

## Design Considerations

-   **Loose Coupling vs Tight Coupling**: We should aim for loose
    coupling, meaning the components are independent and changes in one
    will not affect others.
-   **Maintainability and Extensibility**: Always structure code in a
    way that it is easy to understand, maintain, and extend.

## Keywords and Operators

-   **this Keyword**: Used to refer to the current object instance's
    variables and methods.
-   **static Keyword**: Used for class-level attributes and methods that
    can be accessed without creating an instance of the class.

## Conclusion

Object-oriented programming in Java revolves around designing classes
that model real-world entities, managing complexity through
encapsulation, abstraction, inheritance, and providing flexible and
maintainable code through principles such as the single responsibility
principle. By practicing these concepts, developers can write code that
is robust, reusable, and scalable.
