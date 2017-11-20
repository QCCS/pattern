/**
 * 
 */
package com.usthe.adapter;

/**
 * @ClassName Client
 * @Description 使用客户
 * @author tomsun28
 * @Date 2017年11月17日 下午3:55:59
 * @site usthe.com
 */
public class Client {
	
	public void test1(Target target){
		target.handleRequest();
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		Adaptee e = new Adaptee();
		
		Target t = new Adapter2(e); 
		
		c.test1(t);
	}

}
