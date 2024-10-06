import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
public class Bgclr1 extends JFrame implements AdjustmentListener { 
Scrollbar red, green, blue; 
Color ci; 
int r1, g1, b1; 
public Bgclr1() { 
setLayout(new FlowLayout()); 
red = new Scrollbar(Scrollbar.HORIZONTAL, 1, 0, 0, 256); 
green = new Scrollbar(Scrollbar.HORIZONTAL, 1, 0, 0, 256); 
blue = new Scrollbar(Scrollbar.HORIZONTAL, 1, 0, 0, 256); 
add(red); 
add(green); 
add(blue); 
red.addAdjustmentListener(this); 
green.addAdjustmentListener(this); 
blue.addAdjustmentListener(this); 
setSize(600, 600); 
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
setVisible(true); 
} 
public void adjustmentValueChanged(AdjustmentEvent e) { 
r1 = red.getValue(); 
g1 = green.getValue(); 
b1 = blue.getValue(); 
repaint(); 
} 
public void paint(Graphics g) { 
super.paint(g); 
Font f = new Font("Arial", Font.BOLD, 20); 
g.setFont(f); 
ci = new Color(r1, g1, b1); 
g.drawString("Redvalue=" + r1, 50, 50); 
g.drawString("Greenvalue=" + g1, 100, 100); 
g.drawString("Bluevalue=" + b1, 150, 150); 
getContentPane().setBackground(ci); 
} 
public static void main(String[] args) { 
new Bgclr1(); 
} 
}

