package javaBasic_01;


public class _01_variables {

	public static void main(String[] args) {
		System.out.print(3+5); //8
		System.out.print(8+7); //15
		
		//int num1=3;
		//int num2=5;
		//System.out.println(num1+num2);
		
		int num1=3;
		int num2=5;
		int result=num1+num2;
		System.out.println(result);
	}
}

/*
- Working of Java code
- How is data stored in a database?
- What are variables?
- Syntax of variables

#1
-As a Java developer you write a Java code that will be having .java extension and that gets compiled by javac.
- When you compile that code what you get in output is a byte code that has .class file. 
- Whenever you run .class file in the JVM, it means that it's a part of JRE that has JVM as well as libraries and a lot of classes, and JRE is installed on the OS.
- So, you need a hardware or machine having OS and then OS will have JRE and it has JVM. As a developer, one more tool is required known as JDK. 
When you will install the new JDK, you will get updated JRE and JVM with it. 
- We are using JDK version 17 in this course because of its long-term support.
- We develop software to solve real-world problems using the virtual world. 
 e.g., Amazon

#2
- Whenever we build a project or an application what we are doing is we are processing the data. 
- Data may come from the user and then we do processing on it. A database is used to store the data and processing done on it.
- Database is permanent or persistent storage which means data will remain there if the machine gets shut down.

#3 Variables:-
- Variable is used to store the data temporarily while processing.
- Variable is a type of box in which you store data and a type is attached to it such as type can be number, text, image, etc. Thus, a box is known as a variable and a name and value are present with it.
- A variable is a container that holds the value while the Java program is executed.
- Java is a strongly-typed language as it demands the declaration of every variable with a data type.

- Syntax of creating a variable:
 datatype variable name = value;
 int num1= 3;
- Here, (=) is the assignment operator that takes the right-hand side value and assigns it to the left-hand side.

- println is used to go or print on the new line.
- In Java, every statement ends with a semicolon except blocks.
*/