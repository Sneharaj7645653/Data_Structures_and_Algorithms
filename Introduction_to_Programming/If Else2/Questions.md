# Programming Problems

---

## Q1. Categorise the number - Nested if-else

**Problem Description**  
Given the number N, Categorise the number according to the following condition:
1. Odd-Positive
2. Odd-Negative
3. Even-Positive
4. Even-Negative

**Note**: Intention of problem is to teach you Nested If-Else, so try to solve this problem using nested if-else.

**Problem Constraints**  
-10000 <= N <= 10000 except 0

**Input Format**  
Take Number in single line.

**Output Format**  
Print the statement, according to number N in single line.

**Example Input**  
Input 1 :  
15  
Input 2 :  
-38

**Example Output**  
Output 1 :  
Odd-Positive  
Output 2 :  
Even-Negative

**Example Explanation**  
N is 15, which is Odd and Positive.  
N is -38, which is Even and Negative.

---

## Q2. Relation of 18 with N

**Problem Description**  
Given a Number N, according to situation of N print the output.  
Situations of N are:
- if N is greater than 18, print "N is Greater than 18"
- Otherwise if N is less than 18, print "N is smaller than 18"
- Otherwise Print "N is equal to 18".

**Note**: Intention of this problem is to teach you use of else-if so try to solve it using else-if.

**Problem Constraints**  
-10000 <= N <= 10000

**Input Format**  
Take value of N in an int variable

**Output Format**  
Print situation of N in single line accordingly.

**Example Input**  
Input 1 :  
29  
Input 2 :  
18  
Input 3 :  
-45

**Example Output**  
Output 1 :  
N is Greater than 18  
Output 2 :  
N is equal to 18  
Output 3 :  
N is smaller than 18

**Example Explanation**  
Input N is 29, which is greater than 18.  
Input N is 18, which is equal to 18.  
Input N is -45, which is less than 18.

---

## Q3. Calculate Attendance

**Problem Description**  
Exams are near and Rahul is worried whether he will be allowed to take the exams or not.  
A student is not allowed to take the exams if his/her attendance is less than 75%.  
But Rahul is a little weak in math, so he wants your help to tell him whether he will be able to give exams or not.  
You are given the total number of classes held (T) and number of classes attended by Rahul (N), print YES or NO.

**Problem Constraints**  
1 <= T <= 1000  
1 <= N <= 1000

**Input Format**  
First line is T means total classes.  
Second line is N means classes attended by Rahul.

**Output Format**  
Print YES if Rahul’s attendance is >= 75%, otherwise print NO

**Example Input**  
150  
100

**Example Output**  
NO

**Example Explanation**  
T = 150, N = 100  
Attendance = (100 / 150) * 100 = 66.66%  
Attendance is less than 75%, so the output is NO.

---

## Q4. Employee Bonus

**Problem Description**  
A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.  
Ask user for their name and year of service and print whether they should receive bonus or not.

**Problem Constraints**  
1 <= years of service <= 100

**Input Format**  
First line contains name of the employee  
Second line contains the years of service

**Output Format**  
Print whether or not the employee will receive bonus.

**Example Input**  
Input 1:  
Mukesh  
6

Input 2:  
Shalini  
4

**Example Output**  
Output 1:  
Yes Mukesh will receive bonus.

Output 2:  
No Shalini will not receive bonus.

**Example Explanation**  
Since the years of service of Mukesh are more than 5, he will receive bonus.  
Since the years of service of Shalini are less than 5, she will not receive bonus.