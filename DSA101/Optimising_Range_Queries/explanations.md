# Revision Notes: Prefix Sum Arrays and Range Queries

## Introduction

In this class, we covered the concept of prefix sum arrays and how they
can be utilized for efficiently solving range query problems. We also
discussed time and space complexity optimizations and explored
problem-solving patterns using prefix sums.

## Basic Concept of Prefix Sum

A prefix sum array is a simplified representation of cumulative sums
from the start of an array up to each index. This array allows us to
calculate the sum of any subarray quickly by subtraction, thereby
reducing time complexity for repeated range queries:

-   A prefix sum array **S** for an array **A** is constructed such that
    `S[i]` stores the sum of elements from `A[0]` to `A[i]`.
-   **Formula:** `S[i] = S[i-1] + A[i]` for `i ≥ 1`, with `S[0] = A[0]`.

## Use Case: Range Sum Calculation

Given a range query from index **S** to **E**, the sum can be computed
as:

-   `Sum(S,E) = S[E] - S[S-1]`
-   If `S=0`, then `Sum(S,E) = S[E]` directly since no prior elements
    need to be removed.

## Understanding Time Complexity

-   **Building the Prefix Sum Array:** `O(n)` time complexity.\
-   **Answering Range Queries:** With the prefix sum array, each query
    can be answered in `O(1)`, making the overall process `O(n+q)`,
    where **q** is the number of queries.

## Space Complexity

The additional space required for the prefix sum array is `O(n)`, which
accommodates storing the cumulative sums.

## Advanced Problems Using Prefix Sums

### Even Number Counting in Range Queries

To count even numbers in any range, transform the array:\
- Convert even numbers to 1 and odd numbers to 0.\
- Use the prefix sum technique on this new array to quickly compute the
  count of even numbers for any range query.

### Subarrays' Cumulative Sum Optimization

Instead of iterating over all subarrays to compute a sum, use the prefix
sum approach to directly compute the contribution of elements in
subarrays, which enhances efficiency.

-   Contribution formula for any element `A[i]` is:\
    `A[i] × number of subarrays containing A[i]`.

## Trade-Off: Time vs. Space

While computing the prefix sum array increases space consumption, it
dramatically decreases the time required per query, illustrating a
critical trade-off in optimizing algorithms.

## Conclusion

Understanding and using prefix sum arrays allows software engineers to
handle range queries and similar problems with improved efficiency. The
trade-off between space and time is crucial in such optimizations,
offering a practical approach to problem-solving in algorithms.
