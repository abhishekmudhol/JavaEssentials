/*
  IN BELOW EXAMPLE IN class B WE WANT config() METHOD OF A 
  BUT WE NOT WANT show() method body we want to have different method body 

  IMPORTANT => it will search show() in B(child class) first then in A(parent class)
  IN method overriding WE HAVE SAME NAME and SAME PARAMETER but DIFFERENT BEHAVIOUR
*/

class A
 {
     public void show()
     {
        System.out.println("show() of class A");
     }

    public void config()
     {
        System.out.println("config of class A");
     }
 }

class B extends A  // INHERITANCE IS REQURIED BECUZ WE WANT OTHER MEMBER OF CLASS 
                   //i.e. we want config() to coming from A 
 {
    public void show()
    {
         System.out.println("show() of class B");
    }
 }


public class _16_methodOverriding 
{
    public static void main(String[] args)
    {
        B obj = new B();
          obj.show();
          obj.config();
    }
}

/*
 * OUTPUT => show() of class A  -> BEFOR OVERRIDING
             config of class A

             show() of class B  -> AFTER OVERRIDING
             config of class A   
 */

//                      NOTES

/*
    -- method overriding is run time polymorphism
    -- it is use to increase the reusability of code 
for a method to be overridden, the following conditions must be met:

 -- The method in the subclass must have the same signature (name, number and type of parameters) as the method in the superclass.
 
 -- The method in the subclass must have the same return type (or a subtype) as the method in the superclass.

 -- The method in the subclass must have the same access level (public, protected, or private) as the method in the superclass.

 IMPORTANT => The method in the subclass must not be static, while the method in the superclass must be marked as non-final.

 -- The overridden method must be visible from the subclass it means you can change access modifiers but there is condition for 
    -- you need to increase visibility but you cannot reduced it , you can do it using access modifiers.
    -- you can change access modifiers in this manner 
       private -default -protected -public (in upcoming lecture access modifiers has been discussed)

 */



/*
#1 method overriding 
#2 Necessary condition for method overriding 

What is method Overriding?
It is way to override the parent class method in child class .

class Parent{
int a;
public void show{System.out.println("this is parent");}
}
class Child extends Parents{
    int a=10; //override a 
    public void show(){System.out.println("this is child method");} //method override by child class
}
class Main{
    public static void main(String []args){
        Child c=new Child();
        c.show(); //call the child class override method
           }   
}
 -- method overriding is run time polymorphism
 -- it is use to increase the reusability of code 

#2
for a method to be overridden, the following conditions must be met:

 -- The method in the subclass must have the same signature (name, number and type of parameters) as the method in the superclass.
 
 -- The method in the subclass must have the same return type (or a subtype) as the method in the superclass.

 -- The method in the subclass must have the same access level (public, protected, or private) as the method in the superclass.

 -- The method in the subclass must not be static, while the method in the superclass must be marked as non-final.

 -- The overridden method must be visible from the subclass it means you can change access modifiers but there is condition for 
    -- you need to increase visibility but you cannot reduced it , you can do it using access modifiers.
    -- you can change access modifiers in this manner 
       private -default -protected -public (in upcoming lecture access modifiers has been discussed)

for knowing about access modifiers wait for access modifiers lecture in this playlist
class A{
     void show(){ // -- by default access modifier is default
        System.out.println("A");
    }
    int a=5;
}

class B extends A{
     protected void show(){ //-- access modifier is protected --we can increase visibilty
        System.out.println("B");
     }

}
*/ 