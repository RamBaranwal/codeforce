<h3><a href="https://codeforces.com/problemset/problem/155/A" target="_blank" rel="noopener noreferrer">I_love_%username%</a></h3>

<div class="header"><div class="title">A. I_love_%username%</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>Vasya adores sport programming. He can't write programs but he loves to watch the contests' progress. Vasya even has a favorite coder and Vasya pays special attention to him.</p>

<p>One day Vasya decided to collect the results of all contests where his favorite coder participated and track the progress of his coolness. For each contest where this coder participated, he wrote out a single non-negative number — the number of points his favorite coder earned in the contest. Vasya wrote out the points for the contest in the order, in which the contests run (naturally, no two contests ran simultaneously).</p>

<p>Vasya considers a coder's performance in a contest amazing in two situations: he can break either his best or his worst performance record. First, it is amazing if during the contest the coder earns strictly more points that he earned on each past contest. Second, it is amazing if during the contest the coder earns strictly less points that he earned on each past contest. A coder's first contest isn't considered amazing. Now he wants to count the number of amazing performances the coder had throughout his whole history of participating in contests. But the list of earned points turned out long and Vasya can't code... That's why he asks you to help him.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The first line contains the single integer n (1 ≤ n ≤ 1000) — the number of contests where the coder participated.</p>

<p>The next line contains n space-separated non-negative integer numbers — they are the points which the coder has earned. The points are given in the chronological order. All points do not exceed 10000.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>Print the single number — the number of amazing performances the coder has had during his whole history of participating in the contests.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>5
100 50 200 150 200</pre></div><div class="output"><div class="title">Output</div><pre>2</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>10
4664 6496 5814 7010 5762 5736 6944 4850 3698 7242</pre></div><div class="output"><div class="title">Output</div><pre>4</pre></div></div>
</div>

<div class="note"><div class="section-title">Note</div>
<p>In the first sample the performances number 2 and 3 are amazing.</p>

<p>In the second sample the performances number 2, 4, 9 and 10 are amazing.</p>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="155A/A_I_love_username_question#L1">A_I_love_username_question</a> — problem statement (full text)</li>
</ul>
</div>
