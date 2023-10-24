/*
   THE ALTERNATIVE FOR abstract class WITH all abstract methods
   i.e. no concrete method is inteface
*/
// IMPORTANT => 1.interface is NOT a CLASS
//              2. EVERY method interface IS public abstract
//              3. ALL variables in interface is by default final and static 

/* interface tell us what are the methods we need job of implementing it is os ours */
/*  we create OBJECT of class interface just give us design */
/* we do not able to intiantiate interface we can intiantiate class*/

/*we wre doing implements not extends in implements we only get methods not variables that why they are
 * by default final and static 
 * so we can use it using interface name i.e. static
 * final becuz interface donot have ther own memory in heap i.e. we create object of CLASS not INTERFACE , so how can you have non-final variable
*/

interface A
{
//	public abstract void show();
//	public abstract void config();
	int age=44;            // final and static  i.e. final means intialize and declare on same line
	String area="pune";
	
	void show();
	void config();
}

class B implements A // we have to implement all methods of interface if we not implement them class B BECOMES abstract By default
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
}

public class _33_Interface {
    public static void main(String[] args) {

    	A obj;         //obj is type of A
    //  obj=new A();   //ERROR => Cannot instantiate the type A

    	obj=new B();
    	
    	obj.show();
    	obj.config();
    	
 //   	A.area="Mumbai";  ERROR => The final field A.area cannot be assigned
    	
    	System.out.println(A.area); // static so we can directly use it using interface name without using a object 
        
    }
}


/*
- What is an interface in java?
- Use of interface
- implements keyword in an interface
- Variables in an interface 

#1
Interface:-
In an abstract class, we can have both abstract methods as well as normal or concrete methods.
- If your class has only abstract methods then instead of using class, you can simply use an interface in place of it.
- Interface is not any class.
- Every method in an interface is public and abstract by default.
- Even if you do not use two keywords (public and abstract) with methods then also it will not give an error in an interface. By default, it will consider all methods as public and abstract.
- We cannot instantiate an interface.
- Interface only shows the design and it does not provide any implementation.
- To provide an implementation of methods, you need to create a class and instantiate it also.
e.g,
 interface A
 {
  methods()----
 }

#2
implements keyword:-
To implement an interface, we use the keyword - implements.
- If you use the implements keyword with class, then it is compulsory to give an implementation of all the methods that are defined in an interface.
- If you do not give an implementation of all methods then it will make your class an abstract class by default.
- So, to make a concrete class, you have to give the implementation of all methods present in an interface.
e.g., 
 class B implements A
 {
  methods() {
   statement;
  }
  ------
 }

#3
Variables in an interface:-
- We can call the methods of an interface by creating an object of the class that implements an interface.
- We can also declare variables in an interface.
- All the variables in an interface are final and static by default.
- So, we first have to initialize the variables in an interface.
- As a variable is static in an interface, then you do not need to create an object for it. You can directly call the variable by using the interface name.
e.g., A.area;    (here, area is a variable initialized in an interface)
- As the variable is final, you can not change the value of that variable after initializing it once.

-Interface does not have its own memory in the heap.
 */