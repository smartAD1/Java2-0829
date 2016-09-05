package poker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Drawer  extends JPanel{
	public Drawer(){
		MyListener listener = new MyListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;//
		g2d.setColor(Color.blue);//顏色
		g2d.setStroke(new BasicStroke(4));//線條的粗細
		g2d.drawLine(0,0,100,100);//下筆的座標
		

}
private class MyListener extends MouseAdapter{//筆的觸發回應

	@Override
	public void mouseDragged(MouseEvent e) {//滑鼠移動時
		super.mouseDragged(e);
		int x = e.getX(), y = e.getY();
		System.out.println("Dragge:" + x + "x" + y);//附上座標回應
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {//滑鼠點下去時
		super.mousePressed(e);
		int x = e.getX(), y = e.getY();
		System.out.println("Pressed:" + x + "x" + y);//回應出座標
	}

	@Override
	public void mouseReleased(MouseEvent e) {//滑鼠點上去時
		super.mouseReleased(e);
		int x = e.getX(), y = e.getY();
		System.out.println("Released:" + x + "x" + y);//回應出座標
	}
	
}
}
