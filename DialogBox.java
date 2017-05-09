//Simple java GUI

import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;
import java.awt.*;

public class DialogBox extends JFrame
{

	private JFrame mainFrame;
	private JTextField txtMessage;
	private JButton closeButton;
	
	public DialogBox()
	{
		mainFrame = new JFrame("Hola");
		txtMessage = new JTextField("Hello World");
		txtMessage.setEditable(false);
		closeButton = new JButton("Close Me");

		Container C = mainFrame.getContentPane();
		C.setLayout(new FlowLayout());
		
		C.add(txtMessage, BorderLayout.NORTH);
		C.add(closeButton, BorderLayout.SOUTH);
		
		mainFrame.setSize(500,500);
		
		mainFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		
		class ButtonsHandler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				
				if(e.getSource()==closeButton)
				{
					mainFrame.dispose();

					System.exit(0);
				}
				
			}
		}

		ButtonsHandler bhandler = new ButtonsHandler();
		
		
		closeButton.addActionListener(bhandler);
		mainFrame.setVisible(true);
		
		
	}
	
	public static void main(String[] args)
	{
		DialogBox GUI;
		GUI = new DialogBox();
	}
	
	
}