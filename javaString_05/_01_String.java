package javaString_05;

public class _01_String {
	public static void main(String[] args) 
	{
		String name=new String();
		System.out.println(name);   // blank space

		System.out.println(name.hashCode());

		System.out.println("hello "+name);

		System.out.println(name.concat("ram"));
//      String name="sita";
		
	}
}
/*
1)What is String?
2)How to create String object?
3)hashcode 
4)Concatenation operator
5)Some method of String class

#1
-- If you want to store character sequence e.g "shiva", "navin", "hyder" in 
such cases we need character array or String (non-primitive data ) .
-- But Using String object it is easy to store sequence of character.

-- String is non primitive data-type and it is also a class. 
String str="shiva";

#2
How to create String object?
-- using new operator String str=new String("shiva");
-- directly assigning String str="shiva"; put sequence of character inside a double quotes.

#3
What is hashcode?
-- hashcode is unique number for each object created in heap.
-- hashcode is used to identify object.

#4
Concatenation operator
--  + operator used to concatenate the String
String firstName="shiva";
String lastName="srivastava";

String fullName=firstName+lastName;

System.out.println(fullName); //shivasrivastava

#5
some method used in String
a) int length() --to find the length of String
b) char charAt(int index) --to find character at particular index

System.out.println(str.charAt(0));
System.out.println(str.length());

Note: In array length is property while in String length() is method.
*/