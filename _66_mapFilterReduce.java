


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class _66_mapFilterReduce {
    public static void main(String[] args){   
    	
    List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
    	
    Predicate<Integer> p= new Predicate<Integer>() 
    {
   		public boolean test(Integer n)
        {
   			return n%2==0;
   			// if(n%2==0)
   			// 	return true;
   			// else
   			// 	return false;
   		}
   	};
    	
         int result=nums.stream()
   					.filter(p)       // pass object of Predicate here 
   					.map(n->n*2)
   					.reduce(0, (c,e)-> c+e);
   	System.out.println(result);     // 24

/***********************************************************/    
//                        OR (using a lamda expression)          

//    	Predicate<Integer> p= n-> n%2==0;
    

        //    	int result=nums.stream()
//    					.filter(n-> n%2==0)   // becuz p = n-> n%2==0
//    					.map(n->n*2)
//    					.reduce(0, (c,e)-> c+e);
//    	System.out.println(result);
/***********************************************************/


//                          map

//    	Function<Integer, Integer> fun= new Function<Integer,Integer>() {
//    		public Integer apply(Integer n) {
//    			return n*2;
//    		}
//    	};
    	
//    	Function<Integer,Integer> fun= n-> n*2;
 	
    	
//    	int result=nums.stream()
//    					.filter(n-> n%2==0)
//    					.map(n->n*2)
//    					.reduce(0, (c,e)-> c+e);
//    	System.out.println(result);
 
/***********************************************************/

//                           reduce       reduce() method:-
//                                            - Reduce method takes two parameters, one is the type and the second is the BinaryOperator for operation.
//                                            - BinaryOperator extends the BiFunction and it calls a method to apply.

//    	int result=nums.stream()
//    					.filter(n-> n%2==0)
//    					.map(n->n*2)
//    					.reduce(0, (c,e)-> c+e);
//    	System.out.println(result);

/***********************************************************/


//    	Stream<Integer> sortedValues = nums.stream()
//    			                           .filter(n-> n%2==0)
//    			                           .sorted();
    	
//      Stream<Integer> sortedValues = nums.parallelStream()      //parallelStream() used with the filter that creates multiple threads to work faster.
//      		                           .filter(n-> n%2==0)
//      		                           .sorted();             //parallelStream should not be used with a sorted method as sorting requires all the elements together, so there multiple threads will create an ambiguity. 
    	
//      sortedValues.forEach(n -> System.out.println(n));


    }
}
/*
- Working of the filter method
- What is a predicate method
- Map method and its working
- How reduce method works?
- Sorted and ParallelStream methods with stream


#1
filter() method:-
- filter method needs an object as a parameter of type Predicate.
- Predicate is an interface that contains a method called test which returns a boolean value.
- When you apply the filter method on a value, if it satisfies the condition then it goes further otherwise stops.

#2
map() method:-
- Map needs an object of a functional and it is a functional interface.
- It contains a method called apply(). In apply method, we can do the desired operation on a value.
- Function takes two types, one what is accepted and the other that it returns.

#3
reduce() method:-
- Reduce method takes two parameters, one is the type and the second is the BinaryOperator for operation.
- BinaryOperator extends the BiFunction and it calls a method to apply.

#4
sorted() and parallelStream() method:-
- By using the sorted() method with a stream, it will return a sorted stream.
- There is a method called parallelStream() used with the filter that creates multiple threads to work faster.
- parallelStream should not be used with a sorted method as sorting requires all the elements together, so there multiple threads will create an ambiguity. 
*/