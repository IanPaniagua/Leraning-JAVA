package JFrame;
import javax.swing.JFrame;


public class main {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to

        JFrame frame = new JFrame(); // cerates a frame
        frame.setTitle("JFrame title goes here");
        frame.setSize(420,420); //set dimensions
        frame.setVisible(true); //make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
