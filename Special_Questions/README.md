
# Maximum Fund Return Allocation

Problem source: Local / Special Question

Time limit per test: 3 seconds
Memory limit per test: 1024 megabytes

## Problem

You have a total fund of `m` units and `n` investment opportunities. The i-th opportunity is described by two integers `a_i` and `b_i`:

- `a_i` — the maximum amount you may invest in this opportunity.
- `b_i` — the percentage return (in percent) for each unit invested in this opportunity.

You may invest any non-negative real amount `x_i` in opportunity `i` such that `0 ≤ x_i ≤ a_i`. The total invested amount must not exceed `m` (i.e., ∑ x_i ≤ m). The profit from investing `x_i` in opportunity `i` equals `x_i * (b_i / 100)`.

Find the maximum total profit and print it with exactly two digits after the decimal point. Fractional investments are allowed.

## Input

- The first line contains two integers `n` and `m` — the number of opportunities and the total available fund.
- Each of the next `n` lines contains two integers `a_i` and `b_i` describing the i-th opportunity.

## Output

Print the maximum total profit achievable with the available fund, formatted with two decimal places.

## Examples

Input
```
5 50
30 21
40 12
10 2
50 13
20 15
```
Output
```
9.30
```

Input
```
4 100
60 10
40 15
100 15
50 8
```
Output
```
15.00
```

Input
```
5 150
50 20
70 15
30 10
80 12
100 14
```
Output
```
18.50
```

## Explanation

The optimal strategy is to greedily invest in opportunities with the highest percentage `b_i` first, taking up to their maximum `a_i`, until the fund `m` is exhausted.

**Files in this folder**

- [Maximum_Fund_Return_Allocation](Special_Questions/Maximum_Fund_Return_Allocation)
- [Maximum_Fund_Return_Allocation.java](Special_Questions/Maximum_Fund_Return_Allocation.java)

**Problem source**: Local / Special Question

**Explanation**

- This problem is solved by sorting opportunities by their percentage return `b_i` in descending order, then greedily investing up to `a_i` in each until the total `m` is exhausted.
- Use floating arithmetic to accumulate profit = sum(x_i * b_i / 100) and print with two decimal places.

If you'd like, I can add a link to an online problem statement (Codeforces/other) if you provide the URL.
