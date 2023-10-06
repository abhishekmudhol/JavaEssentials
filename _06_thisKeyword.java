// this -> this keyword represent current object in java ,
        // current object means the object which calling the method here i.e. h

class Human
{

   private int age ;
   private String name ;


public int getAge() {
    return age;
}
public void setAge(int age /* , Human obj*/) {
     //age = age; here we need to diffrentiate between instance variable and local variable
                  // IMPORETAT -> in case of confusion prefernce is allways given to local variable
    //  Human objHere = obj;
    //    objHere.age = age;

        this.age = age;
}


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
    
   
}

public class _06_thisKeyword 
{
   public static void main(String[] args)
   {
      Human h = new Human();
      //System.out.println(h); //Human@28a418fc

     // h.setAge(22 , h); // HERE WE USING OBJECT 2 TIMES FOR CALLING METHOD AND PASSING AS A ARGUMENT
                            //so, java say that don't do that by default I wil give a object i.e. h 

     h.setAge(22 );


      int AGE_NEW = h.getAge();
      System.out.println(AGE_NEW);
   }    
}

/*
- Instance variable and Local variable
- Can we declare two or more variables with the same name?
- This keyword and its uses in Java

#1
Instance variable:- These variables are declared within a class but outside a method.
- These variables are created when we create an object and are destroyed when the object is destroyed.

Local variable:- These variables are declared within a method but do not get any default value.Attempting to use a local variable without initializing it will result in a compilation error
- They are created when we enter a method or constructor and get destroyed when the call returns from the method.

#2
In Java, it is not allowed to declare two or more variables having the same name inside a scope either in class scope or method scope.
- The preference is always given to the local variable.
- Creating an object is not a good idea to solve the issue of conflicting names of instance and local variables.
- We can differentiate between local and instance variables by passing an object itself.
- Instead of writing and passing an object, we can simply use this keyword.

#3
This keyword:-
This keyword represents the current object.
- Current object is an object which is calling the method.
- This keyword is used to invoke the current class constructor.
- Using the 'this' keyword, we can return the current class instance.
-  This keyword can be used as an argument in the constructor call.
*/

/*public class MyClass {
    private int value;

    // Constructor with no parameters
    public MyClass() {
        this(0); // Call the parameterized constructor with a default value of 0
    }

    // Parameterized constructor
    public MyClass(int value) {
        this.value = value;
    }
}
In this updated code, the no-argument constructor calls the parameterized constructor using this(0);. 
This means that when you create an instance of MyClass using the no-argument constructor, it, in turn, 
calls the parameterized constructor with a default value of 0. This allows you to reuse the initialization
code from the parameterized constructor within the no-argument constructor.

/***************************************************************************************************************//* 
 some common uses of the this keyword in Java:

This keyword is used to invoke the current class constructor: Yes, you can use this to invoke another constructor within the same class. This is known as constructor chaining. By doing so, you can reuse initialization code from one constructor in another, allowing for multiple constructors with different parameter sets.

java
Copy code
public class MyClass {
    private int value;

    public MyClass() {
        this(0); // Calls the parameterized constructor with a default value
    }

    public MyClass(int value) {
        this.value = value;
    }
}
Using the 'this' keyword, we can return the current class instance: Yes, you can use this within a method to return the current instance of the class. This is commonly used for method chaining, where multiple methods of the same object can be called sequentially, making code more concise and readable.

java
Copy code
public class MyObject {
    public MyObject doSomething() {
        // ... some logic ...
        return this; // Return the current object
    }

    public MyObject doSomethingElse() {
        // ... some other logic ...
        return this; // Return the current object
    }
}
This keyword can be used as an argument in the constructor call: Yes, you can pass the current object (this) as an argument to a constructor. This is useful when you want to provide the state of the current object to another object being created or when you want to perform some action on the current object before creating a new one based on it.

java
Copy code
public class MyClass {
    private int value;

    public void process(MyClass other) {
        // Use 'this' and 'other' objects as needed
    }

    public MyClass clone() {
        return new MyClass(this); // Create a new object based on the current one
    }
}
These are important and practical uses of the this keyword in Java, helping clarify the context and facilitate various programming tasks within a class.
*/