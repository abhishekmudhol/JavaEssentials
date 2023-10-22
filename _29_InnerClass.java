// IF one class IS TOTALLY DEPENDENT ON other class
// then we use inner class
// A$B.class => means B class belongs to A class 
class Outer 
{

    int age;

    public void show()
    {
        System.out.println("show()");
    }

    class Inner
    {
        public void config()
        {
            System.out.println("config()");
        }
    }
}

public class _29_InnerClass
{
    public static void main(String[] args) 
    {
        Outer obj1 = new Outer();
            obj1.show();
           // obj1.config(); // ERROR => The method config() is undefined for the type Outer
          
        // Outer.Inner obj2 ;                   // NO PROBLEM IN declaring the VARIABLE
        //Outer.Inner obj2 = new Outer.Inner(); // ERROR => No enclosing instance of type Outer is accessible.
                                                  /*        Must qualify the allocation with an enclosing instance of
                                                            type Outer (e.g. x.new A() where x is an instance of Outer).*/


 /* if we want to create object of inner class we need to specify where in belogs to i.e. Outer.Inner means Inner belogs to Outer and OBJECT of outer class to create an object of the inner class i.e. obj1.new Inner();*/  

            Outer.Inner obj2 =  obj1.new Inner(); // to create an object of the inner class, You need to create an object of the outer class. becuz it is non-static
                
                      obj2.config();
    }
}




/*
- What is an inner class in Java?
- Static inner classes in Java
- Advantages Of inner class

#1
Inner Class:-

- We can also create a class inside another class.


class A
{ 
  class B
  {
  }
}


- You can call the method of class B by using the dot operator in between both classes A and B.
 A.B obj= new B();
-  A dollar sign will be introduced in a class name that has an inner class indicating two different classes.
 A$B. class
- You also need to create an object of the outer class, to call the methods of an inner class.

#2
Static Inner Class:-
- An inner class can also be declared as static.
- When an inner class is declared as static, then you do not need to create an object for it.
- But an outer class can not be made static.

#3
Advantage of inner class:-
- Nested classes represent a particular type of relationship that is it can access all the members of the outer class, including private.
- Nested classes make the code more readable and maintainable.
- It makes the code more optimize.
 */