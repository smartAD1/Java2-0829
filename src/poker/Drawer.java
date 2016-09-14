package poker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class Drawer  extends JPanel{
    private LinkedList<LinkedList<HashMap<String, Integer>>> lines,recycle; //宣告LinkedList產生單線結構
    //再用一層LinkedList包覆變成多線結構
	public Drawer(){
		MyListener listener = new MyListener();//繪畫則委派Listener去完成,
		//利用 Register - Callback 的反向呼叫機制
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		lines = new LinkedList<>();//LinkedList 實體
		recycle = new LinkedList<>();
	}

	protected void paintComponent(Graphics g) {//進行物件繪圖
		super.paintComponent(g);//父類別
		
		Graphics2D g2d = (Graphics2D)g;//
		g2d.setColor(Color.blue);//顏色
		g2d.setStroke(new BasicStroke(4));//線條的粗細
		//g2d.drawLine(0,0,100,100);//設定 下筆的座標
		for (LinkedList<HashMap<String,Integer>> line :lines){
		for(int i=1; i<line.size();i++){
			HashMap<String,Integer> p0 = line.get(i-1);
			HashMap<String,Integer> p1 = line.get(i);
			Integer p0x = p0.get("x"), p0y = p0.get("y");
			Integer p1x = p1.get("x"), p1y = p1.get("y");
			g2d.drawLine(p0x, p0y, p1x, p1y);
		}
		
		}
}
	void clear() {//呼叫Mypainter的清除功能
		lines.clear();
		repaint();
	}

	void undo() {
		if (lines.size() > 0) {//呼叫Mypainter的刪除最後一畫的功能
			recycle.add(lines.removeLast());
			repaint();
		}
	}

	void redo() {//呼叫Mypainter的回復功能
		if (recycle.size() > 0) {
			lines.add(recycle.removeLast());
			repaint();
		}
	}
private class MyListener extends MouseAdapter{//筆的觸發回應

	@Override
	public void mouseDragged(MouseEvent e) {//滑鼠移動時
		super.mouseDragged(e);
		int x = e.getX(), y = e.getY();
		HashMap<String, Integer> point = new HashMap<>();//取得新的字串跟名字資料
		point.put("x", x); point.put("y", y);
		lines.getLast().add(point);
		//line.add(point);//產生關係
		
		repaint();
	}
	
	@Override
	public void mousePressed(MouseEvent e) {//滑鼠點下去時
		super.mousePressed(e);
		int x = e.getX(), y = e.getY();
		LinkedList<HashMap<String,Integer>> line = 
				new LinkedList<>();
		HashMap<String, Integer> point = new HashMap<>();//取得新的字串跟名字資料
		point.put("x", x); point.put("y", y);
		line.add(point);//產生關係
		
		lines.add(line);
	}

}
}
