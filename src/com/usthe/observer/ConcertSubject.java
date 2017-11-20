/**
 * 
 */
package com.usthe.observer;

/**
 * @ClassName ConcertSubject
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月21日 上午2:30:29
 * @site usthe.com
 */
public class ConcertSubject extends Subject{

	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		//目标对象状态变化通知所有观察者
		this.notifyAllObserver();
	}

}
