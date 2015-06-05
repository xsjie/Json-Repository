/**
 * 
 */
package test;


/**
 * @ClassName: ReadTest
 * @Description: TODO
 * @author xiongshengjie 382202220@qq.com
 * @date 2015骞�鏈�鏃�涓嬪�?:05:56
 *
 */
public class ReadTest {

	
	public static void main(String[] args)
	{
		final JavaBean jb = new JavaBean();
		for(int i = 0 ;i<2;i++)
		{
			Runnable run = new Runnable()
			{
				public void run()
				{
				    try
					{
						jb.t();
					} catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			};
			Thread t = new Thread(run);
			t.start();
		}
		
		
	}
}
