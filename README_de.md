# Anagramm

Bestimmen Sie bei zwei Wörtern, die aus Groß- und Kleinbuchstaben bestehen, ob sie Anagramme sind.
Bei dieser Aufgabe wird davon ausgegangen, dass kleine und große Buchstaben nicht zu unterscheiden sind.

Ein Wort ist ein Anagramm, wenn es durch Umstellen der Buchstaben eines anderen Wortes gebildet werden kann.

Schreiben Sie eine Funktion isAnagranm(wort1, wort2), die 'True' zurückgibt, wenn wort2 ein Anagramm von wort1 ist, oder sonst 'False'.

Die Länge von Wort1 und Wort2 liegt zwischen 1 und 500

## Beispiel 1

Eingabe

Wort1 = "tap"
Wort2 = "pat"

Erläuterung

Vertausche den ersten und letzten Buchstaben von pat, um tap zu erhalten. Ausgabe

Wahr

## Beispiel 2

Eingabe

Wort1 = "Aal"
Wort2 = "Alle"

Ausgabe

Falsch

Erläuterung

"All" kann nicht zu "Aal" umgeordnet werden, da es keine zwei Buchstaben 'a' enthält.

## Beispiel 3

Eingabe

wort1 = "IAmLordVoldemort"
Wort2 = "TomMarvoloRiddle"

Ausgabe

Wahr

Erläuterung

Da wir nicht zwischen großen und kleinen Buchstaben unterscheiden, kann "TomMarvoloRiddle" zu "IAmLordVoldemort" umgeordnet werden.
