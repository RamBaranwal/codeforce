<h3><a href="https://codeforces.com/problemset/problem/151/A" target="_blank" rel="noopener noreferrer">Soft Drinking</a></h3>

<div class="header"><div class="title">A. Soft Drinking</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>This winter is so cold in Nvodsk! A group of n friends decided to buy k bottles of a soft drink called "Take-It-Light" to warm up a bit. Each bottle has l milliliters of the drink. Also they bought c limes and cut each of them into d slices. After that they found p grams of salt.</p>

<p>To make a toast, each friend needs nl milliliters of the drink, a slice of lime and np grams of salt. The friends want to make as many toasts as they can, provided they all drink the same amount. How many toasts can each friend make?</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The first and only line contains positive integers n, k, l, c, d, p, nl, np, not exceeding 1000 and no less than 1. The numbers are separated by exactly one space.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>Print a single integer — the number of toasts each friend can make.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>3 4 5 10 8 100 3 1</pre></div><div class="output"><div class="title">Output</div><pre>2</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>5 100 10 1 19 90 4 3</pre></div><div class="output"><div class="title">Output</div><pre>3</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>10 1000 1000 25 23 1 50 1</pre></div><div class="output"><div class="title">Output</div><pre>0</pre></div></div>
</div>

<div class="note"><div class="section-title">Note</div>
<p>A comment to the first sample:</p>

<p>Overall the friends have 4 * 5 = 20 milliliters of the drink, it is enough to make 20 / 3 = 6 toasts. The limes are enough for 10 * 8 = 80 toasts and the salt is enough for 100 / 1 = 100 toasts. However, there are 3 friends in the group, so the answer is min(6, 80, 100) / 3 = 2.</p>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="151A/A_Soft_Drinking_question#L1">A_Soft_Drinking_question</a> — problem statement (full text)</li>
</ul>
</div>
