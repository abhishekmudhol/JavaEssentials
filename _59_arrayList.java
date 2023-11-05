// ArrayList has various method


// import java.util.ArrayList;
// import java.util.Collection;


// public class javaArrayList 
// {
//    public static void main(String[] args) 
//    {
//        Collection <Integer> nums = new ArrayList<Integer>(); // <> :- generics // Integer is class which is wrapper class for int type
// //                                                      collection normally works OBJECT not PRIMITIVE values if we have to store interger numberes we have to use class Integer 
//        nums.add(1); // 1,2,3,4 are Object not interger HERE
//        nums.add(2);
//        nums.add(3);
//        nums.add(4);
//       // nums.add("5")  //compiletime ERROR if Integer generics are use
      
      
// //       System.out.println(nums); //[1, 2, 3, 4]


//          for( int n : nums)              //IN collection API or collection interface we don't have INDEX 
//          {
//             System.out.print(n + " "); // 1 2 3 4
//          }

//         //  for(Object n:nums) // if we not USING generics
//         //  {
//         //      int num =(Integer)n;
//         //      System.out.print(num + " "); // 1 2 3 4	
//         //  }
//    } 
// }
/**********************************************************/
/* 
    1. ArrayList is class which implements List
    2. List works with INDEX

IMPORTANT => List supports duplicate values    

USECASE => 1. for ADD & FETCH values use Collection 
           2. for working with INDEX values use List   
*/
import java.util.ArrayList;
import java.util.List;

public class _59_arrayList {
    public static void main(String[] args){   
    	
//    	Collection<Integer> nums= new ArrayList<Integer>(); 
//  	Collection nums=new ArrayList();
    	List<Integer> nums=new ArrayList<Integer>();
    	nums.add(6);  // 'e' is given by vs code it means element
    	nums.add(5);
    	nums.add(8);
    	nums.add(2);
    	//nums.add("5");
    	
    	System.out.println(nums.get(2)); // 8
    	
    	System.out.println(nums.indexOf(2)); // 3
    	
        for(int n:nums)
        {
            System.out.println(n);	
        }
    
    }
}



/**********************************************************/
/*
- Collection in Java
- Use of collection interface and classes
- What is the use of Generics?
- ArrayList and its properties
- How ArrayList is different from Arrays?
- Advantages of Collection framework

#1
The collection interface belongs to java.util.Collection package. All classes and methods of collection interface belong to this java.util package.
- API means a library or some features that we can use directly, we do not need to define an implementation for it.
- Collections List, Queue, Map and Set simply extend the Collection interface and this collection interface must have its own class implementation.
- we can also convert a collection into an array.
- ArrayList is used like:
 Collection nums=new ArrayList(); 
 nums.add(6);
- We can add values in a collection by using the add() method.
-- We do not have indexing for the collection API.
- In the array, we need to specify its type of it. While Collection API works with objects.
- All the data types classes like integer and float extend an object class and thus collection API directly use an object.

#2
- To define the data types in collection API, we use Generics.
- You can define the type of an object to which data type class it belongs in angular brackets like:
 Collection(Integer) nums= new ArrayList Integer ();
- Here, we use Integer as it is a class, while int is a primitive data type.
- If we do not specify the datatype of a collection object, then it will give a run-time error.

#3
- ArrayList is a class that implements a list. The list does not have a method called get because it list works with an index in the values.
-  It uses a dynamic array to store the duplicate element of different data types. 
- The ArrayList class maintains the insertion order and is non-synchronized. 
- The elements stored in the ArrayList class can be randomly accessed. 
- The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection. 
- If you want to use and fetch values from an ArrayList, then you can use Collection.
 Collection Integer nums= new ArrayList Integer ();
- If you want to work with an index value, you should use List as it supports index values.
 List Integer  nums= new ArrayList Integer ();

#4 Advantages of Collection Framework:
- Consistent API
- Reduces programming efforts
- Increases program speed and quality
*/