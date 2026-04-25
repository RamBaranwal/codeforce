# Maximum Fund Return Allocation

Problem source: Local / Special Question

Time limit per test: 3 seconds
Memory limit per test: 1024 megabytes

## Problem

You are given n investment opportunities. The i-th opportunity is described by two integers (a_i, b_i). You have a total fund of m. Allocate the available fund among the opportunities to maximize the total return. The answer should be printed with two digits after the decimal point.

The problem allows fractional allocation of funds to an opportunity (i.e., you may invest a part of the required amount for some opportunities) to maximize the total return.

## Input

- The first line contains two integers n and m — the number of opportunities and the total available fund.
- Each of the next n lines contains two integers a_i and b_i describing the i-th opportunity.

## Output

Print the maximum total return achievable with the available fund, formatted with two decimal places.

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

## Note

If the original problem statement or constraints differ from the description above, update this README with the precise text. The examples above are taken from the problem's local test cases.

## Files in this folder

- [Maximum_Fund_Return_Allocation](Maximum_Fund_Return_Allocation)
- [Maximum_Fund_Return_Allocation.java](Maximum_Fund_Return_Allocation.java)
