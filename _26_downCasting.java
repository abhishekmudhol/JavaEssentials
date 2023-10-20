


class A 
{
   public void showA()
   {
    System.out.println("show method of A");
   }
}

class B extends A
{
    public void showB()
   {
    System.out.println("show method of B");
   }
}

public class _26_downCasting
{
     public static void main(String[] args) 
     {

/***********************UPCASTING**************************/
        
        A obj1 =  new B();  // parent reference and chid object  // (A) IT HAPPENS implicitly behind the sences
        obj1.showA();      

     
/**********************DOWNCASTING**************************/

        // B obj2 = obj1; // ERROR => Type mismatch: cannot convert from A to B

         B obj2 = (B)obj1; // come back to child reference

                          // type of obj1 is A we need to type cast it to B for avoiding above error
                         // here obj1 is of type A we are type casting it to type B whic is child HENCE downcasting
           obj2.showB();
     }
}

/*
 * A obj1 = (A) new B(); => UPCASTING
 * B obj2 = (B)obj1;     => DOWNCASTING
 */
