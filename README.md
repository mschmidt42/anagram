# Anagram

Given two words consisting of english letters (uppercase and lowercase) determine whether they are anagrams. In this task assume that small and big letters are indistinguishable. A word is an anagram if it can be formed by rearranging the letters of another word.

Please write a function anagrams(word1, word2) that returns True if word2 is an anagram of word1, or False otherwise.

Length of word1 and word2 is between 111 and 50,000.

## Example 1

Input

```
word1 = "tap"
word2 = "pat"
```

Explanation

Swap first and last letter of pat to get tap.
Output

True

## Example 2

Input

```
word1 = "Aal"
word2 = "All"
```
Output

False

Explanation

"All" can't be rearranged to form "Aal", since it doesn't have two letters 'a'.

## Example 3

Input

```
word1 = "IAmLordVoldemort"
word2 = "TomMarvoloRiddle"
```

Output

True

Explanation

Since we don't distinguish big and small letters "TomMarvoloRiddle" can be rearranged to form "IAmLordVoldemort".
