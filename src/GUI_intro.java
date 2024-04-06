import javax.swing.JOptionPane;
public class GUI_intro {

	public static void main(String[] args) {
		// GUI = Graphical User Interface
		
	String name = JOptionPane.showInputDialog("Enter your name");
	JOptionPane.showMessageDialog(null, "Hello "+name);

	int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
	
	double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
	JOptionPane.showMessageDialog(null,  "You are "+height+" cm tall");
	}

}
