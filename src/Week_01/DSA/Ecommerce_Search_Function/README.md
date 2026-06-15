# E-commerce Platform Search Function

## 📌 Scenario

An e-commerce platform requires an efficient search functionality to quickly locate products from a large catalog. To evaluate search performance, both **Linear Search** and **Binary Search** algorithms have been implemented and analyzed.

---

## 🎯 Objective

* Understand the importance of algorithm analysis using Big O notation.
* Implement Linear Search and Binary Search.
* Compare their performance based on time complexity.
* Determine the most suitable search algorithm for an e-commerce platform.

---

## 📖 Understanding Asymptotic Notation

### What is Big O Notation?

Big O notation is a mathematical representation used to describe the growth rate of an algorithm's execution time as the input size increases.

It helps developers:

* Analyze algorithm efficiency.
* Compare multiple algorithms.
* Predict scalability for large datasets.
* Optimize application performance.

---

## 🔍 Search Operation Cases

### Best Case

The target element is found on the first comparison.

### Average Case

The target element is found somewhere in the middle of the dataset.

### Worst Case

The target element is found at the end of the dataset or is not present.

---

## 🏗️ Product Class

The `Product` class contains the following attributes:

| Attribute   | Description                    |
| ----------- | ------------------------------ |
| productId   | Unique identifier of a product |
| productName | Name of the product            |
| category    | Product category               |

---

## ⚙️ Algorithms Implemented

### 1️⃣ Linear Search

Linear Search traverses the array sequentially and compares each product ID with the target ID until a match is found.

#### Advantages

* Easy to implement.
* Works on both sorted and unsorted data.

#### Disadvantages

* Slow for large datasets.
* Requires checking elements one by one.

---

### 2️⃣ Binary Search

Binary Search repeatedly divides a sorted array into two halves until the target element is found.

#### Advantages

* Extremely fast for large datasets.
* Reduces search space by half in each iteration.

#### Disadvantages

* Requires data to be sorted.
* Slightly more complex implementation.

---

## 📊 Time Complexity Analysis

| Algorithm     | Best Case | Average Case | Worst Case |
| ------------- | --------- | ------------ | ---------- |
| Linear Search | O(1)      | O(n)         | O(n)       |
| Binary Search | O(1)      | O(log n)     | O(log n)   |

---

## 📈 Performance Comparison

### Linear Search

For a dataset containing 1,000 products:

* Worst-case comparisons ≈ 1,000

### Binary Search

For a dataset containing 1,000 products:

* Worst-case comparisons ≈ log₂(1000)
* Approximately 10 comparisons

This demonstrates the significant efficiency improvement offered by Binary Search.

---

## ✅ Conclusion

Both search algorithms were successfully implemented and tested.

* Linear Search is suitable for small or unsorted datasets.
* Binary Search is significantly more efficient for large datasets because of its logarithmic time complexity.
* Since e-commerce platforms typically contain thousands or millions of products, **Binary Search is the preferred choice** when the product data is maintained in sorted order.

Therefore, Binary Search provides better scalability, faster response times, and improved user experience for product search operations.

---

## 🖥️ Sample Output

```text
Linear Search Result:
Product ID: 104, Product Name: Watch, Category: Accessories

Binary Search Result:
Product ID: 104, Product Name: Watch, Category: Accessories
```
