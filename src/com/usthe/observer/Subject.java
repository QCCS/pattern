/**
 * 
 */
package com.usthe.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Subject
 * @Description TODO观察者模式      被观察对象
 * @author tomsun28
 * @Date 2017年11月21日 上午2:22:54
 * @site usthe.com
 */
public class Subject {

	protected List<Observer> list = new ArrayList<>();
	
	public void registerObserver(Observer ob){
		list.add(ob);
	}
	
	public void removeObserver(Observer ob){
		list.remove(ob);
	}
	
	
	//通知所有的观察者更新
	public void notifyAllObserver(){
		for(Observer ob : list){
			ob.update(this);
		}
		
	}
}
