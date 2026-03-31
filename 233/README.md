<h3><a href="https://codeforces.com/problemset/problem/233/A" target="_blank" rel="noopener noreferrer">Perfect Permutation</a></h3>

<div class="header"><div class="title">A. Perfect Permutation</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>Given a positive integer n, output a permutation of numbers from 1 to n such that for every i (1 ≤ i ≤ n) the i-th element of the permutation is not equal to i. If there is no such permutation, print -1. If there are multiple answers, print any of them.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The only line contains an integer n (1 ≤ n ≤ 1000) — the size of the permutation.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>If a perfect permutation exists, print n integers — the permutation of numbers from 1 to n, separated by spaces. Otherwise print -1.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>2</pre></div><div class="output"><div class="title">Output</div><pre>2 1</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>3</pre></div><div class="output"><div class="title">Output</div><pre>-1</pre></div></div>
</div>

<div class="solution-idea"><div class="section-title">Solution idea</div>
<p>For even n, swap each adjacent pair: output 2 1 4 3 ... For odd n, it's impossible — print -1. Reference implementation: <a href="A_Perfect_Permutation.java">A_Perfect_Permutation.java</a></p>
</div>
