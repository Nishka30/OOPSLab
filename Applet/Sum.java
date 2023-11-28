import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Sum extends Applet implements ActionListener {
    TextField num1Field, num2Field;
    Button sumButton;
    Label resultLabel;
public void init() {
        num1Field = new TextField(10);
        num2Field = new TextField(10);
        sumButton = new Button("Calculate Sum");
        resultLabel = new Label("/n Result will be displayed here");
        sumButton.addActionListener(this);
        add(new Label("/n Enter first number: "));
        add(num1Field);
        add(new Label("/n Enter second number: "));
        add(num2Field);
        add(sumButton);
        add(resultLabel);
    }
public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sumButton) {
            try {
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());
     int sum = num1 + num2;
                resultLabel.setText("Sum: " + sum);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers.");
            }
        }
    }
}
/* <applet code="Main" height=300 width=400> </applet> */



// javac Main.java
// appletviewer Main.java
