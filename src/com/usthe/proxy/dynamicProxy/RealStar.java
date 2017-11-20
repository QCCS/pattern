/**
 * 
 */
package com.usthe.proxy.dynamicProxy;

/**
 * @ClassName RealStar
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月17日 下午4:36:10
 * @site usthe.com
 */
public class RealStar implements Star{

	/* (non-Javadoc)
	 * @see com.usthe.proxy.staticProxy.Star#confer()
	 */
	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("真实明星在做！");
		
	}

	/* (non-Javadoc)
	 * @see com.usthe.proxy.staticProxy.Star#signContract()
	 */
	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("真实明星在做！");
		
	}

	/* (non-Javadoc)
	 * @see com.usthe.proxy.staticProxy.Star#sing()
	 */
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("真实明星在做！");
		
	}

	/* (non-Javadoc)
	 * @see com.usthe.proxy.staticProxy.Star#colectMoney()
	 */
	@Override
	public void colectMoney() {
		// TODO Auto-generated method stub
		System.out.println("真实明星在做！");
		
	}

}
