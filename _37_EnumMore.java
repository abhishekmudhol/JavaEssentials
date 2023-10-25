// We can not extend the enum with any other class.
//- In Java, enum extends the Enum class and also Object class hence we get methods like hashCode()

enum Laptop{
    //	Mackbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
        Mackbook(2000), XPS(2200), Surface, ThinkPad(1800); // this ALL are OBJECTS  we passing value means calling constructor of respective objecs 
        
        private int price;
        
        private Laptop()   //this constructor is for Surface which not passing values i.e. default constructor    
        {
            price=500;
        }
        
        private Laptop(int price) //constructor IS private becuz we creating object in same class itself. 
        {
            this.price=price;
            System.out.println("in Laptop" + this.name());
        }
        
        public int getPrice()            // ABLE TO USE method IN class laptop that is of type enum
        {
            return price;
        }
        public void setPrice(int price)
        {
            this.price=price;    
        }
    }
    
    public class _37_EnumMore {
        public static void main(String[] args) {
    
       	Laptop lap1 = Laptop.Mackbook;
       	System.out.println(lap1+ " : "+ lap1.getPrice()); // Mackbook : 2000
            
            for(Laptop lap : Laptop.values())
            {
                System.out.println(lap+" : "+lap.getPrice());
            }
        }
    }
    
    
/*
- Inheritance with the enum
- Super class of enum
- Enum and Constructor
- Object creation in an enum
- Important points used in the enum

#1
- We can not extend the enum with any other class.
- We can define constructors and methods in an enum. Creation of our constructors and variables is also possible in an enum.
- We can also define our data types through enum that are known as Enumerated Data Types.
- In Java, enum extends the enum class and we get all other methods present inside an enum through the enum class only.
- If we print the superclass of an enum class, then it will also return an enum.
 
 Status s= Status.Success;
 System.out.println(s.getClass().getSuperclass());

 - In an enum, every enum constant represents an object of type enum.

#2 
Enum and Constructor:
- enum contains a constructor and it is executed separately for each enum constant at the time of enum class loading.
- We can create a constructor in an enum that can take any parameter, and that value of a parameter might be different in every object of an enum.
- Instance variables in an enum are private and we can access them in another class by using getters and setters.
- We can print the value of all objects of an enum through a loop and .values() method is used to iterating over all objects.
- If any parameterized constructor is present inside an enum, then the default constructor will not be considered.
- We create private variables and private constructors in an enum because we use them or create an object for constructors in the same class only.
- The constructor in an enum will be called the number of times as much the number of objects created.
*/    