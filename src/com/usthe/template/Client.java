/**
 * 
 */
package com.usthe.template;

/**
 * @ClassName Client
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月21日 上午2:03:36
 * @site usthe.com
 */
public class Client {
	
	public static void main(String[] args) {
		TemplateMethod instance  = new TemplateMethod() {
			
			@Override
			public void transact() {
				// TODO Auto-generated method stub
				System.out.println("这是一个具体处理的方法！");
			}
		};
		
		instance.process();
		
	}

}
