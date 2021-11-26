package project1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chatbot extends JFrame {

	private JTextArea ca = new JTextArea();
	private JTextField cf = new JTextField();
	private JButton b = new JButton();
	private JLabel l = new JLabel();
	
	Chatbot(){
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(580, 520);
		f.getContentPane().setBackground(Color.red);
		f.setTitle("Chatbot");
		f.add(ca);
		f.add(cf);
		ca.setSize(500,410);
		ca.setLocation(1, 1);
		ca.setBackground(Color.WHITE);
		cf.setSize(500, 50);
		cf.setLocation(1,420);
		f.add(b);
		l.setText("SEND");
		b.add(l);
		b.setSize(500,50);
		b.setLocation(500, 420);
		
	    b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()== b) {
					
					String text= cf.getText().toLowerCase();
					ca.append("You -->"+text+ "\n");
					cf.setText("");
					
					if(text.contains("hi")) {
					  replyMeth("Hi there buddy");	
					}
					else if(text.contains("how are u ")) {
						replyMeth("am good :) how r u my friend?");
					}
					
					else if(text.contains("how u doing ")) {
						replyMeth("am good :) ");
					}
					else if(text.contains("what is ur name?? ")) {
						replyMeth("am chatbot");
					}
					else
						replyMeth("I cannot understand you");
						
					
						
					}
				
		
				}	
			
				
	    });
				
	}
	public void replyMeth(String s) {
		  ca.append("Chatbot -->"+s+ "\n");
	  }
	  	
}

