/**
 * 
 */
package test;

/**
 * @ClassName: C
 * @Description: TODO
 * @author xiongshengjie 382202220@qq.com
 * @date 2015年6月10日 上午10:46:30
 *
 */
public class C extends B {

	/**
	 * 
	 * @date 2015年6月10日
	 * @author xiongshengjie
	 * @override @see test.B#testB1()
	 * @Description  TODO
	 */
	
	@Override
	public void testB1()
	{
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 */
	public C()
	{
		System.out.println("C be construct");
	}
	public static void main(String[] args)
	{
		C c = new C() ;
		System.out.println(c.testc2());
		
	}
	public A testc2()
	{
		C c = new C() ;
		return c ;
	}

}
