import javax.swing.*;
import java.awt.*;
public class Student extends JPanel {
 String name;
 int regno;
 double java, ds, maths, moral, nm;
 double total, average;
 String result;
 public Student() {
 name = "JOS";
 regno = 1200598;
 java = 85.0;
 ds = 98.0;
 maths = 76.0;
moral = 94.0;
 nm = 99.0;
 }
 public void paintComponent(Graphics g) {
 super.paintComponent(g);
 total = java + ds + maths + moral + nm;
 average = total / 5.0;
 if ((java >= 35) && (ds >= 35) && (maths >= 35) && (moral >= 35) && (nm >= 35))
{
 result = "PASS";
 } else {
 result = "FAIL";
 }
 g.drawString("NAME: " + name, 100, 50);
 g.drawString("RegNo: " + regno, 100, 100);
 g.drawString("Java: " + java, 100, 150);
 g.drawString("Data Structure: " + ds, 100, 200);
 g.drawString("Maths: " + maths, 100, 250);
 g.drawString("Moral: " + moral, 100, 300);
 g.drawString("Non Major: " + nm, 100, 350);
 g.drawString("Total Marks: " + total, 100, 400);
 g.drawString("Average: " + average, 100, 450);
 g.drawString("Result: " + result, 100, 500);
 }
 public static void main(String[] args) {
 JFrame frame = new JFrame("Student Marksheet");
 Student student = new Student();
 frame.add(student);
 frame.setSize(800, 800);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
}
