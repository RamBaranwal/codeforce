# B. Creating the Contest

Problem source: https://codeforces.com/problemset/problem/1029/B

Time limit per test: 1 second
Memory limit per test: 256 megabytes

## Problem

You are given a problemset consisting of n problems. The difficulty of the i-th problem is a_i. It is guaranteed that all difficulties are distinct and are given in increasing order.

You have to assemble the contest which consists of some problems of the given problemset (a subset, not necessarily consecutive). The condition is: for every problem except the hardest one in the selected subset, there must exist a problem in the subset with difficulty greater than the current problem but not greater than twice its difficulty. Formally, if the selected difficulties in increasing order are a_{i1}, a_{i2}, ..., a_{ip}, then for each j from 1 to p-1 it must hold that a_{i(j+1)} ≤ 2 * a_{ij}.

A contest consisting of a single problem is always valid. Among all valid contests, find one with the maximum number of problems and print that number.

## Input

- The first line contains one integer n (1 ≤ n ≤ 2·10^5) — the number of problems.
- The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 10^9) — difficulties in strictly increasing order.

## Output

Print a single integer — the maximum number of problems in a valid contest.

## Examples

Input
```
10
1 2 5 6 7 10 21 23 24 49
```
Output
```
4
```

Input
```
5
2 10 50 110 250
```
Output
```
1
```

Input
```
6
4 7 12 100 150 199
```
Output
```
3
```

## Note

From the first example: the longest valid contest is [5, 6, 7, 10], size 4. In the third example there are two valid contests of size 3: [4,7,12] and [100,150,199].

## Files in this folder

- [B_Creating_the_Contest_question](B_Creating_the_Contest_question)
- [B_Creating_the_Contest.java](B_Creating_the_Contest.java)
