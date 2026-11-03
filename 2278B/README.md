# B. Stakes and Shapes

Problem source: https://codeforces.com/problemset/problem/2278/B

Time limit per test: 2 seconds
Memory limit per test: 256 megabytes

## Problem

Alice and Bob are playing Rock, Scissors, Paper.

The game consists of multiple rounds. In each round, each player chooses one of three possible outcomes: Rock, Scissors, or Paper. The rules are:

- Rock beats Scissors.
- Scissors beats Paper.
- Paper beats Rock.
- If both players choose the same outcome, the round ends in a draw.

The game consists of exactly `x + y + z` rounds. Bob knows that Alice will play Rock exactly `x` times, Scissors exactly `y` times, and Paper exactly `z` times. However, Bob does not know the order of Alice's outcomes.

Before the game starts, Bob must choose all of his outcomes in advance. Find an optimal sequence of `x + y + z` outcomes such that, regardless of the order of Alice's outcomes, the number of rounds won by Bob is at least the number of rounds won by Alice.

It is guaranteed that such a sequence always exists.

## Input

The first line contains a single integer `t` (`1 ≤ t ≤ 1000`) — the number of test cases.

The only line of each test case contains three space-separated integers `x`, `y`, and `z` (`0 ≤ x, y, z ≤ 100`, `x + y + z > 0`) — the number of times Alice will play Rock, Scissors, and Paper, respectively.

## Output

For each test case, print a string `s` of length `x + y + z` consisting only of the characters `R`, `S`, and `P`. The `i`-th character `s_i` represents Bob's move in the `i`-th round:

- `R` for Rock
- `S` for Scissors
- `P` for Paper

The output string must satisfy the required condition. If multiple valid answers exist, output any one of them.

## Examples

Input
```
2
0 0 3
1 1 2
```

Output
```
RPS
SPSS
```

## Note

In the first test case, Alice can only play Paper in all three rounds.

Bob chooses `RPS`. Thus, Bob loses once with Rock, wins once with Scissors, and draws once with Paper. Therefore, Bob wins one round and Alice wins one round, so the required condition is satisfied.

## Files in this folder

- [BStakesAndShapes.java](BStakesAndShapes.java)
- [Questtion.txt](Questtion.txt)
