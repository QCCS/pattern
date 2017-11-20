/**
 * 
 */
package com.usthe.decorator;

/**
 * @ClassName Car
 * @Description TODO装饰模式：  抽象对象接口
 * @author tomsun28
 * @Date 2017年11月18日 下午5:24:46
 * @site usthe.com
 */
public interface Car {
	void move();

}

//具体真实对象角色
class Icar implements Car{

	/* (non-Javadoc)
	 * @see com.usthe.decorator.Car#move()
	 */
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("在路上跑!");
	}
	
}

//装饰器对象角色
class SuperCar implements  Car {

	private Car icar;
	
	/**
	 * @Title SuperCar
	 * @Description TODO
	 * @param @param icar
	 * @throws 
	 */
	public SuperCar(Car icar) {
		super();
		this.icar = icar;
	}

	@Override
	public void move() {
		icar.move();		
	}
	
}

//具体的装饰器
class FlyCar extends SuperCar{


	public FlyCar(Car icar) {
		super(icar);
		// TODO Auto-generated constructor stub
	}
	
	public void fly(){
		System.out.println("fil in the sky!");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();
	}
	
	
}
//具体的装饰器
class WaterCar extends SuperCar{


	public WaterCar(Car icar) {
		super(icar);
		// TODO Auto-generated constructor stub
	}
	
	public void water(){
		System.out.println("run in the sea!");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		water();
	}
}
