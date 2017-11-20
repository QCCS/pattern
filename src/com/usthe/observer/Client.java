/**
 * 
 */
package com.usthe.observer;

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
		
		subject.registerObserver(observer1);
		subject.registerObserver(observer2);
		subject.registerObserver(observer3);
		subject.registerObserver(observer4);
		subject.setState(2);
		subject.setState(1);
		
	}
}
