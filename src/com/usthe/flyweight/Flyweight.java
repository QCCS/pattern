/**
 * 
 */
package com.usthe.flyweight;

/**
 * @ClassName Flyweight
 * @Description TODO享元类接口
 * @author tomsun28
 * @Date 2017年11月21日 上午1:07:57
 * @site usthe.com
 */
public interface Flyweight {

	void setColor(String color);
	String getColor();
	void display(UnsharedConcreateFlyweight unshare);
}


class ConcreateFlyweight implements Flyweight{

	
	private String color;
	/* (non-Javadoc)
	 * @see com.usthe.flyweight.Flyweight#setColor()
	 */
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	/* (non-Javadoc)
	 * @see com.usthe.flyweight.Flyweight#getColor()
	 */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	/* (non-Javadoc)
	 * @see com.usthe.flyweight.Flyweight#display(com.usthe.flyweight.UnsharedConcreateFlyweight)
	 */
	@Override
	public void display(UnsharedConcreateFlyweight unshare) {
		// TODO Auto-generated method stub
		System.out.println("color: "+color);
		System.out.println("x--y:"+unshare.x+"---"+unshare.y);
	}

	/**
	 * @Title ConcreateFlyweight
	 * @Description TODO
	 * @param @param color
	 * @throws 
	 */
	public ConcreateFlyweight(String color) {
		super();
		this.color = color;
	}
	
	
}