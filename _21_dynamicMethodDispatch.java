/*
 Note: during compile time we donot which show() method is called from which class.
    -- we can know during run time which show method is called this is known as run time polymorphism.
    -- all this concept is class dynamic method dispatch
 */


class A
{
  public void show()
  {
      System.out.println("in show A");
  }
}
class B extends A
{
   public void show()
   {
       System.out.println("in show B");
   }
}

class C extends A
{
   public void show()
   {
       System.out.println("in show C");
   }
}

public class _21_dynamicMethodDispatch
{
    public static void main(String []args)
    {
        A obj =new A();  
        obj.show();  //Output: in show A

        // assiging new object to old variable
        // in below line type of reference is still A but the object is of B

        obj =new B(); //reference is A (we can use reference of parents) and create object of B  and assign to parents reference variable.
        obj.show();  //Output: in show B

        obj =new C();  //reference is A (we can use reference of parents) and create object of C and assign to parents reference variable.
        obj.show();  //Output: in show C

 //     EXAMPLE OF computer AND laptop
    }
}
/*
 * In above example same object obj is behaving diffrently with diffrent object 
 * 
 * here we are not sure about a which class's method obj.show(); called which is decide at runtime 
 *  
 * it all depends on what type of object you have irrespective ot type of reference or variable i.e. A , B or C
 * 
 * this all is dynamic method  which is run-time polymorphism
 * 
 * IT IS ONLY POSSIBLE WHEN WE HAVE inheritance
 */

/*
-- in this lecture we are further talking about run time polymorphism
-- suppose we have some class A , B and C
-- class B and C extends A 
-- in All three class we have show() method 
-- main() method of Demo we create object of A, B and C but we create only reference of A which can hold
object of A, B and C .
class A{
public void show(){
    Systeem.out.println("in show A");
}
}
class B extends A{
public void show(){
    Systeem.out.println("in show B");
}
}

class C extends A{
public void show(){
    Systeem.out.println("in show C");
}
}

public class Demo{
    public static void main(String []args){
        A obj =new A();  
        obj.show();  //Output: in show A

        obj =new B(); //reference is A (we can use reference of parents) and create object of B  and assign to parents reference variable.
        obj.show();  //Output: in show B

        obj =new B();  //reference is A (we can use reference of parents) and create object of C and assign to parents reference variable.
        obj.show();  //Output: in show C

 
    }
}

Note: during compile time we donot which show() method is called from which class.
    -- we can know during run time which show method is called this is known as run time polymorphism.
    -- all this concept is class dynamic method dispatch
*/ 