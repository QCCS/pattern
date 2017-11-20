/**
 * 
 */
package com.usthe.proxy.staticProxy;

/**
 * @ClassName ProxyStar
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月17日 下午4:42:58
 * @site usthe.com
 */
public class ProxyStar implements Star {

	private Star realstar;
	
	
	
	/**
	 * @Title ProxyStar
	 * @Description TODO
	 * @param @param realstar
	 * @throws 
	 */
	public ProxyStar(Star realstar) {
		super();
		this.realstar = realstar;
	}

	/* (non-Javadoc)
	 * @see com.usthe.proxy.staticProxy.Star#confer()
	 */
	@Override
	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("代理经纪人在做！");
		
	}

	/* (non-Javadoc)
	 * @see com.usthe.proxy.staticProxy.Star#signContract()
	 */
	@Override
	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("代理经纪人在做！");
		
	}

	/* (non-Javadoc)
	 * @see com.usthe.proxy.staticProxy.Star#sing()
	 */
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		realstar.sing();
		
	}

	/* (non-Javadoc)
	 * @see com.usthe.proxy.staticProxy.Star#colectMoney()
	 */
	@Override
	public void colectMoney() {
		// TODO Auto-generated method stub
		System.out.println("代理经纪人在做！");
		
	}

}
