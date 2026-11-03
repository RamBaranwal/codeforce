# C. Board Moves

Problem source: https://codeforces.com/problemset/problem/1353/C

Time limit per test: 1 second
Memory limit per test: 256 megabytes

## Problem

You are given a board of size `n × n`, where `n` is odd. Initially, each cell of the board contains one figure.

In one move, you can select exactly one figure in a cell and move it to one of the cells sharing a side or a corner with the current cell. From the cell `(i, j)`, you can move the figure to any of the following cells:

- `(i − 1, j − 1)`
- `(i − 1, j)`
- `(i − 1, j + 1)`
- `(i, j − 1)`
- `(i, j + 1)`
- `(i + 1, j − 1)`
- `(i + 1, j)`
- `(i + 1, j + 1)`

Figures cannot be moved outside the board. It is allowed for several figures to occupy the same cell after a move.

Find the minimum number of moves needed to get all the figures into one cell. In the final arrangement, `n² − 1` cells should contain zero figures and one cell should contain `n²` figures.

## Input

The first line of the input contains one integer `t` (`1 ≤ t ≤ 200`) — the number of test cases.

The only line of each test case contains one integer `n` (`1 ≤ n < 5 · 10^5`) — the size of the board. It is guaranteed that `n` is odd.

It is guaranteed that the sum of `n` over all test cases does not exceed `5 · 10^5`.

## Output

For each test case, print the minimum number of moves needed to get all the figures into one cell.

## Examples

Input
```
3
1
5
499993
```

Output
```
0
40
41664916690999888
```

## Files in this folder

- [CBoardMoves.java](CBoardMoves.java)
- [Question.txt](Question.txt)
