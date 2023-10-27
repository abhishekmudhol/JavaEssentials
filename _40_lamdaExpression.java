//lambda expression is ONLY WORKS WITH A functional interface.


// save one .class file from creating for anonymous inner classes 
//i.e. lamdaExpression$1.class but lamdaExpression.class is heaviour 
//now due to lamda expression  
// of course there is  anonymous classes behind the sences 

@FunctionalInterface
interface A
{
//	void show();
	void show(int i);
//	void show(int i,int j);
	

}


public class _40_lamdaExpression {
    public static void main(String[] args) {
    	
   	// A obj=() -> System.out.println("in Show"); // syntatical sugar
   	// obj.show();
    	
   	A obj1=new A()
   	{
   		public void show(int i)
   		{
   			System.out.println("in show"+i);
   		}
   	};
   	obj1.show(5);
    	
   	// A obj=(int i) ->System.out.println("in show "+i);
   	// obj.show(5);
    	
   	// A obj=(int i,int j) ->System.out.println("in show "+i);
   	// obj.show(5,8);
    	
    	A obj = i -> System.out.println("in show "+i);  // HERE 'i' NOT 'int i' becuz we mentioned it while writing in interface A
    	obj.show(8);
    }
}

/*
#1 what is lambda expression in java?
-- In Java, a lambda expression is a concise way to implement a functional interface. 
   A functional interface is an interface that has only one abstract method, and it can be implemented using a lambda expression.
-- In the previous lecture we see that we are making a class or inner class to implement the functional interface 
   but using lambda expression we do not need of new class and inner class to implement.

#2 Properties of the lambda expression
Concise syntax: Lambda expressions provide a concise and expressive syntax for defining functional interfaces. 
They allow you to define the behaviour of a functional interface in a single line of code.

Functional programming: Lambda expressions are a key component of functional programming in Java. 
They allow you to write code that is more declarative and expressive, and less verbose than traditional imperative code.

No need for anonymous inner classes: Lambda expressions provide an alternative to anonymous inner classes, which are often 
used to implement functional interfaces in Java. Lambda expressions are more concise and easier to read than anonymous inner classes.

#3 example:

class Main{
    public static void  main(String []args){
A obj = new B();
obj.show();

//another way to implement functional interface
A obj1 = new A(){
    @Override
    public void show(){
        System.out.println("Hello");
    }
};
obj1.show();

//now we can use a lambda expression to implement the functional interface
//you can remove new A() and public void show() and replace it with () -grater then System.out.println("Hello"); 
//if you have single statements you need not mention curly braces and return keyword

A obj2 = () - grater then System.out.println("Hello");
obj2.show();

//here you can use lambda expression to implement interface C
C obj3= i-grater then System.out.println(i);
obj3.show(5);
 
}
}
//one way to implement functional interface
class B implements A{
    @Override
    public void show(){
        System.out.println("Hello");
    }
}

//specify it is functional interface
@FunctionalInterface //we use this annotation to specify it is functional interface
interface A{
    void show();
    //void run(); //this will give error as it is not functional interface
} 

interface C{
  public void show(int i);
}
*/