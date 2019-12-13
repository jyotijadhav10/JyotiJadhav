

class A implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println("thread Aaaaaaa"+i);
		}
	}
}

class B implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println("thread B"+i);
		}
	}
}

public class create_thread1 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new A());
		Thread t2 = new Thread(new B());
		
		t1.start();
		t2.start();
	}

}
