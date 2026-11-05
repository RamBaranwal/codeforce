# A. Line Trip

Problem source: https://codeforces.com/problemset/problem/1901/A

Time limit per test: 2 seconds
Memory limit per test: 256 megabytes

## Problem

You must travel from point `0` to point `x` and return to point `0` along a
number line. The car uses one liter of fuel per unit of distance and can be
refueled to full capacity at each of the `n` gas stations.

Find the minimum fuel-tank capacity that makes the complete trip possible.

## Input

The first line contains an integer `t` (`1 ≤ t ≤ 1000`) — the number of test
cases.

Each test case consists of two lines:

- The first line contains `n` and `x` (`1 ≤ n ≤ 50`, `2 ≤ x ≤ 100`).
- The second line contains the station positions
  `a1, a2, ..., an` (`0 < a1 < a2 < ... < an < x`).

## Output

For each test case, print the minimum required tank capacity in liters.

## Examples

Input
```
3
3 7
1 2 5
3 6
1 2 5
1 10
7
```

Output
```
4
3
7
```

## Approach

The car must have enough fuel for every segment between consecutive refueling
points:

- From `0` to the first station: `a1`.
- Between adjacent stations: `ai - ai-1`.
- From the last station to `x` and back to that station: `2 * (x - an)`,
  because there is no station at `x`.

The answer is the largest of these required distances.

## Files in this folder

- [ALineTrip.java](ALineTrip.java)
- [Question.txt](Question.txt)
