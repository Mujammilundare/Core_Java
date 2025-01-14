//A blocking queue is a queue that blocks when you try to dequeue from it
//and the queue is empty, or if you try to enqueue items to it and the queue is already full. 

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Client extends Server
	{
public static void main(String[] args) 
	{
		new Client().go();
	}

public void go() 
	{
			final Server server = new Server();
				server.start();

			 for (int i = 0; i < 2; i++) 
				{
				final Request request = createRequest(i);
				server.accept(request);
				}
  }

Request createRequest(final int index) 
	{
return new Request() 
	{

public void execute() 
	{
		for (int i = 0; i <= 40; i += 20) {
		sleep((new Random().nextInt(5) + 1) * 1000);
		System.out.println(String.format(
		"request: %d completed: %d%%", index, i));
    }
               System.out.println(String.format("reqest %d completed", index));
   }

};

}

private void sleep(int millis) 
	{
try
	{
Thread.sleep(millis);
} catch (InterruptedException e) 
	{
}
}
}



