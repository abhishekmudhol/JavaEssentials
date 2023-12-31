package javaBasic_02;

public class _08_doWhileLoop {

	public static void main(String[] args) {
		int i=1;
		do
		{
			System.out.println("Hi"+i);
			i++;
		}
		while(i<=4);
	}
}

/*
- Do-while loop
- Syntax of do-while loop
- Important points related to do-while loop

Do- While Loop:-
When you have to execute the block at least once even if the condition is false, then in such cases we use do- while loop.
- Do- while is almost similar to while loop except thst the condition is checked after evaluation after body of the loop.
- Do-while runs at least once and at most as many times the test condition evaluates to true.
- Consition is cjeckd at the end of the execution of the body in this loop.
- It is also known as exit- controlled loop.
- It is the only loop that has a semicolon(;).

Syntax of do-while loop:-
 do
 {
  statement;
 }while(condition);
*/