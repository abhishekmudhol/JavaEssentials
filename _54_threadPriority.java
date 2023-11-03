
//  WANT TO EXECUTE "hi" AND "hello" ONE AFTER THE OTHER


// we cannot control our scheduler we only suggest our scheduler to give the priority 
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hello");

			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class _54_threadPriority {
    public static void main(String[] args) throws NumberFormatException {   
    	
    	A obj1=new A();
    	B obj2=new B();
    	
//    	obj2.setPriority(10);
//                OR
    	obj2.setPriority(Thread.MAX_PRIORITY); // using constant from Thread class

        System.out.println(obj2.getPriority()); // 10
    	System.out.println(obj1.getPriority()); //5 // - The range of priority goes from 1 to 10. & 5 IS DEFAULT priority
    	
    	obj1.start();   
    	try {                      
			Thread.sleep(2);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
        
    	obj2.start();
    }
    
}


/*
- Thread priority in Java
- How we can suggest a priority for a thread?
- Sleep() method in thread
- Waiting state in a thread


#1
- We cannot control the schedular, we can only give suggestions to it to give priority.
- getPriority() is a method that gives the current priority of a thread.
- The range of priority goes from 1 to 10. One is the least priority whereas ten is the maximum priority.
- 5 is the default priority or normal priority. By default, every thread has a normal priority which is 5.
- We can also change the priority by using the setPriority().
- Different schedulers have different algorithms to work upon so by giving priority, we can only give suggestions to it. 
- It might be possible that the scheduler gives the highest priority to the process that will execute in less time at the running phase.

#2
- We can also make a thread to wait for some time and then execute the statement further.
- Thread will wait by using the sleep() method.
- In the sleep() method, we have the pass value for how much time we want a thread to wait. The time will be in milliseconds.
- Sleep() method will throw an interrupted exception. So, we can handle an exception by using the try-catch block.
- When we use sleep(), then the thread goes into the waiting state.

- As a programmer, we can not control a thread, we can only optimise it.
*/