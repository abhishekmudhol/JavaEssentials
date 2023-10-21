/*
 * java provides primitive datatype thats make it 99.99 % oop, java is not purly object oriented
 * In oop lang every thing should be a object, java work with somthing that not extending object class
 *  every class in java extends Object class
 * but not privitive value they are not object type they are primitive type , it hepls java to improve 
 * performance becuz it directly works with fixed value not need to save in heap memory as object which is time consuming
 * so that is that if you want to save the value you can save directly in primitive 
 * 
 * but there are certain feature or framwork in java that only works with a object eg. collection framworks
 * 
 * In array we can have primitive types but not in collection framworks there we need to have object type
 * 
 * In java you have concept called Wrapper class 
 */

 /* 
  *what a Wrapper class ?  
  *
  *=> for Every primitive type we will going to have class for it 
  *
  *     byte -Byte        class which extends Object class 
        int - Integer     class which extends Object class   
        long -Long        class which extends Object class 
        char- Character   class which extends Object class 
        double -Double    class which extends Object class 
        float -Float      class which extends Object class 
        boolean -Boolean  class which extends Object class 
  *  
    THIS HELPS WHEN WE WANT TO WORK WITH FRAMWORK WHICH ONLY SUPPORTS objects i.e. collection framwork 
  */


public class _27_wrapper 
{
    public static void main(String[] args) 
    {

  //  Integer IS A Wrapper class i.e. Wrapper around primitive type also provide multiple features one of them is Integer.parseInt(s); 



        int num1 = 4;  // primitive type i.e. primitive variable
        Integer num2 = new Integer(5); // object or class type i.e. reference variable

        int num3 = 4;  
        Integer num4 = new Integer(num3);  // Boxing  here we pass primitive value

        int num5 = 4;  
        Integer num6 = num5;    // Autoboxing    // automatically converting primitive type to object type i.e. storing into reference variable
                                                 // Boxing is happening automatically  

        int num7 = num6.intValue();// UnBoxing   // num6 is object type we have get the value from object type to primitive type

        int num8 = num6;        //AutoUnBoxing   //  UnBoxing  is happening automatically  

    /******************************************************/    
       String s = "4";
       //System.out.println(s*2); // ERROE => The operator * is undefined for the argument type(s) String
       
       int num9 = Integer.parseInt(s);  
       System.out.println(num9*2);  // 8
    }      
}


/*
 * if you want to store integer value you store in int
   java provide primitive data type 
   thats why java is 99.9 % object oriented programming
   primitive data types helps us to improve the performance 
   but certain feature are work only when we work with objects

   for collection framework -- we need non primitive type data as input 


    Boxing:It is manual method to convert primitive type data into non-primitive type .
    e.g 
    int num=7;
    Integer num1=new Integer(8); //boxing

    UnBoxing: It is manual method to convert non-primitive data type to primitive type.
    e.g
    int num2=num1.intValue(); //unboxing

    AutoBoxing:It is automatic conversion of primitive type data into non-primitive data type.
    int num3=5;
    Integer num4=num3; //autoboxing

    AutoUnBoxing:It is automatic conversion of non primitive type data into primitive data type.
    int num5=num4; //autounboxing

    

    int num=7;
    how to store data as Object
    Integer num1=new Integer(8); //this syntax is depreciated 
    Integer num1=Integer.valueOf(8); //Now we use this syntax
    Integer num1=8; //autoboxing 
    int num2=num1.intValue();//unboxing 
    int num3=num1; //autounboxing 
    
    --convert string into int type using parseInt
    String str="12";
    int num4=Integer.parseInt(str); 
    
    --Convert number into String 
    String str1=Integer.toString(23); //convert number into string
 */