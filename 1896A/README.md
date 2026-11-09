# A. Jagged Swaps

Problem source: https://codeforces.com/problemset/problem/1896/A

Time limit per test: 1 second
Memory limit per test: 256 megabytes

## Problem

You are given a permutation `a` of size `n`. In one operation, choose an index
`i` (`2 ≤ i ≤ n - 1`) such that `a[i - 1] < a[i]` and `a[i] > a[i + 1]`,
then swap `a[i]` and `a[i + 1]`.

Determine whether the permutation can be sorted in increasing order after any
number of operations.

## Input

The first line contains an integer `t` (`1 ≤ t ≤ 5000`) — the number of test
cases.

Each test case consists of:

- An integer `n` (`3 ≤ n ≤ 10`) — the size of the permutation.
- A line containing the permutation `a1, a2, ..., an`.

## Output

For each test case, print `YES` if the permutation can be sorted, or `NO`
otherwise.

Answers are case-insensitive.

## Examples

Input
```
6
3
1 2 3
5
1 3 2 5 4
5
5 4 3 2 1
3
3 1 2
4
2 3 1 4
5
5 1 2 3 4
```

Output
```
YES
YES
NO
NO
NO
NO
```

## Approach

The first element can never be involved in an operation: every allowed swap
uses positions `i` and `i + 1` where `i ≥ 2`. Since the target sorted
permutation must begin with `1`, the answer is immediately `NO` if `a[0]`
is not `1`.

If `a[0]` is `1`, the remaining elements can be sorted by repeatedly applying
the allowed swaps to move larger elements to the right, so the answer is
`YES`.

Therefore, check whether the first element of each permutation is `1`.

## Complexity

Each test case is checked in `O(1)` time and uses `O(1)` extra space.

## Files in this folder

- [AJaggedSwaps.java](AJaggedSwaps.java)
- [Question.txt](Question.txt)
