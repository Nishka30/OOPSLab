class Employee { 
int ECode; 
String EName; 
String ContactNo; 
double BasicSal; 
double GrossSal; 
String Dept; 
public Employee(int ECode, String EName, String ContactNo, double BasicSal, String Dept) { 
this.ECode = ECode; 
this.EName = EName; 
this.ContactNo = ContactNo; 
this.BasicSal = BasicSal; 
this.Dept = Dept; 
this.GrossSal = computeTotSalary(); 
} 
public double computeTotSalary() { 
return BasicSal; 
} 
public void calcBonus(double bonusAmount) { 
} 
public void showData() { 
System.out.println("Employee Code: " + ECode); 
System.out.println("Employee Name: " + EName); 
System.out.println("Contact Number: " + ContactNo); 
System.out.println("Basic Salary: " + BasicSal); 
System.out.println("Department: " + Dept); 
System.out.println("Gross Salary: " + GrossSal); 
} 
} 
class Manager extends Employee { 
public Manager(int ECode, String EName, String ContactNo, double BasicSal, String Dept) { 
super(ECode, EName, ContactNo, BasicSal, Dept); 
} 
public double computeTotSalary() { 
double bonus = 0.15 * BasicSal; 
calcBonus(bonus); 
return BasicSal + bonus; 
} 
public void calcBonus(double bonusAmount) { 
System.out.println("Bonus Amount for Manager: " + bonusAmount); 
} 
} 
class Engineer extends Employee { 
public Engineer(int ECode, String EName, String ContactNo, double BasicSal, String Dept) { 
super(ECode, EName, ContactNo, BasicSal, Dept); 
} 
public double computeTotSalary() { 
return BasicSal; 
} 
} 
class Clerk extends Employee { 
public Clerk(int ECode, String EName, String ContactNo, double BasicSal, String Dept) { 
super(ECode, EName, ContactNo, BasicSal, Dept); 
} 
public double computeTotSalary() { 
return BasicSal; 
} 
} 
public class Employee1 { 
public static void main(String[] args) { 
Manager manager = new Manager(101, "John Smith", "123-456-7890", 50000, "Management"); 
Engineer engineer = new Engineer(201, "Alice Johnson", "987-654-3210", 45000, "Engineering"); 
Clerk clerk = new Clerk(301, "Bob Brown", "555-555-5555", 35000, "Administration"); 
manager.showData(); 
System.out.println("-----------------------"); 
engineer.showData(); 
System.out.println("-----------------------"); 
clerk.showData(); 
} 
}