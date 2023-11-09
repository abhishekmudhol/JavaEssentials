


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;

public class _64_forEachMethod {
    public static void main(String[] args){   
    	
    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
/***********************************************************/    	
   	//     Consumer<Integer> con=new Consumer<Integer>() {      //forEach method takes an object of the consumer interface
   		
   	// 	public void accept(Integer n)
   	//     {   
   	// 		System.out.println(n);
   	// 	}
   	//   };
    	
    //     nums.forEach(con);
        
/***********************************************************/
//                           OR                 

    //Consumer<Integer> con= n -> System.out.println(n);    // NO NEED TO WRITE Integer WITH 'n'
 
/***********************************************************/
//                           OR 

     nums.forEach(n -> System.out.println(n));

/***********************************************************/


 //  	nums.forEach(null);
 //   	nums.forEach(con);
    	
    	
    //nums.forEach(n -> System.out.println(n));
    	
    } 
}
/*
- forEach method in Java
- What is a consumer interface?
- Lambda expression with consumer object
- How forEach method works?


#1
- forEach method got introduced in Java 1.8 version.
- The forEach() method of ArrayList is used to perform a certain operation for each element in ArrayList.
- forEach traverses each element of the Iterable until all the elements have been processed.
- Collection classes that extend the Iterable interface can use forEach loop to iterate elements.

#2
- forEach method takes an object of the consumer.
- Consumer is an interface that belongs to the java.util.function package.
- Consumer is a functional interface so lambda expression will also be applicable to it.
- Consumer has a method accept(), that takes a value of the same type of which object is created.

- forEach needs an object and we will pass an object of a consumer in it.
- forEach gives a value at a time and that value gets passed to the consumer object and taken by the accept method.
- We can do operations in this accept method.
*/