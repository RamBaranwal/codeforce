<h3><a href="https://codeforces.com/problemset/problem/92/A" target="_blank" rel="noopener noreferrer">Chips</a></h3>

<div class="header"><div class="title">A. Chips</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>There are n walruses sitting in a circle, numbered clockwise from 1 to n. The presenter has m chips and gives chips to walruses starting from walrus 1 and moving clockwise. Walrus number i receives i chips. If the presenter cannot give the current walrus the required number of chips, the presenter takes the remaining chips and the process ends. Given n and m, determine how many chips the presenter will take at the end.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The first line contains two integers n and m (1 ≤ n ≤ 50, 1 ≤ m ≤ 10^4) — the number of walruses and the number of chips correspondingly.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>Print the number of chips the presenter ended up with.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>4 11</pre></div><div class="output"><div class="title">Output</div><pre>0</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>17 107</pre></div><div class="output"><div class="title">Output</div><pre>2</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>3 8</pre></div><div class="output"><div class="title">Output</div><pre>1</pre></div></div>
</div>

<div class="note"><div class="section-title">Note</div>
<p>In the first sample the presenter gives 1,2,3,4 and then again 1 chip; afterwards he runs out and cannot give 2 chips to walrus 2, so the presenter takes 0 chips.</p>

<p>In the third sample the presenter gives 1,2,3 and then 1; he has one chip left and cannot give 2 to walrus 2, so he takes that 1 chip.</p>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="92A/A_Chips_question#L1">A_Chips_question</a> — problem statement (full text)</li>
</ul>
</div>
