---

# A. Nearly Lucky Number — Core Concept

> Two-layer check: count the lucky digits (4 and 7) in the input number, then check whether that count is itself a lucky number.

---

## Summary

Petya calls a number nearly lucky if the number of lucky digits (4 or 7) in it is itself a lucky number (i.e., the decimal representation of the count contains only 4 and 7).

## One-line idea

Count lucky digits → check whether that count is lucky.

## Steps

1. Read the input number as a string `s`.
2. Let `cnt` = number of characters in `s` equal to `'4'` or `'7'`.
3. Convert `cnt` to a string `t` and check every character of `t` is `'4'` or `'7'`.
4. Print `YES` if the check passes; otherwise print `NO`.

## Complexity

- Time: O(|s|)
- Space: O(1) extra

## Examples

- Input: `40047` → lucky digits = 3 → `3` is not lucky → **NO**
- Input: `7747774` → lucky digits = 7 → `7` is lucky → **YES**

## Short reference implementations

### Python

```python
s = input().strip()
cnt = sum(1 for c in s if c in '47')
print('YES' if all(ch in '47' for ch in str(cnt)) else 'NO')
```

### C++

```cpp
#include <bits/stdc++.h>
using namespace std;
int main(){
  string s; cin >> s;
  int cnt = 0;
  for(char c: s) if(c=='4' || c=='7') ++cnt;
  string t = to_string(cnt);
  for(char c: t) if(c!='4' && c!='7'){ cout<<"NO\n"; return 0; }
  cout<<"YES\n";
}
```

---

## Original quick notes (preserved)

👉 This is a two-layer check problem

✅ Layer 1: Count “special digits”
Traverse the number
Count how many digits are 4 or 7

👉 Example:

```
n = 4477003474
→ count = 7
```

✅ Layer 2: Validate the count itself
Now take that count
Check:

“Is this number made of only digits 4 and 7?”

👉 Example:

```
count = 7 → YES
count = 2 → NO
count = 44 → YES
```

🧠 One-line memory trick

Count lucky digits → check if count is lucky

❗ What NOT to do (very important)

❌ Don’t check original number again
❌ Don’t check divisibility (% 4 or % 7)
❌ Don’t count 4 and 7 separately
❌ Don’t check for patterns like "47"

⚡ How to recognize this pattern in future

Whenever you see:

“count of something”
then “check that result again”

👉 It’s a nested validation problem

🔁 Mental flow (very important)
```
Number → scan digits → count (4 & 7)
                ↓
         New number (count)
                ↓
     Check digits again (only 4 & 7?)
```

💡 Simple example to test yourself

Input: 123447
→ count = 3
→ 3 is NOT lucky
→ answer = NO

🧠 Final mindset

👉 Don’t think: "Is n lucky?"

👉 Think: "How many lucky digits are in n?" / "Is THAT number lucky?"

🚀 If you remember only ONE thing

It’s a problem where output depends on a value derived from input, not the input itself

