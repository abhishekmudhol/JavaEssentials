package javaString_05;

  //  mutable vs Immutable
  
// BY DEFAULT STRING IS IMMUTABLE i.e. once you create object you cannot change it
public class _02_StringType {
    public static void main(String[] args) {
        
    //String a = new String("ram") ; // ram gets stored in heap memory 

    String s = "ram";

    s = s + " bharat"; //try to change string 
  System.out.println(s);  // ram bharat
  /*
    IMPORTANT => WE NOT CHANGING EXISTING STRING
  */ 
     String s1 = "ram";
     String s2 = "ram";
     // behind the sences we ONLY CREATE ONE OBJECT
     //  s1 & s2 are just references i.e. TWO references

     System.out.println(s1 == s2); // true i.e. value of address is same
 
    // In heap we have area called String constant pool 
    // every String literal in java is constant i.e. string is a immutable
 
// on line 13 -> we changing adress not actual data it means we creating new object
    }
}


 // BY DEFAULT STRING IS IMMUTABLE
 // if we want muttable string we have 2 class in java
 //    1. String Buffer class
 //    2. String Builder class  


/*
1) What happen when we create same character sequence ? 
   is it form multiple object for same character sequence?
     a) using new keyword 
     b) String literal
2)What is String constant pool in heap?
3)what happen when we assign different object to reference variable of String class?
4)What is mutable and immutable String?

#1
Using the new keyword, you can create multiple objects from the same character sequence.
This is useful when you want to save time   by creating multiple objects from the same data source. However, when using a string literal,
you can only create one object. String literals are read-only memory locations, so they cannot be changed and can only be used to create a
single object. This makes string literals less flexible than the new keyword.

String name1="navin";
String name2="navin";

Since "navin" is same character sequence and created by string literal way. 
so name1 and name2 pointing same object created in string constant pool.

check--
System.out.println(name1==name2); //true 

using new --
String name3=new String("navin");

System.out.println(name1==name3); //false
Since new can create new string object which can contain navin.

#2
what is string constant pool?
-- The String constant pool is an area in the Java heap that stores immutable strings.

It is used to optimize the storage of strings in the program by providing a single location 
for string literals. When a string is created in the program, the Java Virtual Machine first
checks if the same string exists in the constant pool and if so, it is returned instead of creating
a new string. This helps to reduce the memory footprint and also improve performance since the string
comparison operation is also optimized.

#3
what happen when we assign different value to String reference variable?
suppose we create

String str="Mathura";
now str=str+" city"; 
System.out.println(str);//here we get Mathura city

-- do you think we change in existing "Mathura" object 
then answer is NO because String is immutable type which cannot further changed.
-- here reference variable str pointing to new object that  is "Mathura city";
-- and "Mathura" object ready for garbage collection because no variable pointing the "Mathura" object.

#4
What is difference between mutable and immutable String?
--Mutable and immutable strings are two different types of strings in programming.
Mutable strings are strings which can be modified once they are created. 
-- Immutable strings, on the other hand, cannot be changed after they have been created. 

String is immutable 
StringBuffer and StringBuilder are mutable in nature
*/