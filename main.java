import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {
    	
    	SwingUtilities.invokeLater(new Runnable() {
    		public void run() {
    	    	JFrame frame = new MainFrame("My Title");
    	    	frame.setSize(1500, 1000);
    	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	    	frame.setVisible(true);
    		}
    	});
    }
}
