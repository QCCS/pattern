/**
 * 
 */
package com.usthe.observer2;

import java.util.Observable;

/**
 * @ClassName ConcertSubject
 * @Description TODO用Java提供的java.util.Observable实现 被观察者 
 * @author tomsun28
 * @Date 2017年11月21日 上午3:18:01
 * @site usthe.com
 */
public class ConcertSubject extends Observable{
	
	private int state;
	
	public void setState(int state){
		System.out.println("被观察者改变了状态为："+state);
		this.state = state;
		this.setChanged();//表示当前被观察的对象已经做了更改
		this.notifyObservers(state);//通知所有注册的观察者
	}
	public int getState(){
		
		return this.state;
	}

}
