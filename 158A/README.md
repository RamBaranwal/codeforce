<h3><a href="https://codeforces.com/problemset/problem/158/A" target="_blank" rel="noopener noreferrer">Next Round</a></h3>

<div class="header"><div class="title">A. Next Round</div><div class="time-limit"><div class="property-title">time limit per test</div>3 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.</p>

<p>A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.</p>

<p>The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>Output the number of participants who advance to the next round.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>8 5
10 9 8 7 7 7 5 5</pre></div><div class="output"><div class="title">Output</div><pre>6</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>4 2
0 0 0 0</pre></div><div class="output"><div class="title">Output</div><pre>0</pre></div></div>
</div>

<div class="note"><div class="section-title">Note</div>
<p>In the first example the participant on the 5th place earned 7 points. As the participant on the 6th place also earned 7 points, there are 6 advancers.</p>

<p>In the second example nobody got a positive score.</p>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="158A/A_Next_Round_question#L1">A_Next_Round_question</a> — problem statement (full text)</li>
</ul>
</div>
