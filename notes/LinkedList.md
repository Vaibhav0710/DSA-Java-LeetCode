# 📘 Linked List Notes

---

## 🗓 Day 06 — Linked List Fundamentals

### ✅ Problems Solved
- Reverse Linked List
- Middle of the Linked List
- Linked List Cycle

---

### 🧠 Patterns Learned

#### 1️⃣ Pointer Reversal
- Used in: Reverse Linked List
- Key Idea:
  - Maintain three pointers: `prev`, `curr`, `next`
  - Reverse links one by one
- When to use:
  - “Reverse a linked list”
  - “Modify links in-place”

---

#### 2️⃣ Fast & Slow Pointer
- Used in: Middle of the Linked List
- Key Idea:
  - Slow moves 1 step
  - Fast moves 2 steps
  - When fast reaches end, slow is at middle
- When to use:
  - “Find middle”
  - “Detect cycles”
  - “Nth node problems”

---

#### 3️⃣ Floyd’s Cycle Detection
- Used in: Linked List Cycle
- Key Idea:
  - Use fast & slow pointers
  - If they ever meet → cycle exists
- When to use:
  - “Detect cycle in linked list”
  - “O(1) space required”

---

### ⏱ Complexity Summary
| Problem | Time | Space |
|------|------|------|
Reverse Linked List | O(n) | O(1) |
Middle of Linked List | O(n) | O(1) |
Linked List Cycle | O(n) | O(1) |

---

### ❌ Mistakes / Learnings
- Always save `next` before changing links
- Be careful with null checks
- Visualizing pointers makes logic easier

---

### 🔁 To Revise Again
- Pointer reversal steps
- Fast/slow pointer intuition
