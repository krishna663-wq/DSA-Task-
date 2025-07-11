# DSA-Task-

# For Any Doubt 💬

Reach out to *Piyush* at *6397415707* Or *Parth* at *9559805577*.
# Week 2 Task: The Beauty of Binary Search 🚀

# Ultimate Guide to Binary Search

Binary Search is one of the most fundamental and efficient searching algorithms. It operates on the principle of **divide and conquer**, allowing you to solve a problem by repeatedly halving the search space. This guide will provide you with everything you need to know about Binary Search, from the basics to advanced topics, along with templates and practice problems.

---

## Table of Contents

1. [Introduction to Binary Search](#introduction-to-binary-search)
2. [When to Use Binary Search](#when-to-use-binary-search)
3. [Recognizing a Binary Search Problem](#recognizing-a-binary-search-problem)
4. [Upper Bound and Lower Bound](#upper-bound-and-lower-bound)
5. [Binary Search on Answer](#binary-search-on-answer)
6. [Templates for Binary Search](#templates-for-binary-search)
7. [Practice Questions](#practice-questions)

---

## Introduction to Binary Search

Binary Search is a searching technique used on **sorted arrays or ranges** to find an element or a condition. The algorithm works by dividing the search space into two halves, checking the middle element, and eliminating half of the search space based on the comparison.

### Key Properties:
- **Input Requirement**: The array or range must be sorted.
- **Efficiency**: The time complexity is **O(log n)**, which makes Binary Search much faster than a linear search, especially for large datasets.

---

## When to Use Binary Search

### Indicators of Binary Search Problems:
- **Sorted Data**: When the input is sorted (increasing, decreasing, or even rotated), Binary Search is likely applicable.
- **Search for Extremes**: When you're tasked with finding a minimum, maximum, or something like "first occurrence", "last occurrence".
- **Range Queries**: Problems asking for a specific range, such as finding the lower or upper bound.
- **Optimization Problems**: When minimizing or maximizing a value is the goal, Binary Search can often be applied on the answer space.

### Common Scenarios:
- Searching for an element in a sorted array.
- Finding the first or last occurrence of an element.
- Optimizing time, distance, or other criteria where you are asked to "minimize" or "maximize" something.

---

## Recognizing a Binary Search Problem

Many problems aren't directly presented as Binary Search problems, but with practice, you'll start to recognize common patterns.

#### Ask yourself:
1. **Is the input sorted or can it be treated as sorted?**
2. **Can I break down the problem by halving the search space?**
3. **Am I trying to find a value that satisfies a certain condition (minimum/maximum, first/last occurrence)?**
4. **Is the problem asking me to minimize or maximize something?**

If any of these questions apply, Binary Search could be a potential solution.

---

## Upper Bound and Lower Bound

### **Lower Bound**:
The smallest index where the target is greater than or equal to a value. Useful when finding the first occurrence or the smallest element that satisfies a condition.

### **Upper Bound**:
The first index where an element is strictly greater than the target. Useful when finding ranges of elements or when checking the validity of a range.

### Applications of UB and LB:
- **Range Queries**: Find the number of occurrences of a specific element.
- **Positioning**: Used to find the insert position in sorted arrays.

### Example (Lower Bound in Java):
```java
public int lowerBound(int[] nums, int target) {
    int low = 0, high = nums.length;
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] < target) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return low;
}
```
### Example (Upper Bound in Java):
```java
public int upperBound(int[] nums, int target) {
    int low = 0, high = nums.length;
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] <= target) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return low;
}
```

# Binary Search on Answer

Binary Search isn't always used on arrays. In some problems, we need to search for the answer itself. This is called **Binary Search on the Answer**, where the search space is a range of potential answers, and we determine whether a particular value satisfies a condition.

## Examples
- **Minimizing Maximum Distance:** Find the maximum minimum distance between elements.
- **Minimizing Time or Cost:** Solve problems like minimizing the maximum load, distance, or time.

## How to Identify
- The problem asks for the minimum/maximum of some criteria.
- You need to satisfy certain conditions by varying the possible answers.

## Example: Binary Search on Answer Template in Java

```java
public boolean canSatisfyCondition(int mid, int[] conditions) {
    // Implement the logic to check if mid satisfies the problem's conditions.
    return true; // or false depending on whether the condition is satisfied
}

public int binarySearchOnAnswer(int[] arr) {
    int low = 1, high = arr.length, answer = -1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (canSatisfyCondition(mid, arr)) {
            answer = mid; // Update answer if condition is met
            high = mid - 1; // Adjust for minimizing
        } else {
            low = mid + 1; // Adjust for maximizing
        }
    }
    return answer;
}
```
# Binary Search Templates

## Standard Binary Search
Use this template when searching for an element in a sorted array.

```java
public int binarySearch(int[] nums, int target) {
    int low = 0, high = nums.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return mid; // Element found
        } else if (nums[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1; // Element not found
}
```
# Binary Search on Answer Template

This template is useful for problems that involve minimizing or maximizing a result. It provides a structured approach to implement binary search over a defined range.

## Code Template

The following Java code demonstrates the basic structure for performing a binary search on a specified range.

```java
public int binarySearchOnRange(int low, int high, int[] arr) {
    int answer = -1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (isValid(mid, arr)) {
            answer = mid;
            high = mid - 1; // Minimizing answer
        } else {
            low = mid + 1;
        }
    }
    return answer;
}

public boolean isValid(int mid, int[] arr) {
    // Implement problem-specific condition
    return true; // Change this based on your criteria
}
```

## Explanation

- **`binarySearchOnRange(int low, int high, int[] arr)`**:
    - This method performs binary search within the range defined by `low` and `high` indices.
    - It initializes the variable `answer` to keep track of the most recent valid `mid` value that meets the conditions specified in the `isValid` method.
    - The search continues as long as `low` is less than or equal to `high`. The midpoint `mid` is calculated, and if it is valid, `answer` is updated, and the search space is narrowed to the lower half (`high = mid - 1`). If it is not valid, the search space is adjusted to the upper half (`low = mid + 1`).

- **`isValid(int mid, int[] arr)`**:
    - This method is a placeholder that needs to be customized to implement the specific conditions required by the problem at hand.
    - It should return a boolean value indicating whether the current `mid` value satisfies the necessary criteria.


## Practice Questions

### Easy Questions
1. [Binary Search](https://leetcode.com/problems/binary-search/)
2. [Search Insert Position](https://leetcode.com/problems/search-insert-position/)
3. [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)
4. [Sqrt(x)](https://leetcode.com/problems/sqrtx/)
5. [First Bad Version](https://leetcode.com/problems/first-bad-version/)
6. [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
7. [Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)

### Medium Questions
1. [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
2. [Find Peak Element](https://leetcode.com/problems/find-peak-element/)
3. [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/)
4. [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
5. [Minimum Speed to Arrive on Time](https://leetcode.com/problems/minimum-speed-to-arrive-on-time/)
6. [Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/)

### Hard Questions
1. [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)
2. [Find in Mountain Array](https://leetcode.com/problems/find-in-mountain-array/)
3. [Find a Peak Element II](https://leetcode.com/problems/find-a-peak-element-ii/)

### Classical Problems
1. [Aggressive Cows (SPOJ)](https://www.spoj.com/problems/aggrcows/)
2. [Painter Partition Problem (GFG)](https://www.geeksforgeeks.org/painter-partition-problem/)



---

# Week 1 Task: Let's Master "Subarray" Related Problems 🚀

## 1. Understand the Problem Clearly:

- Carefully read the problem and break it down.
- Are you asked to find a subarray with certain properties (e.g., smallest, largest sum, divisible sum)?
- Are you asked to maximize, minimize, or check for the existence of a condition?
- Does the problem allow for negative numbers or only positive ones?

Understanding these questions is the first step towards identifying which algorithm or technique might work best for solving the problem.

---

## 2. Analyze the Subarray Nature:

Subarrays are contiguous parts of an array, and different categories of subarray-related problems exist. 
- *Key Point*: Each category has specific patterns and hints towards a particular type of solution, so recognizing the subarray nature in the problem is crucial.

---

## 3. Look for Common Patterns:

### 1) Sliding Window or Two-Pointer Technique:

- *When to Use*:
  - Finding a subarray with a fixed sum or length.
  - Finding a subarray with conditions that can be checked as you move from one end of the array to another.
  
- *Why It Works*: This technique is efficient because it processes the array in linear time, expanding and contracting the window as needed.

- *Common Problem Types*:
  - Finding the smallest subarray with a sum greater than X.
  - Longest subarray with distinct elements or fixed-length subarrays.

- *Example*:
  - If you’re asked to find the longest subarray with sum ≤ k, sliding window is often the best approach.

---

### 2) Kadane’s Algorithm (Dynamic Programming):

- *When to Use*:
  - Finding the maximum subarray sum.

- *Why It Works*:
  - This algorithm efficiently tracks the maximum subarray sum ending at each index.
  - It's optimal as it builds solutions to subproblems (maximum sums ending at earlier indices) and extends them to solve larger problems.

- *Common Problem Types*:
  - Finding the maximum subarray sum, especially when there are no constraints on subarray length or when negative values are allowed.

- *Example*:
  - Given an array, find the maximum sum of any subarray.

---

### 3) Prefix Sum & HashMap:

- *When to Use*:
  - Modulo arithmetic (e.g., sum divisible by a number).
  - Checking sums over subarrays (especially when the subarray can be of any size).

- *Why It Works*:
  - The prefix sum allows us to break down a subarray sum into differences between two prefix sums.
  - HashMaps are used for fast lookups of previously seen sums, especially useful for problems with conditions like "sum divisible by k."

- *Common Problem Types*:
  - Finding subarrays that sum to k, or removing a subarray to make a sum divisible by a given value.

- *Example*:
  - Find the smallest subarray whose sum is divisible by a number p.

---

## 4. Practice Questions

### Easy Problems:

1. [Assign Cookies](https://leetcode.com/problems/assign-cookies/)
2. [Buy Two Chocolates](https://leetcode.com/problems/buy-two-chocolates/)
3. [Count Elements with Maximum Frequency](https://leetcode.com/problems/count-elements-with-maximum-frequency/)
4. [Divide Array into Arrays with Max Difference](https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/)
5. [Find Common Characters](https://leetcode.com/problems/find-common-characters/)
6. [Lemonade Change](https://leetcode.com/problems/lemonade-change/)
7. [Minimum Common Value](https://leetcode.com/problems/minimum-common-value/)

---

### Two-Pointer Problems:

1. [3Sum](https://leetcode.com/problems/3sum/)
2. [3Sum Closest](https://leetcode.com/problems/3sum-closest/)
3. [Longest Mountain in Array](https://leetcode.com/problems/longest-mountain-in-array/)
4. [Maximum Erasure Value](https://leetcode.com/problems/maximum-erasure-value/)
5. [Max Consecutive Ones II](https://leetcode.com/problems/max-consecutive-ones-ii/)

---

### Prefix Sum Problems:

1. [Contiguous Array](https://leetcode.com/problems/contiguous-array/)
2. [Continuous Subarray Sum](https://leetcode.com/problems/continuous-subarray-sum/)
3. [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays)
4. [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)
5. [K-radius Subarray Averages](https://leetcode.com/problems/k-radius-subarray-averages/)

---

## 5. Let's Solve Some Problems:

### Leetcode Problems:

1. [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
2. [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)
3. [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/description/)
4. [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays/description/)

### OA Problem:

1. LinkedIn - SDE Intern:
   - *Question*: Given a list of words, if any two adjacent characters in a word are equal, change one of them. Determine the minimum number of substitutions so the final string contains no adjacent equal characters.
   
   Example:  
   Input: ['add', 'boook', 'break']  
   Output: [1, 1, 0]

---

<!---LeetCode Topics Start-->
# LeetCode Topics
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/krishna663-wq/DSA-Task-/tree/master/0001-two-sum) |
| [0012-integer-to-roman](https://github.com/krishna663-wq/DSA-Task-/tree/master/0012-integer-to-roman) |
| [0017-letter-combinations-of-a-phone-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0017-letter-combinations-of-a-phone-number) |
| [0073-set-matrix-zeroes](https://github.com/krishna663-wq/DSA-Task-/tree/master/0073-set-matrix-zeroes) |
| [0141-linked-list-cycle](https://github.com/krishna663-wq/DSA-Task-/tree/master/0141-linked-list-cycle) |
| [0142-linked-list-cycle-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0142-linked-list-cycle-ii) |
| [0160-intersection-of-two-linked-lists](https://github.com/krishna663-wq/DSA-Task-/tree/master/0160-intersection-of-two-linked-lists) |
| [0202-happy-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0202-happy-number) |
| [0219-contains-duplicate-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0219-contains-duplicate-ii) |
| [0242-valid-anagram](https://github.com/krishna663-wq/DSA-Task-/tree/master/0242-valid-anagram) |
| [0268-missing-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0268-missing-number) |
| [0389-find-the-difference](https://github.com/krishna663-wq/DSA-Task-/tree/master/0389-find-the-difference) |
| [0500-keyboard-row](https://github.com/krishna663-wq/DSA-Task-/tree/master/0500-keyboard-row) |
| [0782-jewels-and-stones](https://github.com/krishna663-wq/DSA-Task-/tree/master/0782-jewels-and-stones) |
| [0816-design-hashset](https://github.com/krishna663-wq/DSA-Task-/tree/master/0816-design-hashset) |
| [0905-length-of-longest-fibonacci-subsequence](https://github.com/krishna663-wq/DSA-Task-/tree/master/0905-length-of-longest-fibonacci-subsequence) |
| [0925-construct-binary-tree-from-preorder-and-postorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0925-construct-binary-tree-from-preorder-and-postorder-traversal) |
| [1039-find-the-town-judge](https://github.com/krishna663-wq/DSA-Task-/tree/master/1039-find-the-town-judge) |
| [1160-letter-tile-possibilities](https://github.com/krishna663-wq/DSA-Task-/tree/master/1160-letter-tile-possibilities) |
| [1364-tuple-with-same-product](https://github.com/krishna663-wq/DSA-Task-/tree/master/1364-tuple-with-same-product) |
| [1387-find-elements-in-a-contaminated-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/1387-find-elements-in-a-contaminated-binary-tree) |
| [1873-longest-nice-substring](https://github.com/krishna663-wq/DSA-Task-/tree/master/1873-longest-nice-substring) |
| [1960-check-if-the-sentence-is-pangram](https://github.com/krishna663-wq/DSA-Task-/tree/master/1960-check-if-the-sentence-is-pangram) |
| [2107-find-unique-binary-string](https://github.com/krishna663-wq/DSA-Task-/tree/master/2107-find-unique-binary-string) |
| [2434-design-a-number-container-system](https://github.com/krishna663-wq/DSA-Task-/tree/master/2434-design-a-number-container-system) |
| [2448-count-number-of-bad-pairs](https://github.com/krishna663-wq/DSA-Task-/tree/master/2448-count-number-of-bad-pairs) |
| [2473-max-sum-of-a-pair-with-equal-sum-of-digits](https://github.com/krishna663-wq/DSA-Task-/tree/master/2473-max-sum-of-a-pair-with-equal-sum-of-digits) |
| [3227-find-missing-and-repeated-values](https://github.com/krishna663-wq/DSA-Task-/tree/master/3227-find-missing-and-repeated-values) |
| [3412-permutation-difference-between-two-strings](https://github.com/krishna663-wq/DSA-Task-/tree/master/3412-permutation-difference-between-two-strings) |
| [3434-find-the-number-of-distinct-colors-among-the-balls](https://github.com/krishna663-wq/DSA-Task-/tree/master/3434-find-the-number-of-distinct-colors-among-the-balls) |
## String
|  |
| ------- |
| [0005-longest-palindromic-substring](https://github.com/krishna663-wq/DSA-Task-/tree/master/0005-longest-palindromic-substring) |
| [0008-string-to-integer-atoi](https://github.com/krishna663-wq/DSA-Task-/tree/master/0008-string-to-integer-atoi) |
| [0012-integer-to-roman](https://github.com/krishna663-wq/DSA-Task-/tree/master/0012-integer-to-roman) |
| [0017-letter-combinations-of-a-phone-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0017-letter-combinations-of-a-phone-number) |
| [0022-generate-parentheses](https://github.com/krishna663-wq/DSA-Task-/tree/master/0022-generate-parentheses) |
| [0072-edit-distance](https://github.com/krishna663-wq/DSA-Task-/tree/master/0072-edit-distance) |
| [0125-valid-palindrome](https://github.com/krishna663-wq/DSA-Task-/tree/master/0125-valid-palindrome) |
| [0171-excel-sheet-column-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0171-excel-sheet-column-number) |
| [0242-valid-anagram](https://github.com/krishna663-wq/DSA-Task-/tree/master/0242-valid-anagram) |
| [0257-binary-tree-paths](https://github.com/krishna663-wq/DSA-Task-/tree/master/0257-binary-tree-paths) |
| [0344-reverse-string](https://github.com/krishna663-wq/DSA-Task-/tree/master/0344-reverse-string) |
| [0389-find-the-difference](https://github.com/krishna663-wq/DSA-Task-/tree/master/0389-find-the-difference) |
| [0500-keyboard-row](https://github.com/krishna663-wq/DSA-Task-/tree/master/0500-keyboard-row) |
| [0557-reverse-words-in-a-string-iii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0557-reverse-words-in-a-string-iii) |
| [0680-valid-palindrome-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0680-valid-palindrome-ii) |
| [0782-jewels-and-stones](https://github.com/krishna663-wq/DSA-Task-/tree/master/0782-jewels-and-stones) |
| [0812-rotate-string](https://github.com/krishna663-wq/DSA-Task-/tree/master/0812-rotate-string) |
| [0961-long-pressed-name](https://github.com/krishna663-wq/DSA-Task-/tree/master/0961-long-pressed-name) |
| [0979-di-string-match](https://github.com/krishna663-wq/DSA-Task-/tree/master/0979-di-string-match) |
| [1093-recover-a-tree-from-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/1093-recover-a-tree-from-preorder-traversal) |
| [1160-letter-tile-possibilities](https://github.com/krishna663-wq/DSA-Task-/tree/master/1160-letter-tile-possibilities) |
| [1170-shortest-common-supersequence](https://github.com/krishna663-wq/DSA-Task-/tree/master/1170-shortest-common-supersequence) |
| [1250-longest-common-subsequence](https://github.com/krishna663-wq/DSA-Task-/tree/master/1250-longest-common-subsequence) |
| [1430-find-the-k-beauty-of-a-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/1430-find-the-k-beauty-of-a-number) |
| [1516-the-k-th-lexicographical-string-of-all-happy-strings-of-length-n](https://github.com/krishna663-wq/DSA-Task-/tree/master/1516-the-k-th-lexicographical-string-of-all-happy-strings-of-length-n) |
| [1737-maximum-nesting-depth-of-the-parentheses](https://github.com/krishna663-wq/DSA-Task-/tree/master/1737-maximum-nesting-depth-of-the-parentheses) |
| [1873-longest-nice-substring](https://github.com/krishna663-wq/DSA-Task-/tree/master/1873-longest-nice-substring) |
| [1960-check-if-the-sentence-is-pangram](https://github.com/krishna663-wq/DSA-Task-/tree/master/1960-check-if-the-sentence-is-pangram) |
| [2021-remove-all-occurrences-of-a-substring](https://github.com/krishna663-wq/DSA-Task-/tree/master/2021-remove-all-occurrences-of-a-substring) |
| [2107-find-unique-binary-string](https://github.com/krishna663-wq/DSA-Task-/tree/master/2107-find-unique-binary-string) |
| [2456-construct-smallest-number-from-di-string](https://github.com/krishna663-wq/DSA-Task-/tree/master/2456-construct-smallest-number-from-di-string) |
| [2463-minimum-recolors-to-get-k-consecutive-black-blocks](https://github.com/krishna663-wq/DSA-Task-/tree/master/2463-minimum-recolors-to-get-k-consecutive-black-blocks) |
| [3412-permutation-difference-between-two-strings](https://github.com/krishna663-wq/DSA-Task-/tree/master/3412-permutation-difference-between-two-strings) |
| [3447-clear-digits](https://github.com/krishna663-wq/DSA-Task-/tree/master/3447-clear-digits) |
## Divide and Conquer
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/krishna663-wq/DSA-Task-/tree/master/0023-merge-k-sorted-lists) |
| [0053-maximum-subarray](https://github.com/krishna663-wq/DSA-Task-/tree/master/0053-maximum-subarray) |
| [0108-convert-sorted-array-to-binary-search-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0108-convert-sorted-array-to-binary-search-tree) |
| [0190-reverse-bits](https://github.com/krishna663-wq/DSA-Task-/tree/master/0190-reverse-bits) |
| [0191-number-of-1-bits](https://github.com/krishna663-wq/DSA-Task-/tree/master/0191-number-of-1-bits) |
| [0925-construct-binary-tree-from-preorder-and-postorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0925-construct-binary-tree-from-preorder-and-postorder-traversal) |
| [1873-longest-nice-substring](https://github.com/krishna663-wq/DSA-Task-/tree/master/1873-longest-nice-substring) |
## Bit Manipulation
|  |
| ------- |
| [0136-single-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0136-single-number) |
| [0190-reverse-bits](https://github.com/krishna663-wq/DSA-Task-/tree/master/0190-reverse-bits) |
| [0191-number-of-1-bits](https://github.com/krishna663-wq/DSA-Task-/tree/master/0191-number-of-1-bits) |
| [0231-power-of-two](https://github.com/krishna663-wq/DSA-Task-/tree/master/0231-power-of-two) |
| [0268-missing-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0268-missing-number) |
| [0342-power-of-four](https://github.com/krishna663-wq/DSA-Task-/tree/master/0342-power-of-four) |
| [0371-sum-of-two-integers](https://github.com/krishna663-wq/DSA-Task-/tree/master/0371-sum-of-two-integers) |
| [0389-find-the-difference](https://github.com/krishna663-wq/DSA-Task-/tree/master/0389-find-the-difference) |
| [0461-hamming-distance](https://github.com/krishna663-wq/DSA-Task-/tree/master/0461-hamming-distance) |
| [0693-binary-number-with-alternating-bits](https://github.com/krishna663-wq/DSA-Task-/tree/master/0693-binary-number-with-alternating-bits) |
| [1873-longest-nice-substring](https://github.com/krishna663-wq/DSA-Task-/tree/master/1873-longest-nice-substring) |
## Sliding Window
|  |
| ------- |
| [0219-contains-duplicate-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0219-contains-duplicate-ii) |
| [1430-find-the-k-beauty-of-a-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/1430-find-the-k-beauty-of-a-number) |
| [1873-longest-nice-substring](https://github.com/krishna663-wq/DSA-Task-/tree/master/1873-longest-nice-substring) |
| [2463-minimum-recolors-to-get-k-consecutive-black-blocks](https://github.com/krishna663-wq/DSA-Task-/tree/master/2463-minimum-recolors-to-get-k-consecutive-black-blocks) |
| [3463-alternating-groups-i](https://github.com/krishna663-wq/DSA-Task-/tree/master/3463-alternating-groups-i) |
| [3483-alternating-groups-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/3483-alternating-groups-ii) |
## Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0094-binary-tree-inorder-traversal) |
| [0102-binary-tree-level-order-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0102-binary-tree-level-order-traversal) |
| [0108-convert-sorted-array-to-binary-search-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0108-convert-sorted-array-to-binary-search-tree) |
| [0110-balanced-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0110-balanced-binary-tree) |
| [0144-binary-tree-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0145-binary-tree-postorder-traversal) |
| [0226-invert-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0226-invert-binary-tree) |
| [0257-binary-tree-paths](https://github.com/krishna663-wq/DSA-Task-/tree/master/0257-binary-tree-paths) |
| [0543-diameter-of-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0543-diameter-of-binary-tree) |
| [0617-merge-two-binary-trees](https://github.com/krishna663-wq/DSA-Task-/tree/master/0617-merge-two-binary-trees) |
| [0776-n-ary-tree-postorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0776-n-ary-tree-postorder-traversal) |
| [0784-insert-into-a-binary-search-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0784-insert-into-a-binary-search-tree) |
| [0904-leaf-similar-trees](https://github.com/krishna663-wq/DSA-Task-/tree/master/0904-leaf-similar-trees) |
| [0925-construct-binary-tree-from-preorder-and-postorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0925-construct-binary-tree-from-preorder-and-postorder-traversal) |
| [0975-range-sum-of-bst](https://github.com/krishna663-wq/DSA-Task-/tree/master/0975-range-sum-of-bst) |
| [1050-construct-binary-search-tree-from-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/1050-construct-binary-search-tree-from-preorder-traversal) |
| [1093-recover-a-tree-from-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/1093-recover-a-tree-from-preorder-traversal) |
| [1387-find-elements-in-a-contaminated-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/1387-find-elements-in-a-contaminated-binary-tree) |
| [1498-find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/1498-find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree) |
| [2384-root-equals-sum-of-children](https://github.com/krishna663-wq/DSA-Task-/tree/master/2384-root-equals-sum-of-children) |
| [2564-most-profitable-path-in-a-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/2564-most-profitable-path-in-a-tree) |
## Depth-First Search
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0094-binary-tree-inorder-traversal) |
| [0110-balanced-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0110-balanced-binary-tree) |
| [0144-binary-tree-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0145-binary-tree-postorder-traversal) |
| [0200-number-of-islands](https://github.com/krishna663-wq/DSA-Task-/tree/master/0200-number-of-islands) |
| [0226-invert-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0226-invert-binary-tree) |
| [0257-binary-tree-paths](https://github.com/krishna663-wq/DSA-Task-/tree/master/0257-binary-tree-paths) |
| [0543-diameter-of-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0543-diameter-of-binary-tree) |
| [0617-merge-two-binary-trees](https://github.com/krishna663-wq/DSA-Task-/tree/master/0617-merge-two-binary-trees) |
| [0733-flood-fill](https://github.com/krishna663-wq/DSA-Task-/tree/master/0733-flood-fill) |
| [0776-n-ary-tree-postorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0776-n-ary-tree-postorder-traversal) |
| [0820-find-eventual-safe-states](https://github.com/krishna663-wq/DSA-Task-/tree/master/0820-find-eventual-safe-states) |
| [0904-leaf-similar-trees](https://github.com/krishna663-wq/DSA-Task-/tree/master/0904-leaf-similar-trees) |
| [0975-range-sum-of-bst](https://github.com/krishna663-wq/DSA-Task-/tree/master/0975-range-sum-of-bst) |
| [1093-recover-a-tree-from-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/1093-recover-a-tree-from-preorder-traversal) |
| [1387-find-elements-in-a-contaminated-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/1387-find-elements-in-a-contaminated-binary-tree) |
| [1498-find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/1498-find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree) |
| [2564-most-profitable-path-in-a-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/2564-most-profitable-path-in-a-tree) |
## Breadth-First Search
|  |
| ------- |
| [0102-binary-tree-level-order-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0102-binary-tree-level-order-traversal) |
| [0200-number-of-islands](https://github.com/krishna663-wq/DSA-Task-/tree/master/0200-number-of-islands) |
| [0226-invert-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0226-invert-binary-tree) |
| [0322-coin-change](https://github.com/krishna663-wq/DSA-Task-/tree/master/0322-coin-change) |
| [0617-merge-two-binary-trees](https://github.com/krishna663-wq/DSA-Task-/tree/master/0617-merge-two-binary-trees) |
| [0733-flood-fill](https://github.com/krishna663-wq/DSA-Task-/tree/master/0733-flood-fill) |
| [0820-find-eventual-safe-states](https://github.com/krishna663-wq/DSA-Task-/tree/master/0820-find-eventual-safe-states) |
| [1387-find-elements-in-a-contaminated-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/1387-find-elements-in-a-contaminated-binary-tree) |
| [1498-find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/1498-find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree) |
| [2564-most-profitable-path-in-a-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/2564-most-profitable-path-in-a-tree) |
## Binary Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0094-binary-tree-inorder-traversal) |
| [0102-binary-tree-level-order-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0102-binary-tree-level-order-traversal) |
| [0108-convert-sorted-array-to-binary-search-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0108-convert-sorted-array-to-binary-search-tree) |
| [0110-balanced-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0110-balanced-binary-tree) |
| [0144-binary-tree-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0145-binary-tree-postorder-traversal) |
| [0226-invert-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0226-invert-binary-tree) |
| [0257-binary-tree-paths](https://github.com/krishna663-wq/DSA-Task-/tree/master/0257-binary-tree-paths) |
| [0543-diameter-of-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0543-diameter-of-binary-tree) |
| [0617-merge-two-binary-trees](https://github.com/krishna663-wq/DSA-Task-/tree/master/0617-merge-two-binary-trees) |
| [0784-insert-into-a-binary-search-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0784-insert-into-a-binary-search-tree) |
| [0904-leaf-similar-trees](https://github.com/krishna663-wq/DSA-Task-/tree/master/0904-leaf-similar-trees) |
| [0925-construct-binary-tree-from-preorder-and-postorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0925-construct-binary-tree-from-preorder-and-postorder-traversal) |
| [0975-range-sum-of-bst](https://github.com/krishna663-wq/DSA-Task-/tree/master/0975-range-sum-of-bst) |
| [1050-construct-binary-search-tree-from-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/1050-construct-binary-search-tree-from-preorder-traversal) |
| [1093-recover-a-tree-from-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/1093-recover-a-tree-from-preorder-traversal) |
| [1387-find-elements-in-a-contaminated-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/1387-find-elements-in-a-contaminated-binary-tree) |
| [1498-find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/1498-find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree) |
| [2384-root-equals-sum-of-children](https://github.com/krishna663-wq/DSA-Task-/tree/master/2384-root-equals-sum-of-children) |
## Array
|  |
| ------- |
| [0001-two-sum](https://github.com/krishna663-wq/DSA-Task-/tree/master/0001-two-sum) |
| [0015-3sum](https://github.com/krishna663-wq/DSA-Task-/tree/master/0015-3sum) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0027-remove-element](https://github.com/krishna663-wq/DSA-Task-/tree/master/0027-remove-element) |
| [0033-search-in-rotated-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0042-trapping-rain-water](https://github.com/krishna663-wq/DSA-Task-/tree/master/0042-trapping-rain-water) |
| [0053-maximum-subarray](https://github.com/krishna663-wq/DSA-Task-/tree/master/0053-maximum-subarray) |
| [0055-jump-game](https://github.com/krishna663-wq/DSA-Task-/tree/master/0055-jump-game) |
| [0073-set-matrix-zeroes](https://github.com/krishna663-wq/DSA-Task-/tree/master/0073-set-matrix-zeroes) |
| [0080-remove-duplicates-from-sorted-array-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0080-remove-duplicates-from-sorted-array-ii) |
| [0081-search-in-rotated-sorted-array-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0081-search-in-rotated-sorted-array-ii) |
| [0088-merge-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0088-merge-sorted-array) |
| [0108-convert-sorted-array-to-binary-search-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0108-convert-sorted-array-to-binary-search-tree) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/krishna663-wq/DSA-Task-/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0136-single-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0136-single-number) |
| [0153-find-minimum-in-rotated-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0153-find-minimum-in-rotated-sorted-array) |
| [0162-find-peak-element](https://github.com/krishna663-wq/DSA-Task-/tree/master/0162-find-peak-element) |
| [0189-rotate-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0189-rotate-array) |
| [0200-number-of-islands](https://github.com/krishna663-wq/DSA-Task-/tree/master/0200-number-of-islands) |
| [0219-contains-duplicate-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0219-contains-duplicate-ii) |
| [0268-missing-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0268-missing-number) |
| [0283-move-zeroes](https://github.com/krishna663-wq/DSA-Task-/tree/master/0283-move-zeroes) |
| [0300-longest-increasing-subsequence](https://github.com/krishna663-wq/DSA-Task-/tree/master/0300-longest-increasing-subsequence) |
| [0322-coin-change](https://github.com/krishna663-wq/DSA-Task-/tree/master/0322-coin-change) |
| [0455-assign-cookies](https://github.com/krishna663-wq/DSA-Task-/tree/master/0455-assign-cookies) |
| [0485-max-consecutive-ones](https://github.com/krishna663-wq/DSA-Task-/tree/master/0485-max-consecutive-ones) |
| [0500-keyboard-row](https://github.com/krishna663-wq/DSA-Task-/tree/master/0500-keyboard-row) |
| [0506-relative-ranks](https://github.com/krishna663-wq/DSA-Task-/tree/master/0506-relative-ranks) |
| [0561-array-partition](https://github.com/krishna663-wq/DSA-Task-/tree/master/0561-array-partition) |
| [0605-can-place-flowers](https://github.com/krishna663-wq/DSA-Task-/tree/master/0605-can-place-flowers) |
| [0733-flood-fill](https://github.com/krishna663-wq/DSA-Task-/tree/master/0733-flood-fill) |
| [0780-max-chunks-to-make-sorted](https://github.com/krishna663-wq/DSA-Task-/tree/master/0780-max-chunks-to-make-sorted) |
| [0792-binary-search](https://github.com/krishna663-wq/DSA-Task-/tree/master/0792-binary-search) |
| [0816-design-hashset](https://github.com/krishna663-wq/DSA-Task-/tree/master/0816-design-hashset) |
| [0898-transpose-matrix](https://github.com/krishna663-wq/DSA-Task-/tree/master/0898-transpose-matrix) |
| [0905-length-of-longest-fibonacci-subsequence](https://github.com/krishna663-wq/DSA-Task-/tree/master/0905-length-of-longest-fibonacci-subsequence) |
| [0907-koko-eating-bananas](https://github.com/krishna663-wq/DSA-Task-/tree/master/0907-koko-eating-bananas) |
| [0925-construct-binary-tree-from-preorder-and-postorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0925-construct-binary-tree-from-preorder-and-postorder-traversal) |
| [0941-sort-array-by-parity](https://github.com/krishna663-wq/DSA-Task-/tree/master/0941-sort-array-by-parity) |
| [0958-sort-array-by-parity-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0958-sort-array-by-parity-ii) |
| [0979-di-string-match](https://github.com/krishna663-wq/DSA-Task-/tree/master/0979-di-string-match) |
| [1018-largest-perimeter-triangle](https://github.com/krishna663-wq/DSA-Task-/tree/master/1018-largest-perimeter-triangle) |
| [1019-squares-of-a-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/1019-squares-of-a-sorted-array) |
| [1039-find-the-town-judge](https://github.com/krishna663-wq/DSA-Task-/tree/master/1039-find-the-town-judge) |
| [1047-maximize-sum-of-array-after-k-negations](https://github.com/krishna663-wq/DSA-Task-/tree/master/1047-maximize-sum-of-array-after-k-negations) |
| [1050-construct-binary-search-tree-from-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/1050-construct-binary-search-tree-from-preorder-traversal) |
| [1094-matrix-cells-in-distance-order](https://github.com/krishna663-wq/DSA-Task-/tree/master/1094-matrix-cells-in-distance-order) |
| [1364-tuple-with-same-product](https://github.com/krishna663-wq/DSA-Task-/tree/master/1364-tuple-with-same-product) |
| [1819-construct-the-lexicographically-largest-valid-sequence](https://github.com/krishna663-wq/DSA-Task-/tree/master/1819-construct-the-lexicographically-largest-valid-sequence) |
| [1849-maximum-absolute-sum-of-any-subarray](https://github.com/krishna663-wq/DSA-Task-/tree/master/1849-maximum-absolute-sum-of-any-subarray) |
| [1878-check-if-array-is-sorted-and-rotated](https://github.com/krishna663-wq/DSA-Task-/tree/master/1878-check-if-array-is-sorted-and-rotated) |
| [2107-find-unique-binary-string](https://github.com/krishna663-wq/DSA-Task-/tree/master/2107-find-unique-binary-string) |
| [2265-partition-array-according-to-given-pivot](https://github.com/krishna663-wq/DSA-Task-/tree/master/2265-partition-array-according-to-given-pivot) |
| [2448-count-number-of-bad-pairs](https://github.com/krishna663-wq/DSA-Task-/tree/master/2448-count-number-of-bad-pairs) |
| [2473-max-sum-of-a-pair-with-equal-sum-of-digits](https://github.com/krishna663-wq/DSA-Task-/tree/master/2473-max-sum-of-a-pair-with-equal-sum-of-digits) |
| [2551-apply-operations-to-an-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/2551-apply-operations-to-an-array) |
| [2564-most-profitable-path-in-a-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/2564-most-profitable-path-in-a-tree) |
| [3227-find-missing-and-repeated-values](https://github.com/krishna663-wq/DSA-Task-/tree/master/3227-find-missing-and-repeated-values) |
| [3332-minimum-operations-to-exceed-threshold-value-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/3332-minimum-operations-to-exceed-threshold-value-ii) |
| [3372-longest-strictly-increasing-or-strictly-decreasing-subarray](https://github.com/krishna663-wq/DSA-Task-/tree/master/3372-longest-strictly-increasing-or-strictly-decreasing-subarray) |
| [3434-find-the-number-of-distinct-colors-among-the-balls](https://github.com/krishna663-wq/DSA-Task-/tree/master/3434-find-the-number-of-distinct-colors-among-the-balls) |
| [3463-alternating-groups-i](https://github.com/krishna663-wq/DSA-Task-/tree/master/3463-alternating-groups-i) |
| [3483-alternating-groups-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/3483-alternating-groups-ii) |
## Math
|  |
| ------- |
| [0007-reverse-integer](https://github.com/krishna663-wq/DSA-Task-/tree/master/0007-reverse-integer) |
| [0009-palindrome-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0009-palindrome-number) |
| [0012-integer-to-roman](https://github.com/krishna663-wq/DSA-Task-/tree/master/0012-integer-to-roman) |
| [0050-powx-n](https://github.com/krishna663-wq/DSA-Task-/tree/master/0050-powx-n) |
| [0171-excel-sheet-column-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0171-excel-sheet-column-number) |
| [0189-rotate-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0189-rotate-array) |
| [0202-happy-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0202-happy-number) |
| [0231-power-of-two](https://github.com/krishna663-wq/DSA-Task-/tree/master/0231-power-of-two) |
| [0258-add-digits](https://github.com/krishna663-wq/DSA-Task-/tree/master/0258-add-digits) |
| [0268-missing-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0268-missing-number) |
| [0326-power-of-three](https://github.com/krishna663-wq/DSA-Task-/tree/master/0326-power-of-three) |
| [0342-power-of-four](https://github.com/krishna663-wq/DSA-Task-/tree/master/0342-power-of-four) |
| [0371-sum-of-two-integers](https://github.com/krishna663-wq/DSA-Task-/tree/master/0371-sum-of-two-integers) |
| [0507-perfect-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0507-perfect-number) |
| [1013-fibonacci-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/1013-fibonacci-number) |
| [1018-largest-perimeter-triangle](https://github.com/krishna663-wq/DSA-Task-/tree/master/1018-largest-perimeter-triangle) |
| [1094-matrix-cells-in-distance-order](https://github.com/krishna663-wq/DSA-Task-/tree/master/1094-matrix-cells-in-distance-order) |
| [1411-convert-binary-number-in-a-linked-list-to-integer](https://github.com/krishna663-wq/DSA-Task-/tree/master/1411-convert-binary-number-in-a-linked-list-to-integer) |
| [1430-find-the-k-beauty-of-a-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/1430-find-the-k-beauty-of-a-number) |
| [1889-check-if-number-is-a-sum-of-powers-of-three](https://github.com/krishna663-wq/DSA-Task-/tree/master/1889-check-if-number-is-a-sum-of-powers-of-three) |
| [1965-sum-of-digits-in-base-k](https://github.com/krishna663-wq/DSA-Task-/tree/master/1965-sum-of-digits-in-base-k) |
| [2448-count-number-of-bad-pairs](https://github.com/krishna663-wq/DSA-Task-/tree/master/2448-count-number-of-bad-pairs) |
| [2608-count-the-digits-that-divide-a-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/2608-count-the-digits-that-divide-a-number) |
| [2610-closest-prime-numbers-in-range](https://github.com/krishna663-wq/DSA-Task-/tree/master/2610-closest-prime-numbers-in-range) |
| [2649-count-total-number-of-colored-cells](https://github.com/krishna663-wq/DSA-Task-/tree/master/2649-count-total-number-of-colored-cells) |
| [2802-find-the-punishment-number-of-an-integer](https://github.com/krishna663-wq/DSA-Task-/tree/master/2802-find-the-punishment-number-of-an-integer) |
| [3227-find-missing-and-repeated-values](https://github.com/krishna663-wq/DSA-Task-/tree/master/3227-find-missing-and-repeated-values) |
## Two Pointers
|  |
| ------- |
| [0005-longest-palindromic-substring](https://github.com/krishna663-wq/DSA-Task-/tree/master/0005-longest-palindromic-substring) |
| [0015-3sum](https://github.com/krishna663-wq/DSA-Task-/tree/master/0015-3sum) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0027-remove-element](https://github.com/krishna663-wq/DSA-Task-/tree/master/0027-remove-element) |
| [0042-trapping-rain-water](https://github.com/krishna663-wq/DSA-Task-/tree/master/0042-trapping-rain-water) |
| [0080-remove-duplicates-from-sorted-array-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0080-remove-duplicates-from-sorted-array-ii) |
| [0088-merge-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0088-merge-sorted-array) |
| [0125-valid-palindrome](https://github.com/krishna663-wq/DSA-Task-/tree/master/0125-valid-palindrome) |
| [0141-linked-list-cycle](https://github.com/krishna663-wq/DSA-Task-/tree/master/0141-linked-list-cycle) |
| [0142-linked-list-cycle-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0142-linked-list-cycle-ii) |
| [0160-intersection-of-two-linked-lists](https://github.com/krishna663-wq/DSA-Task-/tree/master/0160-intersection-of-two-linked-lists) |
| [0189-rotate-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0189-rotate-array) |
| [0202-happy-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0202-happy-number) |
| [0283-move-zeroes](https://github.com/krishna663-wq/DSA-Task-/tree/master/0283-move-zeroes) |
| [0344-reverse-string](https://github.com/krishna663-wq/DSA-Task-/tree/master/0344-reverse-string) |
| [0455-assign-cookies](https://github.com/krishna663-wq/DSA-Task-/tree/master/0455-assign-cookies) |
| [0557-reverse-words-in-a-string-iii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0557-reverse-words-in-a-string-iii) |
| [0680-valid-palindrome-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0680-valid-palindrome-ii) |
| [0908-middle-of-the-linked-list](https://github.com/krishna663-wq/DSA-Task-/tree/master/0908-middle-of-the-linked-list) |
| [0941-sort-array-by-parity](https://github.com/krishna663-wq/DSA-Task-/tree/master/0941-sort-array-by-parity) |
| [0958-sort-array-by-parity-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0958-sort-array-by-parity-ii) |
| [0961-long-pressed-name](https://github.com/krishna663-wq/DSA-Task-/tree/master/0961-long-pressed-name) |
| [0979-di-string-match](https://github.com/krishna663-wq/DSA-Task-/tree/master/0979-di-string-match) |
| [1019-squares-of-a-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/1019-squares-of-a-sorted-array) |
| [2265-partition-array-according-to-given-pivot](https://github.com/krishna663-wq/DSA-Task-/tree/master/2265-partition-array-according-to-given-pivot) |
| [2551-apply-operations-to-an-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/2551-apply-operations-to-an-array) |
## Greedy
|  |
| ------- |
| [0055-jump-game](https://github.com/krishna663-wq/DSA-Task-/tree/master/0055-jump-game) |
| [0455-assign-cookies](https://github.com/krishna663-wq/DSA-Task-/tree/master/0455-assign-cookies) |
| [0561-array-partition](https://github.com/krishna663-wq/DSA-Task-/tree/master/0561-array-partition) |
| [0605-can-place-flowers](https://github.com/krishna663-wq/DSA-Task-/tree/master/0605-can-place-flowers) |
| [0680-valid-palindrome-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0680-valid-palindrome-ii) |
| [0780-max-chunks-to-make-sorted](https://github.com/krishna663-wq/DSA-Task-/tree/master/0780-max-chunks-to-make-sorted) |
| [0979-di-string-match](https://github.com/krishna663-wq/DSA-Task-/tree/master/0979-di-string-match) |
| [1018-largest-perimeter-triangle](https://github.com/krishna663-wq/DSA-Task-/tree/master/1018-largest-perimeter-triangle) |
| [1047-maximize-sum-of-array-after-k-negations](https://github.com/krishna663-wq/DSA-Task-/tree/master/1047-maximize-sum-of-array-after-k-negations) |
| [2456-construct-smallest-number-from-di-string](https://github.com/krishna663-wq/DSA-Task-/tree/master/2456-construct-smallest-number-from-di-string) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/krishna663-wq/DSA-Task-/tree/master/0015-3sum) |
| [0088-merge-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0088-merge-sorted-array) |
| [0242-valid-anagram](https://github.com/krishna663-wq/DSA-Task-/tree/master/0242-valid-anagram) |
| [0268-missing-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0268-missing-number) |
| [0389-find-the-difference](https://github.com/krishna663-wq/DSA-Task-/tree/master/0389-find-the-difference) |
| [0455-assign-cookies](https://github.com/krishna663-wq/DSA-Task-/tree/master/0455-assign-cookies) |
| [0506-relative-ranks](https://github.com/krishna663-wq/DSA-Task-/tree/master/0506-relative-ranks) |
| [0561-array-partition](https://github.com/krishna663-wq/DSA-Task-/tree/master/0561-array-partition) |
| [0780-max-chunks-to-make-sorted](https://github.com/krishna663-wq/DSA-Task-/tree/master/0780-max-chunks-to-make-sorted) |
| [0941-sort-array-by-parity](https://github.com/krishna663-wq/DSA-Task-/tree/master/0941-sort-array-by-parity) |
| [0958-sort-array-by-parity-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0958-sort-array-by-parity-ii) |
| [1018-largest-perimeter-triangle](https://github.com/krishna663-wq/DSA-Task-/tree/master/1018-largest-perimeter-triangle) |
| [1019-squares-of-a-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/1019-squares-of-a-sorted-array) |
| [1047-maximize-sum-of-array-after-k-negations](https://github.com/krishna663-wq/DSA-Task-/tree/master/1047-maximize-sum-of-array-after-k-negations) |
| [1094-matrix-cells-in-distance-order](https://github.com/krishna663-wq/DSA-Task-/tree/master/1094-matrix-cells-in-distance-order) |
| [2473-max-sum-of-a-pair-with-equal-sum-of-digits](https://github.com/krishna663-wq/DSA-Task-/tree/master/2473-max-sum-of-a-pair-with-equal-sum-of-digits) |
## Counting Sort
|  |
| ------- |
| [0561-array-partition](https://github.com/krishna663-wq/DSA-Task-/tree/master/0561-array-partition) |
| [1160-letter-tile-possibilities](https://github.com/krishna663-wq/DSA-Task-/tree/master/1160-letter-tile-possibilities) |
| [1364-tuple-with-same-product](https://github.com/krishna663-wq/DSA-Task-/tree/master/1364-tuple-with-same-product) |
| [2448-count-number-of-bad-pairs](https://github.com/krishna663-wq/DSA-Task-/tree/master/2448-count-number-of-bad-pairs) |
## Linked List
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/krishna663-wq/DSA-Task-/tree/master/0023-merge-k-sorted-lists) |
| [0024-swap-nodes-in-pairs](https://github.com/krishna663-wq/DSA-Task-/tree/master/0024-swap-nodes-in-pairs) |
| [0083-remove-duplicates-from-sorted-list](https://github.com/krishna663-wq/DSA-Task-/tree/master/0083-remove-duplicates-from-sorted-list) |
| [0141-linked-list-cycle](https://github.com/krishna663-wq/DSA-Task-/tree/master/0141-linked-list-cycle) |
| [0142-linked-list-cycle-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0142-linked-list-cycle-ii) |
| [0160-intersection-of-two-linked-lists](https://github.com/krishna663-wq/DSA-Task-/tree/master/0160-intersection-of-two-linked-lists) |
| [0203-remove-linked-list-elements](https://github.com/krishna663-wq/DSA-Task-/tree/master/0203-remove-linked-list-elements) |
| [0206-reverse-linked-list](https://github.com/krishna663-wq/DSA-Task-/tree/master/0206-reverse-linked-list) |
| [0816-design-hashset](https://github.com/krishna663-wq/DSA-Task-/tree/master/0816-design-hashset) |
| [0908-middle-of-the-linked-list](https://github.com/krishna663-wq/DSA-Task-/tree/master/0908-middle-of-the-linked-list) |
| [1411-convert-binary-number-in-a-linked-list-to-integer](https://github.com/krishna663-wq/DSA-Task-/tree/master/1411-convert-binary-number-in-a-linked-list-to-integer) |
## Recursion
|  |
| ------- |
| [0024-swap-nodes-in-pairs](https://github.com/krishna663-wq/DSA-Task-/tree/master/0024-swap-nodes-in-pairs) |
| [0050-powx-n](https://github.com/krishna663-wq/DSA-Task-/tree/master/0050-powx-n) |
| [0203-remove-linked-list-elements](https://github.com/krishna663-wq/DSA-Task-/tree/master/0203-remove-linked-list-elements) |
| [0206-reverse-linked-list](https://github.com/krishna663-wq/DSA-Task-/tree/master/0206-reverse-linked-list) |
| [0231-power-of-two](https://github.com/krishna663-wq/DSA-Task-/tree/master/0231-power-of-two) |
| [0326-power-of-three](https://github.com/krishna663-wq/DSA-Task-/tree/master/0326-power-of-three) |
| [0342-power-of-four](https://github.com/krishna663-wq/DSA-Task-/tree/master/0342-power-of-four) |
| [1013-fibonacci-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/1013-fibonacci-number) |
## Heap (Priority Queue)
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/krishna663-wq/DSA-Task-/tree/master/0023-merge-k-sorted-lists) |
| [0506-relative-ranks](https://github.com/krishna663-wq/DSA-Task-/tree/master/0506-relative-ranks) |
| [2434-design-a-number-container-system](https://github.com/krishna663-wq/DSA-Task-/tree/master/2434-design-a-number-container-system) |
| [2473-max-sum-of-a-pair-with-equal-sum-of-digits](https://github.com/krishna663-wq/DSA-Task-/tree/master/2473-max-sum-of-a-pair-with-equal-sum-of-digits) |
| [3332-minimum-operations-to-exceed-threshold-value-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/3332-minimum-operations-to-exceed-threshold-value-ii) |
## Merge Sort
|  |
| ------- |
| [0023-merge-k-sorted-lists](https://github.com/krishna663-wq/DSA-Task-/tree/master/0023-merge-k-sorted-lists) |
## Dynamic Programming
|  |
| ------- |
| [0005-longest-palindromic-substring](https://github.com/krishna663-wq/DSA-Task-/tree/master/0005-longest-palindromic-substring) |
| [0022-generate-parentheses](https://github.com/krishna663-wq/DSA-Task-/tree/master/0022-generate-parentheses) |
| [0042-trapping-rain-water](https://github.com/krishna663-wq/DSA-Task-/tree/master/0042-trapping-rain-water) |
| [0053-maximum-subarray](https://github.com/krishna663-wq/DSA-Task-/tree/master/0053-maximum-subarray) |
| [0055-jump-game](https://github.com/krishna663-wq/DSA-Task-/tree/master/0055-jump-game) |
| [0072-edit-distance](https://github.com/krishna663-wq/DSA-Task-/tree/master/0072-edit-distance) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/krishna663-wq/DSA-Task-/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0300-longest-increasing-subsequence](https://github.com/krishna663-wq/DSA-Task-/tree/master/0300-longest-increasing-subsequence) |
| [0322-coin-change](https://github.com/krishna663-wq/DSA-Task-/tree/master/0322-coin-change) |
| [0905-length-of-longest-fibonacci-subsequence](https://github.com/krishna663-wq/DSA-Task-/tree/master/0905-length-of-longest-fibonacci-subsequence) |
| [1013-fibonacci-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/1013-fibonacci-number) |
| [1170-shortest-common-supersequence](https://github.com/krishna663-wq/DSA-Task-/tree/master/1170-shortest-common-supersequence) |
| [1250-longest-common-subsequence](https://github.com/krishna663-wq/DSA-Task-/tree/master/1250-longest-common-subsequence) |
| [1849-maximum-absolute-sum-of-any-subarray](https://github.com/krishna663-wq/DSA-Task-/tree/master/1849-maximum-absolute-sum-of-any-subarray) |
## Backtracking
|  |
| ------- |
| [0017-letter-combinations-of-a-phone-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0017-letter-combinations-of-a-phone-number) |
| [0022-generate-parentheses](https://github.com/krishna663-wq/DSA-Task-/tree/master/0022-generate-parentheses) |
| [0257-binary-tree-paths](https://github.com/krishna663-wq/DSA-Task-/tree/master/0257-binary-tree-paths) |
| [1160-letter-tile-possibilities](https://github.com/krishna663-wq/DSA-Task-/tree/master/1160-letter-tile-possibilities) |
| [1516-the-k-th-lexicographical-string-of-all-happy-strings-of-length-n](https://github.com/krishna663-wq/DSA-Task-/tree/master/1516-the-k-th-lexicographical-string-of-all-happy-strings-of-length-n) |
| [1819-construct-the-lexicographically-largest-valid-sequence](https://github.com/krishna663-wq/DSA-Task-/tree/master/1819-construct-the-lexicographically-largest-valid-sequence) |
| [2107-find-unique-binary-string](https://github.com/krishna663-wq/DSA-Task-/tree/master/2107-find-unique-binary-string) |
| [2456-construct-smallest-number-from-di-string](https://github.com/krishna663-wq/DSA-Task-/tree/master/2456-construct-smallest-number-from-di-string) |
| [2802-find-the-punishment-number-of-an-integer](https://github.com/krishna663-wq/DSA-Task-/tree/master/2802-find-the-punishment-number-of-an-integer) |
## Design
|  |
| ------- |
| [0816-design-hashset](https://github.com/krishna663-wq/DSA-Task-/tree/master/0816-design-hashset) |
| [1387-find-elements-in-a-contaminated-binary-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/1387-find-elements-in-a-contaminated-binary-tree) |
| [2434-design-a-number-container-system](https://github.com/krishna663-wq/DSA-Task-/tree/master/2434-design-a-number-container-system) |
## Hash Function
|  |
| ------- |
| [0816-design-hashset](https://github.com/krishna663-wq/DSA-Task-/tree/master/0816-design-hashset) |
## Simulation
|  |
| ------- |
| [0258-add-digits](https://github.com/krishna663-wq/DSA-Task-/tree/master/0258-add-digits) |
| [0898-transpose-matrix](https://github.com/krishna663-wq/DSA-Task-/tree/master/0898-transpose-matrix) |
| [2021-remove-all-occurrences-of-a-substring](https://github.com/krishna663-wq/DSA-Task-/tree/master/2021-remove-all-occurrences-of-a-substring) |
| [2265-partition-array-according-to-given-pivot](https://github.com/krishna663-wq/DSA-Task-/tree/master/2265-partition-array-according-to-given-pivot) |
| [2551-apply-operations-to-an-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/2551-apply-operations-to-an-array) |
| [3332-minimum-operations-to-exceed-threshold-value-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/3332-minimum-operations-to-exceed-threshold-value-ii) |
| [3434-find-the-number-of-distinct-colors-among-the-balls](https://github.com/krishna663-wq/DSA-Task-/tree/master/3434-find-the-number-of-distinct-colors-among-the-balls) |
| [3447-clear-digits](https://github.com/krishna663-wq/DSA-Task-/tree/master/3447-clear-digits) |
## Number Theory
|  |
| ------- |
| [0258-add-digits](https://github.com/krishna663-wq/DSA-Task-/tree/master/0258-add-digits) |
| [2610-closest-prime-numbers-in-range](https://github.com/krishna663-wq/DSA-Task-/tree/master/2610-closest-prime-numbers-in-range) |
## Geometry
|  |
| ------- |
| [1094-matrix-cells-in-distance-order](https://github.com/krishna663-wq/DSA-Task-/tree/master/1094-matrix-cells-in-distance-order) |
## Matrix
|  |
| ------- |
| [0073-set-matrix-zeroes](https://github.com/krishna663-wq/DSA-Task-/tree/master/0073-set-matrix-zeroes) |
| [0200-number-of-islands](https://github.com/krishna663-wq/DSA-Task-/tree/master/0200-number-of-islands) |
| [0733-flood-fill](https://github.com/krishna663-wq/DSA-Task-/tree/master/0733-flood-fill) |
| [0898-transpose-matrix](https://github.com/krishna663-wq/DSA-Task-/tree/master/0898-transpose-matrix) |
| [1094-matrix-cells-in-distance-order](https://github.com/krishna663-wq/DSA-Task-/tree/master/1094-matrix-cells-in-distance-order) |
| [3227-find-missing-and-repeated-values](https://github.com/krishna663-wq/DSA-Task-/tree/master/3227-find-missing-and-repeated-values) |
## String Matching
|  |
| ------- |
| [0812-rotate-string](https://github.com/krishna663-wq/DSA-Task-/tree/master/0812-rotate-string) |
## Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/krishna663-wq/DSA-Task-/tree/master/0042-trapping-rain-water) |
| [0094-binary-tree-inorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0094-binary-tree-inorder-traversal) |
| [0144-binary-tree-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0145-binary-tree-postorder-traversal) |
| [0776-n-ary-tree-postorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/0776-n-ary-tree-postorder-traversal) |
| [0780-max-chunks-to-make-sorted](https://github.com/krishna663-wq/DSA-Task-/tree/master/0780-max-chunks-to-make-sorted) |
| [1050-construct-binary-search-tree-from-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/1050-construct-binary-search-tree-from-preorder-traversal) |
| [1737-maximum-nesting-depth-of-the-parentheses](https://github.com/krishna663-wq/DSA-Task-/tree/master/1737-maximum-nesting-depth-of-the-parentheses) |
| [2021-remove-all-occurrences-of-a-substring](https://github.com/krishna663-wq/DSA-Task-/tree/master/2021-remove-all-occurrences-of-a-substring) |
| [2456-construct-smallest-number-from-di-string](https://github.com/krishna663-wq/DSA-Task-/tree/master/2456-construct-smallest-number-from-di-string) |
| [3447-clear-digits](https://github.com/krishna663-wq/DSA-Task-/tree/master/3447-clear-digits) |
## Binary Search Tree
|  |
| ------- |
| [0033-search-in-rotated-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0081-search-in-rotated-sorted-array-ii](https://github.com/krishna663-wq/DSA-Task-/tree/master/0081-search-in-rotated-sorted-array-ii) |
| [0108-convert-sorted-array-to-binary-search-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0108-convert-sorted-array-to-binary-search-tree) |
| [0153-find-minimum-in-rotated-sorted-array](https://github.com/krishna663-wq/DSA-Task-/tree/master/0153-find-minimum-in-rotated-sorted-array) |
| [0162-find-peak-element](https://github.com/krishna663-wq/DSA-Task-/tree/master/0162-find-peak-element) |
| [0268-missing-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/0268-missing-number) |
| [0300-longest-increasing-subsequence](https://github.com/krishna663-wq/DSA-Task-/tree/master/0300-longest-increasing-subsequence) |
| [0784-insert-into-a-binary-search-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/0784-insert-into-a-binary-search-tree) |
| [0792-binary-search](https://github.com/krishna663-wq/DSA-Task-/tree/master/0792-binary-search) |
| [0907-koko-eating-bananas](https://github.com/krishna663-wq/DSA-Task-/tree/master/0907-koko-eating-bananas) |
| [0975-range-sum-of-bst](https://github.com/krishna663-wq/DSA-Task-/tree/master/0975-range-sum-of-bst) |
| [1050-construct-binary-search-tree-from-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/1050-construct-binary-search-tree-from-preorder-traversal) |
## Database
|  |
| ------- |
| [0175-combine-two-tables](https://github.com/krishna663-wq/DSA-Task-/tree/master/0175-combine-two-tables) |
| [0182-duplicate-emails](https://github.com/krishna663-wq/DSA-Task-/tree/master/0182-duplicate-emails) |
| [1153-product-sales-analysis-i](https://github.com/krishna663-wq/DSA-Task-/tree/master/1153-product-sales-analysis-i) |
## Memoization
|  |
| ------- |
| [1013-fibonacci-number](https://github.com/krishna663-wq/DSA-Task-/tree/master/1013-fibonacci-number) |
## Monotonic Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/krishna663-wq/DSA-Task-/tree/master/0042-trapping-rain-water) |
| [0780-max-chunks-to-make-sorted](https://github.com/krishna663-wq/DSA-Task-/tree/master/0780-max-chunks-to-make-sorted) |
| [1050-construct-binary-search-tree-from-preorder-traversal](https://github.com/krishna663-wq/DSA-Task-/tree/master/1050-construct-binary-search-tree-from-preorder-traversal) |
## Ordered Set
|  |
| ------- |
| [2434-design-a-number-container-system](https://github.com/krishna663-wq/DSA-Task-/tree/master/2434-design-a-number-container-system) |
## Graph
|  |
| ------- |
| [0820-find-eventual-safe-states](https://github.com/krishna663-wq/DSA-Task-/tree/master/0820-find-eventual-safe-states) |
| [1039-find-the-town-judge](https://github.com/krishna663-wq/DSA-Task-/tree/master/1039-find-the-town-judge) |
| [2564-most-profitable-path-in-a-tree](https://github.com/krishna663-wq/DSA-Task-/tree/master/2564-most-profitable-path-in-a-tree) |
## Union Find
|  |
| ------- |
| [0200-number-of-islands](https://github.com/krishna663-wq/DSA-Task-/tree/master/0200-number-of-islands) |
## Topological Sort
|  |
| ------- |
| [0820-find-eventual-safe-states](https://github.com/krishna663-wq/DSA-Task-/tree/master/0820-find-eventual-safe-states) |
<!---LeetCode Topics End-->