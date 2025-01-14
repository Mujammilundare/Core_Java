class SharedData 
	{
	public int a = 0;
	public String s = null;
	
	public SharedData() {
		a = 10;
		s = "Test";
	}
}

class MyThread extends Thread 
	{
	private SharedData m_data = null;
	
	public MyThread(SharedData data) {
		m_data = data;
	}
	
	public void run() {
		for (;;) {
			m_data.a++;
		}
	}
}
public class Main5 {
	public static void main(String [] args) {
		SharedData data = new SharedData();
		MyThread t1 = new MyThread(data);
		t1.start();
		
		for (;;) {
			data.a--;
		}
	}
}
