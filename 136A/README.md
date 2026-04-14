
<h3><a href="https://codeforces.com/problemset/problem/136/A" target="_blank" rel="noopener noreferrer">A. Presents</a></h3>

<div class="header"><div class="title">A. Presents</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>Little Petya very much likes gifts. Recently he has received a new laptop as a New Year gift from his mother. He immediately decided to give it to somebody else as what can be more pleasant than giving somebody gifts. And on this occasion he organized a New Year party at his place and invited n his friends there.</p>

<p>If there's one thing Petya likes more that receiving gifts, that's watching others giving gifts to somebody else. Thus, he safely hid the laptop until the next New Year and made up his mind to watch his friends exchanging gifts while he does not participate in the process. He numbered all his friends with integers from 1 to n. Petya remembered that a friend number i gave a gift to a friend number pi. He also remembered that each of his friends received exactly one gift.</p>

<p>Now Petya wants to know for each friend i the number of a friend who has given him a gift.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The first line contains one integer n (1 ≤ n ≤ 100) — the quantity of friends Petya invited to the party. The second line contains n space-separated integers: the i-th number is pi — the number of a friend who gave a gift to friend number i. It is guaranteed that each friend received exactly one gift. It is possible that some friends do not share Petya's ideas of giving gifts to somebody else. Those friends gave the gifts to themselves.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>Print n space-separated integers: the i-th number should equal the number of the friend who gave a gift to friend number i.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>4
2 3 4 1</pre></div><div class="output"><div class="title">Output</div><pre>4 1 2 3</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>3
1 3 2</pre></div><div class="output"><div class="title">Output</div><pre>1 3 2</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>2
1 2</pre></div><div class="output"><div class="title">Output</div><pre>1 2</pre></div></div>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="136A/A_Presents_question#L1">A_Presents_question</a></li>
    <li><a href="136A/A_Presents.java#L1">A_Presents.java</a></li>
</ul>
</div>
