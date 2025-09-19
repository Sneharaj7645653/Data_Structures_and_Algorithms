# Subarrays

## Introduction
A **subarray** is a contiguous part of an array. Unlike subsequences, subarrays consist of consecutive elements from the original array.

For example, if the array is:
```
A = [1, 2, 3]
```
The subarrays are:
```
[1], [2], [3], [1, 2], [2, 3], [1, 2, 3]
```

---

## Properties of Subarrays
1. Subarrays must be **contiguous**.
2. An array of size `n` has a total of:
    - **n(n+1)/2 subarrays**

Example:
```
For n = 3 → Total = 3(4)/2 = 6 subarrays
```

---

## Difference Between Subarray and Subsequence
- **Subarray**: Contiguous elements only.
- **Subsequence**: Elements need not be contiguous, but must follow the order.

Example (array = [1,2,3]):
- Subarrays: [1,2], [2,3], [1,2,3]
- Subsequences: [1,3], [2], [1,2,3]

---

## Generating All Subarrays
### Brute Force Approach
We can generate all subarrays using two nested loops.

```python
def all_subarrays(arr):
    n = len(arr)
    subarrays = []
    for i in range(n):
        for j in range(i, n):
            subarrays.append(arr[i:j+1])
    return subarrays

# Example
arr = [1, 2, 3]
print(all_subarrays(arr))
# Output: [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
```

---

## Applications of Subarrays
1. **Maximum Subarray Sum** → Kadane’s Algorithm
2. **Subarray with Given Sum**
3. **Counting Subarrays with Specific Properties**
4. Used in **sliding window techniques**

---

## Example Problem: Maximum Subarray Sum
```python
def kadane(arr):
    max_sum = float('-inf')
    current_sum = 0
    for num in arr:
        current_sum = max(num, current_sum + num)
        max_sum = max(max_sum, current_sum)
    return max_sum

# Example
arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
print(kadane(arr))  # Output: 6 ([4, -1, 2, 1])
```

---

## Summary
- A subarray is a **contiguous** part of an array.
- Total subarrays of an array of length `n` = **n(n+1)/2**.
- Subarrays are widely used in problems related to sums, maximum/minimum ranges, and dynamic programming.
