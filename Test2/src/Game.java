
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game 
{
    public static void main(String[] args) 
    {
        JLabel label = new JLabel();
        label.setText("HELLO , HOW ARE YOU ?");
        label.setHorizontalTextPosition(JLabel.CENTER);
        

        JFrame frame = new JFrame();
        frame.setTitle("New to JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
        //frame.setBackground(FFFF);
        ImageIcon image = new ImageIcon("C:\\Users\\jagde\\OneDrive\\Desktop\\StartJava\\IMAGES");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(123,50,250));
        frame.add(label);
    }

}
