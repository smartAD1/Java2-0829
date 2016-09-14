package poker;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mypainter extends JFrame {
	private Drawer drawer;
	private JButton clear, undo, redo, save;//新增按鈕
	private MyClock clock;

	public Mypainter() {
		super("My Painter");
		setLayout(new BorderLayout());

		clear = new JButton("Clear");//新增按鈕
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		save = new JButton("Save");
		clock = new MyClock();
		JPanel top = new JPanel(new BorderLayout());
		JPanel topLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel topRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		top.add(topLeft, BorderLayout.WEST);
		top.add(topRight, BorderLayout.EAST);
		topLeft.add(clear);//其餘擺左邊
		topLeft.add(undo);
		topLeft.add(redo);
		topLeft.add(save);
		topRight.add(clock);//時間擺右邊
		add(top, BorderLayout.NORTH);

		drawer = new Drawer();
		add(drawer, BorderLayout.CENTER);

		setSize(1024, 768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearDrawer();//清除圖像
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				undoDrawer();//刪除最後一筆
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				redoDrawer();//回復最後一筆
			}
		});
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				save2Drawer();//存檔功能
			}
		});

	}

	private void clearDrawer() {//清除功能
		drawer.clear();
	}

	private void undoDrawer() {//刪除最後一畫功能
		drawer.undo();
	}

	private void redoDrawer() {//回復最後一畫功能
		drawer.redo();
	}

	private void saveDrawer() {//存檔功能,規劃成jpg img 都能存檔
		BufferedImage img = new BufferedImage(drawer.getWidth(), drawer.getHeight(), BufferedImage.TYPE_INT_RGB);
		drawer.print(img.getGraphics()); // or: panel.printAll(...);
		try {
			ImageIO.write(img, "jpg", new File("dir1/drawer.jpg"));
			System.out.println("Save OK");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	private void save2Drawer() {//存檔功能2
		BufferedImage bi = 
				new BufferedImage(drawer.getWidth(), drawer.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics g = bi.createGraphics();
		drawer.paint(g); // this == JComponent
		g.dispose();
		try {//規劃成png存檔功能
			ImageIO.write(bi, "png", new File("dir1/test.png"));
			System.out.println("Save2 OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		new Mypainter();
	}

}