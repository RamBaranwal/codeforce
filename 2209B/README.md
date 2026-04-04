<h3><a href="https://codeforces.com/problemset/problem/2209/B" target="_blank" rel="noopener noreferrer">B. Array</a></h3>

<div class="header"><div class="title">B. Array</div><div class="time-limit"><div class="property-title">time limit per test</div>1.5 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>You are given an integer array a of length n.</p>

<p>For each index i, find the maximum number of indices j such that j&gt;i and |a_i−k|&gt;|a_j−k|, over all possible integer values of k.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤100). The description of the test cases follows.</p>

<p>The first line of each test case contains an integer n (1≤n≤5000).</p>

<p>The second line contains n integers a1,a2,…,an (−10^9≤ai≤10^9).</p>

<p>It is guaranteed that the sum of n over all test cases does not exceed 5000.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>For each test case, output n integers denoting the answer.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>6
1
1092
2
105 -105
5
1 2 93 84 2
7
2 9 38 4 7 1 6
10
1 9 20 9 829 3 87 1 283 7
11
9 18 29817 283 3 3928 5726 1942 1000000000 -1000000000 19</pre></div><div class="output"><div class="title">Output</div><pre>0
1 0
4 2 2 1 0
5 4 4 2 2 1 0
8 4 4 3 5 3 2 2 1 0
8 7 7 4 5 3 3 2 2 1 0</pre></div></div>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="2209B/B_Array_question#L1">B_Array_question</a> — problem statement (full text)</li>
    <li><a href="2209B/B_Array.java#L1">B_Array.java</a> — solution implementation</li>
</ul>
</div>
