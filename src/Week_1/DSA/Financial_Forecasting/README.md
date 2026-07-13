# Financial Forecasting

## 📌 Scenario

Financial institutions and businesses often need to predict future values based on historical growth patterns. This project demonstrates how recursion can be used to forecast future financial values using a fixed annual growth rate.

---

## 🎯 Objective

* Understand recursive algorithms.
* Implement financial forecasting using recursion.
* Analyze the efficiency of recursive solutions.
* Explore optimization techniques for recursive algorithms.

---

## 📖 Understanding Recursion

### What is Recursion?

Recursion is a programming technique in which a method calls itself to solve a problem.

A recursive solution typically consists of:

1. **Base Case** – Stops further recursive calls.
2. **Recursive Case** – Breaks the problem into smaller subproblems.

Recursion simplifies problems that can be naturally divided into smaller versions of themselves.

---

## 🏗️ Problem Statement

Predict the future value of an investment using:

* Current Value
* Annual Growth Rate
* Number of Years

### Formula

Future Value = Present Value × (1 + Growth Rate)^Years

This formula can be implemented recursively by applying the growth rate one year at a time.

---

## ⚙️ Recursive Approach

### Base Case

When the number of years becomes zero:

```text
Future Value = Present Value
```

### Recursive Case

```text
Future Value(years)
=
Future Value(years - 1)
× (1 + Growth Rate)
```

The function repeatedly calculates the value for previous years until the base case is reached.

---

## 💻 Algorithm

1. If years = 0, return current value.
2. Otherwise:

    * Calculate future value for (years - 1).
    * Multiply by (1 + growth rate).
3. Return the result.

---

## 📊 Example

### Input

```text
Present Value = 10000
Growth Rate = 10%
Years = 5
```

### Calculation

```text
Year 0 = 10000
Year 1 = 11000
Year 2 = 12100
Year 3 = 13310
Year 4 = 14641
Year 5 = 16105.10
```

### Output

```text
Predicted Future Value = 16105.10
```

---

## ⏱️ Time Complexity Analysis

### Recursive Solution

For every year, one recursive call is made.

```text
T(n) = T(n-1) + O(1)
```

Therefore:

```text
Time Complexity = O(n)
```

where n = number of years.

### Space Complexity

The recursion stack stores one function call per year.

```text
Space Complexity = O(n)
```

---

## 🚀 Optimization

### Problem with Recursion

For very large values of n:

* Deep recursion increases memory usage.
* Excessive recursive calls may cause stack overflow.

### Possible Optimizations

#### 1. Memoization

Store previously computed results and reuse them.

Benefits:

* Avoids repeated computations.
* Improves efficiency for overlapping subproblems.

#### 2. Iterative Approach

Replace recursion with loops.

Benefits:

* Constant memory usage.
* Eliminates recursion overhead.

#### 3. Mathematical Formula

Use:

```text
Future Value = Present Value × (1 + Growth Rate)^Years
```

Benefits:

* Fastest solution.
* Direct computation.

---

## 📈 Performance Comparison

| Method        | Time Complexity | Space Complexity |
| ------------- | --------------- | ---------------- |
| Recursive     | O(n)            | O(n)             |
| Iterative     | O(n)            | O(1)             |
| Formula Based | O(1)            | O(1)             |

---

## ✅ Conclusion

A recursive approach provides a simple and intuitive way to implement financial forecasting. However, recursion consumes additional stack memory and may become inefficient for large forecasting periods.

For real-world financial applications involving large datasets and long forecasting horizons, iterative or formula-based solutions are generally preferred because they offer better performance and lower memory consumption.

---

## 🖥️ Sample Output

```text
Present Value: 10000.0
Growth Rate: 10%
Years: 5

Predicted Future Value: 16105.10
```
