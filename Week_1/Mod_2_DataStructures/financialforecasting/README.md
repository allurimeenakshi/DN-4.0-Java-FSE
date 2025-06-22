# Exercise 7: Financial Forecasting

This exercise involves developing a financial forecasting tool that predicts future values based on historical data using recursion. It focuses on applying recursive algorithms for solving real-world forecasting problems, analyzing their performance, and identifying potential optimizations.

---

## 1. Understand Recursive Algorithms

### Q1: Explain the concept of recursion and how it can simplify certain problems.

Recursion is a programming technique where a method calls itself to solve smaller subproblems of a larger problem. Each recursive call breaks the task down until it reaches a base case, which stops the recursion.

Recursion simplifies problems that have a **repetitive or self-similar structure**, such as calculating factorials, Fibonacci numbers, and traversing trees. Instead of using loops or manual tracking, recursion provides a cleaner and more intuitive solution by directly expressing the relationship between a problem and its subproblems.

However, recursion must be used with caution, as it can lead to performance issues or stack overflow if not implemented with proper base cases or optimizations like memoization.

---

## 2. Setup

### Q2: Create a method to calculate the future value using a recursive approach.

A method was defined to calculate future financial values recursively, based on a given growth rate and historical values. The method takes the current year, a base value, and the growth rate as inputs and recursively computes the future value for a target year.

This setup forms the foundation for modeling compound growth in financial forecasting.

---

## 3. Implementation

### Q3: Implement a recursive algorithm to predict future values based on past growth rates.

The recursive algorithm uses the idea that each future value is based on the previous year’s value multiplied by the growth rate. For example, to calculate the value at year `n`, it recursively computes the value at `n-1` and applies the growth rate.

This implementation models compound growth and allows the forecasting of values for any future period by recursively referencing prior computations.

---

## 4. Analysis

### Q4: Discuss the time complexity of your recursive algorithm.

The time complexity of the naive recursive forecasting algorithm is **O(n)**, where `n` is the number of years being forecasted. This is because for each year, the algorithm performs one recursive call, building upon the result of the previous one until the base year is reached.

If memoization or dynamic programming is not used, the performance remains linear, but if the recursion involves branching (like in some exponential growth models), the complexity can become **O(2^n)**.

---

### Q5: Explain how to optimize the recursive solution to avoid excessive computation.

The recursive solution can be optimized using **memoization**, which involves storing already computed results in a cache (e.g., a map or array) to avoid redundant calculations. This significantly reduces the time complexity by eliminating repeated subproblem evaluations.

Another alternative is to use **dynamic programming** with a bottom-up approach, where results are computed iteratively and stored, making it more efficient in both time and space.

Additionally, **tail recursion** (if supported by the compiler or JVM optimization) can also improve stack usage by enabling the compiler to optimize recursive calls into iteration.

---


