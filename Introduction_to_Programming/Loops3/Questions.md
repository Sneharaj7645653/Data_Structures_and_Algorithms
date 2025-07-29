
# Practice Questions

## Q1. LCM - Easy

**Problem Description**  
Implement a program that takes two positive integers A and B in the input and prints their LCM.

**Definition of LCM**: The Least Common Multiple or LCM of two numbers say A and B, is denoted as LCM(A,B). And the LCM is the smallest or least positive integer that is divisible by both A and B.

**Problem Constraints**  
1 <= A,B <= 200

**Input Format**  
Two space separated integers A and B in the input.

**Output Format**  
Output a single integer that is the LCM of A and B.

**Example Input**  
Input 1:  
5 10  
Input 2:  
2 3

**Example Output**  
Output 1:  
10  
Output 2:  
6

**Example Explanation**  
Explanation 1: LCM(5,10)=10  
Explanation 2: LCM(2,3)=6

---

## Q2. HCF - Easy

**Problem Description**  
Write a program to input two integers A & B from user and print their HCF.

**Definition Of HCF**: The HCF (Highest Common Factor) or the GCD (Greatest Common Divisor) of two positive integers is the largest positive integer that divides the numbers without leaving a remainder.

**Problem Constraints**  
1 <= A,B <= 100000

**Input Format**  
First line will contain 2 integers A and B

**Output Format**  
An integer which is the HCF of A & B.

**Example Input**  
Input 1:  
15 105  
Input 2:  
24 36

**Example Output**  
Output 1:  
15  
Output 2:  
12

---

## Q3. Print the Primes!

**Problem Description**  
You are given an integer N you need to print all the Prime Numbers between 1 and N.

Prime numbers are numbers that have only 2 factors: 1 and themselves.

**Problem Constraints**  
1 <= N <= 300

**Input Format**  
First and only line of input contains a single integer N.

**Output Format**  
Print all the prime numbers between 1 and N each in a new line.

**Example Input**  
Input 1:  
5  
Input 2:  
10

**Example Output**  
Output 1:  
2  
3  
5  
Output 2:  
2  
3  
5  
7

**Example Explanation**  
Explanation 1: Prime numbers between [1, 5] are (2, 3, 5).  
Explanation 2: Prime numbers between [1, 10] are (2, 3, 5, 7)

---

## Q4. Armstrong Numbers!

**Problem Description**  
You are given an integer N. You need to print all the Armstrong Numbers between 1 to N (inclusive).

If the sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.

**Note**: All the test cases in this problem are limited to 3-digit numbers.

**Problem Constraints**  
1 <= N <= 500

**Input Format**  
First and only line of input contains an integer N.

**Output Format**  
Output all the Armstrong numbers in range [1, N] each in a new line.

**Example Input**  
Input 1:  
5  
Input 2:  
200

**Example Output**  
Output 1:  
1  
Output 2:  
1  
153

**Example Explanation**  
Explanation 1: 1 is an armstrong number.  
Explanation 2: 1 and 153 are Armstrong numbers under 200.

---

## Q5. Calculate the Steps

**Problem Description**  
Given a number N, each time N gets divided by 2. How many times do we need to divide N by 2 in order to get 1 as the final result?

**Note**: Try to solve this question using a while loop for learning purposes.

**Problem Constraints**  
1 <= N <= 1000

**Input Format**  
Value of N

**Output Format**  
Print the number of steps we need to divide N by 2 to reach 1.

**Example Input**  
35

**Example Output**  
5

**Example Explanation**  
N = 35 → 17 → 8 → 4 → 2 → 1. Total steps = 5

---

## Q6. Print N stars

**Problem Description**  
Given an integer N, print N stars in a single line.

**Example**: If N = 5, then the output is: *****

**Problem Constraints**  
2 <= N <= 100

**Input Format**  
Single line input contains a single integer N.

**Output Format**  
Output N stars in a single line.

**Example Input**  
Input 1:  
2  
Input 2:  
3

**Example Output**  
Output 1:  
**  
Output 2:
***  

**Example Explanation**  
Print the pattern as described.

---

## Q7. Print a matrix of stars

**Problem Description**  
Given two integers N and M as inputs, print a rectangle of N * M stars.

**Example**:  
If N = 3, M = 4, the output is:
****  
****  
****  

**Problem Constraints**  
2 <= N, M <= 100

**Input Format**  
First line of input contains an integer N (number of rows).  
Second line of input contains an integer M (number of columns).

**Output Format**  
Output N * M rectangle of stars.

**Example Input**  
Input 1:  
2  
3  
Input 2:  
3  
1

**Example Output**  
Output 1:
***  
***  
Output 2:
*
*
*

**Example Explanation**  
Print the pattern as described.
