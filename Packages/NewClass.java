Save by A.java, 
package pack; 
public class A { 
public void method(){ 
System.out.println("This is from previous class A."); 
} 
} 
Save by B.java, 
package pack; 
public class B{ 
public void method(){ 
System.out.println("This is from previous class B."); 
} 
} 
Save by c.java, 
package pack; 
public class c { 
public void method(){ 
System.out.println("I am from newly added class c."); 
} 
} 
Save by Assignment15.java, 
import pack.A; 
import pack.B; 
import pack.c; 
public class Assignment15 { 
public static void main(String[] args) { 
A o1=new A(); 
o1.method(); 
B o2=new B(); 
o2.method(); 
c o3=new c(); 
 
 
        o3.method(); 
    } 
} 




//javac CCA_Score.java
//javac Student.java
//javac CCAScore.java
//CCAScore.java