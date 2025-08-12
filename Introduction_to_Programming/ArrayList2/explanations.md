# Revision Notes: 2D Array Lists and Binary Search

## Introduction
This session covers the creation of 2D array lists in Java, their traversal, common mistakes during development, and introduces the concept of Binary Search as an efficient searching algorithm. These notes summarize the discussed topics and provide important technical details for deeper understanding.

---

## 2D Array Lists

### Definition and Creation
- **Definition**: 2D Array Lists are lists of lists in Java, allowing dynamic row and column sizes unlike fixed-size 2D arrays.
- **Declaration**:
  ```java
  ArrayList<ArrayList<Integer>> list = new ArrayList<>();
  ```

### Populating a 2D Array List
1. **Determine size**: Decide how many 1D array lists (rows) will be included.
2. **Iterate and Populate**:
   ```java
   for (int i = 0; i < N; i++) {
       ArrayList<Integer> tempList = new ArrayList<>();
       // Add elements to tempList
       list.add(tempList);
   }
   ```
    - **Important**: Always create a new `ArrayList` inside the loop to avoid reference issues.

### Accessing Elements
- **Access Row**:
  ```java
  list.get(i)
  ```
- **Access Element**:
  ```java
  list.get(i).get(j)
  ```

### Common Mistakes
- **Mistake**: Adding the same list repeatedly without recreating it → all references point to the same object.
- **Solution**: Instantiate a **new** 1D list for each loop iteration.

### Iteration and Display
```java
for (ArrayList<Integer> row : list) {
    for (Integer num : row) {
        System.out.print(num + " ");
    }
    System.out.println();
}
```

### Spiral Order Traversal
- Elements are accessed in a **spiral order** within a 2D array list.
- Requires **top, right, bottom, and left boundaries** to control navigation.

---

## Binary Search

### Introduction
Binary Search is a **logarithmic** search algorithm used with **sorted arrays**.

### Process
1. **Midpoint Calculation**: Divide array into halves:
   ```java
   while (s <= e) {
       int mid = s + (e - s) / 2;
       if (arr[mid] == x) { /* found */ }
       else if (arr[mid] < x) s = mid + 1;
       else e = mid - 1;
   }
   ```
2. **Comparison**:
    - If `arr[mid] == target` → found.
    - If `arr[mid] < target` → search right half.
    - Else → search left half.

### Efficiency
- **Time Complexity**:
    - Binary Search: **O(log n)**
    - Linear Search: **O(n)**
- Best for **large, sorted datasets**.

### Key Considerations
- Requires **sorted array**.
- Use **divide and conquer** approach.
- Avoid integer overflow when calculating midpoint:
  ```java
  int mid = s + (e - s) / 2;
  ```

---

## Conclusion
Both **2D array lists** and **binary search** provide:
- **Flexibility** in data structure manipulation.
- **Efficiency** in searching.
  Avoiding common pitfalls, like **reference issues** in array lists and **midpoint overflow** in binary search, improves coding proficiency and ensures robust implementations.
