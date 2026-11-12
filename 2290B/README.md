# B. Stubborn Pen

Problem source: https://codeforces.com/problemset/problem/2290/B

Time limit per test: 2 seconds  
Memory limit per test: 256 megabytes

## Problem

A pen initially writes in red. After writing each letter, its color switches
automatically between red and blue.

Before writing any letter, you may manually switch the pen's color. Given a
string `s` consisting of `R` and `B`, determine the minimum number of manual
switches needed to write the string.

## Input

The first line contains an integer `t` (`1 <= t <= 10^4`) — the number of test
cases.

Each test case consists of:

- An integer `n` (`1 <= n <= 100`) — the length of the string.
- A string `s` of length `n`, containing only `R` and `B`.

## Output

For each test case, print the minimum number of manual switches.

## Examples

### Input

```text
5
5
BRRBR
1
R
4
RBRB
3
BBB
6
RRBBRB
```

### Output

```text
2
0
0
3
2
```

## Approach

The pen starts in red:

- If the first character is `B`, one manual switch is required.
- After writing a character, the pen switches automatically, so the next
  character can be written without help when it differs from the previous
  character.
- If two consecutive characters are equal, one manual switch is required
  before the second character.

Therefore, count whether the first character is `B`, then count every adjacent
pair `s[i - 1] == s[i]`.

## Complexity

Each character is examined once:

- **Time:** `O(n)`
- **Space:** `O(1)`

## Files in this folder

- [BStubbornPen.java](BStubbornPen.java) — Java solution
- [Question.txt](Question.txt) — problem statement
