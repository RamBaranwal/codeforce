<h1><a href="https://codeforces.com/problemset/problem/2253/A" target="_blank" rel="noopener noreferrer">A. The Best Card</a></h1>

<div class="header">
  <div class="title">A. The Best Card</div>
  <div class="time-limit"><strong>Time limit:</strong> 2 seconds</div>
  <div class="memory-limit"><strong>Memory limit:</strong> 512 megabytes</div>
</div>

## Problem

A card game contains `n` cards with values from `2` through `n + 1`.

When comparing cards with values `x` and `y`:

- If one value is divisible by the other, the smaller card wins.
- Otherwise, the larger card wins.

Determine whether there is a card that wins against every other card.

## Input

The first line contains an integer `t` (`1 <= t <= 10^4`) — the number of test cases.

Each test case contains one integer `n` (`2 <= n <= 2 * 10^5`). The sum of `n` over all test cases does not exceed `3 * 10^6`.

## Output

For each test case, print `YES` if there is a card that wins against every other card; otherwise, print `NO`.

The answer is case-insensitive.

## Example

### Input

```text
5
2
3
4
5
8
```

### Output

```text
YES
NO
YES
NO
NO
```

## Solution Idea

The largest card is `n + 1`.

- Against a smaller card that does not divide `n + 1`, the largest card wins because it has the greater value.
- If a smaller card `d` divides `n + 1`, then `d` wins because it is the smaller value in a divisible pair.

Therefore, a winning card exists exactly when no value from `2` through `n` divides `n + 1`.

For each test case, check every possible smaller card `d`:

1. If `(n + 1) % d == 0`, print `NO`.
2. If no divisor is found, print `YES`.

### Correctness

If the algorithm prints `NO`, it found a card `d` such that `d` divides `n + 1`. Since `d < n + 1`, card `d` wins against `n + 1`, so no card can be guaranteed to win against every other card.

If the algorithm prints `YES`, no card from `2` through `n` divides `n + 1`. Thus `n + 1` is larger than and not divisible by every other card, so it wins against every card. Hence, a winning card exists.

## Complexity

For each test case, the algorithm checks at most `n - 1` values:

- **Time:** `O(n)`
- **Space:** `O(1)`

## Files in This Folder

<ul>
  <li><a href="2253A/ATheBestCard_question">ATheBestCard_question</a> — problem statement</li>
  <li><a href="2253A/ATheBestCard.java">ATheBestCard.java</a> — Java solution</li>
</ul>
