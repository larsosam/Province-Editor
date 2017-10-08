import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
    public MainFrame(String title) {
    	super(title);
    	
    	//Set Layout Manager
    	setLayout(new BorderLayout());
    	
    	//Create Swing Components
    	final JTextArea textArea = new JTextArea();
    	JButton button = new JButton("Click ME!");
    	
    	//Add Swing Components to Content Pane
    	Container c = getContentPane();
    	
    	c.add(textArea, BorderLayout.CENTER);
    	c.add(button, BorderLayout.SOUTH);
    	
    	//Add behavior
        button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("Hello\n");
				
			}
        	
        });
    }
}
