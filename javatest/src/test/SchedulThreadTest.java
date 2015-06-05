/**
 * 
 */
package test;

import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: SchedulThreadTest
 * @Description: TODO
 * @author xiongshengjie 382202220@qq.com
 * @date 2015Âπ?Êú?Êó?‰∏ãÂçà3:15:38
 *
 */
public class SchedulThreadTest {

	public static void main(String[] args) throws InterruptedException
	{
		ScheduledExecutorService schedulThread = new ScheduledThreadPoolExecutor(1);
		
		Runnable run = new Runnable()
		{
			
			@Override
			public void run()
			{
				// TODO Auto-generated method stu
				System.out.println(new Date(System.currentTimeMillis())+Thread.currentThread().getName()+"Âº?ßãÊâßË°å");
				try{
					
				
//					for(int i =0 ;i<100;i++)
//					{
//						System.out.println(i+"run be invoking");
//						
//					}
//					Thread.sleep(10000);
					Runnable run2 = new Runnable()
					{
						
						@Override
						public void run()
						{
							
							try
							{
								Thread.sleep(1000000);
								System.out.println("run2");
							} catch (InterruptedException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					};
					Thread t = new Thread(run2);
					t.start();
						System.out.println(new Date(System.currentTimeMillis())+Thread.currentThread().getName()+"ÊâßË°åÂÆåÊØï");
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		};
		schedulThread.scheduleAtFixedRate(run, 3, 5, TimeUnit.SECONDS);
//		schedulThread.schedule(run, 10, TimeUnit.SECONDS);
		System.out.println(new Date(System.currentTimeMillis()));
//		Thread.sleep(4000);
//		schedulThread.shutdownNow();
		System.out.println(new Date(System.currentTimeMillis())+"mainÁªìÊùü");
	}
}
