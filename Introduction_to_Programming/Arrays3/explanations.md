
# 🚀 Mastering Iterations: Pairs, Triplets & Optimizations

## 📌 Introduction
In this class, we focused on:
- 🔍 Iterating over **pairs** and **triplets** in arrays
- 🧮 Counting **special pairs** and **triplets**
- ⚡ Optimizing our iterations

These are **fundamental skills** for building **efficient algorithms**.

---

## 🔹 Iterating Over Pairs

### **Problem**
Given an array, count the number of pairs `(i, j)` such that:

```
a[i] + a[j] = k  and  i ≠ j
```

---

### **Brute Force Approach**
- Use **two nested loops** to check all possible pairs.
- Avoid self-pairing (`i ≠ j`).

```python
count = 0
for i in range(len(array)):
    for j in range(len(array)):
        if i != j and array[i] + array[j] == k:
            count += 1

# Each pair is counted twice
count //= 2
```

---

### **Optimized Approach**
- Store element **frequencies** in a hash map.
- For each element, check if `k - a[i]` exists in the map.

---

## 🔹 Iterating Over Triplets

### **Problem**
Count triplets `(i, j, k)` such that:

```
a[i] + a[j] + a[k] → even sum
i ≠ j ≠ k
```

---

### **Brute Force Approach**
```python
count = 0
n = len(array)
for i in range(n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            if (array[i] + array[j] + array[k]) % 2 == 0:
                count += 1
print(count)
```

⏳ **Complexity:** `O(n³)` — slow for large arrays.

---

### **When is a Triplet's Sum Even?**
- ✅ All **three numbers** are **even**.
- ✅ **One number** is **even**, and the other **two are odd**.

---

### **Optimized Count-Based Method**
```python
from math import comb

even_count = sum(1 for x in array if x % 2 == 0)
odd_count = len(array) - even_count

even_triplets = comb(even_count, 3)
even_odd_triplets = comb(odd_count, 2) * even_count

result = even_triplets + even_odd_triplets
print(result)
```

---

## 🔹 Optimizing Iterations

### **Counting Exact Iterations**
Understanding iteration counts helps in **performance tuning**.

```python
iterations = 0
n = len(array)
for i in range(n):
    for j in range(i + 1, n):
        iterations += 1
print(iterations)  # Should be n * (n-1) / 2
```

---

### **Combinatorial Calculations**
Using combinations instead of loops reduces complexity from:
```
❌ O(n³) → ✅ O(n²) or ✅ O(n)
```

---

## 🔹 Practical Implementation

### **Dry Run Example: Reversing an Array**
**⚠ Issue:** Directly replacing without storing causes data loss.

✅ **Correct Approach:**
```python
def reverse_array(arr):
    start, end = 0, len(arr) - 1
    while start < end:
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start += 1
        end -= 1
    return arr
```

---

## 📌 Review Importance
- 🧪 Always **dry run** code to find logic vs implementation errors.
- 🔄 Transition from **correct logic** to **correct code** is crucial.
