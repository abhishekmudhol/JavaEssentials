package javaBasic_02;

public class _09_forLoop {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			System.out.println("Hi"+i);
		}
		
		
		for(int i=1;i<=7;i++)
		{
			System.out.println("Day"+i);
			for(int j=1;j<=9;j++)
			{
				System.out.println(" "+(j+8)+"-"+(j+9));
			}
		}
		
		
		int i=1;
		for(;i<=5;)
		{
			System.out.println("DAY"+i);
			i++;
		}
	}
}
/*
- Overview of a while loop
- For loop and its point
- Syntax of for loop
- Nested for loops

#1
-In the while loop we have three things: Initialization, Condition, and then increment.
-We do these three things in different lines in a while loop.
-Sometimes we do not know about the ending point, where this loop will get end. As it may end based on some conditions.

#2
- In the finite loop, we know about its starting and ending.
- For loop supports three different statements in one line.
- We can put initialization, condition and increment in one single line in for loop.
- It is mostly used when the number of iterations is fixed.
- Because of the binary format computer starts from 0.
- So, in general, we start from 0 and end at count-1 ie., one less than the total number of iterations.
- Loops are very useful when we have to print some pattern or want to print things repeatedly.

#3
Syntax of For Loop:-
 for(initiation; condition; incrementation or decrementation)
 {
  statements;
 }

* init - The init expression is used for initializing a variable, and it is executed only once.
* condition - It executes the condition statement for every iteration. If it evaluates the condition to be true, it executes the body of the loop. The loop will continue to run until the condition becomes false.
* incr/ decr - It is the increment or decrement statement applied to the variable to update the initial expression.

- First initiation and condition statement execute and then execution of statements takes place and then increment takes place at last.
- We can also skip any of the three parts as per the need.

#4
Nested For loops:-
- We can also use nested for loops as same as while loop. Nested loops mean loop inside a loop.
- Whenever the outer loop meets the condition, the inner loop is executed completely.
*/