//Comparotor =>is interface USING which we can SPECIFY own logic for SORTING
// WE ARE CHANGING WAY IT SORT VALUE i.e. if we want to specify our own logic WE HAVE TO PASS object OF comparator
//comparable => GIVE power to class which implements it to COMPARE IT OBJECT TO ITSELF

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


//class Student implements Comparable<Student>
class Student
{
	int age;
	String name;
	
	public Student(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public String toString() {
		return "Student [age=" + age + ", name=" +name +"]";
	}

    // @Override
    // public int compareTo(Student that)
    // {
    //    // return 0;
    //    if(this.age >that.age)
	// 		return 1;
	// 	else
	// 		return -1;
    // }   
}    

public class _62_comparatorVsComparable {
    public static void main(String[] args){   
    	
   	// Comparator<Integer> com=new Comparator<Integer>()   //implementing interface Comparator using anonymous class 
   	// {
   	// 	public int compare(Integer i,Integer j)        // NOT int i OR int j USE CLASS NAME BECUZ collection works with WRAPPER CLASS
   	// 	{
   	// 		if(i%10 >j%10)
   	// 			return 1;                      // 1 means it will swap
   	// 		else
   	// 			return -1;
   	// 	}
   	// };	
    	
   	// List<Integer> nums= new ArrayList<>();
   	// nums.add(43);
   	// nums.add(31);
   	// nums.add(72);
   	// nums.add(29);
    
    // Collections.sort(nums , com);   // Collections CLASS has sort() method
   	// System.out.println(nums);       //[31, 72, 43, 29]
    


   	Comparator<Student> com1 =new Comparator<Student>()
   	{
   		public int compare(Student i,Student j)
   		{
   			if(i.age >j.age)
   				return 1;      // swap
   			else
   				return -1;
   		}
   	};
/**********************************************************/
//           ABOVE CODE USING A lamda expression

   	Comparator<Student> com2 =  (Student i,Student j) ->
   		{
   			// if(i.age >j.age)
   			// 	return 1;      // swap
   			// else
   			// 	return -1;

            return i.age > j.age?1:-1;
   		};
   	       
//  Comparator<Student> com2 = (i,j) -> i.age > j.age?1:-1;   // ABOVE CODE IN SINGLE LINE

/**********************************************************/
    List<Student> studs= new ArrayList<>();
    studs.add(new Student(21,"Navin"));
    studs.add(new Student(12,"John"));
    studs.add(new Student(18,"Parul"));
    studs.add(new Student(20,"Kiran"));

    System.out.println(studs);     //[Student [age=21, name=Navin], Student [age=12, name=John], Student [age=18, name=Parul], Student [age=20, name=Kiran]]
    
    // for(Student s:studs)
    // { 
    //     System.out.println(s);        
    // }
/**********************************************************/ 
    /*IMPORTANT */ 
//  Collections.sort(studs);   // ERROR => we not implements Comparable with Student class i.e. when we using Integer it implements Comparable HENCE BY default sort() works with Integer

    /*AFTER implements Comparable WITH Student class */
//    Collections.sort(studs);
/**********************************************************/

    Collections.sort(studs , com1);


      for(Student s:studs)
    { 
        System.out.println(s);      // PRINTS SORTED VALUES HERE 
    }

    }
}
/*
- What is Comparator in Java?
- How to give your implementation for sorting?
- What is Comparable in Java?
- Difference between Comparable & Comparator


#1
- From the Java 1.7 version, it is not compulsory to mention the generic type on the right-hand side if you have already mentioned it on the left-hand side.BUT WIRH anonymous class it is compulsory to mention it at right-hand side also  
 
- A collection class has lots of methods. The collection class belongs to the util package.
- We can sort a list or an ArrayList by using the method sort of collection class
 Collections.sort();
- If we want to apply our own logic in sorting, then we have to use a comparator with sorting in collections.
- Comparator is also an interface.
- We have a method called compare() in the comparator interface.
- We can use an interface by implementing a class or through an anonymous class.
- Compare method works on an algorithm where it compares two values and then swaps them.
 Comparator Integer com= new Comparator Integer()
 {
  public int compare(Integer i, Integer j)
  {
   statements;
  }
 };
- So, a comparator is an interface through which you can specify your own concept of sorting.

#2
- Integer class implements a Comparable interface. So by default, sort works for Integer.
- If you want to do natural sorting on any other non-defined class, you can implement something called the Comparable.
- Comparable is present in the lang package.
- Comparable has a method known as compareTo(). 
- You have to define the method comapreTo() in a class, that is implementing Comparable.
 class Student implements Comparable Student
 {
  public int compareTo( Student that){
   statements;
  }
 }
Here, that is a variable.
- We can also override the logic by using Comparator even if we have implements the Comparable interface.
- Lambda expression can also be used with Comparator as it is a functional interface.

 #3
Difference between Comparable & Comparator:
- Comparable provides a single sorting sequence while the Comparator provides multiple sorting sequences.
- In Comparable, actual gets modified while in Comparator, the original class does not get affected.
- Comparable gives the compareTo() method for sorting while Comparator gives the compare() method to sort elements.
*/