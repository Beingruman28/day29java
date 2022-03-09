package day29java;

public class ThreadCounters implements Runnable {
	public void run() {
		int i=0;
		while(true) {
			System.out.println(i);
			i++;
			if(i==50)
				i=0;
				try {
				Thread.sleep(1000);
				}
			catch (Exception e)  
			{  
			// catching the exception  
			System.out.println(e);  
		}
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCounters tc = new ThreadCounters();
		Thread t1 = new Thread(tc);
		Thread t2 = new Thread(tc);
		t1.start();
		t2.start();

	}

}
