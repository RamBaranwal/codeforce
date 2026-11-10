# A. How Much Does Daytona Cost?

Problem source: https://codeforces.com/problemset/problem/1878/A

Time limit per test: 1 second  
Memory limit per test: 256 megabytes

## Problem

Given an array `a` of length `n` and an integer `k`, determine whether there
exists a non-empty subsegment in which `k` is the most common element.

## Input

The first line contains an integer `t` (`1 ≤ t ≤ 1000`) — the number of test
cases.

Each test case consists of:

- Two integers `n` and `k` (`1 ≤ n, k ≤ 100`).
- `n` integers `a1, a2, ..., an` (`1 ≤ ai ≤ 100`).

## Output

For each test case, print `YES` if such a subsegment exists, or `NO` otherwise.

Answers are case-insensitive.

## Examples

### Test Case 1

Input:

```text
5 4
1 4 3 4 1
```

Output:

```text
YES
```

### Test Case 2

Input:

```text
4 1
2 3 4 4
```

Output:

```text
NO
```

### Test Case 3

Input:

```text
5 6
43 5 60 4 2
```

Output:

```text
NO
```

### Test Case 4

Input:

```text
2 5
1 5
```

Output:

```text
YES
```

### Test Case 5

Input:

```text
4 1
5 3 3 1
```

Output:

```text
YES
```

### Test Case 6

Input:

```text
1 3
3
```

Output:

```text
YES
```

### Test Case 7

Input:

```text
5 3
3 4 1 5 5
```

Output:

```text
YES
```

## Key Observation

If `k` appears anywhere in the array, choose the one-element subsegment
containing that occurrence. Since `k` is the only element in this subsegment,
it is automatically the most common element.

If `k` does not appear in the array, no subsegment can contain `k`, so the
answer is `NO`.

Therefore, it is sufficient to check whether the array contains `k`.

## Complexity

Each test case is processed in `O(n)` time and uses `O(1)` extra space.

## Files in this folder

- [AHowMuchDoesDaytonaCost.java](AHowMuchDoesDaytonaCost.java)
- [Question.txt](Question.txt)
