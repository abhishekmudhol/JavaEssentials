
// JAVA SAY IF YOU NOT DEFINED constructor I WILL CREATE constructor FOR YOU
// THATS WHY WE SAY THAT A default constructor
// i.e.     public Human()               
//          {
//                  
//          }

class Human
{

/******************************/    
private int age ;
private String name ;
/******************************/
//          constructors

public Human(int age , String name) // parameterized constructor
 {
      this.age = age;
      this.name = name; 
      System.out.println("constructor get executed here");
 }

public Human()                // default constructor
 {
    age = 20;
    name = "ab";      
 }

public Human(String name) 
{
    age = 20;
    this.name = name;
}


public Human(int age) 
{
    this.age = age;
}

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


public class _09_constructorOverloading
 {
   public static void main(String[] args)
   {

     Human h1 = new Human(21 , "ram");
     System.out.println(h1.getName() + " : " + h1.getAge()); //ram : 21


     Human h2 = new Human();
     System.out.println(h2.getName() + " : " + h2.getAge()); //ab : 20

     Human h3 = new Human("bharat");
     System.out.println(h3.getName() + " : " + h3.getAge()); //bharat : 20

     Human h4 = new Human(1);
     System.out.println(h4.getName() + " : " + h4.getAge()); //null : 1
   }
}
