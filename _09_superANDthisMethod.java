/* 
       1.this(); // EXCUTE constructor OF SAME CLASS
       2.super()  // EXCUTE constructor OF super class
*/

// when we create object of B with parameterized constructor it called parameterized constructor of B
// but DEFULT constructor of A not parameterized constructor of A, WHY?

//ANS => EVERY constructor IN JAVA HAS METHOD super() even if it not mentioned

//IMPORTANT
// super() => means call the constructor of super class

/*
 * 
 * 
 *  B has super-class A so we have super() there but why we have super() in A
 *   as it not extends any class
 * 
 * ANS=>  EVERY CLASS IN JAVA extends Object class , so EVEN IF WE NOT MENTIONED
 * 
 * 
 *     class A extends Object
 *     {
 * 
 *     }
 * 
 */

class A //extends Object
{
    public A()
    {
        super(); // represents constructor of Object class
        System.out.println("constructor A");
    }

        public A(int M)
    {
        super();
        System.out.println("constructor A with int");
    }
}

class B extends A
{
    public B()
    {
        super();
         System.out.println("constructor B");
    }

     public B(int N)
    {
       // super(); // here not passing any parameter hence calling default constructor of A
       // super(N); // NOW IT CALL parameterized constructor OF A
       
        this(); // EXCUTE constructor OF SAME CLASS
       System.out.println("constructor B with int");
    }
}

public class _09_superANDthisMethod
 {
    public static void main(String[] args)
    { 
         B obj1 = new B();
         B obj2 = new B(4);
    }
}
// OUTPUT => constructor A
//           constructor B

//           constructor A
//           constructor B with int

//           constructor A with int
//           constructor B with int

//           constructor A            
//           constructor B           //  USING this();   
//           constructor B with int
          
// it is calling constructor od A & B when we create object of B

/*
 *  when we get object of class it will call constructor of both sub-class and super-class
 */

//  conclusion=> 1. super( ) is there but not written we have to write 
//                  explicitly if we want to pass parameter in it

  //             2. when we get object of class it will call constructor
  //                of both sub-class and super-class

/*
- Constructors in Java
- Super method in Java
- Object class in Java
- This method in Java
- Similarities in between this() and super() method


#1
- Whenever you call an object, it will create a constructor of a class.
- When we create an object of a class that it calls the constructor of a sub-class as well as a constructor of a superclass.
- If you do not pass any value in an object, then it will call the default constructor of a class.
- But if you pass the value in an object, then it will call the parameterised constructor of that class.

#2
Super() method:-
- Every constructor in Java has a method, even if you do not mention it.
- By default, the first statement in every constructor is a method called a super() method.
- Super() method means calls the constructor of a superclass.
- If you do not pass any parameter in a super method, then it will call the default constructor of a superclass.
- If you pass any parameter in a super method, then it will call the parameterised constructor of a superclass.
- To call the parameterised constructor of a parent class, we need to explicitly call the super method.

#3
Object class:-
- Every class in Java extends the Object class, even if you do not mention it.
- Object is a class in Java that contains a lot of methods.
- So, the super method of a superclass calls the constructor of an object class.
- There is multi-level inheritance in this concept.

#4
This() method:-
- this() method calls the constructor of the same class.
- If you do not pass any parameter in this method, then it will call the default constructor of the same class.
-  If you pass any parameter in this method, then it will call the parameterised constructor of the same class.

#5 
Similarities in between this() and super() method:-
- We can use both this and super method anywhere except the static area.
- Both this and super method can be used any number of times in a code.
But both can be used only one time inside a constructor.
- Both are non-static keywords.
*/