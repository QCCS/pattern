/**
 * 
 */
package com.usthe.flyweight;

/**
 * @ClassName UnsharedConcreateFlyweight
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月21日 上午1:11:21
 * @site usthe.com
 */
public class UnsharedConcreateFlyweight {

	int x,y;

	/**
	 * @Title UnsharedConcreateFlyweight
	 * @Description TODO
	 * @param @param x
	 * @param @param y
	 * @throws 
	 */
	public UnsharedConcreateFlyweight(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
