Save by A.java, 
package pack; 
public class A { 
public void method(){ 
System.out.println("This is from public class A."); 
} 
} 
Save by B.java, 
Save by Assignment14.java, 
package pack; 
class B{ 
public void method(){ 
System.out.println("This is from non public class B."); 
} 
} 
import pack.A; 
public class Assignment14 { 
public static void main(String[] args) { 
A o1=new A(); 
o1.method(); 
B o2=new B(); 
o2.method(); 
} 
} 


//javac CCA_Score.java
//javac Student.java
//javac CCAScore.java
//CCAScore.java