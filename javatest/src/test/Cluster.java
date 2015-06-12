/**
 * 
 */
package test;

/**
 * @ClassName: Cluster
 * @Description: TODO
 * @author xiongshengjie 382202220@qq.com
 * @date 2015年6月3日 上午11:38:16
 *
 */
/**
 * 
 */

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

/**
 * @ClassName: Cluster
 * @Description: TODO
 * @author xiongshengjie 382202220@qq.com
 * @date 2015年6月1日 下午5:24:25
 * @update 2015.06.06
 *
 */
public class Cluster {
	public static void main(String[] args) throws IOException {

		Set<HostAndPort> nodes = new HashSet<HostAndPort>();
		String[] hostAndPorts =  {"132.121.88.81:6371","132.121.88.81:6372","132.121.88.81:6373","132.121.88.81:6374","132.121.88.81:6375","132.121.88.81:6376"};
		for(String hostAndPort : hostAndPorts){
			String[] nodeHostAndPort = hostAndPort != null ? hostAndPort.split(":") : new String[]{};
			if(nodeHostAndPort.length == 2){
				String nodeHost = nodeHostAndPort[0];
				Integer nodePort = Integer.valueOf(nodeHostAndPort[1]);
				HostAndPort node = new HostAndPort(nodeHost, nodePort > 0 ? nodePort : 6379);
				nodes.add(node);
			}
		} 
		JedisCluster cluster = new JedisCluster(nodes); 
		cluster.set("name2", "zhangsan1");
		cluster.set("age2", "30") ;
		cluster.set("email2", "1test@126.com");
		System.out.println(cluster.get("name1"));
		System.out.println(cluster.get("age1"));
		System.out.println(cluster.get("email1"));
	}

}
