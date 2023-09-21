package javaBasic_01;


public class _03_Literals {

	public static void main(String[] args) {
	int num1=0b101;
	System.out.println(num1);
	
	int num2=0x7E;
	System.out.println(num2);
	
	int num3=10_00_00_000;
	System.out.println(num3);
	
	float num4=56;
	System.out.println(num4);
	
	double num5=56;
	System.out.println(num5);
	
	double num6=12e10;
	System.out.println(num6);
	
	//boolean num7= 1;
	//System.out.println(num7);
	
	char c='a';
	System.out.println(c);
	c++;
	
	char c1='a';
	c1++;
	System.out.println(c1);
	}

}
/*
1)What is literal ?
2)difference ways of representation of integers using literal?
  a)decimal
  b)binary
  c)octal
  d)hexadecimal
3)underscore use as literal to separate digits
4)different literal use in real value

#1
literal is a source code representation of a fixed value. 
e.g 2000l -- represent long type of integers, 20.5f -- represent float 

#2
their are many ways to represent integer using literal:
 a)decimal 
  -- int num=10; int num=10004;

 b)binary
  -- int num=0b1010; int num=0b101
  -- here literal in binary must start with 0b or 0B.
 
 c)octal 
   -- int num=0123;
   -- literal in octal must start with 0.
 
 d)hexadecimal
   -- int num=0xA, int num=0x13B
   -- iteral in hexadecimal must start with 0x or 0X

#3
Underscore use as literal to separate digit 
-- int num=1_000_000; int num=3_45_78; int num=0b1010_1010;
-- float num=3.4_56f; double num=3.4_5;
-- underscore can be used between numbers to make it more readable

#4
different literal in real numbers
-- float num=4.55f; 
-- 4.5f is a float literal and f is a suffix 
-- double d=3.44e10; --meaning of 3.44e10 is 3.44x10^10
*/