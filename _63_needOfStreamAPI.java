// some time we perform operation on list BY WHICH original value get change , instead of doing this we have Stream API

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _63_needOfStreamAPI {
    public static void main(String[] args){   
    	
    	List<Integer> nums= Arrays.asList(4,5,7,3,2,6); // - asList() is a method that gives a list asList() belongs to a class Arrays.
    	
        System.out.println(nums); //[4, 5, 7, 3, 2, 6]

/********************PRINTING VALUES*****************************/        

//    	for(int i=0;i<nums.size();i++)          // size()
//    	{
//    		System.out.println(nums.get(i));
//    	}
    	
    	
//    	for(int n: nums)
//    	{
//    		System.out.println(n);
//    	}
    	
    	nums.forEach(n -> System.out.println(n)); // forEach() is PART OF List interface
    	
/************************************************************/            	
    	int sum=0;
    	for(int n:nums)
    	{
    		if(n%2==0)
    		{
    			n=n*2;
    			sum=sum+n;
    		}
    	}
    	
//    	System.out.println(nums);
    	System.out.println(sum);  // 24
  
    }
}
/*
- What is Stream API?
- Method in a stream interface
- Difference between normal and enhanced for loop
- forEach method in a list interface


#1
- Stream API is the concept introduced in Java 1.8 version.
- The Stream API is used to process collections of objects. 
- Stream is a sequence of objects that supports various methods to produce the desired result.
- asList() is a method that gives a list that belongs to a class Arrays.
- Stream is an interface that belongs to java.lang package.
- Stream interface provides a lot of methods like filter(), map(), reduce(), etc.
- A stream is not a data structure instead it takes input from Collections like arrays.

#2
- Normal for loop iterates over the elements one by one whereas enhanced for loop array itself give a value and that value goes into a variable say n.
- We can also print all the values present in an array by using the forEach method(). 
- forEach method gives one value at a time and we can save that value in a variable say n and print it.
 nums.forEach( n- System.out.println(n));
- forEach method is part of a list interface, that gives one value at a time and then you can perform operations on it.
*/