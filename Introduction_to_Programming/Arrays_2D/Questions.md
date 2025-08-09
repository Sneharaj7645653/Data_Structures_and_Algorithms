# 📚 Matrix Problems – Revision Notes with Examples

---

## Q1️⃣ Matrix Transpose 🔄

### 📌 Problem Description
Given a 2D integer array **A**, return its **transpose**.  
The transpose is obtained by flipping the matrix over its **main diagonal**, switching rows with columns.

### 📏 Constraints
- `1 <= A.size() <= 1000`
- `1 <= A[i].size() <= 1000`
- `1 <= A[i][j] <= 1000`

### 💡 Example
**Input 1:**  
`A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]`  
**Output 1:**  
`[[1, 4, 7], [2, 5, 8], [3, 6, 9]]`

**Input 2:**  
`A = [[1, 2],[1, 2],[1, 2]]`  
**Output 2:**  
`[[1, 1, 1], [2, 2, 2]]`

---

## Q2️⃣ Rotate Matrix 90° Clockwise 🖼️

### 📌 Problem Description
You are given an **n x n** 2D matrix **A** representing an image. Rotate it by **90 degrees clockwise**, **in place**.

### 📏 Constraints
- `1 <= n <= 1000`

### 💡 Example
**Input 1:**
```
[
  [1, 2],
  [3, 4]
]
```
**Output 1:**
```
[
  [3, 1],
  [4, 2]
]
```

**Input 2:**
```
[
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
```
**Output 2:**
```
[
  [7, 4, 1],
  [8, 5, 2],
  [9, 6, 3]
]
```

### 🔄 Approach
1. **Transpose** the matrix.
2. **Reverse each row**.

---

## Q3️⃣ Matrix Multiplication ✖️

### 📌 Problem Description
Given two matrices **A** (*M x N*) and **B** (*N x P*), compute the product matrix **A × B**.

### 📏 Constraints
- `1 <= M, N, P <= 100`
- `-100 <= A[i][j], B[i][j] <= 100`

### 💡 Example
**Input 1:**
```
A = [[1, 2],
     [3, 4]]
B = [[5, 6],
     [7, 8]]
```
**Output 1:**
```
[[19, 22],
 [43, 50]]
```

**Input 2:**
```
A = [[1, 1]]
B = [[2],
     [3]]
```
**Output 2:**
```
[[5]]
```

### ⚙️ Calculation Formula
`C[i][j] = sum(A[i][k] * B[k][j] for k in range(N))`

---

💡 *Mastering these three operations (Transpose, Rotation, Multiplication) will strengthen your matrix problem-solving skills!* 🚀
