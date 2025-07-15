# 📝 Notes

---

## 🔁 Difference Between Syntax and Semantics

- **Syntax** = Structure
- **Semantics** = Meaning

---

### 🧩 1. Syntactically Correct but Semantically Meaningless

Consider this Python code:

```python
x = 10
y = 0
z = x / y
```

- **Syntax:**  
  The code follows Python syntax rules perfectly — variable assignment and division are correct.

- **Semantics:**  
  Attempting to divide by zero (`x / y`) is semantically invalid because it causes a **runtime error** (division by zero is undefined).  
  So, while the program is syntactically valid, it is **semantically meaningless or incorrect**.

---

### 🧩 2. Semantically Meaningful but Syntactically Incorrect

Consider this intended Python code:

```python
x = 10
if x > 5
print("x is greater than 5")
```

- **Semantics:**  
  The meaning is clear — check if `x` is greater than 5 and print a message accordingly.

- **Syntax:**  
  The code has a **syntax error** because it lacks the colon (`:`) at the end of the `if` condition.  
  This makes it **syntactically incorrect**, and the program will not run, even though the intended semantics is clear.

---

## 📚 Java Basics

### 📦 Java Libraries

For common tasks like printing output or taking input, Java has pre-written code available in libraries, which can be used directly to avoid rewriting common code.

**Example:**
```java
import java.util.*;
```

---

### 🧱 Java Program Structure

Every Java program is structured inside classes, which can contain methods and variables.

**Example:**
```java
public class Main {
    public static void main(String[] args) {
        // code goes here
    }
}
```

---

## 🚀 Main Method in Java

- The `main()` method is the **entry point** of any Java program. It's where the program execution starts.
- The main method is a **function** that Java calls to run the program.
- **Functions** are constructs that take inputs (arguments), execute code, and can produce outputs.

---

## 🖨️ Printing Output

- Java provides methods like `print()` and `println()` as part of the `System.out` object.
- `System.out.print("Name");` – Prints `"Name"` to the console.
- `System.out.println("ASD");` – Prints `"ASD"` followed by a newline.

---

## 🔗 String Concatenation

- Using `+` between strings concatenates them.

**Example:**
```java
System.out.println("Hello, " + "world!");
```

This will print:
```
Hello, world!
```

---

## 🔢 Printing Numbers and Concatenation

- Numbers can be printed directly **without quotes**.
- When combining numbers and strings, **concatenation** occurs.

**Example:**
```java
int num = 5;
System.out.println("Number: " + num);
```

This will print:
```
Number: 5
```

---

## 🔀 Complex Concatenation Example

**What will happen if we do:**

```java
System.out.println(1000 + 1000 + "1000" + "1000");
```

### 🧠 Explanation:

- Java processes from **left to right**.
- `1000 + 1000` is evaluated first → `2000`
- `2000` is then concatenated with `"1000"` → `"20001000"`
- `"20001000"` is then concatenated with another `"1000"` → `"200010001000"`

So the final output is:
```
200010001000
```

This illustrates how Java handles **mixed arithmetic and string concatenation**.

---
