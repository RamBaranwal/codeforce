<h3>C. Spring</h3>

<div class="header"><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>512 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>Alice, Bob, and Carol visit a spring to collect water. Alice visits every a days (on days a,2a,3a,…), Bob visits every b days (on days b,2b,3b,…), and Carol visits every c days (on days c,2c,3c,…).</p>

<p>When only one person visits, they collect 6 liters of water. If multiple people visit, the water is divided equally: two people take 3 liters each, and three people take 2 liters each.</p>

<p>Your task is to calculate how much water Alice, Bob, and Carol collect over m days, starting from day 1.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The first line contains a single integer t (1≤t≤10^4) — the number of test cases.</p>

<p>The only line of each test case contains four integers a, b, c, and m (1≤a,b,c≤10^6; 1≤m≤10^17).</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>For each test case, print three integers — the number of liters of water that Alice, Bob, and Carol collect over m days.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>4
2 1 3 10
1 1 8 5
6 20 15 1000
650650 1092 157437 100000000000000000
</pre></div><div class="output"><div class="title">Output</div><pre>14 38 8 
15 15 0 
881 236 281 
845294870595 549337065358857 3774389867286 
</pre></div></div>
</div>

<div class="note"><div class="section-title">Note</div>
<p>Example explanation (first test case): on day 1 only Bob visits (6 liters); on day 2 Alice and Bob visit (3 liters each); on day 3 Bob and Carol visit (3 liters each); … on day 6 all three visit (2 liters each), and so on.</p>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="2204C/CSpring_question">CSpring_question</a></li>
    <li><a href="2204C/CSpring.java">CSpring.java</a></li>
</ul>
</div>
