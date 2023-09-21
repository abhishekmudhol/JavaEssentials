package javaBasic_01;


public class _06_RelationalOperators {

	public static void main(String[] args) {
		int x=6;
		int y=5;
//		boolean result= x<y;
//		boolean result= x>y;
//		boolean result= x>=y;
//		boolean result= x<=y;
//		boolean result= x!=y;
		boolean result= x==y;
		System.out.println(result);
		
		double a=8.8;
		double b=9.8;
//		boolean res = a<=b;		
		boolean res = a>=b;
	
		System.out.println(res);
	}

}
/* 
- Relational Operators in Java
- Types of Relational Operators
- The return type of relational operations

Relational operators are used where we need to compare things. 
- We can use less than, greater than or also compare two values like they are equal or not.
- In Java, equal to (=) is an assignment operator that is used to assign values.
 x=5   ( here, we are assigning the value 5 to the variable x).
- Double equal to (==) is used to compare two values.
- If we have to check the values are not equal, then we use not equal to an operator (!=). 

Relational Operators:-
less than 
greater than 
equal to for comparison 
not equal to 
less than equal to 
greater than equal to 

- Relational operators return a boolean result after the comparison.
- They are mostly used in looping and conditional statements.
*/