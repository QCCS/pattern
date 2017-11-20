/**
 * 
 */
package com.usthe.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName StarHandler
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月18日 上午9:30:26
 * @site usthe.com
 */
public class StarHandler implements InvocationHandler {


	Star realStar;
	
	
	
	/**
	 * @Title StarHandler
	 * @Description TODO
	 * @param @param realStar
	 * @throws 
	 */
	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}



	//代理对方法的调用都会经过这个invoke()函数
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("######");
		System.out.println("唱歌前代理机构所做的处理！");
		if(method.getName().equals("sing")){
			//invoke()调用真实对象realStar的method()方法,参数是args
			method.invoke(realStar,args);
		}
		System.out.println("唱歌后代理机构所做的处理！");
		
		return null;
	}

}
