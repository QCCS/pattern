/**
 * 
 */
package com.usthe.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

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
		StarHandler handler = new StarHandler(realStar);
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},handler);

		proxy.sing();
	}

}
