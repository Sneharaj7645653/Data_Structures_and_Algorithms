
# Array Manipulation and Sorting in Software Engineering

## Insertion Sort: Concept and Implementation

### Concept
Insertion sort is an algorithm that builds the final sorted array one item at a time. It iterates over each element of the array and inserts it into its correct position within the sorted portion of the array:

#### Initial Setup:
- Assume the first element is sorted.
- Take the next element and locate its position within the sorted section of the array.

#### Insertion Process:
- If the element is greater than the one before it, leave it in its place.
- If it is smaller, shift elements to the right to make space for the inserted element.
- Continue this process until the whole array is sorted.

### Iteration Details
- For every pass, the algorithm finds the position for the next element.
- In the worst scenario, each pass involves moving the element back past the entire sorted section, leading to `n²` iterations.

---

## Functions in Array Manipulation

### Void Functions and Side Effects
**Definition:** A void function does not return a value. Its primary role is to perform an action.

#### Usage in Arrays:
- Can modify array contents because arrays are reference types; hence changes reflect in the original array.
- **Example:** If you rotate or sort an array within a void function, those changes are visible outside the function.

### Checking Array States
- To confirm actions like rotating an array, one must run checks internally:
    - Print array by using loops to avoid errors with references.

---

## Array Rotations

### Basic Rotation Concept
Rotating an array involves shifting its elements a specified number of times:

- Each element moves a defined number of positions to the right, while wrapping around to the beginning as needed.

### Efficient Rotation Using Functions

**Understanding Rotation:**
- Rotating an array 'k' times can be optimized by observing:
    - Rotating by 'n' (the array's length) results in no change.
    - For rotations exceeding 'n', reduce 'k' to `k % n` (k modulo n).

**Implementation:**
- Perform rotations using in-built functions that manage element shifts.

---

## Code Modularity and Best Practices

### Function Reusability
- Avoid code duplication by utilizing functions that encapsulate repetitive tasks.
- Modular coding leads to easy maintenance and readability.

### Importance of Dry Runs
- Testing via dry runs helps identify logic errors and verify algorithm correctness in a hands-on manner without actual execution.
- Simulate code execution on paper to understand potential pitfalls and verify outcomes.

---

## Conclusion

The class intricately covered different methods to handle arrays utilizing sort algorithms and array transformation functions. Emphasis was placed on modular programming practices and understanding algorithm efficiency.

**By employing these strategies, you can efficiently handle arrays in software solutions, ensuring correct functionality while maintaining code clarity and reusability.**
