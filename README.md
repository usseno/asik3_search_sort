## Bubble Sort

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order. After each pass, the largest element moves to the end of the array.
 • Time Complexity: O(n²)
⸻

Merge Sort

Merge Sort is a divide-and-conquer algorithm. It splits the array into smaller parts, sorts each part recursively, and then merges them back together in sorted order.
 • Time Complexity: O(n log n)
⸻

 Binary Search

Binary Search works on a sorted array. It repeatedly divides the search space in half by comparing the target with the middle element, eliminating half of the remaining elements each step.
 • Time Complexity: O(log n)




##1. Which sorting algorithm performed faster? Why?

Merge Sort performed faster than Bubble Sort, especially for larger arrays, 
because it has a time complexity of n log n, while Bubble Sort has n^2.

⸻

2. How does performance change with input size?

As input size increases, execution time increases. 
Bubble Sort grows much faster (quadratic), 
while Merge Sort grows slower (logarithmic-linear).

⸻

3. How does sorted vs unsorted data affect performance?

Bubble Sort performs faster on sorted arrays, 
while Merge Sort shows almost no difference.

⸻

4. Do the results match expected Big-O complexity?

Yes, the results match expectations. 
Bubble Sort becomes very slow for large arrays, 
while Merge Sort remains efficient.

⸻

5. Which searching algorithm is more efficient? Why?

Binary Search is more efficient because it has log n time complexity, 
compared to Linear Search which is n.

⸻

6. Why does Binary Search require a sorted array?

Binary Search relies on dividing the array into halves. Without sorting, it cannot decide which half to search.
