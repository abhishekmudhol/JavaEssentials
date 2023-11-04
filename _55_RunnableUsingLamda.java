
// IMPORATNT => WE DON'T NEED class A & class B NOW due to use of anonymous inner class with LAMDA EXPRESSION , we write work of class A & B IN anonymous inner class

public class _55_RunnableUsingLamda {
    public static void main(String[] args) throws NumberFormatException {   
    	
    	Runnable obj1 = () ->                         // directly implemeting Runnable interface here , becuz IT IS funtional interface
	                {
	                	for(int i=1;i<=5;i++)
	                	{
	                		System.out.println("Hi");
	                		try {
	                			Thread.sleep(10);
	                		}catch(InterruptedException e) {
	                			e.printStackTrace();
	                		}
	                	}
	                } ;
                      

    		Runnable obj2 = () ->                         // directly implemeting Runnable interface here , becuz IT IS funtional interface
	                {
	                	for(int i=1;i<=5;i++)
	                	{
	                		System.out.println("Hello");
	                		try {
	                			Thread.sleep(10);
	                		}catch(InterruptedException e) {
	                			e.printStackTrace();
	                		}
	                	}
	                } ;
    	
        Thread t1 = new Thread(obj1);  // it will do not known about obj1 & obj2 , one of Thread class constructor accept Runnable object so pass it in Thread constructor  
        Thread t2 = new Thread(obj2);
    	
    	t1.start(); 
    	t2.start();
    }
} 




// class A implements Runnable
// {
// 	public void run()
// 	{
// 		for(int i=1;i<=5;i++)
// 		{
// 			System.out.println("Hi");
// 			try {
// 				Thread.sleep(10);
// 			}catch(InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }

// class B implements Runnable
// {
// 	public void run()
// 	{
// 		for(int i=1;i<=5;i++)
// 		{
// 			System.out.println("Hello");

// 			try {
// 				Thread.sleep(10);
// 			}catch(InterruptedException e) {
// 				e.printStackTrace();
// 			}
// 		}
// 	}
// }