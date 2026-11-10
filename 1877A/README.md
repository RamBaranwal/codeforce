# A. Goals of Victory

Problem source: https://codeforces.com/problemset/problem/1877/A

Time limit per test: 1 second  
Memory limit per test: 256 megabytes

## Problem

There are `n` teams in a football tournament. The efficiency of a team is
the total number of goals it scores minus the total number of goals scored by
its opponents.

The efficiencies of `n - 1` teams are given. Find the efficiency of the
remaining team.

## Input

The first line contains an integer `t` (`1 ≤ t ≤ 500`) — the number of test
cases.

Each test case consists of:

- An integer `n` (`2 ≤ n ≤ 100`) — the number of teams.
- `n - 1` integers `a1, a2, ..., an-1` (`-100 ≤ ai ≤ 100`) — the known
  efficiencies.

## Output

For each test case, print the efficiency of the missing team.

## Examples

### Test Case 1

Input:

```text
4
4
3 -4 5
```

Output:

```text
-4
```

### Test Case 2

Input:

```text
11
-30 12 -57 7 0 -81 -68 41 -89 0
```

Output:

```text
265
```

## Key Observation

Every match contributes a goal difference of `d` to one team and `-d` to the
other team. Therefore, the sum of the efficiencies of all teams is always
zero.

If the known efficiencies have sum `S`, the missing efficiency must be:

`-S`

## Complexity

Each test case is processed in `O(n)` time and uses `O(1)` extra space.

## Files in this folder

- [AGoalsOfVictory.java](AGoalsOfVictory.java)
- [Question.txt](Question.txt)
