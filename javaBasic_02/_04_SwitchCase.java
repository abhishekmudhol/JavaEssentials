package javaBasic_02;


public class _04_SwitchCase {

	public static void main(String[] args) {
//		int n=1;
//		if(n==1)
//			System.out.println("Monday");
//		else if(n==2)
//			System.out.println("Tuesday");
//		else if(n==3)
//		System.out.println("Wednesday");
//		else if(n==4)
//		System.out.println("Thursday");
//		else if(n==5)
//		System.out.println("Friday");
//		else if(n==6)
//		System.out.println("Saturday");
//		else
//		System.out.println("Sunday");
		
		int n=8;
		switch(n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
		System.out.println("Wednesday");
			break;
		case 4:
		System.out.println("Thursday");
			break;
		case 5:
		System.out.println("Friday");
			break;
		case 6:
		System.out.println("Saturday");
			break;
		case 7:
		System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter a valid number");			
		}
		
	}
}


/*
1) What is switch statement?
2) why we need switch statement?
3) What datatype can we use in switch?
4) Syntax of switch and example
5) Need of break 
6) Need of default 

#1
-- switch statement is a multiway branch statement that allows a variable to be tested for equality against a list of values
each value is called a case, and the variable being switched on is checked for each switch case.

#2
if we have multiple test cases and we want to test for a particular value then we can use switch statement. 
At the place switch we can also use if-else-if ladder.

e.g
suppose user enter a your date of birth and we want to check from multiple year then
in this case we can use switch case.

#3
what dataType we can use in switch statement?
-- the switch statement can have a number of possible execution paths. A switch works with the 
byte, short, char, and int primitive data types. It also works with enumerated types (discussed in Enum Types), 
the String class, and a few special classes that wrap certain primitive types: Character, Byte, Short, and Integer.

#4
Syntax of Switch and example:
switch(variable){
    case x1:
    //code
    break;

    case x2:
    //code
    break;

    default:
    //code
}

example:
int x=9;
switch(x){
case 8:
  System.out.println("8");
  break;
case 7:
  System.out.println("7");
  break;
default:
  System.out.println("No match found");
 }

#5
Need of break 
--  The break statements are necessary because without them, statements
in switch blocks fall through: All statements after the matching case label
are executed in sequence, regardless of the expression of subsequent case labels,
until a break statement is encountered. The program  shows
statements in a switch block that fall through.

int x=5;
switch(x){
    case 5:
    System.out.println("five");
    case 4:
    System.out.println("six);
    default:
    System.out.println("default");
}

output:
five
six
default

Since, we are not using break after matching the case 5
it execute all remaining statements without check.

#6
Need of default:
 The default section handles all values that are not explicitly handled by one of the case sections.

 example:
int y=9;
switch(y){
    case 8:
        System.out.println("8");
        break;
    case 7:
        System.out.println("7");
        break;
    }
In this case you don’t get any result because no case is match and 
since no default case is available so, nothing we get.
*/