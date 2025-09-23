Revision Notes for Binary Search and Related Concepts
Introduction to Binary Search
Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise, narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.

Key Concepts:
Sorted Array Requirement: Binary search requires the array to be sorted to function correctly. This allows the algorithm to effectively eliminate half of the remaining elements at each step【4:15†transcript.txt】.

Initial Setup:

Start (S) and End (E) pointers are initialized at the beginning and end of the array, respectively【4:16†transcript.txt】.
Midpoint (Mid) is calculated as S + (E - S) / 2.
Binary Search Loop:

If A[Mid] equals the target, the target is found.
If A[Mid] is greater than the target, set E to Mid - 1.
If A[Mid] is less than the target, set S to Mid + 1.
Repeat the process until S is greater than E, which indicates the target is not present【4:16†transcript.txt】.
Time Complexity: The time complexity of binary search is O(log n), making it highly efficient for large datasets【4:15†transcript.txt】.

Finding Leftmost and Rightmost Occurrences
Binary search can be adapted to find the first and last position of a target element in a sorted array.

Leftmost Occurrence:
Similar to binary search, but when A[Mid] is equal to the target, update the answer and continue searching in the left sub-array (E = Mid - 1) to ensure no potential smaller index exists【4:0†transcript.txt】.
Rightmost Occurrence:
Similar to finding the leftmost occurrence, but when A[Mid] equals the target, search in the right sub-array (S = Mid + 1)【4:15†transcript.txt】.
Trapping Rain Water Problem
The problem involves finding how much water would be trapped after it rains when an array represents the elevation map.

Explanation:
Concept:

Water trapped over a building is determined by the shorter of the tallest buildings to the left and right minus the building's height【4:12†transcript.txt】.
Algorithm:

Calculate left_max and right_max for each building.
The height of water that can be trapped on a building is min(left_max[i], right_max[i]) - height[i].
Sum the water heights for all buildings【4:19†transcript.txt】.
Time Complexity: O(n), as it involves single passes to compute left_max and right_max, and a third pass to calculate the trapped water【4:11†transcript.txt】.

Analogies:
The water trapped between buildings resembles a valley scenario where the height of water is determined like a container with varying heights at the boundaries【4:11†transcript.txt】【4:19†transcript.txt】.
Practical Implementation and Exercises
During a practical session, an example of finding a floor of a number using binary search was demonstrated. It involved adjusting pointers for not just finding a target but finding the greatest number less than a specified number effectively【4:3†transcript.txt】.
Exercises with similar scenarios were suggested to practice the derived algorithm and concepts【4:10†transcript.txt】.
Conclusion
Binary search is a powerful tool, particularly effective in sorted datasets. Its applications, such as finding range occurrences and solving complex problems like trapping rainwater, highlight its versatility. Understanding and implementing the variations of binary search is crucial for efficient problem solving in algorithmic challenges.