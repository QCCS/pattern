/**
 * 
 */
package com.usthe.flyweight;

/**
 * @ClassName Client
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月21日 上午1:22:25
 * @site usthe.com
 */
public class Client {

	public static void main(String[] args) {
		Flyweight chess1 = FlyWeightFactory.getChess("black");
		Flyweight chess2 = FlyWeightFactory.getChess("black");
		System.out.println(chess1);
		System.out.println(chess2);
		
		chess1.display(new UnsharedConcreateFlyweight(100,90));
		chess2.display(new UnsharedConcreateFlyweight(340,90));
	}
}
