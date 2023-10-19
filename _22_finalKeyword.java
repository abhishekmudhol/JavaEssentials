// final keyword use with => variable , method , class
// final variable = constant i.e. variable con not able to modify
/* 
   final with variable => make it a constant
   final with class    => stop Inheritance
   final with method   => method not be override
*/
/**********************************************************/

// public class finalKeyword {
//       public static void main(String[] args) {
        
//         //  final int number = 4;
//         //  number = 5; // error
//       }
// }


/**********************************************************/
 

// WE CAN STOP THE inheritance BY USING final keyword WITH class

// final class calculation
// {
//     public void show()
//     {
//         System.out.println("show in a calculation");
//     }

//     public void add(int a , int b)
//     {
//         System.out.println(a+b);
//     }
// }

// //  class AdvCalculation extends calculation //ERROR : The type AdvCalculation cannot subclass the final class calculation
// //  {

// //  }



// public class finalKeyword {
//       public static void main(String[] args) {
        
//         calculation obj = new calculation();
//              obj.add(4, 5);
//              obj.show();
//       }
// }
/**********************************************************/

 //final with method   => method not be override

 class calculation
{
    final public void show()
    {
        System.out.println("show in a calculation");
    }

    public void add(int a , int b)
    {
        System.out.println(a+b);
    }
}

 class AdvCalculation extends calculation 
 {
    // public void show() // Cannot override the final method from calculation
    // {
    //     System.out.println("show in a Advcalculation");
    // }
 }



public class _22_finalKeyword {
      public static void main(String[] args) {
        
        calculation obj = new calculation();
             obj.add(4, 5);
             obj.show();
      }
}

/*
-- final keyword use with variable , methods and class
-- if make a variable final then variable become constant
final int a=5;
//you cannot reassign a value to a
-- final class 
class A{
public void show(){
System.out.println("In Calc show);
}

public void add(int a,int b){
    System.out.println(a+b);
}
}

Suppose someone want to extend your class , but we want to stop inheritance then we need to make final
-- if you make class final then no one can inherite your class
-- but you can use the final class by making object of final class

class A{
    public final void show(){
        System.out.print("IN A");
    }
}

class B extends A{
    // but you inherit class but you cannot override show() method  if your method is final
    //since show method is final
}

-- if you make method as final no one can override your method.
*/