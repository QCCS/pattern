/**
 * 
 */
package com.usthe.observer;

/**
 * @ClassName Observer
 * @Description TODO观察者模式   观察者
 * @author tomsun28
 * @Date 2017年11月21日 上午2:23:37
 * @site usthe.com
 */
public interface Observer {

	void update(Subject subject);
}

class ObserverA implements Observer{

	private int mystate;
	/* (non-Javadoc)
	 * @see com.usthe.observer.Observer#update(com.usthe.observer.Subject)
	 */
	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		mystate = ((ConcertSubject) subject).getState();
		System.out.println(this.toString()+"的状态改变为:"+mystate);
	}
	
}