# A. Don't Try to Count

Problem source: https://codeforces.com/problemset/problem/1881/A

Time limit per test: 2 seconds
Memory limit per test: 256 megabytes

## Problem

Given strings `x` and `s`, one operation appends the current value of `x` to
itself. Find the minimum number of operations after which `s` appears as a
substring of `x`. If this is impossible, output `-1`.

The strings contain lowercase Latin letters and satisfy `n * m <= 25`, where
`n` and `m` are their lengths.

## Input

The first line contains an integer `t` (`1 ≤ t ≤ 10^4`) — the number of test
cases.

Each test case consists of three lines:

- The first line contains `n` and `m` (`1 ≤ n * m ≤ 25`).
- The second line contains the string `x` of length `n`.
- The third line contains the string `s` of length `m`.

## Output

For each test case, print the minimum number of operations needed for `s` to
appear in `x`, or `-1` if it can never appear.

## Examples

Input
```
12
1 5
a
aaaaa
5 5
eforc
force
2 5
ab
ababa
3 5
aba
ababa
4 3
babb
bbb
5 1
aaaaa
a
4 2
aabb
ba
2 8
bk
kbkbkbkb
12 2
fjdgmujlcont
tf
2 2
aa
aa
3 5
abb
babba
1 19
m
mmmmmmmmmmmmmmmmmmm
```

Output
```
3
1
2
-1
1
0
1
3
1
0
2
5
```

## Approach

Start with `x` and check whether it already contains `s`. If not, append the
current string to itself and check again after each operation.

Because `n * m <= 25`, it is sufficient to continue while the constructed
string has length at most `25`; after one final check, any remaining case is
impossible. The first successful check gives the minimum number of operations.

## Complexity

The constructed string has length at most `25`, so each test case uses
`O(25 * m)` time and `O(25)` space.

## Files in this folder

- [ADonTTryToCount.java](ADonTTryToCount.java)
- [Question.txt](Question.txt)
