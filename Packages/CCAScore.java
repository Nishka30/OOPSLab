//Save by CCA_Score.java
package pack; 
public interface CCA_Score{ 
int CCA_credit=5; 
void show_cca_cred(); 
}  
//Save by Student.java
package pack; 
public class Student { 
private String Name; 
private int Roll_No; 
public void get_data(String n,int r){ 
Name=n; 
Roll_No=r; 
} 
public void put_data(){ 
System.out.println("Name of student is:"+Name); 
System.out.println("Roll number of student is:"+Roll_No); 
} 
} 


//orignal program
import pack.Student;
import pack.CCA_Score; 

class Test_marks extends Student{ 
private static final String Sn = null; 
private float Marks1; 
private float Marks2; 
public void get_data(String n,int r,float a,float b) { 
super.get_data(n,r); 
Marks1=a; 
Marks2=b; 
} 
public void put_data(){ 
super.put_data(); 
System.out.println("1st marks of student is:"+Marks1); 
System.out.println("2nd marks of student is:"+Marks2); 
} 
} 
class Sem_Result extends Test_marks implements CCA_Score{ 
public void show_cca_cred() { 
System.out.println("Credit of the student is:"+CCA_credit); 
} 
public void put_data(){ 
super.put_data(); 
show_cca_cred(); 
} 
} 
public class CCAScore { 
public static void main(String[] args) { 
Sem_Result o1=new Sem_Result(); 
System.out.println("For first student:"); 
o1.get_data("Rohan", 19, 23.5f, 29.0f); 
o1.put_data(); 
System.out.println(); 
System.out.println("For second student:"); 
o1.get_data("Rohit", 20, 12.3f, 30.0f); 
o1.put_data(); 
} 
} 


//javac CCA_Score.java
//javac Student.java
//javac CCAScore.java
//CCAScore.java