/**
 * 
 */
package test;

/**
 * @ClassName: LoginTest
 * @Description: TODO
 * @author xiongshengjie 382202220@qq.com
 * @date 2015��5��31�� ����6:36:23
 *
 */
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.cookie.*;
import org.apache.commons.httpclient.methods.*;
public class FormLoginDemo {
    static final String LOGON_SITE = "132.97.172.70";
    static final int    LOGON_PORT = 80;
   
    public static void main(String[] args) throws Exception{
       HttpClient client = new HttpClient();
       client.getHostConfiguration().setHost(LOGON_SITE, LOGON_PORT);
      
       GetMethod get = new GetMethod("/ITOS/welcome.htm");
       client.executeMethod(get);
       System.out.println(get.getResponseBodyAsString());
       get.releaseConnection();
       
       
       
       //ģ���¼ҳ��login.jsp->main.jsp
       PostMethod post = new PostMethod("/ITOS/welcome.htm");
       NameValuePair name = new NameValuePair("username", "id");      
       NameValuePair pass = new NameValuePair("password", "id");      
       post.setRequestBody(new NameValuePair[]{name,pass});
       int status = client.executeMethod(post);
       System.out.println(post.getResponseBodyAsString());
       post.releaseConnection();  
      
       //�鿴cookie��Ϣ
       CookieSpec cookiespec = CookiePolicy.getDefaultSpec();
       Cookie[] cookies = cookiespec.match(LOGON_SITE, LOGON_PORT, "/", false, client.getState().getCookies());
       if (cookies.length == 0) {
           System.out.println("None");   
       } else {
           for (int i = 0; i < cookies.length; i++) {
              System.out.println(cookies[i].toString());   
           }
       }
       //���������ҳ��main2.jsp
      
    }
}