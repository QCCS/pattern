/**
 * 
 */
package com.usthe.singleton;

/**
 * @ClassName SingletonDemo2
 * @Description 单例模式 懒汉模式
 * @author tomsun28
 * @Date 2017年11月12日 下午3:42:09
 * @site usthe.com
 */
public class SingletonDemo2 {
	//类初始化时不实例一个对象，需要的时候再实例化对象
	private static SingletonDemo2 singletonDemo2;
	
	private SingletonDemo2(){
		
	}
	//使用synchronized同步线程安全
	public static synchronized SingletonDemo2 getInstance(){
		if(singletonDemo2==null){
			singletonDemo2 = new SingletonDemo2();
		}
		return singletonDemo2;
	}

}
