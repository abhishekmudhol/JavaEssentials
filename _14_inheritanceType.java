


class Calc
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	public int sub(int n1, int n2)
	{
		return n1-n2;
	}
}


class AdvCalc extends Calc
{
	public int multi(int n1, int n2)
	{
		return n1*n2;
	}
	public int div(int n1, int n2)
	{
		return n1/n2;
	}
}

//class VeryAdvCalc extends Calc
class VeryAdvCalc extends AdvCalc
{
	public double power(int n1,int n2)
	{
		return Math.pow(n1, n2);
	}
}

public class _14_inheritanceType
{
	public static void main(String a[]) 
	{
//		Calc obj=new Calc();
//		AdvCalc obj=new AdvCalc();
		VeryAdvCalc obj=new VeryAdvCalc();
		
		int r1=obj.add(4, 5);
		int r2=obj.sub(7,3);
		int r3=obj.multi(5,3);
		int r4=obj.div(15,4);
		double r5=obj.power(4,2);
		
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
		
	}
}


/*
- Types of inheritance in Java
- Single inheritance in Java
- Multilevel inheritance in Java
- Examples related to single and multilevel inheritance


Single Inheritance:-
- In single inheritance, subclasses inherit the features of one superclass. 
- Only one parent class exists in single inheritance.
- It is when there are only two classes.
e.g., 
Calc class inherits the properties of AdvCalc class.
Here, Calc - child class
     AdvCalc - parent class


Multi-level inheritance:-
- In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes.
- More than one parent class exists in multilevel inheritance.
- It is when we have multiple layers in between the classes.
e.g.,
Calc class inherits the properties of AdvCalc and further AdvCalc inherits the properties of VeryAdvCalc.
Here, Calc - child class
     AdvCalc - parent class of Calc & child class of VeryAdvCalc
     VeryAdvCalc - parent class of both other classes
*/