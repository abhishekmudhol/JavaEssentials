// You need to add an abstract keyword to only declare a method.
// using abstract keyword in method means we are just giving abstract idea we not known how to implement it.

// IMPORANT => abstract keyword method can only declared in abstract class 
//             whichever class is extending abstract class should have defination of all abstract methods
//Objects of an abstract class can not be created.

// IMPORANT => IT IS NOT compalsory to have abstract method in abstract class

abstract class car  // abstract class can have //abstract method and normal methods 
                                               // also ONLY abstract method
                                               //also ONLY normal method
{
    public abstract void drive(); //The abstract method drive in type car can only be defined by an abstract class
  
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("Music playing..");
    }
}

 abstract class mustagGT extends car  
{                              //The type mustagGT must implement the inherited abstract method car.drive()
    public void drive()
    {
       System.out.println("Driving..");
    }

    // public void fly()
    // {
    //    System.out.println("Flying.."); 
    // }
}

 class UpdatedmustagGT extends  mustagGT    // Concrete class
{                              
   
    public void fly()
    {
       System.out.println("Flying.."); 
    }
}
public class _28_abstractKeyword 
{
    public static void main(String[] args) 
    {
       // car obj1 = new car() ;  //Cannot instantiate the type car
                             // USING abstract class WE CAN RESTRICT CREATION OF object of abstract class 
        car obj1 = new UpdatedmustagGT();  //referance of abstract class and object of non-abstract class i.e. Concrete class
           obj1.drive();
           obj1.playMusic();
           obj1.fly();
    }
}

/*

- What is Abstraction?
- Abstract method in Java
- Abstract class in Java
- Abstract vs Concrete classes

#1
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

#2
Abstract method:-
- Instead of defining the method, we can declare the method.
- If we put a semicolon at the end of a method, it means that you only declare the method like:

    public void drive();

- This method does not contain any features and you will not be able to create an object of it.
- You need to add an abstract keyword to only declare a method.

#3
Abstract class:-
- Abstract methods can only be defined in an abstract class.
- We need to add an abstract keyword before a class to make it an abstract class.
- Objects of an abstract class can not be created. we can create referance of abstract class
- If you are extending an abstract class, then it is compulsory to define all abstract methods.
- It is not necessary that an abstract class should have an abstract method.
- Abstract class can have an abstract or a normal method or both.
- An abstract class can have more than one abstract method.

#4
Concrete class: A class other than an abstract class is known as a concrete class.
- An object of a concrete class can be created. 

*/