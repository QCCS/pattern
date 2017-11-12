/**
 * 
 */
package com.usthe.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName Test
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月12日 下午3:56:06
 * @site usthe.com
 */
public class Test {
	public static void main(String[] args) throws InterruptedException {
		SingletonDemo1 instance1 = SingletonDemo1.getInstance();
		SingletonDemo1 instance2 = SingletonDemo1.getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
		SingletonDemo2 instance3 = SingletonDemo2.getInstance();
		SingletonDemo2 instance4 = SingletonDemo2.getInstance();
		System.out.println(instance3);
		System.out.println(instance4);
		SingletonDemo3 instance5 = SingletonDemo3.getInstance();
		SingletonDemo3 instance6 = SingletonDemo3.getInstance();
		System.out.println(instance5);
		System.out.println(instance6);
		SingletonDemo4 instance7 = SingletonDemo4.Instance;
		SingletonDemo4 instance8 = SingletonDemo4.Instance;
		System.out.println(instance7==instance8);
	
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		long start = System.currentTimeMillis(); 
		for(int i=0;i<threadNum;i++){
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i=0;i<1000000;i++){
						Object instance = SingletonDemo1.getInstance();
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		
		countDownLatch.await();
		long end = System.currentTimeMillis();
		System.out.println("用时："+(end-start));
		

	}

}
