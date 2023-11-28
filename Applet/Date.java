import java.applet.Applet;
import java.awt.Graphics;
import java.util.*;
public class Date extends Applet
{
  public void paint(Graphics g) {
    Date CurrentDate = new Date();
    CurrentDate.toString();
    g.drawString("date: " + CurrentDate, 20, 20);
  }
}
/* <applet code="Main" height=300 width=400> </applet> */



// javac Main.java
// appletviewer Main.java



