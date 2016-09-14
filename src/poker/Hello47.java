package poker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Hello47  extends JFrame{ 
	private MyGame gameview;
	
	public Hello47(){//視窗化
		setLayout(new BorderLayout());
		gameview = new MyGame();
		add(gameview, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//關閉等同停止運行
	}
	
	private class MyGame extends JPanel{
		private Timer timer;
		private Ball myBall;
		private int viewW, viewH;
		private LinkedList<Ball> balls;// 資料結構
		private Color[] colors = {Color.red,Color.black, Color.blue,
				Color.green, Color.yellow};//設定球的顏色
		MyGame(){
			timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					repaint();
				}
			}, 1000, 70);
			
			balls = new LinkedList<>();
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					balls.add(new Ball(
							e.getX()-20,e.getY()-20,
							40,40,10,10,colors[(int)(Math.random()*5)]));
				}
			});
		}
		

		private class Ball {
			int x, y, w, h, dx, dy;
			Color color;
			private Timer timer;
			Ball(int x, int y, int w, int h, int dx, int dy, Color color){
				//球的長寬高顏色 ,dx跟dy則是不讓球超出是窗外
				this.x=x;this.y=y;this.w=w;this.h=h;
				this.dx=dx;this.dy=dy;
				this.color = color;
				timer = new Timer();
				timer.schedule(new BallTask(), 0, 40);//排程執行球的運作
			}
			private class BallTask extends TimerTask {
				@Override
				public void run() {//設定讓球在視窗裡面活動不超出是窗外,參考座標
					if (x<0 || x+w > viewW){
						dx *= -1;
					}
					if (y<0 || y+h > viewH){
						dy *= -1;
					}
					x += dx; y += dy;
				}
			}
		}

		@Override
		protected void paintComponent(Graphics g) {//把圖轉成2D
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;
			
			viewW = getWidth(); viewH = getHeight();
			
			for (Ball myBall : balls){//用for把ball包起來
				g2d.setColor(myBall.color);
				g2d.fillOval(myBall.x, myBall.y, myBall.w, myBall.h);
		}
	}
	}
	public static void main(String[] args) {
		new Hello47();

	}

}
