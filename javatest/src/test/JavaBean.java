/**
 * 
 */
package test;

/**
 * @ClassName: JavaBean
 * @Description: TODO
 * @author xiongshengjie 382202220@qq.com
 * @date 2015骞�鏈�鏃�涓嬪�?:27:14
 *
 */
public class JavaBean {

	public void t() throws InterruptedException
	{
		for(int i = 0 ;i<50;i++)
		{
			Thread.sleep(((int)Math.random())*1000);
		   System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
