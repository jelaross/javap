import java.awt.*; 
import javax.swing.*; 
public class BouncingBall extends JPanel implements Runnable { 
int x = 600, y = 200, r = 100; 
int dx = 11, dy = 7; 
Thread animator; 
volatile boolean pleaseStop; 
public BouncingBall() { 
setPreferredSize(new Dimension(250, 250)); 
} 
public void paintComponent(Graphics g) { 
super.paintComponent(g); 
g.setColor(Color.orange); 
g.fillOval(x - r, y - r, 2 * r, 2 * r); 
} 
public void animate() { 
Rectangle bounds = getBounds(); 
if ((x + dx) < 0 || (x + dx) > bounds.width) { 
dx = -dx; 
} 
if ((y + dy) < 0 || (y + dy) > bounds.height) { 
dy = -dy; 
} 
x += dx; 
y += dy; 
repaint(); 
} 
public void run() { 
while (!pleaseStop) { 
animate(); 
try { 
Thread.sleep(30); 
} catch (InterruptedException e) { 
Thread.currentThread().interrupt(); 
} 
} 
} 
public void start() { 
animator = new Thread(this); 
pleaseStop = false; 
animator.start(); 
} 
public void stop() { 
pleaseStop = true; 
} 
public static void main(String[] args) { 
JFrame frame = new JFrame("Bouncing Ball"); 
BouncingBall bouncingBall = new BouncingBall(); 
frame.add(bouncingBall); 
frame.pack(); 
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
frame.setVisible(true); 
bouncingBall.start(); 
} 
}
