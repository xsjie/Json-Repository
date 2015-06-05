/**
 * 
 */
package test;

/**
 * @ClassName: a
 * @Description: TODO
 * @author xiongshengjie 382202220@qq.com
 * @date 2015年5月31日 下午6:25:37
 *
 */
import java.awt.Desktop;  
import java.io.IOException;  
import java.net.URI;  
import java.net.URISyntaxException;  
  
public class TestBrowse {  
 public static void main(String[] a) {  
  try {  
   URI uri = new URI("http://www.baidu.com");  
   Desktop desktop = null;  
   if (Desktop.isDesktopSupported()) {  
    desktop = Desktop.getDesktop();  
   }  
   if (desktop != null)  
    desktop.browse(uri);  
  } catch (IOException ioe) {  
   ioe.printStackTrace();  
  } catch (URISyntaxException e) {  
   e.printStackTrace();  
  }  
 }  
}