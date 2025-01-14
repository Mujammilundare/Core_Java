
class Server extends Thread
	{
private BlockingQueue queue = new LinkedBlockingQueue();

public void accept(Request request) 
	{
		queue.add(request);
	}

public void run() 
	{
while (true)
try
	{
		execute(queue.take());
	} catch (InterruptedException e) 
		{
		}
	}

public interface Request 
	{
		void execute();
	}

private void execute(final Request request) 
	{
	new Thread(new Runnable() 
		{
			public void run() 
				{
				request.execute();
			}
}).start();
}
}