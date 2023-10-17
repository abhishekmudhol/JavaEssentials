
/*
 *  if want something access outside of package always make it PUBLIC
 *  hence method most of time is PUBLIC
 * 
 *  i) public: A public class, method, or data member is visible to all classes i.e. USED ANYWHERE. 
 * 
    ii) protected: A protected class, method, or data member can be accessed by classes within the same
    package, and any subclasses which extend the class. 

    iii) default: (PRIVATE-PROTECTED)A default class, method, or data member is visible only to classes
    within the same package. 

    iv) private: A private class, method, or data member is only visible to the class it is declared in, 
    and not to any subclasses.

     IMPORTANT => The default access modifier is also called package-private,
 */

import others.Access_A;

class Name extends Access_A 
{
      public void just()
      {
       System.out.println(name); // protected =>  can be access in sub-class
      }
     
}



public class Modifiers
{
    public static void main(String[] args)
    {
        Access_A obj1 = new Access_A();
          int score1 =obj1.marks;

                   //  obj1.name; //protected => cannot be used in other package if class is not sub-class 
                                 //i.e.class Modifiers not inherted form Access_A class here
          System.out.println(score1);

          Access_B obj2 = new Access_B();
          int score2 =obj2.marks;
          System.out.println(score2);
    }
}

/*
  IMPORTANT =>

    1. MAKE A class public   
     -> WE CANNOT HAVE 2 public CLASS IN SAME FILE i.e. general idea is in one file should have one class

    2. MAKE a Instance variable private

    3. MAKE method MOST OF TIME public

    4. method or variable whisch should be access only in SUB-CLASS of OTHER PACKAGES use protected

    5. TRY TO AVOID default i.e. DEFAULT means you don't known what access to give 
 */