public class Time {
    // Data members
    private int hr;
    private int min;
    private double sec;

    // Parameterized constructor
    public Time(int hr, int min, double sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    // Member function to show the time
    public void showTime() {
        System.out.println("Time: " + hr + " hours, " + min + " minutes, " + sec + " seconds");
    }

    // Polymorphic add function for adding minutes to the Time object
    public void addTime(int minutes) {
        min += minutes;
    }

    // Polymorphic add function for adding hours and minutes to the Time object
    public void addTime(int hours, int minutes) {
        hr += hours;
        min += minutes;
    }

    // Polymorphic add function for adding seconds to the Time object
    public void addTime(double seconds) {
        sec += seconds;
    }

    // Polymorphic add function for adding another Time object
    public void addTime(Time otherTime) {
        hr += otherTime.hr;
        min += otherTime.min;
        sec += otherTime.sec;
    }

    public static void main(String[] args) {
        // Create Time objects
        Time time1 = new Time(2, 30, 45.5);
        Time time2 = new Time(1, 15, 30.75);

        // Display original times
        System.out.println("Original Time 1:");
        time1.showTime();
        System.out.println("Original Time 2:");
        time2.showTime();

        // Add minutes to time1
        time1.addTime(10);
        System.out.println("\nTime 1 after adding 10 minutes:");
        time1.showTime();

        // Add hours and minutes to time2
        time2.addTime(1, 45);
        System.out.println("\nTime 2 after adding 1 hour and 45 minutes:");
        time2.showTime();

        // Add seconds to time1
        time1.addTime(20.5);
        System.out.println("\nTime 1 after adding 20.5 seconds:");
        time1.showTime();

        // Add another Time object to time2
        time2.addTime(time1);
        System.out.println("\nTime 2 after adding Time 1:");
        time2.showTime();
    }
}