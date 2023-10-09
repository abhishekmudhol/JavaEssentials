
/*  
  anonymous object CANNOT be used more than once 
  i.e. 
         new A().show(); 
         new A().show(); // HERE CREATS NEW ONJECT NOT USING PREVIOUS ONE    
         
         every time we say // new A(); // IT CREATES NEW OBJECT
*/
class A 
{


    public void show()
    {
        System.out.println("show method in class A");
    }

    public A()
    {
        System.out.println("constructor A");
    }


} 

public class _11_anonymousObject {
    public static void main(String[] args) {
        
    //A obj =new A();// A obj   => it is refernce creation
                     // new A() => creating object i.e. object creation
         
    //new A() ;  // anonymous object becuz don't have name i.e. there is NO refence in stack memory

    //A obj =new A(); //it is called referenced object becuz there is a refence in stack memory

        new A().show();     // constructor A
                             //show method in class A
        new A().show();      //constructor A
                             //show method in class A
    }
}

/*
- Object creation in Java
- Anonymous objects in Java
- Difference between Simple objects and Anonymous objects


#1
In JVM, we have both stack memory and heap memory.
- Object is created in the heap memory that contains  variable and methods, it also have some address.
- A obj=new A();
  obj.show();
here, A is the classname.
         obj refers to the address say 101
    show() is a method that is called using reference variable obj.
- Every time you call an object, it will call the constructor as well.
- Object creation can be done in two ways:
 1. Declare an object  - creating a reference
 2. Creating an object  - and assigning the value to it
e,g.,  A obj;
  obj=new A();
 *new A() shows that you are creating an object.
- Reference of an object is created in the stack.


#2
Anonymous Objects:- 
Anonymous objects are simply created by using the new keyword.
- It does not have any reference for an anonymous object.
e.g., new A();
- A method can directly be called using this object.
  new A().show();
- We can't use the same anonymous object again. It will be use only for one time.
*/