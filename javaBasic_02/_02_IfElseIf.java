package javaBasic_02;

public class _02_IfElseIf {

	public static void main(String[] args) {
//		int x=8;
//		int y=7;
//		int z=8;
//		
//		if(x>y && x>z)  //false
//		{
//			System.out.println(x);
//		}
//		else
//			System.out.println(y);
		
//		int x=8;
//		int y=7;
//		int z=9;
//		if(x>y && x>z)         //false
//			System.out.println(x);
//		else if(y>x && y>z)
//			System.out.println(y);
//		else
//			System.out.println(z);
		
		
		int x=8;
		int y=7;
		int z=9;
		if(x>y && x>z)         //false
			System.out.println(x);
		else if(y>z)
			System.out.println(y);
		else
			System.out.println(z);

		
	}

}
/*
1) what is if-else-if ladder?
2) syntax of if-else-if ladder
3) example of if-else-if 

#1
-- if-else-if ladder is a series of if, else if or else statements that are executed based on the boolean condition.
-- if else if ladder is used to test multiple conditions

#2
syntax of if-else-if ladder

if(condition1)
{
    //block of code  
}
else if(condition2){
    //block of code
}
else if(condition3)
{
    //block of code
}
else{
    //block of code
}

Note: only one block is executed from all. If all condition is false then else part executed

#3
-- check greatest number from three number.
      int x=8;
      int y=7;
      int z=6; 
        if(x y && x z)
        System.out.println("x is greater");
        else if(y z) 
        System.out.println("y is greater");
        else
        System.out.println("z is greater");  
*/