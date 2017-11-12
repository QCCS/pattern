/**
 * 
 */
package com.usthe.singleton;

/**
 * @ClassName Singleton1
 * @Description 单例模式饿汉模式
 * @author tomsun28
 * @Date 2017年11月12日 下午3:36:53
 * @site usthe.com
 */
public class SingletonDemo1 {
	
	//类初始化的时候就创建实例，每次都得到同一个实例，线程安全
	private static SingletonDemo1 singletonDemo1 = new SingletonDemo1();
	private SingletonDemo1(){
		
	}
	public static SingletonDemo1 getInstance(){
		return singletonDemo1;
	}

}
