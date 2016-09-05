package poker;
import java.awt.BorderLayout; 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Editro extends JFrame{
	private JButton open,save,exit;
	private JTextArea editor;
	private File openFile;
	
	public Editro(){
		super("My Editor");
		//UI介面
		setLayout(new BorderLayout());
		//新增三個按鈕
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		//把按鈕移去左邊
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);top.add(save);top.add(exit);
		add(top, BorderLayout.NORTH);
		
		editor = new JTextArea();
		JScrollPane jsp = new JScrollPane(editor);
		add(jsp, BorderLayout.CENTER);
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doOpen();
			}
		});
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doSave();
			}
		});
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	private void doOpen(){
		JFileChooser jfc = new JFileChooser();
		if(jfc.showOpenDialog(null)==
				JFileChooser.APPROVE_OPTION){
			openFile = jfc.getSelectedFile();
			readFile();
		}
		
	}
	private void readFile() {
		if (openFile==null)return;
		editor.setText("");
		try {
			FileReader reader = new FileReader(openFile);
			int c;
			while((c = reader.read()) !=-1){
				editor.append(""+(char)c);
			}
			reader.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	private void doSave(){
		if(openFile== null)return;
		try{
			FileWriter wirter = new FileWriter(openFile);
			wirter.write(editor.getText());
			wirter.flush();
			wirter.close();
			JOptionPane.showMessageDialog(null, "save Ok");
			
			
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, "Save Fail");
		}
	}
	
	public static void main(String[] args) {
		new Editro();
	}

}