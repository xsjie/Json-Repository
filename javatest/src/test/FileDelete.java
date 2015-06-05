/**
 * 
 */
package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/**
 * @ClassName: FileDelete
 * @Description: TODO
 * @author xiongshengjie 382202220@qq.com
 * @date 2015�?�?2�?上午11:45:38
 *
 */
public class FileDelete {

	private static  String localHost = "" ;
	private static String localPath = "";
	private static String remoteHost = "" ;
	private static String remotePath = "" ;
	
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("d:\\ts_data\\11757160.txt") ;
		
		
	}
	
	public static String getMd5ByFile(File file) throws FileNotFoundException {  
        String value = null;  
        FileInputStream in = new FileInputStream(file);  
    try {  
        MappedByteBuffer byteBuffer = in.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, file.length());  
        MessageDigest md5 = MessageDigest.getInstance("MD5");  
        md5.update(byteBuffer);  
        BigInteger bi = new BigInteger(1, md5.digest());  
        value = bi.toString(16);  
    } catch (Exception e) {  
        e.printStackTrace();  
    } finally {  
            if(null != in) {  
                try {  
                in.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
    return value;  
    }
	public static String getRemoteHostMd5() throws MalformedURLException
	{
		URL url = new URL(remoteHost) ;
		
		
		
		return null ;
	}
}
