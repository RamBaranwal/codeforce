
<h3><a href="https://codeforces.com/problemset/problem/214/A" target="_blank" rel="noopener noreferrer">System of Equations</a></h3>

<div class="header"><div class="title">A. System of Equations</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>Furik loves math lessons very much, so he doesn't attend them, unlike Rubik. But now Furik wants to get a good mark for math. For that Ms. Ivanova, his math teacher, gave him a new task. Furik solved the task immediately. Can you?</p>

<p>You are given a system of equations. You should count how many pairs of integers (a, b) (0 ≤ a, b) satisfy the system.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>A single line contains two integers n, m (1 ≤ n, m ≤ 1000) — the parameters of the system.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>Print the number of pairs (a, b) that satisfy the system.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>9 3</pre></div><div class="output"><div class="title">Output</div><pre>1</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>14 28</pre></div><div class="output"><div class="title">Output</div><pre>1</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>4 20</pre></div><div class="output"><div class="title">Output</div><pre>0</pre></div></div>
</div>

<div class="solution-idea"><div class="section-title">Solution idea</div>
<p>Brute-force iterate a and b within reasonable bounds (0..1000) and check both equations. Reference implementation: <a href="A_System_of_Equations.java">A_System_of_Equations.java</a></p>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
	<li><a href="214/A_System_of_Equations_Question#L1">A_System_of_Equations_Question</a> — problem statement (full text)</li>
	<li><a href="214/A_System_of_Equations.java#L1">A_System_of_Equations.java</a> — solution implementation</li>
</ul>
</div>
