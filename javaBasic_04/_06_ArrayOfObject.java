package javaBasic_04;



class Student
{
	int rollno;
	String name;
	int marks;	
}

public class _06_ArrayOfObject {
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
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].name+":"+students[i].marks);
		}
		
		
		
//		int nums[] = new int[6];
//		nums[0]=4;
//		nums[1]=8;
//		nums[2]=3;
//		nums[3]=9;
//		
//		for(int i=0;i<nums.length;i++)
//		{
//			System.out.println(nums[i]);
//		}
	}
}



/*
-- If we create array by default value assign for each type of array
-- The new operator automatically initializes the elements of an array to their default value, which, for example, is zero for all numeric types
and null for all reference types.
-- why we should we know length of array using length property?
-- There is array out of bound exception.

How to create array of object and what does it means?
-- just like to create array for int, float, char we can create array of object 
-- when we create array of object it means we create an array which can hold the reference of object.

e.g
class Student{

}

Student st=new Student();
we know st is reference and new Student() is object.
and st hold reference of student object.

similarly whenever we create array of object
Student sts[]=new Student[5];
it means we can create an array of Student reference type which can hold 5 different reference of
Student object.


sts[0]=new Student();
sts[1]=new Student();
sts[2]=new Student();
sts[3]=new Student();
sts[4]=new Student(); 
*/