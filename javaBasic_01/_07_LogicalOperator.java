package javaBasic_01;

public class _07_LogicalOperator {

	public static void main(String[] args) {
		int x=7;
		int y=5;
		int a=5;
		int b=9;
		
//		boolean result= x>y && a<b ;
//		boolean result= x>y || a<b ;
//		boolean result= x>y && a>b ;
//		boolean result= x>y || a>b ;
//		boolean result= x<y && a<b ;
//		boolean result= x<y || a<b ;
//		boolean result= x<y || a<b || a>1 ;
		
//		System.out.println(result);
		
		boolean result= a>b ;
		System.out.println(!result);
		
	}

}


/*
- What are relational operators?
- AND operator
- OR operator
- NOT operator

If we need to combine the result of two or more relational operators, then we use logical operators.
- We use logical operator in between two or more results of relational operators.
- AND operator (&&), OR operator (||) and Not operator (!) are logical operators.

1) In case of AND Operator:
- If both are true - true
- If one is true and other is false - false
- If one is false and other is true - false
- If both are false - false
 * If first condition is false then it will not check for the another one and it will increase the execution time.
Thus, because of its less time it is known as short- circuit.

2) In case of OR Operator:
- If both are true - true
- If one is true and other is false - true
- If one is false and other is true - true
- If both are false - false
 * If first condition is true then it will not check for the another one and it will increase the execution time.
Thus, because of its less time it is known as short- circuit.

3) In case of Not Operator:
- It is basically used to reverse the things.
It means if result is false, it will do true.
If the result is true, it will do false.
* Not operator just do the opposite.

- We can use as much logical operators as we want in between the relational operations.


 & vs && 

&& -> save time (short circuit)

The & operator evaluates both operands, regardless of their value. 
It then performs a bitwise AND operation on the operands and returns the result. 
The && operator, on the other hand, evaluates its operands only if necessary. 
If the first operand is false , it returns false without evaluating the second operand.

*/