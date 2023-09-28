
// we cannot use non-static variable inside a static method
// only use when we have object refernce i.e.  show2()


class Mobile {
        int price;         // instance variable
        static String brand;  //common variable
    
 
     public void show(){ // instance method -> need object to called method
      
        System.out.println(price + " " + brand);
     }
 
     public static void show1(){
       // System.out.println(price + " " + brand);  // price-> Cannot make a static reference to the non-static field price
          System.out.println("This is static method");
     }

     public static void show2(Mobile obj){
          System.out.println(obj.price + " " + brand);  
          System.out.println("This is static 2 method");
     }
}

public class _02_staticMethod {
    public static void main(String[] args) {
        
      Mobile obj1 = new Mobile();
         Mobile.brand = "OnePluse"; // OR //obj1.brand = "OnePluse";
         obj1.price =   2000;

       Mobile obj2 = new Mobile();
         Mobile.brand = "Apple";    // OR // obj2.brand = "Apple";
         obj2.price =   8000;

          Mobile.brand = "phone"; // it will change brand for both object obj1 & obj2

                obj1.show();
                obj2.show();

         // Mobile.show(); // Cannot make a static reference to the non-static method show() from the type Mobile
            Mobile.show1();

            Mobile.show2(obj1); // passing object so we can use non-static variable inside static method
           


    }    
}

// why main is static
/*
 * if main is not static it means it is non-static so we need to create object of class to called main method
 * as main is starting point of excution if excution is not started how to create object i.e. deadlock
 * 
 * By making main() static, Java ensures that it can be called without the need for object instantiation,
 * making it suitable as the entry point for Java applications.
 */


/*
1)What is use of static keyword in java? (discussed in static variable file)
2)At which place we can use static keyword. 
3)when memory get allocated (discussed in static variable lecture)
4)static variable vs instance variable(discussed in static variable lecture)
5)static block vs non static method (discussed in static block lecture)
6)static method vs non static method (discussed in this lecture)

#1
Use of static keyword
= when we are using static keyword with variable, block, method it become
independent of object. 
e.g class{
    static int a=5;
}
= a is not dependent on object .if we have two object obj1 and obj2 then both object able to access this 
variable.
= when we are using static it become independent to object.

#2
Four place we can use static keyword 
a) before variable declaration e.g class Calc{ static int s; }
b) before a block  class Calc{  static {System.out.println("this is static block);}}
c) during method creation class Calc{public static void add(int num1,int num2){};}
d) with concept of inner class (It is not discussed in this lecture) 
class OuterClass {
  int x = 10;
  static class InnerClass {
    int y = 5;
  }
} 



#3
When memory get allocated
= for that we need to know some term 

a)stack area b)heap area c)class loader system 

Step 1: when you compile the code you get .class file 
Step 2: when you are executing (java MainClass) first class loading to class loader System.
Step 3: During class loading static variable initialize, static block get executed.
Step 4: Since, static variable got memory in heap before object creation. Now we can say that it is independent of object.

#4
Static variable vs instance variable

Class Calc{
    static int stA=100; //independent of object // we can use this by class name as well as object
    int  inB=100;  //dependent of object //we can only use this by object

public static void main(String []args){
Calc obj1=new Calc(); 
Calc obj1=new Calc();
//for static variable
System.out.println(Calc.stA); //use with class name
System.out.println(obj1.stA);  //use by object name

//for instance variable
//System.out.println(Calc.inB); //got an error --Cannot make a static reference to the non-static
System.out.println(obj1.inB); //used by object name reference 

obj1.inB=1000;
obj1.stA=2000;

//static 
System.out.println(obj1.stA);//output: 2000
System.out.println(obj2.stA);//output: 2000 value changed for both obj1 and obj2 


//instance 
System.out.println(obj1.inB); // output: 1000
System.out.println(obj2.inB); // output: 100 no change in obj2
}
}

#5
static block vs non static block
= remember static block executed before the execution of static method 
= non static block executed when you try to create the object and executed before constructor called.

Let's explore static blocks and non-static blocks in Java with an example:


public class BlockExample {
    // Static block
    static {
        System.out.println("Static block is executed");
    }

    // Non-static block (also called an instance initializer)
    {
        System.out.println("Non-static block is executed");
    }

    // Constructor
    public BlockExample() {
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method");
        BlockExample obj1 = new BlockExample();
        BlockExample obj2 = new BlockExample();
    }
}
In this example, we have a class named BlockExample with a static block, a non-static (instance) block, and a constructor.

Here's the order of execution when you run the main() method:

Static Block: The static block is executed before anything else because it's associated with the class itself, not with instances of the class. When you run the program, you'll see "Static block is executed" printed once.

Inside the main() Method: The code inside the main() method is executed next. You'll see "Inside the main method" printed to the console.

Object Creation: When you create an object of the BlockExample class (BlockExample obj1 = new BlockExample();), the following sequence of actions occurs:

Non-static Block: The non-static block is executed before the constructor is called. You'll see "Non-static block is executed" printed each time an object is created.
Constructor: The constructor is called after the non-static block. You'll see "Constructor is called" printed for each object creation.
So, when you run the program, you'll see output like this:

O/P =>
        
        Static block is executed
        Inside the main method
        Non-static block is executed
        Constructor is called
        Non-static block is executed
        Constructor is called

Key takeaways:

Static blocks are executed once when the class is loaded, before any static methods or constructors are called.
Non-static blocks (also known as instance initializers) are executed each time an object of the class is created, before the constructor is called. They are used for common initialization code shared among all constructors of the class.
Understanding the order of execution of static and non-static blocks is important when working with Java classes, especially for tasks like resource allocation, initialization, and configuration.

/***************************************************************************************************//* 
class Calc{
    static{
        System.out.println("Static Block");
        System.out.println("Executed before main");
    }

    {
        //non static block
        System.out.println("Non static block executed before the execution of constructor");
    }

    public static void main(String []args){
        System.out.println("main method");
        Calc c = new Calc(); //non static block executed when we create object 
        // Help h ; -- this will not execute static block of Help class //declaring a reference variable Help h; without creating an instance of the Help class will 
//                                                                        not load the Help class or execute its static block.
        // Help h = new Help(); this will execute static block of Help class
        Help.wish(); //-- this will execute static block of Help class //It's important to note that the static block of the Help class will
//                                                                     only execute when the class is first loaded or when a static member of the Help class is accessed.
//                                                                      In this case, the Help.wish(); method call triggers the execution of the static block of the Help class.

    }
}

class Help{
    static {
        System.out.println("Static block of Help class");
    }
    static void wish(){
        System.out.println("Hello");
    }
}

/*
 PS D:\telusko\january\java-course-telusko\code javac Calc.java
PS D:\telusko\january\java-course-telusko\code java Calc

Static Block
Executed before main
main method
Non static block executed before the execution of constructor
Static block of Help class
Hello
 

#6
Static method vs non static method
= remember we can call static method with object reference or class name  e.g ClassName.staticMethod() or objReference.statiMethod()
= but non static method dependent on object so it can be called only  by object reference. e.g objReference.nonStaticMethod();

Remember one thing:
i)we can use static property, member inside non static block or method without object creation.
ii) But we cannot use non static property or method inside static block or method without object creation.
*/