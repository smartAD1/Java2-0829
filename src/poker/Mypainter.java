package poker;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Mypainter extends JFrame{
	private Drawer drawer;//類似javascript canvas
	
	public Mypainter(){
		super("My painter"); //父類別
	
		setLayout(new BorderLayout()); //排版作用
		
		drawer = new Drawer(); //畫出一個視窗
		add(drawer, BorderLayout.CENTER); 
		
		setSize(1024, 768);//視窗大小
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//離開
	}
	
	public static void main(String[] args) {
		new Mypainter();
	}

}