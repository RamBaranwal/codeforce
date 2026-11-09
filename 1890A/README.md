# A. Doremy's Paint 3

Problem source: https://codeforces.com/problemset/problem/1890/A

Time limit per test: 1 second
Memory limit per test: 256 megabytes

## Problem

You are given an array `a` of length `n`. You may permute its elements in any
order. An array is good if all sums of adjacent elements are equal:

`b1 + b2 = b2 + b3 = ... = bn-1 + bn`.

Determine whether it is possible to rearrange `a` into a good array.

## Input

The first line contains an integer `t` (`1 ≤ t ≤ 100`) — the number of test
cases.

Each test case consists of:

- An integer `n` (`2 ≤ n ≤ 100`) — the length of the array.
- A line containing `n` integers `a1, a2, ..., an`
  (`1 ≤ ai ≤ 10^5`).

## Output

For each test case, print `Yes` if the array can be rearranged into a good
array, or `No` otherwise.

Answers are case-insensitive.

## Examples

Input
```
5
2
8 9
3
1 1 2
4
1 1 4 5
5
2 3 3 3 3
4
100000 100000 100000 100000
```

Output
```
Yes
Yes
No
No
Yes
```

## Approach

If two adjacent sums are equal, then:

`bi + bi+1 = bi+1 + bi+2`

which implies `bi = bi+2`. Therefore, every good array alternates between
one or two values.

So:

- If the array has one distinct value, it is always good.
- If it has more than two distinct values, it cannot be good.
- If it has exactly two distinct values, their frequencies must differ by at
  most one so they can be placed alternately.

Count the frequencies of the distinct values and apply these conditions.

## Complexity

Each test case is processed in `O(n)` time and uses `O(n)` extra space.

## Files in this folder

- [ADoremySPaint3.java](ADoremySPaint3.java)
- [Question.txt](Question.txt)
