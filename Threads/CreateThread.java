class MyThread extends Thread { 
public void run() {   //he run method is the entry point for the code that will be executed when a thread starts.
System.out.println("Thread ID: " + Thread.currentThread().getId());   /// Prints the ID of the current thread using Thread.currentThread().getId(). The getId() method returns a unique identifier for the current thread.
} 
} 
public class CreateThread { 
public static void main(String[] args) { 
for (int i = 0; i < 20; i++) { 
MyThread thread = new MyThread(); 
thread.start(); 
} 
} 
}
