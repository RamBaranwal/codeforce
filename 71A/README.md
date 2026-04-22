<h3><a href="https://codeforces.com/problemset/problem/71/A" target="_blank" rel="noopener noreferrer">A. Way Too Long Words</a></h3>

<div class="header"><div class="title">A. Way Too Long Words</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.</p>

<p>Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.</p>

<p>This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.</p>

<p>Thus, "localization" will be spelt as "l10n", and "internationalization" will be spelt as "i18n".</p>

<p>You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis
</pre></div><div class="output"><div class="title">Output</div><pre>word
l10n
i18n
p43s
</pre></div></div>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="71A/A_Way_Too_Long_Words_question">A_Way_Too_Long_Words_question</a></li>
    <li><a href="71A/A_Way_Too_Long_Words.java">A_Way_Too_Long_Words.java</a></li>
</ul>
</div>
