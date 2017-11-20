/**
 * 
 */
package com.usthe.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName ObserverA
 * @Description TODO 使用Java提供的 java.util.Observer 接口来实现 观察者
 * @author tomsun28
 * @Date 2017年11月21日 上午3:22:53
 * @site usthe.com
 */
public class ObserverA implements Observer{

	private int state;
	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.state = ((ConcertSubject)o).getState();
		System.out.println(this.toString()+"改变了状态："+state);	
	}

}
