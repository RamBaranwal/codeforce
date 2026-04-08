<h3><a href="https://codeforces.com/problemset/problem/1339/A" target="_blank" rel="noopener noreferrer">Remove_Smallest</a></h3>

<div class="header"><div class="title">A. Remove Smallest</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>You are given the array a consisting of n positive (greater than zero) integers.</p>

<p>In one move, you can choose two indices i and j (i≠j) such that the absolute difference between a_i and a_j is no more than one (|a_i−a_j|≤1) and remove the smallest of these two elements. If two elements are equal, you can remove any of them (but exactly one).</p>

<p>Your task is to find if it is possible to obtain the array consisting of only one element using several (possibly, zero) such moves or not.</p>

<p>You have to answer t independent test cases.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The first line of the input contains one integer t (1≤t≤1000) — the number of test cases. Then t test cases follow.</p>

<p>The first line of the test case contains one integer n (1≤n≤50) — the length of a. The second line of the test case contains n integers a1,a2,…,an (1≤ai≤100), where ai is the i-th element of a.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>For each test case, print the answer: "YES" if it is possible to obtain the array consisting of only one element using several (possibly, zero) moves described in the problem statement, or "NO" otherwise.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>5
3
1 2 2
4
5 5 5 5
3
1 2 4
4
1 3 4 4
1
100</pre></div><div class="output"><div class="title">Output</div><pre>YES
YES
NO
NO
YES</pre></div></div>
</div>

<div class="note"><div class="section-title">Note</div>
<p>In the first test case of the example, we can perform the following sequence of moves:</p>

<p>choose i=1 and j=3 and remove a_i (so a becomes [2,2]); choose i=1 and j=2 and remove a_j (so a becomes [2]).</p>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="1339A/A_Remove_Smallest_question#L1">A_Remove_Smallest_question</a> — problem statement (full text)</li>
</ul>
</div>
