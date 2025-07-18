
# Questions

## Q1. Categorize Age of a Person
Given the age of a person, categorize it as:
- "Child" if 0 ≤ age ≤ 12
- "Teenager" if 13 ≤ age ≤ 19
- "Young" if 20 ≤ age ≤ 40
- "Middle-Aged" if 41 ≤ age ≤ 60
- "Senior-Citizen" if age > 60

**Input:**  
A single integer representing the age.

**Output:**  
Print the corresponding category.

---

## Q2. Fizz Buzz
Write a program that takes a number N and:
- Prints "Fizz" if N is a multiple of 3
- Prints "Buzz" if N is a multiple of 5
- Prints "FizzBuzz" if N is a multiple of both 3 and 5

**Input:**  
A single integer N (1 ≤ N ≤ 1000)

**Output:**  
"Fizz", "Buzz", or "FizzBuzz" accordingly.

---

## Q3. Which Triangle?
Given three sides of a triangle A, B, and C, determine the type of triangle:
- "equilateral" if all sides are equal
- "isosceles" if any two sides are equal
- "scalene" if all sides are different

**Input:**  
Three space-separated integers A, B, C

**Output:**  
One string: "equilateral", "isosceles", or "scalene"

---

## Q4. Music Certification
Given the number of albums sold (N), determine the certification:
- "diamond" if N ≥ 10,000,000
- "platinum" if N ≥ 1,000,000
- "gold" if N ≥ 500,000
- "None" otherwise

**Input:**  
A single integer N (1 ≤ N ≤ 10⁹)

**Output:**  
One string: "diamond", "platinum", "gold", or "None"

---

## Q5. Max of Three
Write a program to input three integers A, B, and C, and print the maximum.

**Input:**  
Three lines each containing one integer A, B, and C

**Output:**  
The maximum of the three integers

---

## Q6. Bank Account
Given a bank balance N and a transaction (Type, X):
- Type 1: ADD X to N
- Type 2: SUBTRACT X from N if X ≤ N, else print "Insufficient Funds"

**Input:**  
Line 1: Initial bank balance N  
Line 2: Two integers: Type (1 or 2), and Amount X

**Output:**  
New balance or "Insufficient Funds"

---

## Q7. Days in Month
Given a month number (1 to 12), print the number of days in that month assuming a non-leap year.

**Input:**  
An integer A (1 ≤ A ≤ 12)

**Output:**  
Number of days in the month

---

## Q8. Percentage and Grade
Given marks in 5 subjects (each out of 100), compute percentage and grade:
- Grade A: ≥ 90%
- Grade B: 80–89%
- Grade C: 70–79%
- Grade D: 60–69%
- Grade E: 40–59%
- Grade F: < 40%

**Input:**  
Five lines with one integer each (marks for each subject)

**Output:**  
Line 1: Integer percentage (floor value)  
Line 2: Grade (A to F)

---

## Q9. Confusion in Electricity Bill
Given units of electricity consumed (N), compute the bill:
- First 50 units: ₹0.50/unit
- Next 100 units: ₹0.75/unit
- Next 100 units: ₹1.20/unit
- Above 250 units: ₹1.50/unit
- Add 20% surcharge to total  
  Print the integer part of the total bill.

**Input:**  
One integer N (0 < N ≤ 100000)

**Output:**  
Integer value of total bill

---

## Q10. Pac-Man Game Rule
Given two binary inputs:
- Line 1: 1 if power pellet is active, 0 otherwise
- Line 2: 1 if touching a ghost, 0 otherwise  
  Pac-Man loses if touching a ghost and no power pellet.

**Input:**  
Two lines each with 0 or 1

**Output:**  
1 if Pac-Man loses, 0 otherwise
