# A. Game with Integers

Problem source: https://codeforces.com/problemset/problem/1899/A

Time limit per test: 1 second
Memory limit per test: 256 megabytes

## Problem

Vanya and Vova take turns modifying an integer `n`. On each turn, a player
may add `1` or subtract `1`, and Vanya moves first.

Vanya wins if the integer becomes divisible by `3` immediately after one of
his moves. If Vanya has not won after `10` moves, Vova wins.

Determine the winner when both players play optimally.

## Input

The first line contains an integer `t` (`1 ≤ t ≤ 100`) — the number of test
cases.

Each test case contains one integer `n` (`1 ≤ n ≤ 1000`).

## Output

For each test case, print `First` if Vanya wins, or `Second` if Vova wins.

## Examples

Input
```
6
1
3
5
100
999
1000
```

Output
```
First
Second
First
First
Second
First
```

## Approach

Only the remainder of `n` when divided by `3` matters:

- If `n` is divisible by `3`, either move by Vanya changes it to a
  non-divisible number, so Vanya cannot win. The answer is `Second`.
- Otherwise, Vanya can add or subtract `1` to make the number divisible by
  `3` on his first move. The answer is `First`.

Therefore, print `Second` when `n % 3 == 0`; otherwise, print `First`.

## Files in this folder

- [AGameWithIntegers.java](AGameWithIntegers.java)
- [Question.txt](Question.txt)
