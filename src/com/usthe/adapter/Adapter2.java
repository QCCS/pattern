/**
 * 
 */
package com.usthe.adapter;

/**
 * @ClassName Adapter2
 * @Description TODO使用组合的方式实现ADAPTER
 * @author tomsun28
 * @Date 2017年11月17日 下午4:08:39
 * @site usthe.com
 */
public class Adapter2 implements Target{

	private Adaptee adaptee;
	
	@Override
	public void handleRequest() {
		
		adaptee.request();
	}
	
	public Adapter2(Adaptee a){
		super();
		this.adaptee=a;
	}

}
