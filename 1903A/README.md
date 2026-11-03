# A. Halloumi Boxes

Problem source: https://codeforces.com/problemset/problem/1903/A

Time limit per test: 1 second
Memory limit per test: 256 megabytes

## Problem

You are given an array of `n` integers and an integer `k`. In one operation, you
may reverse any subarray whose length is at most `k`.

Determine whether it is possible to sort the array in non-decreasing order
using any number of operations.

## Input

The first line contains a single integer `t` (`1 ≤ t ≤ 100`) — the number of
test cases.

Each test case consists of two lines:

- The first line contains two integers `n` and `k` (`1 ≤ k ≤ n ≤ 100`).
- The second line contains `n` integers `a1, a2, ..., an`
  (`1 ≤ ai ≤ 10^9`).

## Output

For each test case, print `YES` if the array can be sorted in non-decreasing
order, or `NO` otherwise.

Answers are case-insensitive.

## Examples

Input
```
5
3 2
1 2 3
3 1
9 9 9
4 4
6 4 2 1
4 3
10 3 830 14
2 1
3 1
```

Output
```
YES
YES
YES
YES
NO
```

## Note

- An already sorted array needs no operations.
- If `k = 1`, no operation can change the array, so it must already be
  sorted.
- If `k > 1`, the array can always be sorted using reversals of length at
  most `k`.

## Files in this folder

- [AHalloumiBoxes.java](AHalloumiBoxes.java)
- [Question.txt](Question.txt)
