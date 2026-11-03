# B. Simons and Cakes for Success

Problem source: https://codeforces.com/problemset/problem/2205/B

Time limit per test: 1 second
Memory limit per test: 256 megabytes

## Problem

When I succeed, we'll share the cakes together!

— SHUN

Simons has `n` friends and a huge amount of cakes. To divide the cakes fairly, you are asked to help him solve the following problem:

Find the minimum positive integer `k` such that `n` is a divisor of `k^n`.

It can be proved that the answer always exists under the given constraints.

## Input

Each test contains multiple test cases. The first line contains the number of test cases `t` (`1 ≤ t ≤ 100`). The description of the test cases follows.

The only line of each test case contains a single integer `n` (`2 ≤ n ≤ 10^9`) — the number of friends Simons has.

## Output

For each test case, output a single integer — the minimum `k` you found.

## Examples

Input
```
4
8
12
369
55635800
```

Output
```
2
6
123
2090
```

## Note

In the first test case:

- `1^8 = 1`, and `8` is not a divisor of `1`.
- `2^8 = 256`, and `8` is a divisor of `256`, because `256 = 8 · 32`.

Thus, the minimum possible `k` is `2`.

In the second test case, `6^12 = 2176782336`, which is divisible by `12`:

`2176782336 = 12 · 181398528`.

## Files in this folder

- [B_Simons_and_Cakes_for_Success.java](B_Simons_and_Cakes_for_Success.java)
- [Question.txt](Question.txt)
