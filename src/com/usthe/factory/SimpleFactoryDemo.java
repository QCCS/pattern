/**
 * 
 */
package com.usthe.factory;

/**
 * @ClassName SimpleFactoryDemo
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月13日 下午2:50:51
 * @site usthe.com
 */
public class SimpleFactoryDemo {
	
	public static Car createCar(String type){
		if(type=="BYD"){
			return new BydCar(); 
		}
		else if(type=="AUTO")
			return new AutoCar();
		else
			return null;
	}

}
