package poker;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel {
	private Timer timer;
	public MyClock(){
		timer = new Timer();
		timer.schedule(new MyTask(), 0, 500);
	}

	private class MyTask extends TimerTask {
		@Override
		public void run() {
			Calendar now =Calendar.getInstance();
			int hh = now.get(Calendar.HOUR_OF_DAY);//顯示小時
			int mm = now.get(Calendar.MINUTE);//顯示分鐘
			int ss = now.get(Calendar.SECOND);//顯示秒數
			setText(hh + ":"+ mm + ":" + ss);//時間總和
			
			
					
			
			
		}
	}
}