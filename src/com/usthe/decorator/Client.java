/**
 * 
 */
package com.usthe.decorator;

/**
 * @ClassName Client
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月18日 下午5:34:03
 * @site usthe.com
 */
public class Client {
	public static void main(String[] args) {
		Icar car = new Icar();
		car.move();
		System.out.println("用装饰器增加新的功能！");
		FlyCar flycar = new FlyCar(car);
		flycar.move();
		System.out.println("用装饰器增加新的功能！");
        WaterCar water = new WaterCar(flycar);	
        water.move();
	}


}
