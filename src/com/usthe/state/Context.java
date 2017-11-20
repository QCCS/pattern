/**
 * 
 */
package com.usthe.state;

/**
 * @ClassName Context
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月21日 上午2:15:24
 * @site usthe.com
 */
public class Context {

	private State state;
	
	public void setState(State s){
		System.out.println("修改当前状态！");
		this.state = s;
		state.handle();
		System.out.println("-----------------");
	}
}
