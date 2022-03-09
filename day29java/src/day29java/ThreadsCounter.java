package day29java;

public class ThreadsCounter implements Runnable {
	 static int counter = 1; 

	    public ThreadsCounter() {
	    }

	    static synchronized void incrementCounter() {
	         System.out.println(Thread.currentThread().getName() + ": " + counter);
	         counter++;
	    }

	    @Override
	    public void run() {
	         while(counter<500){
	              incrementCounter();
	              return;
	         }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadsCounter tc = new ThreadsCounter();
        Thread thread1 = new Thread(tc);
        Thread thread2 = new Thread(tc);

        thread1.start();
        thread2.start();          
   }
}
