# A. Domino Piling

Problem source: https://codeforces.com/problemset/problem/50/A

Time limit per test: 1 second
Memory limit per test: 256 megabytes

## Problem

You are given a rectangular board of size n × m, consisting of unit 1×1 squares. You want to place as many 2×1 dominoes on the board as possible. Dominoes must cover exactly two adjacent unit squares and cannot overlap or go outside the board.

Find the maximum number of dominoes that can be placed on the board.

## Input

- The only line contains two integers n and m (1 ≤ n, m ≤ 16) — the dimensions of the board.

## Output

Print a single integer — the maximum number of 2×1 dominoes that can be placed.

## Example

Input
```
2 4
```

Output
```
4
```

## Explanation

The board has 8 unit squares and each domino covers 2 squares, so the maximum number is floor(2*4 / 2) = 4.

## Solution approach

The board has n·m squares and each domino covers 2 squares, so the maximum number of dominoes that can be placed without overlap is simply:

$$\left\lfloor\dfrac{n\times m}{2}\right\rfloor$$

This works because placing dominoes is equivalent to pairing unit squares; the best possible is to pair as many squares as possible, which is half the total number of squares rounded down.

Complexity: O(1) time and O(1) memory.

## Files in this folder

- [ADominoPiling_question](ADominoPiling_question)
