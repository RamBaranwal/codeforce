# C. Move Brackets

Problem source: https://codeforces.com/problemset/problem/1374/C

Time limit per test: 1 second
Memory limit per test: 256 megabytes

## Problem

You are given a bracket sequence `s` of length `n`, where `n` is even. The string `s` consists of `n/2` opening brackets `(` and `n/2` closing brackets `)`.

In one move, you can choose exactly one bracket and move it to the beginning or to the end of the string. In other words, you choose some index `i`, remove the `i`-th character of `s`, and insert it before or after all remaining characters.

Find the minimum number of moves required to obtain a regular bracket sequence from `s`. It can be proved that the answer always exists under the given constraints.

Recall that a regular bracket sequence is defined as follows:

- `()` is a regular bracket sequence.
- If `s` is a regular bracket sequence, then `(` + `s` + `)` is a regular bracket sequence.
- If `s` and `t` are regular bracket sequences, then `s` + `t` is a regular bracket sequence.

For example, `()()`, `(())()`, `(())`, and `()` are regular bracket sequences, but `)(`, `()(`, and `)))` are not.

## Input

The first line of the input contains one integer `t` (`1 ≤ t ≤ 2000`) — the number of test cases.

The first line of each test case contains one integer `n` (`2 ≤ n ≤ 50`) — the length of `s`. It is guaranteed that `n` is even.

The second line of each test case contains the string `s`, consisting of `n/2` opening brackets and `n/2` closing brackets.

## Output

For each test case, print the minimum number of moves required to obtain a regular bracket sequence from `s`.

## Examples

Input
```
4
2
)(
4
()()
8
())()()(
10
)))((((())
```

Output
```
1
0
1
3
```

## Note

In the first test case, it is sufficient to move the first bracket to the end of the string.

In the third test case, it is sufficient to move the last bracket to the beginning of the string.

In the fourth test case, we can choose the last three opening brackets, move them to the beginning of the string, and obtain `((()))(())`.

## Files in this folder

- [CMoveBrackets.java](CMoveBrackets.java)
- [Question.txt](Question.txt)
