package javaBasic_04;

class Student
{
	int rollno;
	String name;
	int marks;	
}

public class _07_EnhancedForLoop {
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.rollno=1;
		s1.name="Navin";
		s1.marks=88;
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Harsh";
		s2.marks=67;
		
		Student s3=new Student();
		s3.rollno=3;
		s3.name="Kiran";
		s3.marks=97;
		
		System.out.println(s1.name + ":"+ s1.marks);
		
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
//		for(int i=0;i<students.length;i++)
//		{
//			System.out.println(students[i].name+":"+students[i].marks);
//		}

/************************Enhanced forloop*******************/

		for(Student stud: students)         
		{
			System.out.println(stud.name +":"+stud);
		}
		
/**********************************************************/        
		
		int nums[]=new int[4];
		nums[0]=4;
		nums[1]=8;
		nums[2]=3;
		nums[3]=9;
		
//		for (int i=0;i<nums/length;i++)
//		{
//			System.out.println(nums[i]);
//		}
		
		for(int n: nums)
		{
			System.out.println(n);
		}
		
	}
}


/*
1)why do we need enhanced for loop if we have many different loop.
2)enhanced for loop use to iterate values of arrays and collection

#1
why do we need enhanced for loop ?
-- As of Java 5, the enhanced for loop was introduced. This is mainly used to traverse a collection of elements including arrays.
-- for traversing any collection and arrays without index we can use enhanced for loop.
-- syntax does not need increment statement, condition check statement .this can automatically iterate  the array or collection without need of index.

#3
-- enhanced for loop can be used in array and collection to iterate the object
syntax 
 int nums[]=new int[4];
        for(int n:nums){
            System.out.println(n);
        }

for curiosity:
e.g use of enhanced for loop in collection
ArrayList al=new ArrayList();
al.add(10);
al.add(20);
al.add(30)
for(Object o:al){
    System.out.println(o);
}

Note: Do not confuse yourself with collection in upcoming lecture we will discussing the collection.
*/