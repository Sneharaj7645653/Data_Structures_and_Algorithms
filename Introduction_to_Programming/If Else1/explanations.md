
# Revision Notes: If-Else Statements & Operators

## Introduction to If-Else Statements

If-Else statements are control flow statements that help in making decisions based on conditions in code.

### Basic Structure

```java
if (condition) {
    // code to be executed if the condition is true
} else {
    // code to be executed if the condition is false
}
```

The `else` block is optional.

### Boolean Conditions

Conditions typically use comparison operators and return a boolean value:

```java
if (num1 > num2) {
    System.out.println("num1 is greater");
} else {
    System.out.println("num1 is not greater");
}
```

---

## 1. Else If Ladder

Used to check multiple conditions sequentially.

```java
int number = 25;
if (number > 30) {
    System.out.println("Greater than 30");
} else if (number > 20) {
    System.out.println("Greater than 20");
} else if (number > 10) {
    System.out.println("Greater than 10");
} else {
    System.out.println("10 or less");
}
```

**Quiz:** What will get printed?

---

## 2. Max of Three Numbers Using Else/If

```java
int a = 12, b = 25, c = 9;
if (a >= b && a >= c) {
    System.out.println("Max is: " + a);
} else if (b >= a && b >= c) {
    System.out.println("Max is: " + b);
} else {
    System.out.println("Max is: " + c);
}
```

---

## 3. Max of Four Numbers Using Else/If

```java
int a = 45, b = 20, c = 70, d = 50;
if (a >= b && a >= c && a >= d) {
    System.out.println("Max is: " + a);
} else if (b >= a && b >= c && b >= d) {
    System.out.println("Max is: " + b);
} else if (c >= a && c >= b && c >= d) {
    System.out.println("Max is: " + c);
} else {
    System.out.println("Max is: " + d);
}
```

---

## 4. Max of Four Numbers Using a Single Max Variable

```java
int a = 45, b = 20, c = 70, d = 50;
int max = a;
if (b > max) max = b;
if (c > max) max = c;
if (d > max) max = d;
System.out.println("Max is: " + max);
```

---

## 5. % Mod Operator and Remainder

```java
System.out.println(10 % 3); // Outputs 1
System.out.println(10 % 5); // Outputs 0
```

The modulus operator `%` returns the remainder of a division.

---

## 6. Even or Odd Program

```java
int num = 4;
if (num % 2 == 0) {
    System.out.println(num + " is even");
} else {
    System.out.println(num + " is odd");
}
```

---

## 7. FizzBuzz Program

```java
int i = 30;
if (i % 15 == 0) {
    System.out.println("FizzBuzz");
} else if (i % 3 == 0) {
    System.out.println("Fizz");
} else if (i % 5 == 0) {
    System.out.println("Buzz");
}
```

---

## Notes on Java Operators

### Arithmetic Operators

- `+` : Addition
- `-` : Subtraction
- `*` : Multiplication
- `/` : Division
- `%` : Modulus

### Assignment Operators

- `=` : Assignment
- `+=` : Addition assignment
- `-=` : Subtraction assignment
- `*=` : Multiplication assignment
- `/=` : Division assignment
- `%=` : Modulus assignment

### Relational Operators

- `==` : Equal to
- `!=` : Not equal to
- `>` : Greater than
- `<` : Less than
- `>=` : Greater than or equal to
- `<=` : Less than or equal to

### Logical Operators

- `&&` : Logical AND
- `||` : Logical OR
- `!` : Logical NOT

### Unary Operators

- `+` : Unary plus
- `-` : Unary minus
- `++` : Increment
- `--` : Decrement
- `!` : Logical complement

---

## Practice Exercises

1. Write a program to check if a number is positive, negative, or zero using if-else.
2. Take age as input and check voting eligibility for the next election.
3. Implement FizzBuzz from 1 to N.

---

## Conclusion

- If-Else is a foundational concept in programming.
- Practice is essential for mastery.
- Think of real-world analogies like ATM logic for better understanding.
