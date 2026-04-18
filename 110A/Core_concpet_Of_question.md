# A. Nearly Lucky Number — Core Concept

Petya calls a number nearly lucky if the number of lucky digits (digits equal to 4 or 7) in it is itself a lucky number (every digit of that count is 4 or 7).

## Quick idea
Count lucky digits → check whether that count is a lucky number.

## Steps

1. Read the input number as a string `s`.
2. Compute `cnt =` number of characters in `s` that are `'4'` or `'7'`.
3. Convert `cnt` to a string and verify every digit is `'4'` or `'7'`.
4. Print `YES` if true, otherwise `NO`.

## Why this matters
This is a nested validation: the answer depends on a value derived from the input (the count), not the direct luckiness of `n` itself.

## Complexity

- Time: O(len(s)).
- Space: O(1) extra.

## Examples

- `40047` → lucky digits = 3 → `3` is not lucky → `NO`
- `7747774` → lucky digits = 7 → `7` is lucky → `YES`

## Pseudocode

```
read s
cnt = 0
for c in s:
    if c == '4' or c == '7':
        cnt += 1

t = str(cnt)
if all(ch in ('4','7') for ch in t):
    print("YES")
else:
    print("NO")
```

---

Keep the original `Core_concpet_Of_question` file as your quick notes; use this `.md` file for a nice GitHub-rendered reference.
