# 📘 Sliding Window Notes

---

## 🗓 Day 03 — Sliding Window Foundations

### ✅ Problems Solved
- Maximum Average Subarray I  
- (Longest Substring Without Repeating Characters — Deferred)

---

### 🧠 Patterns Learned

#### 1️⃣ Fixed-Size Sliding Window
- Used in: Maximum Average Subarray I
- Key Idea:
  - Maintain sum of window of size `k`
  - Slide window by removing left element and adding right element
- When to use:
  - “Subarray of size k”
  - “Fixed-length window”

---

#### 2️⃣ Variable-Size Sliding Window (Introduced)
- Used in: Longest Substring Without Repeating Characters (Deferred)
- Key Idea:
  - Expand window to include new elements
  - Shrink window when condition is violated
- When to use:
  - “Longest / shortest substring”
  - “At most / at least k condition”

---

### ⏱ Complexity Summary
| Problem | Time | Space |
|------|------|------|
Maximum Average Subarray I | O(n) | O(1) |

---

### ❌ Mistakes / Learnings
- Fixed window is easy; variable window needs intuition
- Shrinking logic is the hardest part
- It’s okay to defer variable window problems initially

---

### 🔁 To Revise Again
- Longest Substring Without Repeating Characters
