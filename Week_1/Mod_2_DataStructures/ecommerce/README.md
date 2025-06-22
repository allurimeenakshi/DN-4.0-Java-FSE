# Exercise 2: E-commerce Platform Search Function

This exercise focuses on implementing and analyzing search functionalities for an e-commerce platform using two fundamental searching techniques: linear search and binary search. It explores how asymptotic notation can help determine the performance of these algorithms and helps identify the most suitable technique for real-world applications.

---

## 1. Understand Asymptotic Notation

### Q1: Explain Big O notation and how it helps in analyzing algorithms.

Big O notation is used to describe the time and space complexity of an algorithm in terms of its input size. It provides an upper bound on the growth rate of an algorithm, making it easier to evaluate and compare performance irrespective of hardware. It allows developers to estimate how an algorithm will perform as the dataset grows larger, which is crucial for building scalable systems. Big O focuses on the dominant term, ignoring constants and lower-order terms, to convey the algorithm’s efficiency in the worst-case scenario.

---

### Q2: Describe the best, average, and worst-case scenarios for search operations.


**Linear Search:**
- **Best Case:** O(1) — the element is found at the beginning.
- **Average Case:** O(n/2) ≈ O(n) — the element is in the middle.
- **Worst Case:** O(n) — the element is at the end or not present.

**Binary Search:**
- **Best Case:** O(1) — the element is at the middle of the sorted array.
- **Average Case:** O(log n) — efficient halving of the search space.
- **Worst Case:** O(log n) — element not found after full halving.

Binary search is more efficient but requires a sorted dataset, while linear search works on unsorted data but is slower as data grows.

---

## 2. Setup

### Q3: Create a class Product with attributes for searching, such as productId, productName, and category.

The `Product` class was created to represent items in the e-commerce platform. It contains the following attributes:
- `productId` – a unique identifier for each product.
- `productName` – the name of the product, which is used as the search key.
- `category` – the category to which the product belongs.

This class supports encapsulation with getter and setter methods and provides a `toString` method for readable output.

---

## 3. Implementation

### Q4: Implement linear search and binary search algorithms.

Two search algorithms were implemented:
- **Linear Search**: Iterates over each product and compares names.
- **Binary Search**: Operates on a sorted array of products by product name, repeatedly dividing the search range.

Both return the matched product or `null` if not found.

---

### Q5: Store products in an array for linear search and a sorted array for binary search.

Products were stored in:
- An **unsorted array** for linear search, as it does not require sorting.
- A **sorted array** (sorted by product name) for binary search, as sorting is a precondition for binary search to function correctly.

This setup allows comparing the same dataset under different conditions for accurate analysis.

---

## 4. Analysis

### Q6: Compare the time complexity of linear and binary search algorithms.


| Algorithm       | Best Case | Average Case | Worst Case |
|------------------|------------|----------------|--------------|
| Linear Search     | O(1)       | O(n)           | O(n)         |
| Binary Search     | O(1)       | O(log n)       | O(log n)     |

Binary search significantly reduces the number of comparisons required as the input size increases, due to its divide-and-conquer approach. Linear search becomes increasingly inefficient for larger datasets.

---

### Q7: Discuss which algorithm is more suitable for your platform and why.

Binary search is more suitable for an e-commerce platform where speed and performance are critical, especially with large product catalogs. Since product lists in e-commerce systems can be pre-sorted by attributes like name or price, binary search becomes a practical option.

While linear search can be useful for small or dynamically changing datasets where sorting overhead isn’t justified, it does not scale well and results in poor performance on large inputs.

**Conclusion:** Binary search is the better choice for scalable search functionality in an e-commerce context, provided the dataset is kept sorted.




