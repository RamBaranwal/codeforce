# C. Books on a Shelf

Problem source: https://codeforces.com/problemset/problem/2290/C

Time limit per test: 2 seconds  
Memory limit per test: 256 megabytes

## Problem

You are given `n` books with heights `h1, h2, ..., hn`. Arrange all books in
any order.

A book is visible from the left if it is strictly taller than every book to
its left. It is visible from the right if it is strictly taller than every
book to its right.

Find the maximum possible number of books visible from at least one side and
output an arrangement that achieves it.

## Input

The first line contains an integer `t` (`1 <= t <= 10^4`) — the number of test
cases.

Each test case consists of:

- An integer `n` (`1 <= n <= 2 * 10^5`) — the number of books.
- `n` integers `h1, h2, ..., hn` (`1 <= hi <= 10^9`) — the book heights.

The sum of `n` over all test cases does not exceed `2 * 10^5`.

## Output

For each test case, print two lines:

1. The maximum number `k` of books visible from at least one side.
2. An arrangement of the `n` heights that contains exactly `k` visible books.

The arrangement must contain the original heights in some order.

## Examples

### Input

```text
5
6
1 2 2 3 3 3
1
5
3
7 7 7
4
4 1 3 2
11
3 1 4 1 5 9 2 6 5 3 5
```

### Output

```text
5
2 3 3 3 2 1
1
5
2
7 7 7
4
3 4 2 1
10
1 3 4 5 9 5 6 5 3 2 1
```

## Approach

For a height that appears `f` times, at most two copies can be visible:
one can be visible from the left and one from the right. Therefore, the
maximum possible number of visible books is:

```text
sum(min(f, 2))
```

To construct an optimal arrangement:

1. Sort the distinct heights in increasing order and place one copy of each.
   These books are visible from the left.
2. Place all remaining copies, except one copy for values occurring at least
   twice, in the middle.
3. Place one copy of every duplicated height in decreasing order. These books
   are visible from the right.

Thus, every height contributes exactly `min(f, 2)` visible books.

## Complexity

Let `n` be the number of books in a test case:

- **Time:** `O(n log n)`
- **Space:** `O(n)`

## Files in this folder

- [CBooksOnAShelf.java](CBooksOnAShelf.java) — Java solution
- [Question.txt](Question.txt) — problem statement
