<h3><a href="https://codeforces.com/problemset/problem/119/A" target="_blank" rel="noopener noreferrer">Epic_Game</a></h3>

<div class="header"><div class="title">A. Epic Game</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>Simon and Antisimon play a game. Initially each player receives one fixed positive integer that doesn't change throughout the game. Simon receives number a and Antisimon receives number b. They also have a heap of n stones. The players take turns to make a move and Simon starts. During a move a player should take from the heap the number of stones equal to the greatest common divisor of the fixed number he has received and the number of stones left in the heap. A player loses when he cannot take the required number of stones (i. e. the heap has strictly less stones left than one needs to take).</p>

<p>Your task is to determine by the given a, b and n who wins the game.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The only string contains space-separated integers a, b and n (1≤a, b, n≤100) — the fixed numbers Simon and Antisimon have received correspondingly and the initial number of stones in the pile.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>If Simon wins, print "0" (without the quotes), otherwise print "1" (without the quotes).</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>3 5 9</pre></div><div class="output"><div class="title">Output</div><pre>0</pre></div></div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>1 1 100</pre></div><div class="output"><div class="title">Output</div><pre>1</pre></div></div>
</div>

<div class="note"><div class="section-title">Note</div>
<p>The greatest common divisor of two non-negative integers a and b is such maximum positive integer k, that a is divisible by k without remainder and similarly, b is divisible by k without remainder. Let gcd(a, b) represent the operation of calculating the greatest common divisor of numbers a and b. Specifically, gcd(x, 0) = gcd(0, x) = x.</p>

<p>In the first sample the game will go like that:</p>

<p>Simon should take gcd(3, 9) = 3 stones from the heap. After his move the heap has 6 stones left.
Antisimon should take gcd(5, 6) = 1 stone from the heap. After his move the heap has 5 stones left.
Simon should take gcd(3, 5) = 1 stone from the heap. After his move the heap has 4 stones left.
Antisimon should take gcd(5, 4) = 1 stone from the heap. After his move the heap has 3 stones left.
Simon should take gcd(3, 3) = 3 stones from the heap. After his move the heap has 0 stones left.
Antisimon should take gcd(5, 0) = 5 stones from the heap. As 0 &lt; 5, it is impossible and Antisimon loses.</p>

<p>In the second sample each player during each move takes one stone from the heap. As n is even, Antisimon takes the last stone and Simon can't make a move after that.</p>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="119A/A_Epic_Game_question#L1">A_Epic_Game_question</a> — problem statement (full text)</li>
</ul>
</div>
