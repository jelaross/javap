import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.awt.image.*; 
import javax.imageio.*; 
import java.io.*; 

public class Picture extends JPanel implements MouseListener { 
    private int x, y; 
    private Image img; 

    public Picture() { 
        super(); 
        addMouseListener(this); 
        try {
            img = ImageIO.read(new File("1.jpg")); // Load image with error handling
        } catch (IOException e) {
            e.printStackTrace();
            img = null; // Handle case where image can't be loaded
        }
    } 

    @Override 
    protected void paintComponent(Graphics g) { 
        super.paintComponent(g); 
        g.drawString("x-axis=" + x + ", y-axis=" + y, x, y); 
        if (img != null) {
            g.drawImage(img, x, y, this); // Ensure img is loaded before drawing
        }
    } 

    @Override 
    public void mouseClicked(MouseEvent me) { 
        x = me.getX(); 
        y = me.getY(); 
        repaint(); 
    } 

    // Unused MouseListener methods 
    @Override 
    public void mouseEntered(MouseEvent me) {} 
    @Override 
    public void mouseExited(MouseEvent me) {} 
    @Override 
    public void mousePressed(MouseEvent me) {} 
    @Override 
    public void mouseReleased(MouseEvent me) {} 

    public static void main(String[] args) { 
        SwingUtilities.invokeLater(new Runnable() { 
            public void run() { 
                createAndShowGUI(); 
            } 
        }); 
    } 

    private static void createAndShowGUI() { 
        JFrame frame = new JFrame("Picture App"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Picture panel = new Picture(); 
        frame.add(panel); 
        frame.setSize(600, 600); 
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true); 
    } 
}
