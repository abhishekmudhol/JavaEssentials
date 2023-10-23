


abstract class A    // abstract class
{
     public abstract void show();
     public abstract void config();  
}

// what if we want to change behaviour of show()
// we can create class B extends A and implement show()
// becuz class A is abstract 
// We can avoid the creating class implement method which we will use only ONES we can use Anonymous Inner Class

public class _31_AbstractAnonymousInnerClass 
{
    public static void main(String[] args) 
    {
         A obj1 = new A() //IMPORANT => here we creating OBJECT of Anonymous Inner Class NOT class A which is abstract  
            {             // It Is Anonymous Inner Class 
               public void show()
                   {
                       System.out.println("new show()");
                   }

            
                public void config() 
                    {
                      System.out.println("new config()");
                    } 
            };     

         obj1.show(); 
         obj1.config();
    }
}

/*
- Abstract and anonymous inner class
- Use of anonymous class with an abstract class
- Example of abstract and anonymous inner class.

#1
When you want to use an interface and an abstract class only once, then you can simply use an anonymous innner class in place of that.
- You can also provide the implementation for multiple methods in an anonymous inner class.
- Anonymous inner class can implement only one interface at s time.
- Anonymous inner class can either extend a class or implement an interface at a time.
- We can create object for abstract class by providing the implementation of an abstract method in an anonymous inner class.
e.g.,
abstract class A
{
 public abstract void show();
}

In main methid:
A obj=new A()
{
 public void shoe()
 {
  statement;
 }
};
 */