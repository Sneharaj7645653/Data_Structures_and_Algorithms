# Overview
This class focused on introducing Object-Oriented Programming (OOP) concepts using Java. It covered the creation and use of classes and objects, constructors, and data encapsulation using a practical example of a Student class. The session also touched upon data structures like arrays and ArrayLists to manage collections of objects.

# Class and Object Concept
**Class as a Blueprint:** A class in Java serves as a blueprint for creating objects. It encapsulates data for the object and methods to manipulate that data【4:1†transcript.txt】.  
**Object:** An instance of a class that holds data and behavior defined by the class. For example, the Student class described has attributes like name, email, and phone number【4:0†transcript.txt】.

# Creating a Student Class
The Student class was used as an example, containing attributes like name, email, and phoneNumber, and grades like CGR (Cumulative Grade Report)【4:1†transcript.txt】.  
Similar to structs in C, a class in Java groups different types of data (e.g., string, double) into a single unit【4:7†transcript.txt】【4:15†transcript.txt】.

# Objects in Practice
**Object Creation:** To create an object of a class, you instantiate the class:
```java
Student s1 = new Student(); // Default constructor
```
Here, s1 is an object with default values【4:8†transcript.txt】.

**Accessing Object Attributes:** Use the dot operator:
```java
s1.name = "Aditya";
s1.email = "aditya@example.com";
```
This sets the name and email attributes of the s1 object【4:8†transcript.txt】.

# Constructors
**Default Constructor:** Automatically provided if no custom constructor is defined, initializes object with default values【4:14†transcript.txt】.

**Parameterized Constructor:** Allows initializing attributes with specific values:
```java
public Student(String name, String email, String phoneNumber) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
}
Student s2 = new Student("Vikram", "vikram@example.com", "9876543210");
```
Here, s2 is initialized with specific values【4:12†transcript.txt】.

# Arrays and ArrayLists
**Array of Objects:** Arrays can hold multiple objects, each corresponding to a class instance. Example for Student objects:
```java
Student[] students = new Student[100];
```
Each index in the array can be a distinct Student object【4:3†transcript.txt】.

**ArrayList:** More flexible, allows dynamic resizing. Useful when the number of objects isn't fixed:
```java
ArrayList<Student> studentList = new ArrayList<Student>();
```
Ideal for managing collections of objects dynamically【4:3†transcript.txt】.

# Practical Applications in OOP
- **Encapsulation:** By using classes, the internal representation of data is hidden from outside access unless explicitly allowed.
- **Simplified Data Management:** Classes allow combining various data types into a coherent unit, simplifying data management and manipulation【4:11†transcript.txt】.

# Conclusion and Next Steps
The class concluded with a discussion on the advantages of using OOP, such as reduced code redundancy and improved code management. Students were encouraged to practice creating classes and objects, implementing constructors, and exploring more about data encapsulation in Java. The next session is expected to cover more advanced OOP concepts.
