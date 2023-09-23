package javaBasic_02;


public class _03_TernaryOperator {

	public static void main(String[] args) {
//		int n=4;
//		int result=0;
//		if(n%2==0)
//			result=10;
//		
//		else
//			result =20;
//		System.out.println(result);
		
		int n=5;
		int result=0;
		result = n%2==0 ? 10 : 20;
		System.out.println(result);
	}

}
/*
1)What is ternary operator?
2)Why do we need ternary operator?
3)Syntax of ternary operator 
4)example of ternary operator

#1
-- ternary operator is shorthand of if-else statement.

#2
 why we need ternary operator?
  a) to reduce the code
  b) to make the code more readable
  c) to make the code more compact

#3
Syntax:
variable = (condition)?value1 if condition is true :value2 if condition is false
boolean result  =(5 less then 6)? true :false; //result false

#4
example:
in if-else we can check a given number is even or odd now we code this problem by 
ternary operator.

int num=13;
String str=(num%2==0)?"Even":"Odd";
System.out.println(str); //output: Odd
 */