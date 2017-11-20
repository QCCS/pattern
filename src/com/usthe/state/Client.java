/**
 * 
 */
package com.usthe.state;

/**
 * @ClassName Client
 * @Description TODO
 * @author tomsun28
 * @Date 2017年11月21日 上午2:16:58
 * @site usthe.com
 */
public class Client {

	public static void main(String[] args) {
		
		Context ctx = new Context();
		ctx.setState(new FreeState());
		ctx.setState(new BookedState());
		
	}
}
