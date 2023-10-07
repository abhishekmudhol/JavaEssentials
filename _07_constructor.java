


// constructor = look like method with class name with no return type
// EVERY TIME WE CREATE OBJECT constructor GETS called



class Human
{

/******************************/    
private int age ;
private String name ;
/******************************/


public Human(int age , String name)
 {
      this.age = age;
      this.name = name; 

      System.out.println("constructor get executed here");
 }


//          OR 

// public Human()  
//  {
//     age = 20;
//     name = "ab";      
//  }

/******************************/
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
/******************************/

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
/******************************/    
   
}


public class _07_constructor
 {
   public static void main(String[] args)
   {
       // Human h = new Human(); // creates blank object inside heap
      //System.out.println(h.getName() + " : " + h.getAge());  // null : 0

        // here above when object get created default value get assign 
        // but what if we want to assign value when object get created 
        //i.e. ihe moment object gets created we want some value not default value i.e. null values
        // ANS -> USING constructor

     Human h1 = new Human(21 , "ram");
     System.out.println(h1.getName() + " : " + h1.getAge()); //ram : 21


     Human h2 = new Human(22 ,"bharat");
   }
}

/*
   OUTPUT -> constructor get executed here
             ram : 21
             constructor get executed here
 */

 // when we trying to connect with database we need connection we write that connection inside constructor


/*
- What are constructors in Java
- Properties and use of a constructor
- Syntax of a constructor

#1
- When you create an object then in the heap memory, it will just create a blank object.
- If you do not assign values than the default values will be assigned like:
 0 for int,
 NULL for string
- We can also define values at the time of the creation of an object by giving our default values.

#2
Properties of a constructor:
- Constructor is almost similar to a method it has a name and it also has round brackets.
- The change in the constructor with respect to the method is that in the constructor we do not specify the return type.
- The name of a constructor must be the same as the class name.
- There is no need to call a constructor. It gets called automatically at the time of the creation of an object.
-  At the time of calling the constructor, memory for the object is allocated in the memory.
- Constructors are called only once at the time of object creation. While method(s) can be called any number of times.

#3
Syntax of a constructor:
class human {
 public Human()
 {
  statements;
 }
}
*/