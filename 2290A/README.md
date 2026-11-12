# A. Three Piles

Problem source: https://codeforces.com/problemset/problem/2290/A

Time limit per test: 1 second  
Memory limit per test: 256 megabytes

## Problem

There are three piles containing `a`, `b`, and `c` stones, where
`a <= b <= c`. You must make exactly one move: remove one stone from one pile
and add it to another pile.

Determine whether it is possible for all three piles to contain the same number
of stones after this one move.

## Input

The first line contains an integer `t` (`1 <= t <= 1000`) — the number of test
cases.

Each test case contains three integers `a`, `b`, and `c`
(`1 <= a <= b <= c <= 10`).

## Output

For each test case, print `YES` if the piles can be made equal using exactly
one move; otherwise, print `NO`.

The answer is case-insensitive.

## Examples

### Input

```text
6
1 2 3
2 2 2
3 4 5
1 1 4
8 9 10
3 5 7
```

### Output

```text
YES
NO
YES
NO
YES
NO
```

## Approach

After one move, the total number of stones does not change, so the final
number in each pile must be the average of `a`, `b`, and `c`.

Because the piles are sorted, exactly one move is possible only when the piles
are consecutive values:

```text
a + 1 = b and b + 1 = c
```

In that case, move one stone from the largest pile to the smallest pile.
Otherwise, print `NO`.

## Complexity

Each test case requires one check:

- **Time:** `O(1)`
- **Space:** `O(1)`

## Files in this folder

- [AThreePiles.java](AThreePiles.java) — Java solution
- [Question.txt](Question.txt) — problem statement
