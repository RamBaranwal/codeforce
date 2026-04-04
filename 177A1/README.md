<h3><a href="https://codeforces.com/problemset/problem/177/A" target="_blank" rel="noopener noreferrer">A. Good Matrix Elements</a></h3>

<div class="header"><div class="title">A. Good Matrix Elements</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>The Smart Beaver from ABBYY got hooked on square matrices. Now he is busy studying an n × n size matrix, where n is odd. The Smart Beaver considers the following matrix elements good:</p>

<ul>
<li>Elements of the main diagonal.</li>
<li>Elements of the secondary diagonal.</li>
<li>Elements of the "middle" row — the row which has exactly rows above it and the same number of rows below it.</li>
<li>Elements of the "middle" column — the column that has exactly columns to the left of it and the same number of columns to the right of it.</li>
</ul>

<p>Help the Smart Beaver count the sum of good elements of the given matrix.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The first line of input data contains a single odd integer n. Each of the next n lines contains n integers aij (0 ≤ aij ≤ 100) separated by single spaces — the elements of the given matrix.</p>

<p>The input limitations for getting 30 points are:</p>

<p>1 ≤ n ≤ 5</p>
<p>The input limitations for getting 100 points are:</p>

<p>1 ≤ n ≤ 101</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>Print a single integer — the sum of good matrix elements.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>3
1 2 3
4 5 6
7 8 9</pre></div><div class="output"><div class="title">Output</div><pre>45</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>5
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1</pre></div><div class="output"><div class="title">Output</div><pre>17</pre></div></div>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="177A1/A_1_Good_Matrix_Element_question#L1">A_1_Good_Matrix_Element_question</a> — problem statement (full text)</li>
</ul>
</div>
