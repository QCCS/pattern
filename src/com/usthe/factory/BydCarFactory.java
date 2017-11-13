/**
 * 
 */
package com.usthe.factory;

/**
 * @ClassName 
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月13日 下午7:25:23
 * @site usthe.com
 */
public class BydCarFactory implements FactoryMethodDemo {

	/* (non-Javadoc)
	 * @see com.usthe.factory.FactoryMethodDemo#createCar()
	 */
	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new BydCar();
	}



}
