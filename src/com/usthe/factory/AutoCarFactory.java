/**
 * 
 */
package com.usthe.factory;

/**
 * @ClassName AutoCarFactory
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月13日 下午7:42:12
 * @site usthe.com
 */
public class AutoCarFactory implements FactoryMethodDemo {

	/* (non-Javadoc)
	 * @see com.usthe.factory.FactoryMethodDemo#createCar()
	 */
	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new AutoCar();
	}

}
