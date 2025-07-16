
# 🧠 Java Basics – Data Types and Operations

---

## ✅ 1. Precedence of Operations Inside `System.out.println` Statements

Java follows standard **operator precedence** rules.  
In `System.out.println` statements, **arithmetic operations** (`+`, `-`, `*`, `/`) are evaluated before **string concatenation**.

### 💡 Example:

```java
System.out.println(50 + "50" + 5 * 10);
```

- Multiplication is evaluated first: `5 * 10 = 50`
- Then, left-to-right evaluation:
  - `50 + "50"` → `"5050"`
  - `"5050" + 50"` → `"505050"`

✅ Output:
```
505050
```

---

## ✅ 2. Need for Variables

Variables **store data** that can be used and manipulated throughout a program.  
Using variables helps in making programs **dynamic and reusable**.

### 💡 Example:

```java
int count;
count = 10;
count = count + 1; // increment count by 1
System.out.println("Count is: " + count); // prints "Count is: 11"
```

---

## ✅ 3. Variable Initialization and Value Assignment

- **Initialization** gives a variable an initial value.
- **Assignment** changes the existing value.

### 💡 Example:

```java
int b = 20;
b = b + 30; // updates b to 50
b = b * 2;  // now b is 100
System.out.println(b); // prints 100
```

---

## ✅ 4. Limitations of the `int` Variable

- `int` is a 32-bit data type.
- It can **overflow** if values exceed its range.

### 🔸 Overflow Example:

```java
int a = 100000;
a = a * a * a * a * a; // causes overflow
System.out.println(a); // might print a negative number
```

### 🔸 Error Example:

```java
int a = 10000000000; // ❌ too large for int
// Compiler error: integer number too large
```

---

## ✅ 5. Bit and Byte

- A **bit** is a binary digit (0 or 1), the smallest data unit.
- A **byte** = 8 bits

---

## ✅ 6. Size of the `int` Variable

- An `int` in Java occupies **32 bits**.
- Range: `-2,147,483,648` to `2,147,483,647`

---

## ✅ 7. Using the `long` Variable for Larger Values

- `long` is a 64-bit integer type.
- Use it to store **very large values**.

### 💡 Example:

```java
long bigNumber = 9223372036854775807L; // max value for long
System.out.println(bigNumber);
```

---

## ✅ 8. Common Error with `long`

If you don't specify `L`, Java treats the number as `int`, which causes errors if the number is too big.

### 💡 Example:

```java
long a = 1000000000000L; // ✅ correct
long b = 1000000000000;  // ❌ error: literal out of range
```

---

## ✅ 9. Specifying a `long` Literal

Append `L` to the end of the number to mark it as a long value.

### 💡 Example:

```java
long distance = 5000000000L;
System.out.println("Distance: " + distance);
```

---

## ✅ 10. When You Can Omit the `L` Suffix

It is not always necessary to write the `L` suffix when assigning a value to a `long` variable if the literal fits within the `int` range. This is because:

- By default, integer literals in Java are of type `int`.
- If the literal value fits within the range of an `int` (`–2,147,483,648` to `2,147,483,647`), the compiler treats the literal as an `int` and then automatically widens it to a `long` when assigned to a `long` variable.

This means the following is valid:

```java
long b = 10000000; // no L needed here because 10,000,000 fits in int range
```

However, if the literal value exceeds the maximum `int` value, you **must** add the `L` suffix to explicitly mark it as a `long` literal, otherwise the code will fail to compile:

```java
long num = 15000000000;   // Compilation error: integer number too large
long num = 15000000000L;  // Correct usage with L suffix
```

This is because without the suffix, the compiler tries to treat the literal as an `int` first, and values larger than `int` range cause errors.

### ✅ Summary

| Condition                              | Is L suffix needed? | Reason                                           |
|----------------------------------------|----------------------|--------------------------------------------------|
| Literal within int range (e.g., 10,000,000) | No                   | Implicit widening conversion to `long`          |
| Literal beyond int range (e.g., 15,000,000,000) | Yes              | Must mark as long literal to compile            |

✅ **Best practice:** Always use uppercase `L` when writing `long` literals, to avoid confusion with the digit `1`.

In your example:

```java
long b = 10000000;
```

Since `10000000` fits within the `int` range, the compiler treats it as an `int` literal and then widens it to `long` when assigning to `b`—so the `L` is optional there.  
But if the number were larger than `int` capacity, you must write `10000000L` explicitly.


---

## ✅ 11. Why You Need `f` or `F` with `float` Literals

In Java, you need to write `f` or `F` at the end of a floating-point literal assigned to a `float` variable because floating-point literals without a suffix are considered `double` by default.

- `double` is a **64-bit** floating point and has **higher precision** than `float`, which is **32-bit**.

### 💡 Example:

```java
float num = 5.5;   // ❌ Compilation error: possible lossy conversion from double to float
float num = 5.5f;  // ✅ Correct: 5.5f is a float literal
```

If you try to assign a `double` literal (like `5.5`) directly to a `float` variable, the compiler prevents it due to potential precision loss and requires an explicit conversion (either using a cast or the `f` suffix).

By adding `f` or `F`, you explicitly tell the compiler: “This number should be treated as a `float`.”

### ✅ Summary:

You **must** write `f` with `float` variables to distinguish them from the default `double` literals and to avoid possible data loss from automatic conversions.
