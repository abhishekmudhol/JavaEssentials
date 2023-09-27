package javaString_05;




public class _03_Stringmutable {
   public static void main(String[] args) {
    

    StringBuffer sb = new StringBuffer();
       System.out.println(sb.capacity());//16 bytes i.e. character

       StringBuffer sb1 = new StringBuffer("ram");
       //System.out.println(sb1.capacity()); //19 becuz to reduce relocation of string it give buffer
         System.out.println(sb1.length()); // 3
    
        sb1.append(" bharat");
    
        System.out.println(sb1);  // ram bharat
/*********************************************************/   
      // assigning Stringbuffer data to String

     //String s = sb1; //Type mismatch: cannot convert from StringBuffer to String
 
         String s = sb1.toString() ; 

/*********************************************************/
     
        StringBuffer sb2 = new StringBuffer("bharat");

            sb2.deleteCharAt(1);

        System.out.println(sb2);//barat  

             sb2.insert(1, 'h');

        System.out.println(sb2);//bharat 
/*********************************************************/
        
            sb2.setLength(21);

         System.out.println(sb2);

            sb2.ensureCapacity(100);

        System.out.println(sb2.capacity());//100


/*********************************************************/
        //StringBuffer  sb5 = "ram"; //Type mismatch: cannot convert from StringBuffer to String
    }
}


// DIFFRENCE BETWEEN Stringbuffer vs Stringbuilder

//Stringbuffer is thread safe
//Stringbuilder is NOT thread safe


/*
1)StringBuffer class and StringBuilder class
2)Different method of thes class
a)capacity()
b)length()
c)append()
d)insert()
e)deleteCharAt()
f)convert to String -- toString() 
and there are many method you should  explore from your side
3)Difference Between StringBuilder vs StringBuffer

#1
StringBuffer class and StringBuilder class
--  string buffer and string builder class in java used to create mutable string 

#2
Different method
 --First Create StringBuffer object 
        StringBuffer sb = new StringBuffer("Hello");
 --Find capacity of StringBuffer 
        System.out.println(sb.capacity());
        -- default capacity is 16

--Find the length of StringBuffer Created String
        System.out.println(sb.length());
    
--To append the content in existing StringBuffer object
        sb.append(" World");

--To Convert StringBuffer Object into String Object
        String str=sb.toString();
        System.out.println(str);

-- Delete charcter of particular index
        sb.deleteCharAt(3);
        -- delete character at index 3

-- Insert "hi " at index 0 of existingStringBuffer Object
        sb.insert(0, "Hi ");
        System.out.println(sb);

#3
Difference between StringBuffer and StringBuilder
       -- StringBuffer is thread safe
       -- StringBuilder is not thread safe
Imp: We will discuss thread safe when we study multithreading

StringBuffer:

   --StringBuffer is a class that has been available in Java since the early versions, making it part of the Java's legacy API.
   
   --It is thread-safe, which means it can be safely used in a multi-threaded environment without external synchronization. This thread safety is achieved through synchronized methods.
   
   --Because of the synchronization overhead, StringBuffer operations can be slower in a single-threaded context compared to StringBuilder.
   
   --StringBuffer is suitable for situations where thread safety is a concern, such as in a multi-threaded server environment.


StringBuilder:

   --StringBuilder was introduced in Java 5 to address the performance limitations of StringBuffer.
   
   --It is not thread-safe, which means it is not synchronized and should not be used in a multi-threaded context without external synchronization.
   
   --StringBuilder is faster than StringBuffer in a single-threaded environment because it doesn't have the synchronization overhead.
   
   --It is suitable for most situations where you need to build or manipulate strings in a single-threaded context.   

*/