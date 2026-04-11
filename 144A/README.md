<h3><a href="https://codeforces.com/problemset/problem/144/A" target="_blank" rel="noopener noreferrer">Arrival of the General</a></h3>

<div class="header"><div class="title">A. Arrival of the General</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>A Ministry for Defense sent a general to inspect the Super Secret Military Squad under the command of the Colonel SuperDuper. Having learned the news, the colonel ordered to all n squad soldiers to line up on the parade ground.</p>

<p>By the military charter the soldiers should stand in the order of non-increasing of their height. But as there's virtually no time to do that, the soldiers lined up in the arbitrary order. However, the general is rather short-sighted and he thinks that the soldiers lined up correctly if the first soldier in the line has the maximum height and the last soldier has the minimum height. Please note that the way other solders are positioned does not matter, including the case when there are several soldiers whose height is maximum or minimum. Only the heights of the first and the last soldier are important.</p>

<p>For example, the general considers the sequence of heights (4, 3, 4, 2, 1, 1) correct and the sequence (4, 3, 1, 2, 2) wrong.</p>

<p>Within one second the colonel can swap any two neighboring soldiers. Help him count the minimum time needed to form a line-up which the general will consider correct.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The first input line contains the only integer n (2 ≤ n ≤ 100) which represents the number of soldiers in the line. The second line contains integers a1, a2, ..., an (1 ≤ ai ≤ 100) the values of the soldiers' heights in the order of soldiers' heights' increasing in the order from the beginning of the line to its end. The numbers are space-separated. Numbers a1, a2, ..., an are not necessarily different.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>Print the only integer that represents the minimum number of swaps needed.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>4
33 44 11 22</pre></div><div class="output"><div class="title">Output</div><pre>2</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>7
10 10 58 31 63 40 76</pre></div><div class="output"><div class="title">Output</div><pre>10</pre></div></div>
</div>

<div class="note"><div class="section-title">Note</div>
<p>In the first sample the colonel will need to swap the first and second soldier and then the third and fourth soldier. That will take 2 seconds. The resulting position of the soldiers is (44, 33, 22, 11).</p>

<p>In the second sample the colonel may swap the soldiers in the following sequence:</p>

<pre>(10, 10, 58, 31, 63, 40, 76)
(10, 58, 10, 31, 63, 40, 76)
(10, 58, 10, 31, 63, 76, 40)
(10, 58, 10, 31, 76, 63, 40)
(10, 58, 31, 10, 76, 63, 40)
(10, 58, 31, 76, 10, 63, 40)
(10, 58, 31, 76, 63, 10, 40)
(10, 58, 76, 31, 63, 10, 40)
(10, 76, 58, 31, 63, 10, 40)
(76, 10, 58, 31, 63, 10, 40)
(76, 10, 58, 31, 63, 40, 10)</pre>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="144A/A_Arrival_of_the_General_question#L1">A_Arrival_of_the_General_question</a></li>
</ul>
</div>