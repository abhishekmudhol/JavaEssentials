// import calculator.AdvCalc;
// import calculator.calc;
  
   import calculator.*;

public class _13_inheritance
{
    public static void main(String[] args) 
    {
     calc obj1 = new calc();
          int add=  obj1.add(4, 5);
          int sub = obj1.sub(4, 5); 
          System.out.println(add );         //9
          System.out.println(sub );         //-1

    //  AdvCalc obj2 = new AdvCalc();
    //     int multi = obj2.multi(4,5 ) ;
    //     int div   = obj2.div(4, 5);  
    //     System.out.println(multi);
    //     System.out.println(div);
    // HERE WE DONT HAVE add() & sub() WE NEED TO INHERT IT FROM calc CLASS
    // USING KEYWORD CALLED extends


    
        AdvCalc obj2 = new AdvCalc();
        int multi = obj2.multi(4,5 ) ;
        int div   = obj2.div(4, 5); 
        
        int add1 =  obj2.add(4, 5);
        int sub1 = obj2.sub(4, 5); 
        System.out.println(add1 );       // 9
        System.out.println(sub1 );       // -1
        
        System.out.println(multi);      //20
        System.out.println(div);        //0
    }
}  








/***********************************************************/   
    
//  class Clac
// {
         
//        public int add(int n1,int n2) //You should specify the data types of the parameters
//        {
//              return n1 + n2;
//        }

//        public int sub(int n1 , int n2)
//        {
//          return n1 - n2;
//        }
// }

// public class inheritance
// {
//     public static void main(String[] args) 
//     {
        
//     }
// }


/* 

//                   Calc.java

 class Calc
{
         
       public int add(int n1,int n2) //You should specify the data types of the parameters
       {
             return n1 + n2;
       }

       public int sub(int n1 , int n2)
       {
         return n1 - n2;
       }
}

  
 //               inheritance.java 

public class inheritance
{
    public static void main(String[] args) 
    {
        Clac obj = new Clac();
    }
}

in above we have Calc class in Calc.java file 
    and  we have inheritance in inheritance.java file

1.  javac inheritance.java => it only creat .class file for inheritance
                            class i.e. inheritance.class not for calc 
                            becuz Calc classs is not in use 

2.  AFTER CREATING OBJECT OF Calc IN inheritance.java FILE
    javac inheritance.java
      IT WILL CREATE .class file FOR BOTH inheritance AND Calc CLASS
*/






/*
- What is inheritance in Java?
- Use of extend keyword in inheritance
- The main aim of inheritance
- Important points related to inheritance

#1
For every class that we create in a code, there will be a class file.
- Inheritance helps to add more features by inheriting the class.
- For inheritance, we only required the class file. There is no need for a java file.
- extends keyword is used in inheritance to inherit properties of a parent class.

#2
- The main aim of inheritance is to implement the concept of reusability, saving our time and resources and also creating better connections between different classes, and achieving method overriding. 

#3
Points related to inheritance in Java:-
- The superclass of every class is an Object class.
In the absence of any other explicit superclass, every class is implicitly a subclass of the Object class.
-   A superclass can have any number of subclasses but a subclass can have only one superclass.
- Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
- A subclass does not inherit the private members of its parent class. 
*/