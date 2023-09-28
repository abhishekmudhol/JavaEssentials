class Human
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="ram";
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}
	
//	public void SetAge(int a)
//	{
//		age=a;
//	}
	
//	public int abc()
//	{
//		return age;
//	}
//	public void xyz(int a)
//	{
//		age=a;
//	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
//	public void setName(String n)
//	{
//		name=n;
//	}
}

public class _05_getterAndSetter {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
//		obj.xyz(30);
		obj.SetAge(30);
		obj.setName("krishna");
//		obj.age=11;
//		obj.name="Navin";
		
//		System.out.println(obj.abc()+" : "+obj.getAge());
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}

/*
Setters and getters in Java
- What are setters?
- What are getters?
- 
Shortcut for writing getters and setters in vscode:-

- The name of a method should define the objective of the model.
- For every variable, we have two things: Setters and Getters methods inside a class in Java programming. 
- Getter and Setter are methods used to protect your data and make your code more secure.
- Getter and Setter make the programmer convenient in setting and getting the value for a particular data type.
- In both getter and setter, the first letter of the variable should be capitalised.

Getters:-
- If you want to get the value of a method, we use getters.
= public int getAge();

Setters:-
- To set the value in a method, we use overloading.
= public void setAge()

- There is no complusion that there should be all methods and variables inside the class.

Shortcut for writing getters setters in vscode:-
= Right-click on the editor - source action or insert code - Generate getters and setters.
*/