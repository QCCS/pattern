/**
 * 
 */
package com.usthe.singleton;

/**
 * @ClassName SingletonDemo3
 * @Description 单例模式 静态内部类模式
 * @author tomsun28
 * @Date 2017年11月12日 下午3:46:57
 * @site usthe.com
 */
public class SingletonDemo3 {
	private SingletonDemo3(){
		
	}
	private static class StaticSingleton{
		private static final SingletonDemo3 singletonDemo3 = new SingletonDemo3();
	}
	public static SingletonDemo3 getInstance(){
		return StaticSingleton.singletonDemo3;
	}

}
