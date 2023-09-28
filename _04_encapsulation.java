
// encapsulation = tightly close , not outside world can use it

//Note:
//Always make variable as private and method as public to achieve  security in program.

// EVERY TIME YOU WILL CREATE INSTANCE VARIABLE MAKE IT private


// private -> only access within the class 


class Human
{

   private int age =21;
   private String name ;
    
   public int getAge()
   {
      return age;
   }

   public String getName()
   {
    return name;
   }

   public void setAge(int a)
   {
        age = a;
   }
 
   public void setName(String s)
   {
       name = s;
   }
}

public class _04_encapsulation 
{
    public static void main(String[] args) 
    {
        

    Human h = new Human();

            //h.age; //The field Human.age is not visible
            //h.name;//The field Human.name is not visible

    int AGE = h.getAge();
    String NAME = h.getName();

    System.out.println(AGE); // 21    
    System.out.println(NAME);// null

    h.setAge(22);
    h.setName("RAM");

    int AGE_NEW = h.getAge();
    String NAME_NEW = h.getName();

    System.out.println(AGE_NEW); // 22    
    System.out.println(NAME_NEW);//RAM
    }
}



// HERE WE BINDING OUR DATA WITH METHODS AND ONLY WAY TO ACCESS THAT DATA IS METHODS
// SO , NO ONE CAN USE OUR DATA OR VARIABLE DIRECTLY FORM OUTSIDE WORLD


//  HENCE WE ENCAPSULATING DATA AND METHOD

/*
1)What is encapsulation?
2)how to achieve encapsulation
3)Benefits of encapsulation
4)how to use private data?

#1
What is encapsulation?
= binding data with method to make your program secure is known as encapsulation.
Consider encapsulation as we have capsule and inside capsule everything inside a class is wrapped or encapsulated.
e.g
class A
{ 
    private int a;  
    public void setA(int num){a=num;} 
    public int getA(){return a;}
} 
//here you can see that we can bind data with method inside a curly braces, it seems look like a capsule inside everything is present.

#2
how to achieve encapsulation?
-- through access specifiers private,protected,public,default . We can achieve 
encapsulation.

#3
Benefit of encapsulation
 i)Helpful in to achieve abstraction 
 ii)for security point of view it is most beneficial.
 iii)you can maintain log file through method when you bind your data with method.

#4
how to use private data?
-- using setters and getters method we can set and get the value of variable.
-- private int num;
public int getNum( )
{
return num;
}

public void setNum(int num)
{
this.num=num;
}

 Note:
 Always make variable as private and method as public to achieve  security in program.
*/