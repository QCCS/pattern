/**
 * 
 */
package com.usthe.bridge;

/**
 * @ClassName Client
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月18日 下午12:13:01
 * @site usthe.com
 */
public class Client {
	
	public static void main(String[] args) {
		Computer comp = new Desktop(new Apple());
		comp.sale();
		Computer comp2 = new Laptop(new Lenovo());
		comp2.sale();
	}
}
