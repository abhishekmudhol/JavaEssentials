/*
Class Object is the root of the class hierarchy. Every class has Object as a superclass
java.lang.Object


toString() is come from Object class which is by default extend to every class in java


The hashCode() method is defined in Java Object class which computes the hash values of
             given input objects. It returns an integer whose value represents the hash value of the input object.
             The hashCode() method is used to generate the hash values of objects.

              
How many methods are in the Java object class?
    11 methods 
    
    1. toString()
    2. equals(Object obj)
    3. hashCode()
    4. getClass()
    5. clone()
    6. notify()
    7. notifyAll()
    8. wait(long timeout)
    9. wait(long timeout, int nanos)
    10. wait()
    11. finalize()
*/

/**********************************************************/


//  class laptop 
// {
//     String model ;
//     int price ;
    
// }


// public class objectClass
// {
//    public static void main(String[] args)
//    {
//       laptop obj1 = new laptop();  
//           obj1.model="dell";
//           obj1.price=2000;

//     //    System.out.println(obj1);  // laptop@28a418fc  
          
//        System.out.println(obj1.toString());// laptop@28a418fc
//                                   // every time we try to print object by defult .toString() method 
//                                   //is called on object   
//    }   
// }


/*    SEE INSIDE Object class

 public String toString()
 {
   return getClass().getName() + '@' + Integer.toHexString(hashCode());
 }

*/ 

/**********************************************************/

//  class laptop 
// {
//     String model ;
//     int price ;
    
//     @Override
//     public String toString(){
//         return "Model: "+model+" and price: "+price;
//     }
// }



// public class objectClass
// {
//    public static void main(String[] args)
//    {
//       laptop obj1 = new laptop();  
//           obj1.model="dell";
//           obj1.price=2000;

//        System.out.println(obj1);  //Model: dell and price: 2000  
         
//          laptop obj2 = new laptop();  
//           obj2.model="dell";
//           obj2.price=2000;

//          boolean answer = obj1.equals(obj2) ;
//          System.out.println(answer); //false   
//         /* equals() is comminf from Object class if we see
//          * method defination in Object class it comparing object
//          * by there hexadecimal number 
//          * 
//          * 
//          *  so , we can equals them  base on there values 
//          *  by implimenting or overriding equals() method in
//          *  our own laptop class   
//         */
                    
//    }   
// }


/**********************************************************/


//  class laptop 
// {
//     String model ;
//     int price ;
    
//     @Override
//     public String toString(){
//         return "Model: "+model+" and price: "+price;
//     }

//     public boolean equals(laptop thatobj)
//      {
//        if (this.model.equals(thatobj.model) && (this.price==thatobj.price))
//         {
//             return true;
//         } 
//         return false;
//     }
// }



// public class objectClass
// {
//    public static void main(String[] args)
//    {
//       laptop obj1 = new laptop();  
//           obj1.model="dell";
//           obj1.price=2000;

//        System.out.println(obj1);  //Model: dell and price: 2000  
         
//          laptop obj2 = new laptop();  
//           obj2.model="dell";
//           obj2.price=2000;

//          boolean answer = obj1.equals(obj2) ;
//          System.out.println(answer); //true   
                
//    }   
// }

/**********************************************************/

// IN ABOVE CODE WE OVERRIDE equal() BY OURSELF WE CA DO USING IDE AS BELOW


//CASE => class can override object class hashCode(), toString(), equals()


 class laptop 
{
    String model ;
    int price ;
    

    @Override
    public String toString() {
        return "laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        laptop other = (laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    
}



public class _23_objectClass
{
   public static void main(String[] args)
   {
      laptop obj1 = new laptop();  
          obj1.model="dell";
          obj1.price=2000;

       System.out.println(obj1);  //Model: dell and price: 2000  
         
         laptop obj2 = new laptop();  
          obj2.model="dell";
          obj2.price=2000;

         boolean answer = obj1.equals(obj2) ;
         System.out.println(answer); //true   
                
   }   
}