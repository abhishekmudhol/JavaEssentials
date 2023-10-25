/*
 * below basically status is CLASS and Running, Failed, Pending, Success are OBJECTS of status
 */


enum Status{
	Running, Failed, Pending, Success; // this are named constant instead of using int ,String we can use constant instead
}

public class _35_Enums {
    public static void main(String[] args) {

    	int i=5;
    	Status s1= Status.Running;
	   	Status s2= Status.Failed;
//  	Status s3= Status.NoIdea; // ERROR => NoIdea cannot be resolved or is not a field
	   	Status s4= Status.Success;
		Status s5= Status.Pending;
    	
     	System.out.println(s1);  //o/p => Running

    	System.out.println(s1.ordinal()); //o/p => 0 //DIFFERNT CONSTANT HAVE DIFFRENT numbers IN JAVA IT STARTS WITH 0
    	System.out.println(s2.ordinal()); //o/p => 1
		System.out.println(s4.ordinal()); //o/p => 3
		System.out.println(s5.ordinal()); //o/p => 2

        System.out.println(s1.getClass().getSuperclass()); // class java.lang.Enum i.e  Enum class

    	Status[] ss = Status.values(); // status is class so it has inbuild methods like values()
    	System.out.println(ss);
    	
    	for(Status st:ss)
    	{
    		System.out.println(st);
    		System.out.println(st+" : "+st.ordinal());
    	}
    	
    	
        
    }
}

/* OUTPUT =>

     Running
     Running : 0
     Failed
     Failed : 1
     Pending
     Pending : 2
     Success
     Success : 3
*/

/*
- Enumeration in Java
- What is an enum in Java?
- How to use an enum in Java?
- Methods used with enum

#1
Enum is a short term used for Enumeration.
Enumerations serve the purpose of representing a group of named constants in a programming language.

#2
-Java Enums can be thought of as classes that have a fixed set of constants 
- Enum is named constants that we create for specific constants or error codes.
- Enum is created in place of an object for constants.
- Enum is pre-defined that contains all name constants.
- Enums are used to create our data type like classes.
- In enum, instead of returning a string format or a specific object, we can simply return a status or a value present inside an enum.

e.g.,  enum Status{
   Running, Failed, Pending, Success;
  }

- enum is also treated as a class in Java. Objects can also be created for enum like:
 Status s= Status.Running;
- Every enum constant represents an object of type enum.
- enum type can be passed as an argument to switch statement

#3
- In enum, all the name constants are defined by using numbers.
- ordinal() method is used to get the index of the name constant present in the enum.
- values() method is used to get all the statuses or name constants of enums.
 Status [][] s= Status.values();
*values() method will give an array. 
*/