public class Student {
    // Data members
    private String S_Name;
    private int Roll_No;
    private String Batch;
    private int Year_of_Adm;
    private String Stream;

    // Constructors

    // Constructor with only name and roll number
    public Student(String S_Name, int Roll_No) {
        this(S_Name, Roll_No, "DefaultBatch", 0, "DefaultStream");
    }

    // Constructor with name, roll number, and batch
    public Student(String S_Name, int Roll_No, String Batch) {
        this(S_Name, Roll_No, Batch, 0, "DefaultStream");
    }

    // Constructor with name, roll number, batch, and year of admission
    public Student(String S_Name, int Roll_No, String Batch, int Year_of_Adm) {
        this(S_Name, Roll_No, Batch, Year_of_Adm, "DefaultStream");
    }

    // Constructor with all data members
    public Student(String S_Name, int Roll_No, String Batch, int Year_of_Adm, String Stream) {
        this.S_Name = S_Name;
        this.Roll_No = Roll_No;
        this.Batch = Batch;
        this.Year_of_Adm = Year_of_Adm;
        this.Stream = Stream;
    }

    // Method to display data members
    public void showData() {
        System.out.println("Name: " + S_Name);
        System.out.println("Roll Number: " + Roll_No);
        System.out.println("Batch: " + Batch);
        System.out.println("Year of Admission: " + Year_of_Adm);
        System.out.println("Stream: " + Stream);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Student student1 = new Student("John Doe", 101);
        Student student2 = new Student("Jane Smith", 102, "CS");
        Student student3 = new Student("Bob Johnson", 103, "EE", 2022);
        Student student4 = new Student("Alice Brown", 104, "ME", 2021, "Mechanical");

        // Displaying data for each student
        student1.showData();
        student2.showData();
        student3.showData();
        student4.showData();
    }
}