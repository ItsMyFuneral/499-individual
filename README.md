# 499-individual

## How to simulate a single number:

1. Run the program.
2. Input `a` in response to the question.
3. Input the desired number.
4. The program will output the Collatz sequence for the number simulated, and the length of the sequence.

Example output:

```
Welcome to the Collatz Conjecture simulator!
Would you like to simulate a single number, or find the longest number up to a particular number?
Type 'a' to simulate one number, or 'b' to find the longest.
a
Input a positive integer. (1 or greater)
11
11 - 34 - 17 - 52 - 26 - 13 - 40 - 20 - 10 - 5 - 16 - 8 - 4 - 2 - 1
Finished in 14 steps.
```

## How to find the longest chain up to a given number:

1. Run the program.
2. Input `b` in response to the question.
3. Input the desired upper bound.
4. The program will output the number within the upper bound with the longest Collatz sequence, and the length of the sequence.

Example output:

```
Welcome to the Collatz Conjecture simulator!
Would you like to simulate a single number, or find the longest number up to a particular number?
Type 'a' to simulate one number, or 'b' to find the longest.
b
Input a positive integer. (1 or greater)
123
The number less than 123 with the longest series is 97, with length 118.
```
