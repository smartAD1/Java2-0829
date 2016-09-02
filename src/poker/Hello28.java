package poker;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Hello28 extends JFrame implements ActionListener{
 private JButton open,save,exit;
 
	public Hello28(){
		
		super("Window");
		
		setLayout(new FlowLayout());
		
		open = new JButton("OPEN");
		save = new JButton("SAVE");
		exit = new JButton("EXIT");
		
		add(open);add(save);add(exit);
		open.addActionListener(this);
		open.addActionListener(new MyListener());
		open.addActionListener(new ActionListener() {
//		save.addActionListener(new MyListener());
//		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("test");
				
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		new Hello28();
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== open){
			System.out.println("Open");
		}else if (e.getSource() == save){
			System.out.println("Save");
		}else if (e.getSource() == exit){
			System.out.println("Exit");
		}
	}
}
	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Save");
		}
	
	

}