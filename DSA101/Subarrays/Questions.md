# Problem Notes

## Problem 1: Subarrays with Prime Sum

### Problem Statement
You are given an integer array **A** of size **N**.  
You have to find the number of subarrays whose sum is a **prime number**.

### Input Format
- The first argument is an array `A`, having `N` integers.

### Output Format
- Return an integer, i.e., the number of subarrays with a prime sum.

### Constraints
- 1 <= N <= 10^3
- 1 <= A[i] <= 10^3

### Example
**Input**
```
A = [1, 2, 3]
```

**Output**
```
4
```

**Explanation**
```
Subarray        Sum
[1]             1 (not prime)
[1, 2]          3 (prime)
[1, 2, 3]       6 (not prime)
[2]             2 (prime)
[2, 3]          5 (prime)
[3]             3 (prime)
```

Here, there are **4 subarrays** with a prime sum.

### Approach
1. Generate all subarrays using two loops.
2. Compute sum of each subarray.
3. Check if the sum is prime.
4. Count and return the number of prime sums.

### Pseudocode (Python)
```python
def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

def count_prime_sum_subarrays(arr):
    n = len(arr)
    count = 0
    for i in range(n):
        curr_sum = 0
        for j in range(i, n):
            curr_sum += arr[j]
            if is_prime(curr_sum):
                count += 1
    return count

# Example
A = [1, 2, 3]
print(count_prime_sum_subarrays(A))  # Output: 4
```

---

## Problem 2: Amazing Substrings

### Problem Statement
You are given a string **S**, and you have to find all the **Amazing Substrings** of S.  
An **Amazing Substring** is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

### Input Format
- First line contains an integer `T` i.e. number of test cases.
- Next `T` lines contain a string `S`.

### Output Format
- For each test case, print an integer `X % 10003` in a new line, where `X` is the number of amazing substrings in the given string.

### Constraints
- 1 <= T <= 1000
- 1 <= length(S) <= 10^6
- S can have special characters
- Number of characters in each file doesn't exceed 10^6

### Example
**Input**
```
1
ABEC
```

**Output**
```
6
```

**Explanation**
```
Amazing substrings are:
1. A
2. AB
3. ABE
4. ABEC
5. E
6. EC
```
Hence, result = 6 % 10003 = 6

### Approach
1. For each character in string `S`, if it is a vowel, then all substrings starting from this character are amazing.
2. If character is at index `i` in a string of length `n`, then number of substrings starting at `i` = `(n - i)`.
3. Add these counts for all vowel positions.
4. Take result modulo `10003`.

### Pseudocode (Python)
```python
def count_amazing_substrings(S):
    vowels = set("aeiouAEIOU")
    n = len(S)
    count = 0
    for i in range(n):
        if S[i] in vowels:
            count += (n - i)
    return count % 10003

# Example
print(count_amazing_substrings("ABEC"))  # Output: 6
```

---

## Summary
- **Problem 1**: Count subarrays with prime sum using nested loops and prime check.
- **Problem 2**: Count substrings starting with vowels using direct formula `(n - i)`.  
