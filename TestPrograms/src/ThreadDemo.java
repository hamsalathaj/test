
public class ThreadDemo {

	public static void main (String[] args) throws Exception {
		Thread t1 = new Thread (
		//Lamda Expression for functional interface	
		//We can set name of threads here only		
		() ->{
			for (int i=1;i<5;i++){
				//Get the priority of current thread
				System.out.println("Hi" + " " + Thread.currentThread().getPriority());
				try { Thread.sleep(500);}catch(Exception e){};
			}
		}, "HI THREAD");
	
		Thread t2 = new Thread (
				//Lamda Expression for functional interface		
				() ->{
					for (int i=1;i<5;i++){
						System.out.println("Hello");
						try { Thread.sleep(500);}catch(Exception e){};
					}
				});
		//set priority of the thread
		//Instead of using number use default values
		//Min=1,max=10,norm=5
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		
		t1.start();
		try { Thread.sleep(1000);}catch(Exception e){};
		t2.start();
		
		//This will not create a thread runs as normal execution
		//t1.run();
		//t2.run();
		
		//Checks if thread is running or not and gives boolean output
		//it gives true as t1 is still running
		System.out.println(t1.isAlive());
		
		//This executes in between t1 and t2 as main is also a thread so use join
		//Join will help t1 to join main thread and similarly t2
		//Join throws exception so handle it
		System.out.println("join");
		t1.join();
		t2.join();
		System.out.println("Done joining");
		
		//Checks if thread is running or not and gives boolean output
		//Gives false as t1 is not running
		System.out.println(t1.isAlive());
		
		//set and getName methods
		System.out.println(t1.getName());
		t1.setName("Hi thread");
		System.out.println(t1.getName());
	}
}
