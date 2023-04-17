# Small-Programs


### Ceasar Cipher
In cryptography, the Caesar cipher is one of the simplest and most widely known encryption techniques. To learn more about it check - [Caesar cipher](https://en.wikipedia.org/wiki/Caesar_cipher). My version of the Caesar cipher takes as an input the word you want to encrypt and a number by which, we will move the letters. If the new position points to a number bigger than the alphabet size, the counter starts from the begging.

Example 1:
- Input: abcd
- Number: 3
- Output: defg
- Explanation: The first letter "a" is at position 1. When we sum 1 + 3 = 4, the 4th letter in the english alphabet is "d". The same applies to "b" -> 2 + 3 = 5 -> "e"; "c" -> 3 + 3 = 6 -> "f"; "d" -> 4 + 3 = 7 -> "g"

Example 2:
- Input: zzzywx
- Number: 4
- Output: dddcab
- Explanation: The letter "z" is the last letter in the english alphabet on position - 26. Since 26 is the last available position we start from the beginning. In the case of "z" -> 0 + 4 = 4 -> "d". The next letter "y" is the 25th in the alphabet, so we start counting from 25 but we reach the end again(26), so we continue from the beginning. In this case 25 + 4 = 29 -> we are 3 steps out of 26, so we start from 0 and count 3 steps. The 3th letter in the english alphabet is "c". The same applies for "w" and "x".

You can check my version of Caesar cipher [here](https://github.com/DenisBuserski/Small-Programs/blob/main/programs/CaesarCipher.java).

##


### Print number from 1 to 100
How to print the numbers from 1 to 100 without using any numbers. You can check my siple solution [here](https://github.com/DenisBuserski/Small-Programs/blob/main/programs/Print-numbers-from-1-to-100.txt)

##


### Print number of pairs of parentheses
Simple solution on how to print all posible combinations of opened and closed brackets. The program takes as an input the number of opened and closed brackets and prints all combinations.

Example:
- Input: 3
- Output:

  ((()))
  
  ()()()
  
  ()(())
  
  (())()
  
  (()())


To check my solution click [here](https://github.com/DenisBuserski/Small-Programs/blob/main/programs/Print-number-of-pairs-of-parentheses.txt).

##


### Change value of 2 integers

##




