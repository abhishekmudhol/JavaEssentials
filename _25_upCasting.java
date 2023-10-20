// upcasting or downcasting is general called typecasting


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

public class _25_upCasting
{
     public static void main(String[] args) 
     {

/***********************UPCASTING**************************/
        
        A obj1 = (A) new B(); // casting child class to parent class hence upcasting 
                              //IT is NOT complusary IT HAPPENS implicitly behind the sences even we not mentioned casting part i.e. (A)  
                         // HERE object is of B and reference is of A we are going up hence upcasting
        obj1.showA();      //show method of A

        //obj1.showB();  // ERROR => The method showB() is undefined for the type A
    /*
     * using obj1 which is of B still we can not able to called showB() method becuz 
     * The reference is of A and A don't known about showB() method  
     */
    // SOLUTION =>
     
/**********************DOWNCASTING**************************/

        // B obj2 = obj1; // ERROR => Type mismatch: cannot convert from A to B
         B obj2 = (B)obj1;   // type of obj1 is A we need to type cast it to B for avoiding above error
                         // here obj1 is of type A we are type casting it to type B whic is child HENCE downcasting
           obj2.showB();
     }
}

/*
 * A obj1 = (A) new B(); => UPCASTING
 * B obj2 = (B)obj1;     => DOWNCASTING
 */



/*
what is typecasting  ?
typecasting is way to converting one primitive data type into other data type using implicit or explicit type
conversion.
double d=4.5;
int i=(int)d; //explicit typecasting 

int i1=5;
double d1=i1; //implicit type conversion

When we are talking about non -primitive data type we have concept of upcasting and downcasting
condition for upcasting and downcasting:
-- for that two class should have some parents child  relationship 
-- if non-primitive data type have no any relationship so, upcasting and downcasting is not possible.

class A{
    public void show1(){
        System.out.println("In show A)
    }
}

class B extends A{
    public void show2(){
        System.out.println("In show B");
    }
}

class Demo{
    public static void main(String []args){
        A obj =(A) new B(); //upcasting 
        obj.show1();
       
    A obj1 =new B(); // upcasting 
   // obj1.show2(); // you get error and you are not able to call show2() because with parennts reference specialised method of child is not visible
    here we downcastig to use show2() method
    ((B)obj).show2(); //downcasting
    }
}

Note:
the object can also be typecasted like the datatypes. Parent and Child objects are two types of objects. 
So, there are two types of typecasting possible for an object, i.e., Parent to Child and Child to Parent or can say Upcasting and Downcasting.
*/