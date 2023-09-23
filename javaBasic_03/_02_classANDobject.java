package javaBasic_03;

class Calculator
{
	public int add(int n1, int n2)
	{
		//int a;
		//System.out.println("in add");
		//return 0;

		//int r=num1+num2;
		//return r;

		int r=n1+n2;
		return r;
	}
}

public class _02_classANDobject
{
	public static void main(String[] args) 
	{
		int num1=4;
		int num2=5;
		Calculator calc= new Calculator();
		int result=calc.add(4,5);
		//calc.add();
		//int result=calc.add();
		//int result=num1+num2;
		System.out.println(result);
		
	}
}

// Object Oriented programming
// Object - Properties and Beahaviors

//Class



/*
- Class in Java
- Syntax of class in Java
- Creation of objects in Java
- Methods in Java

#1
Whatever we do in Java, we do it in a class.
A class is a user-defined blueprint or prototype from which objects are created.
- In a class, we have methods and variables.
- Class will be created in the same java file.
- We can create any number of classes in a program.
- Class does not occupy memory.
Syntax of a class:-
 class classname
 {
  methods, variables
 }

#2
- Every object has two things: properties and methods.
- When an object of a class is created, the class is said to be instantiated. All the instances share the attributes and the behavior of the class. 
- Action will be done with the help of methods.
- We need to specify the access to methods. We will specify it as public if we want it to be called from anywhere else.
- If we want the method to return any value then we need to specify its return type like int for Integer type values.
- As Java is a statically typed language so you have to specify the return type in it.

Syntax of method:-
= access modifier return type method name()
 public int add()
 {
  statement;
 }

#3
- We need an object to call a method from a different class.
- Creating an object:-
 classname reference variable= new classname();
- reference variable is used to tell that this variable is made to establish a reference between a class.
- new keyword is used to tell that we have to utilise the space for an object.

- We can call a method by using the reference variable of the object. 
- We have to pass the values if we want some operations to be on them.
- We also have to accept values in a method as well if we pass some values. For this, we have to specify parameters in a method based on the type of passed values.
*/