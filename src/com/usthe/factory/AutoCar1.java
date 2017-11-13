/**
 * 
 */
package com.usthe.factory;

/**
 * @ClassName AutoCar1
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月13日 下午7:27:26
 * @site usthe.com
 */
public class AutoCar1 implements FactoryMethodDemo{



	/* (non-Javadoc)
	 * @see com.usthe.factory.FactoryMethodDemo#createCar()
	 */
	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new AutoCar();
	}

}
