class MyRunnable implements Runnable { 
public void run() { 
try { 
System.out.println("Thread Name: " + Thread.currentThread().getName()); 
// Simulate some work 
Thread.sleep(1000); 
} catch (InterruptedException e) { 
e.printStackTrace(); 
} 
} 
} 
public class RunnableThreadExample { 
public static void main(String[] args) { 
for (int i = 1; i <= 10; i++) { 
Thread thread = new Thread(new MyRunnable()); 
thread.setName("Thread-" + i); 
thread.start(); 
} 
} 
} 
