# 📚 Arrays in Java: Comprehensive Revision Notes

## 📝 Introduction to Arrays

### 🔍 What is an Array?
An **array** in Java is a collection of elements of the **same type**.  
They allow you to store multiple values in a **single variable**, instead of declaring separate variables for each value.

---

## 🧩 Array Types

- **Integer Arrays** → Stores integers: `int[]`
- **Double Arrays** → Stores decimal numbers: `double[]`
- **String Arrays** → Stores strings: `String[]`
- **Character Arrays** → Stores characters: `char[]`
- **Nested Arrays** → Arrays within arrays: `int[][]`

---

## 🏗 Structure of an Array
Arrays in Java have these properties:
- **Fixed size** → Once created, cannot change size.
- **Stored in contiguous memory**.
- **Same data type** for all elements.
- **Index-based access** → First element index is `0`.

---

## ✏ Syntax to Create an Array

**Step 1: Declare the array**
```java
int[] marks;
```

**Step 2: Instantiate the array**
```java
marks = new int[5];
```

**One-line declaration & initialization:**
```java
int[] marks = new int[5];
```

---

## 📏 Array Size
The size of an array must be specified when it is created:
```java
int[] marks = new int[5]; // Can store 5 integers
```

---

## 🎯 Accessing & Modifying Elements

**Access:**
```java
int firstMark = marks[0]; // Access first element
```

**Modify:**
```java
marks[0] = 95; // Change first element to 95
```

---

## ⚙ Basic Operations on Arrays

### 1️⃣ Initializing an Array
```java
int[] marks = {85, 90, 95, 80, 75};
```

### 2️⃣ Iterating Over an Array
```java
for (int i = 0; i < marks.length; i++) {
    System.out.println(marks[i]);
}
```

---

## 🧮 Common Array Problems

### 🔹 Summation of Elements
```java
int sum = 0;
for (int i = 0; i < marks.length; i++) {
    sum += marks[i];
}
System.out.println("Sum: " + sum);
```

### 🔹 Average of Elements
```java
double average = (double) sum / marks.length;
System.out.println("Average: " + average);
```

### 🔹 Maximum & Minimum
```java
int max = marks[0], min = marks[0];
for (int i = 1; i < marks.length; i++) {
    if (marks[i] > max) max = marks[i];
    if (marks[i] < min) min = marks[i];
}
System.out.println("Max: " + max + ", Min: " + min);
```

### 🔹 Count Even & Odd Numbers
```java
int evenCount = 0, oddCount = 0;
for (int num : marks) {
    if (num % 2 == 0) evenCount++;
    else oddCount++;
}
System.out.println("Even: " + evenCount + ", Odd: " + oddCount);
```

### 🔹 Check if Two Arrays are Identical
```java
boolean areIdentical = true;
if (arr1.length != arr2.length) areIdentical = false;
else {
    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i]) {
            areIdentical = false;
            break;
        }
    }
}
System.out.println("Identical: " + areIdentical);
```

### 🔹 Reverse an Array
```java
for (int i = 0; i < marks.length / 2; i++) {
    int temp = marks[i];
    marks[i] = marks[marks.length - 1 - i];
    marks[marks.length - 1 - i] = temp;
}
```

### 🔹 Check if Array is Palindrome
```java
boolean isPalindrome = true;
for (int i = 0; i < marks.length / 2; i++) {
    if (marks[i] != marks[marks.length - 1 - i]) {
        isPalindrome = false;
        break;
    }
}
System.out.println("Palindrome: " + isPalindrome);
```

---

## ⚠ Important Points to Remember
- Arrays are **zero-indexed**.
- Size is **fixed after creation**.
- Avoid **ArrayIndexOutOfBoundsException**.
- Arrays are efficient for **read** operations but costly for **append**.

---

## 💥 Example: Array Index Out of Bound
```java
int[] marks = new int[5];
int outOfBoundElement = marks[5]; // ❌ Error
```

---

## 🏁 Conclusion
Arrays are a **fundamental building block** in Java.  
By mastering operations like **iteration, summation, reversal, and comparison**, you will be equipped to handle **complex problems** efficiently.

✨ **Practice regularly** to strengthen your understanding and prepare for advanced Java topics!
