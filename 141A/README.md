<h3><a href="https://codeforces.com/problemset/problem/141/A" target="_blank" rel="noopener noreferrer">Amusing Joke</a></h3>

<div class="header"><div class="title">A. Amusing Joke</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div>

<div>
<p>So, the New Year holidays are over. Santa Claus and his colleagues can take a rest and have guests at last. When two "New Year and Christmas Men" meet, their assistants cut out of cardboard the letters from the guest's name and the host's name in honor of this event. Then they hung the letters above the main entrance. One night, when everyone went to bed, someone took all the letters of our characters' names. Then he may have shuffled the letters and put them in one pile in front of the door.</p>

<p>The next morning it was impossible to find the culprit who had made the disorder. But everybody wondered whether it is possible to restore the names of the host and his guests from the letters lying at the door? That is, we need to verify that there are no extra letters, and that nobody will need to cut more letters.</p>

<p>Help the "New Year and Christmas Men" and their friends to cope with this problem. You are given both inscriptions that hung over the front door the previous night, and a pile of letters that were found at the front door next morning.</p>
</div>

<div class="input-specification"><div class="section-title">Input</div>
<p>The input file consists of three lines: the first line contains the guest's name, the second line contains the name of the residence host and the third line contains letters in a pile that were found at the door in the morning. All lines are not empty and contain only uppercase Latin letters. The length of each line does not exceed 100.</p>
</div>

<div class="output-specification"><div class="section-title">Output</div>
<p>Print "YES" without the quotes, if the letters in the pile could be permuted to make the names of the "New Year and Christmas Men". Otherwise, print "NO" without the quotes.</p>
</div>

<div class="sample-tests"><div class="section-title">Examples</div>
<div class="sample-test"><div class="input"><div class="title">Input</div><pre>SANTACLAUS
DEDMOROZ
SANTAMOROZDEDCLAUS</pre></div><div class="output"><div class="title">Output</div><pre>YES</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>PAPAINOEL
JOULUPUKKI
JOULNAPAOILELUPUKKI</pre></div><div class="output"><div class="title">Output</div><pre>NO</pre></div></div>

<div class="sample-test"><div class="input"><div class="title">Input</div><pre>BABBONATALE
FATHERCHRISTMAS
BABCHRISTMASBONATALLEFATHER</pre></div><div class="output"><div class="title">Output</div><pre>NO</pre></div></div>
</div>

<div class="note"><div class="section-title">Note</div>
<p>In the first sample the letters written in the last line can be used to write the names and there won't be any extra letters left.</p>
</div>

<div class="files"><div class="section-title">Files in this folder</div>
<ul>
    <li><a href="141A/A_Amusing_Joke_question#L1">A_Amusing_Joke_question</a> — problem statement (full text)</li>
</ul>
</div>
