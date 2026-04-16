<h3><a href="https://codeforces.com/problemset/problem/116/A" target="_blank" rel="noopener noreferrer">A. Tram</a></h3>

<div class="header"><div class="title">A. Tram</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>Linear Kingdom has exactly one tram line. It has n stops, numbered from 1 to n in the order of tram's movement. At the i-th stop a<sub>i</sub> passengers exit the tram, while b<sub>i</sub> passengers enter it. The tram is empty before it arrives at the first stop. Also, when the tram arrives at the last stop, all passengers exit so that it becomes empty.</p>

<p>Your task is to calculate the tram's minimum capacity such that the number of people inside the tram at any time never exceeds this capacity. Note that at each stop all exiting passengers exit before any entering passenger enters the tram.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The first line contains a single number n (2&nbsp;≤&nbsp;n&nbsp;≤&nbsp;1000) — the number of the tram's stops.</p>

<p>Then n lines follow, each contains two integers a<sub>i</sub> and b<sub>i</sub> (0&nbsp;≤&nbsp;a<sub>i</sub>,&nbsp;b<sub>i</sub>&nbsp;≤&nbsp;1000) — the number of passengers that exits the tram at the i-th stop, and the number of passengers that enter the tram at the i-th stop. The stops are given from the first to the last stop in the order of tram's movement.</p>

<p>The number of people who exit at a given stop does not exceed the total number of people in the tram immediately before it arrives at the stop. This particularly means that a<sub>1</sub>=0. At the last stop, all the passengers exit the tram and it becomes empty. More formally, a<sub>n</sub> equals the number of passengers just before the last stop, and b<sub>n</sub>=0.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>Print a single integer denoting the minimum possible capacity of the tram (0 is allowed).</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>4
0 3
2 5
4 2
4 0</pre></div><div class="output"><div class="title">Output</div><pre>6</pre></div></div>
</div>

<div class="note"><div class="section-title">Note</div>
<p>For the example, a capacity of 6 is sufficient:</p>
<p>At the first stop, the number of passengers inside the tram before arriving is 0. Then, 3 passengers enter the tram, and the number of passengers inside the tram becomes 3.</p>
<p>At the second stop, 2 passengers exit the tram (1 passenger remains inside). Then, 5 passengers enter the tram. There are 6 passengers inside the tram now.</p>
<p>At the third stop, 4 passengers exit the tram (2 passengers remain inside). Then, 2 passengers enter the tram. There are 4 passengers inside the tram now.</p>
<p>Finally, all the remaining passengers inside the tram exit the tram at the last stop. There are no passenger inside the tram now, which is in line with the constraints.</p>
<p>Since the number of passengers inside the tram never exceeds 6, a capacity of 6 is sufficient. Furthermore it is not possible for the tram to have a capacity less than 6. Hence, 6 is the correct answer.</p>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="116A/A_Train_question#L1">A_Train_question</a></li>
    <li><a href="116A/A_Tram.java#L1">A_Tram.java</a></li>
</ul>
</div>
