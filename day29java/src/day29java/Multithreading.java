package day29java;


	class A extends Thread
	{
		public void run()
		{
			System.out.println("Current id of thread-A : "+Thread.currentThread().getId());
		}
	}
	class B extends Thread
	{
		public void run()
		{
			System.out.println("Current id of thread-B : "+Thread.currentThread().getId());
		}
	}
	class C extends Thread
	{
		public void run()
		{
			System.out.println("Current id of thread-C : "+Thread.currentThread().getId());
		}
	}
	class D implements Runnable
	{
		public void run()
		{
			System.out.println("Current id of thread-C : "+Thread.currentThread().getId());
		}
	}
	public class Multithreading {
		public static void main(String[] args) 
		{
	       A a=new A();
	       a.setPriority(Thread.MIN_PRIORITY);
	       a.start();
	       B b=new B();
	       b.setPriority(Thread.NORM_PRIORITY);
	       b.start();
	       C c=new C();
	       c.setPriority(Thread.MAX_PRIORITY);
	       c.start();
	       D d=new D();
	       Thread th=new Thread(d);
	       //th.start();
	       th.setPriority(Thread.MAX_PRIORITY);
	       th.start();
	       for (int i = 0; i < 3; i++) 
	       {
	           System.out.println("ID of Main method : "+Thread.currentThread().getId());
	       }
		}

	}
