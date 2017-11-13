/**
 * 
 */
package com.usthe.factory;

/**
 * @ClassName Test
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月13日 下午6:03:52
 * @site usthe.com
 */
public class Test {
	
	public static void main(String[] args) {
	  
		Car car = SimpleFactoryDemo.createCar("BYD");
		Car car1 = SimpleFactoryDemo.createCar("AUTO");
		car.run();
		car1.run();
		
		Car car2 = new BydCarFactory().createCar();
		Car car3 = new AutoCarFactory().createCar();
		car2.run();
		car3.run();
		
		
		
	}
}
