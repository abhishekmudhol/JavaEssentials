package javaBasic_02;

public class _01_IfElse {

	public static void main(String[] args) {
//		int x=8;
//		System.out.println("Hello");
//		System.out.println("Bye");
		
//		int x=18;
//		if(x>10) {
//			System.out.println("Hello");
//		}
		
//		if(true) {
//			System.out.println("Hello");
//		}
		
//		int x=28;
//		if(x>10 && x<=20) {       //11-20
//			System.out.println("Hello");
//		}
//		System.out.println("Bye");
		
//		int x=28;
//		if(x>10 && x<=20) {       //11-20
//			System.out.println("Hello");
//		}
//		else
//		System.out.println("Bye");
		
		int x=8;
		int y=7;
		if(x>y) {
			System.out.println(x);
			System.out.println("Thankyou");
		}
		else
			System.out.println(y);		
	}

}

/*
1)What is conditional statements?
2)types of conditional statements 
  a) if-else
  b) switch (next lecture)
  c) ternary operator (next lecture)
  d) nested if-else (next lecture)
  e) if-else-if ladder (next lecture)

3)syntax of if-else 
4)example on if-else condition

#1
-- conditional statement is a statement that can be true or false.
-- suppose if ask student is pass. (answer yes or no)
-- this type of statement of statement is conditional statement.

#2
In this part we are only discussing about if-else and 
in next lecture we are discussing if-else-if ladder, ternary operator and switch statement.

#3
syntax of if-else

-- condition is either true or false after evaluation 
-- remember like c and c++, we cannot use number directly as condition of if-else
- if(5) -- not allowed in java 
-- you get Type mismatch: cannot convert from int to boolean
if(condition) 
{
    //code 
    //either this part execute 
}

else
{
    //code
    //or this part execute
}

#4
example:
if want to check a given number is even or odd then;
int num=13;
if(num%2==0)
System.out.println("Even"); //here we not use  braces for single statement {}

else
System.out.println("Odd");  // here we not use braces {}

Note: for single statement braces is not required  but for multiple statement it is required.

*/