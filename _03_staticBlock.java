// for instanciate instance variable usually we use constructor 
/*
    but when we put static variable inside class constructor initiate static
    variable every time constructor is called we not want to do that the problem
    can be sovled by static block
*/
// inside static block we initialise static variables


/* 
Remember one thing:
i)we can use static property, member inside non static block or method without object creation.
ii) But we cannot use non static property or method inside static block or method without object creation.
*/


class Mobile {
    int price;         // instance variable
    static String brand;  //common variable
    

      public Mobile()
      {

            price = 200;
            System.out.println("constructor is executed here");
             
      }

      static                // static block will called only once irrespective of how many object you creates
       {
              brand = "mobile";
              System.out.println("static block executed here");
       }


     public void show(){ // instance method -> need object to called method
      
        System.out.println(price + " " + brand);
     }
 
     
}

public class _03_staticBlock {
    public static void main(String[] args) {
        


      // Mobile obj1 = new Mobile();
      //    Mobile.brand = "OnePluse"; 
      //    obj1.price =   2000;
      //    Mobile.brand = "phone"; 

      // Mobile obj2 = new Mobile(); 

        
    }    
}
 
/*
  output => static block executed here   
            constructor is executed here
            constructor is executed here

     // see above o/p static block called before constructor
        java does not follow sequence       
*/

/*
 *  2 step in which you get object
   
 *     1. class loads
 *     2. object instanciated
 
 * but the things is CLASS ONLY GETS LOADED ONCES
 * JVM have areas called classs loader which have all class which are loaded
 * 
 * every time you load class it will called static block
 * 
 * as class loading happen first then it create object hence consrtuctor called after static block
 */

/* 
    IMPORTANT
 IF WE DON'T CREATE OBJECT it will not called static block and constructor as well
  IT MEANS IF WE DON'T CREATE THE OBJECT IT WILL NOT LOAD THE CLASS AS WELL
 if we want to load the class without creating the object how to do that?

 ans => we have special class inside java called Class class which have .forName() method
        forName method load the class
        
     syntax =>   Class.forName("Mobile");  

     // comment all object in above code and run above line
        output -> static block executed here // i.e. only static bolck get excuted not constructor
                                                      becuz NO object is created

   USECASE => JDBC                                            
*/

        
