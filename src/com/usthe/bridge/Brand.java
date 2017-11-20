/**
 * 
 */
package com.usthe.bridge;

/**
 * @ClassName Brand
 * @Description TODO桥接模式     品牌接口 品牌类
 * @author tomsun28
 * @Date 2017年11月18日 上午11:52:44
 * @site usthe.com
 */
public interface Brand {

	void sale();
}

class Dell implements Brand{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("dell 品牌 ！");
		
	}
	
}

class Lenovo implements Brand{

	/* (non-Javadoc)
	 * @see com.usthe.bridge.Brand#sale()
	 */
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("lenovo 品牌！ ");
		
	}
	
	
	
}

class Apple implements Brand{

	/* (non-Javadoc)
	 * @see com.usthe.bridge.Brand#sale()
	 */
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("apple 品牌！");
	}
	
	
	
}
