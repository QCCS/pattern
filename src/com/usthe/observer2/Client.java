/**
 * 
 */
package com.usthe.observer2;

import java.util.Observer;

/**
 * @ClassName Client
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月21日 上午2:45:09
 * @site usthe.com
 */
public class Client {

	public static void main(String[] args) {
		ConcertSubject subject = new ConcertSubject();
		
		Observer observer1 = new ObserverA();
		Observer observer2 = new ObserverA();
		Observer observer3 = new ObserverA();
		Observer observer4 = new ObserverA();
		
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.addObserver(observer3);
		subject.addObserver(observer4);
		subject.setState(100);
		subject.setState(9999);
		
	}
}
