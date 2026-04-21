<h3><a href="https://codeforces.com/problemset/problem/80/A" target="_blank" rel="noopener noreferrer">A. Panoramix's Prediction</a></h3>

<div class="header"><div class="title">A. Panoramix's Prediction</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>A prime number is a number which has exactly two distinct divisors: one and itself. For example, numbers 2, 7, 3 are prime, and 1, 6, 4 are not.</p>

<p>The next prime number after x is the smallest prime number greater than x. For example, the next prime number after 2 is 3, and the next prime number after 3 is 5. Note that there is exactly one next prime number after each number. So 5 is not the next prime number for 2.</p>

<p>One cold April morning Panoramix predicted that soon Kakofonix will break free from his straitjacket, and this will be a black day for the residents of the Gallic countryside.</p>

<p>Panoramix's prophecy tells that if some day Asterix and Obelix beat exactly x Roman soldiers, where x is a prime number, and next day they beat exactly y Roman soldiers, where y is the next prime number after x, then it's time to wait for Armageddon, for nothing can shut Kakofonix up while he sings his infernal song.</p>

<p>Yesterday the Gauls beat n Roman soldiers and it turned out that the number n was prime! Today their victims were a troop of m Romans (m &gt; n). Determine whether the Gauls should wait for the black day after today's victory of Asterix and Obelix?</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The first and only input line contains two positive integers 1 n and m (2 &le; n &lt; m &le; 50). It is guaranteed that n is prime.</p>
<p>Pretests contain all the cases with restrictions 2 &le; n &lt; m &le; 4.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>Print YES, if m is the next prime number after n, or NO otherwise.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>3 5</pre></div><div class="output"><div class="title">Output</div><pre>YES</pre></div></div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>7 11</pre></div><div class="output"><div class="title">Output</div><pre>YES</pre></div></div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>7 9</pre></div><div class="output"><div class="title">Output</div><pre>NO</pre></div></div>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="80A/A_Panoramix_s_Prediction_question">A_Panoramix_s_Prediction_question</a></li>
    <li><a href="80A/A_Panoramix_s_Prediction.java">A_Panoramix_s_Prediction.java</a></li>
</ul>
</div>