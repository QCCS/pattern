/**
 * 
 */
package com.usthe.proxy.staticProxy;

import java.net.Proxy;

/**
 * @ClassName Client
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月17日 下午4:45:35
 * @site usthe.com
 */
public class Client {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		Star proxyStar = new ProxyStar(realStar);
		proxyStar.colectMoney();
		proxyStar.confer();
		proxyStar.sing();
		proxyStar.signContract();
	}

}
