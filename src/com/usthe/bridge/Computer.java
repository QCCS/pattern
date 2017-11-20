/**
 * 
 */
package com.usthe.bridge;

/**
 * @ClassName Computer
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月18日 下午12:04:01
 * @site usthe.com
 */
public class Computer {

	protected Brand brand;
	
	/**
	 * @Title Computer
	 * @Description TODO
	 * @param 
	 * @throws 
	 */
	public Computer(Brand brand) {
		// TODO Auto-generated constructor stub
	    this.brand=brand;
	}
	
	public void sale(){
		System.out.println("这是电脑类型！");
	}

}

class Desktop extends Computer{
	
	/**
	 * @Title Desktop
	 * @Description TODO
	 * @param @param brand
	 * @throws 
	 */
	public Desktop(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void sale() {
		
		System.out.println("销售台式机！");
		brand.sale();
		
	}
	
	
}

class Laptop extends Computer{

	/**
	 * @Title Laptop
	 * @Description TODO
	 * @param @param brand
	 * @throws 
	 */
	public Laptop(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see com.usthe.bridge.Computer#sale()
	 */
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("销售笔记本!");
		brand.sale();
	}
	
}





