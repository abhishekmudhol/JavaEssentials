


class A 
{
     public void show()
    {
        System.out.println("A show()");
    }
}

// what if we want to change behaviour of show()
// we can create class B extends A and override showa()
// but it create .class file for class B also and we want to use show() ONLY ONCE but with change behaviour
// We can avoid the overriding and do not need to create a new class for this particular task.

public class _30_AnonymousInnerClass 
{
    public static void main(String[] args) 
    {
         A obj1 = new A()   //It is Anonymous Inner Class
         {
            public void show()
                {
                    System.out.println("new show()");
                } 
         };     // semicolan

         obj1.show(); // new show() => it will calling show() new implemention in Anonymous Inner Class
    }
}


/*
- What is the meaning of Anonymous?
- Anonymous inner class in Java
- Syntax of an anonymous inner class
- Important points related to anonymous class

#1
- Anonymous means something that does not have a name.
- In overriding, to provide a new implementation of a method, we need to create a new class and extend it with the parent class. After extending the class, we override the method.
- We can avoid the overriding and do not need to create a new class for this particular task.
- We can use the inner class concept to give a new implementation of a method.

#2
- We can create a new anonymous inner class after creating an object of a class that contains the method.
- We do not need to use a class keyword with an anonymous inner class.
- It just starts with braces and contains the method and its new implementation.
- Anonymous inner class starts just the creation of an object and ends with the semicolon of that object.

e.g., A obj=new A()
             {
              public void show()
              {
               new statement;
              }
             };

#3
- Anonymous class used in the interface, functional interface, lambda expressions.
- Anonymous inner class can implement only one interface at s time.
- It can either extend a class or implement an interface at a time.
- We do not write a constructor for an anonymous inner class because it does not have any class name.
- An anonymous class has access to the members of its enclosing class.

 */