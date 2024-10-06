import java.awt.*; 
import javax.swing.*; 
public class Gridlayout1 extends JFrame { 
public Gridlayout1() { 
setLayout(new GridLayout(5, 2)); 
Button b1 = new Button("Abisha"); 
Button b2 = new Button("Ajitha"); 
Button b3 = new Button("Dency"); 
Button b4 = new Button("Gercy"); 
Button b5 = new Button("Preethi"); 
Button b6 = new Button("Karthika"); 
Button b7 = new Button("Kavitha"); 
Button b8 = new Button("Libarin"); 
Button b9 = new Button("Manju"); 
Button b10 = new Button("Suganya"); 
add(b1); 
add(b2); 
add(b3); 
add(b4); 
add(b5); 
add(b6); 
add(b7); 
add(b8); 
add(b9); 
add(b10); 
setSize(400, 400); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setVisible(true); 
} 
public Insets getInsets() { 
return new Insets(20, 20, 20, 20); 
} 
public static void main(String[] args) { 
new Gridlayout1(); 
} 
}
