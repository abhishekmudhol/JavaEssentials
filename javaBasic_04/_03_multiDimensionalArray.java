package javaBasic_04;

public class _03_multiDimensionalArray {
	public static void main(String[] args) {
		int nums[][]=new int [3][4];
		//int random=0;
		//int random=(int)Math.random()*100;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				nums[i][j]=(int)Math.random()*100;
				System.out.println(nums[i][j]);
			}
			System.out.println();
		}
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int n[]:nums)
		{
			for(int m:n)
			{
				System.out.println(m+" ");
			}
			System.out.println();
		}
	}
}

/*
1)what is multidimensional array?
2)Why do we need multidimension array?
3)How to create multidimension array?
4)How to access element of multidimension array?
5)how to use enhanced for loop and simple loop in multidimension array to traverse array element?

#1
what is multidimension array?
-- simple we can say it is array of array

-------------
| 1 | 2 | 3 |
-------------
| 4 | 5 | 6 |
-------------

Above is example of 2-d array which has 2 rows and 3 columns.
-- it seems to look like a bigger array consist two single dimension array.
-- just like we have 3-d array and array might be n-dimension.

#2
Why do we need multidimension array?
-- to solve some matrix problem to solve grid problem

#3
How to create multidimension in java?
-- different Ways to create array in java

  a)Literal notation
  Literal notation: int [][]arr = {{1, 2, 3},{4,5,6}};

  b)Object notation
  int [][]nums=new int[2][3];

-- general syntax for object notation:
-- dataType [][]arrayName=new dataType[rows][columns];

#4
how to access element of multidimension array element?
let we create 2d array arr
int [][]arr = {{1, 2, 3},{4,5,6}};
-------------
| 1 | 2 | 3 |
-------------
| 4 | 5 | 6 |
-------------

-- there are two rows whose index are 0,1 and columns are 0,1,2.
-- want to access 2 which are at row 0 and columns 1
-- System.out.println(arr[0][1]); //give 2 

simple if you want to access element at ith row and jth column then;
arr[i][j]; //it is value at that position

#5
How to use enhanced for loop 

for  array name arr:
-- using for loop traverse all element
-- arr.length give number of rows and arr[0].length give number of column in first row 
for(int i=0;i < arr.length;i++){
    for(int j=0;j < arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}

using enhanced for loop:
for(int x[]: arr){
    for(int y:x){
        System.out.print(y+" ");
    }
    System.out.println();
}

general syntax for enhanced for-loop 
for(dataType singleDimension[]: twoDimension){
    for(dataType element: singleDimension){
        System.out.println(element);
    }
}
*/