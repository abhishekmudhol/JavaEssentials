// class - class -> extends
// class - interface -> implements
// interface - interface -> extends


//- We can have a class implementing multiple interfaces


interface A
{
//	public abstract void show();
//	public abstract void config();
	int age=44;            // final and static 
	String area="pune";
	
	void show();
	void config();
}

interface X
{
	void run();
}


interface Y extends X    // Inheritance is valid here
{
	
}

class B implements A,Y     //class implementing multiple interfaces
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
	public void run()
	{
		System.out.println("running...");
	}
}

public class _34_InterfaceMore {
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config();
   //   obj.run();    //  method run() is undefined for the type A
   //                      A don't have idea ehat is run() need referance of interface X to call run()  

    	X obj1=new B();
    	obj1.run();
    //	obj1.show();    // method show() is undefined for the type X
    //	obj1.config();  // method config() is undefined for the type X


 //   	A.area="Mumbai";
    	
    	System.out.println(A.area);
        
    }
}


/*
- Implementation of multiple interfaces
- Inheritance in between interfaces
- Method calling of an interface

#1
- We can have a class implementing multiple interfaces


class B implemets A,X
{
}


(here, A and X are two different interfaces)
- Implementation of all the methods that are present in those interfaces should be given in a class.
- Inheritance is also valid in between interfaces.
- Inheritance can be achieved in between interfaces by using the extend keyword.
- Whenever you create a reference of an interface and create an object of a class, then you can only call those methods by that reference that are present in that interface of which the refernce is created.
- Methods of another interface can be called by using another reference variable for that interface with the object of a class.

#2
*
class - class - extends
class - interface - implements
interface - interface - extends 
*/