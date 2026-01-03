# 📘 Arrays Notes

---

## 🗓 Day 01 — Foundations

### ✅ Problems Solved
- Two Sum
- Best Time to Buy & Sell Stock
- Maximum Subarray (Kadane)

---

### 🧠 Patterns Learned

#### 1️⃣ Hashing for Lookup
- Used in: Two Sum
- Key Idea:
  - Store value → index in HashMap
  - Check target - current value
- When to use:
  - “Find pair”, “seen before”, “lookup quickly”

---

#### 2️⃣ Prefix Minimum (Greedy)
- Used in: Buy & Sell Stock
- Key Idea:
  - Track minimum price so far
  - Update max profit greedily
- When to use:
  - “Max difference”, “profit”, “single transaction”

---

#### 3️⃣ Running Sum (Kadane’s Algorithm)
- Used in: Maximum Subarray
- Key Idea:
  - Carry sum forward if positive
  - Reset when sum becomes negative
- When to use:
  - “Maximum subarray sum”

---

### ⏱ Complexity Summary
| Problem | Time | Space |
|------|------|------|
Two Sum | O(n) | O(n) |
Buy & Sell Stock | O(n) | O(1) |
Maximum Subarray | O(n) | O(1) |

---

### ❌ Mistakes / Learnings
- Always think brute force → then optimize
- Reset logic is crucial in Kadane
- Handle edge case: all negative numbers

---

### 🔁 To Revise Again
- Maximum Subarray

---

## 🗓 Day 02 — Hashing & In-Place Tricks

### ✅ Problems Solved
- Contains Duplicate
- Product of Array Except Self
- Move Zeroes (Extra)

---

### 🧠 Patterns Learned

#### 1️⃣ HashSet for Duplicate Detection
- Used in: Contains Duplicate
- Key Idea:
  - Store elements in HashSet
  - Return early if already present
- When to use:
  - “Check duplicates”, “unique elements”

---

#### 2️⃣ Prefix + Suffix Product
- Used in: Product of Array Except Self
- Key Idea:
  - Left product × Right product
  - Avoid division (zero-safe)
- When to use:
  - “Product except self”, “no division allowed”

---

#### 3️⃣ Two Pointers (In-Place)
- Used in: Move Zeroes
- Key Idea:
  - Maintain pointer for non-zero position
  - Shift non-zeros forward
- When to use:
  - “Modify array in-place”, “preserve order”

---

### ⏱ Complexity Summary
| Problem | Time | Space |
|------|------|------|
Contains Duplicate | O(n) | O(n) |
Product Except Self | O(n) | O(1)* |
Move Zeroes | O(n) | O(1) |

\* output array excluded

---

### ❌ Mistakes / Learnings
- Don’t try division in Product Except Self
- Check constraints before choosing approach
- Prefer in-place when possible

---

### 🔁 To Revise Again
- Product of Array Except Self
