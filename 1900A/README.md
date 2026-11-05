# A. Cover in Water

Problem source: https://codeforces.com/problemset/problem/1900/A

Time limit per test: 1 second
Memory limit per test: 256 megabytes

## Problem

You are given a row of `n` cells. A cell is either blocked (`#`) or empty
(`.`). The goal is to fill every empty cell with water while minimizing the
number of times water must be placed directly into a cell.

Water can also be moved between empty cells. Additionally, an empty cell
becomes filled automatically when both of its adjacent cells contain water.

## Input

The first line contains an integer `t` (`1 ≤ t ≤ 100`) — the number of test
cases.

Each test case consists of two lines:

- The first line contains an integer `n` (`1 ≤ n ≤ 100`) — the number of cells.
- The second line contains a string `s` of length `n`, containing only `.` and
  `#`.

## Output

For each test case, print the minimum number of direct water placements needed
to fill all empty cells.

## Examples

Input
```
5
3
...
7
##....#
7
..#.#..
4
####
10
#...#..#.#
```

Output
```
2
2
5
0
2
```

## Approach

Consider each consecutive segment of empty cells:

- A segment of length `1` or `2` requires one direct placement per empty cell.
- A segment of length at least `3` can be filled using only two direct
  placements. The remaining cells are filled automatically or by moving water.

Therefore:

1. Count the lengths of all consecutive `.` segments.
2. If any segment has length at least `3`, the answer is `2`.
3. Otherwise, add the lengths of all empty segments.

## Files in this folder

- [ACoverInWater.java](ACoverInWater.java)
- [Question.txt](Question.txt)
