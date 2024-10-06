import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class RadioButton extends JFrame implements ItemListener { 
    private JRadioButton choice1, choice2, choice3, choice4, choice5; 
    private ButtonGroup group; 
    private JTextField text1; 

    public RadioButton() { 
        setTitle("Radio Selection"); 
        setSize(300, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new FlowLayout()); 
        
        String s = "List of UG degree"; 
        JLabel label = new JLabel(s, JLabel.CENTER); 
        add(label); 
        
        group = new ButtonGroup(); 
        choice1 = new JRadioButton("MBA", false); 
        choice1.addItemListener(this); 
        group.add(choice1); 
        add(choice1); 
        
        choice2 = new JRadioButton("MCA", false); 
        choice2.addItemListener(this); 
        group.add(choice2); 
        add(choice2); 
        
        choice3 = new JRadioButton("M.COM", false); 
        choice3.addItemListener(this); 
        group.add(choice3); 
        add(choice3); 
        
        choice4 = new JRadioButton("MSC", false); 
        choice4.addItemListener(this); 
        group.add(choice4); 
        add(choice4); 
        
        choice5 = new JRadioButton("MA", false); 
        choice5.addItemListener(this); 
        group.add(choice5); 
        add(choice5); 
        
        text1 = new JTextField(20); 
        add(text1); 
        
        setVisible(true); 
    } 

    @Override 
    public void itemStateChanged(ItemEvent e) { 
        JRadioButton selectedButton = (JRadioButton) e.getItemSelectable(); 
        if (selectedButton == choice1) { 
            text1.setText("MBA Selected"); 
        } else if (selectedButton == choice2) { 
            text1.setText("MCA Selected"); 
        } else if (selectedButton == choice3) { 
            text1.setText("M.COM Selected"); 
        } else if (selectedButton == choice4) { 
            text1.setText("MSC Selected"); 
        } else if (selectedButton == choice5) { 
            text1.setText("MA Selected"); 
        } 
    } 

    public static void main(String[] args) { 
        SwingUtilities.invokeLater(new Runnable() { 
            public void run() { 
                new RadioButton(); 
            } 
        }); 
    } 
}
