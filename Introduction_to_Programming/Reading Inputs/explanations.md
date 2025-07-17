
# 📥 Java Basics – Taking User Input & Boolean Logic

---

## ✅ How to Take Input in Java

Taking input from the user is a common requirement in Java applications. One of the most common and easy ways to handle this is by using the `Scanner` class from the `java.util` package.

---

### 🔹 Setting Up Scanner

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Code to take inputs will go here
        scanner.close(); // It's important to close the scanner
    }
}
```

---

### 🔹 Taking String Input

```java
System.out.print("Enter a word: ");
String word = scanner.next(); // Reads a single word
System.out.println("You entered: " + word);

System.out.print("Enter a line of text: ");
scanner.nextLine(); // Consume leftover newline
String line = scanner.nextLine(); // Reads a full line
System.out.println("You entered: " + line);
```

---

### 🔹 Taking Integer Input

```java
System.out.print("Enter an integer: ");
int number;
try {
    number = scanner.nextInt();
    System.out.println("You entered: " + number);
} catch (InputMismatchException e) {
    System.out.println("That's not a valid integer.");
}
```

---

### 🔹 Taking Double Input

```java
System.out.print("Enter a double: ");
double value;
try {
    value = scanner.nextDouble();
    System.out.println("You entered: " + value);
} catch (InputMismatchException e) {
    System.out.println("That's not a valid double.");
}
```

---

### 🔹 Important Notes

- When switching between different types of input, call `nextLine()` to consume any leftover newline.
- Always close the Scanner using `scanner.close()` to free resources.

---

### 🔹 Example Application

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            System.out.print("Enter your GPA: ");
            double gpa = scanner.nextDouble();
            System.out.println("Hello, " + name + "! You are " + age +
            " years old and your GPA is " + gpa);
        } catch (InputMismatchException e) {
            System.out.println("You entered incorrect data.");
        } finally {
            scanner.close();
        }
    }
}
```

---

## ✅ Boolean Data Type in Java

### 🔹 Overview

- `boolean` has two possible values: `true` and `false`.
- Used for flags and conditional logic.

### 🔹 Example

```java
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun); // true
System.out.println(isFishTasty); // false
```

---

## ✅ Comparison Operators

| Operator | Meaning                |
|----------|------------------------|
| `==`     | Equal to               |
| `!=`     | Not equal to           |
| `>`      | Greater than           |
| `<`      | Less than              |
| `>=`     | Greater than or equal  |
| `<=`     | Less than or equal     |

```java
int x = 5, y = 3;
System.out.println(x == y);  // false
System.out.println(x != y);  // true
System.out.println(x > y);   // true
System.out.println(x < y);   // false
System.out.println(x >= 3);  // true
System.out.println(x <= 5);  // true
```

---

## ✅ Logical Operators

| Operator | Description                                |
|----------|--------------------------------------------|
| `&&`     | Logical AND – both must be true            |
| `||`     | Logical OR – at least one must be true     |
| `!`      | Logical NOT – reverses the result          |

```java
boolean a = true, b = false;
System.out.println(a && b); // false
System.out.println(a || b); // true
System.out.println(!a);     // false
```

---

## ✅ Short-Circuit Evaluation

### 🔹 AND (`&&`) Short-Circuit

```java
int x = 5;
boolean result = (x < 10) && ((x = x + 1) > 10);
System.out.println(result); // false
System.out.println(x);      // 6
```

### 🔹 OR (`||`) Short-Circuit

```java
int y = 20;
boolean result = (y > 10) || ((y = y + 1) > 30);
System.out.println(result); // true
System.out.println(y);      // 20
```

---

## ✅ Taking Boolean Input

### 🔹 Using `nextBoolean()`

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Are you married (true/false): ");
boolean isMarried = scanner.nextBoolean();
System.out.println("You are married: " + isMarried);
scanner.close();
```

- Valid inputs: `true`, `false` (case-insensitive)
- Invalid input throws `InputMismatchException`

### 🔹 Custom Input (e.g., yes/no)

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Are you 18 years or older? (yes/no): ");
String input = scanner.nextLine().toLowerCase();
boolean isAdult = input.equals("yes");
System.out.println("Is adult: " + isAdult);
scanner.close();
```

---

### ✅ Valid Values for `nextBoolean()`

Only the following inputs will not cause an error:

- `true`, `false`
- `TRUE`, `FALSE`
- `True`, `False`

Any other value will cause an `InputMismatchException`.

### 🔹 How to Check for Valid Boolean Input

```java
if (scanner.hasNextBoolean()) {
    boolean value = scanner.nextBoolean();
    System.out.println("Valid boolean: " + value);
} else {
    System.out.println("Invalid boolean input.");
}
```

- `hasNextBoolean()` checks if the next token is a valid boolean.
- Prevents exceptions by validating input before reading.

