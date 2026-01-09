# 📘 Binary Search Notes

---

## 🗓 Day 04 — Binary Search Foundations

### ✅ Problems Solved
- Binary Search
- First Bad Version
- Search Insert Position

---

### 🧠 Patterns Learned

#### 1️⃣ Classic Binary Search
- Used in: Binary Search
- Key Idea:
  - Search in sorted array
  - Compare mid with target
  - Narrow search space
- When to use:
  - “Sorted array”
  - “Search efficiently”

---

#### 2️⃣ Binary Search on Answer
- Used in: First Bad Version
- Key Idea:
  - Search space is versions (1..n)
  - If mid is bad → move left
- When to use:
  - “First / last occurrence”
  - “Minimum valid answer”

---

#### 3️⃣ Lower Bound Search
- Used in: Search Insert Position
- Key Idea:
  - Return index where target fits
  - If not found → return `left`
- When to use:
  - “Insert position”
  - “Smallest index ≥ target”

---

### ⏱ Complexity Summary
| Problem | Time | Space |
|------|------|------|
Binary Search | O(log n) | O(1) |
First Bad Version | O(log n) | O(1) |
Search Insert Position | O(log n) | O(1) |

---

### ❌ Mistakes / Learnings
- Incorrect `mid` calculation can overflow
- Wrong boundary updates cause infinite loops
- Always confirm array is sorted

---

### 🔁 To Revise Again
- Boundary handling (`left <= right`)
- Lower bound logic
