/**
 * 
 */
package com.usthe.template;

/**
 * @ClassName TemplateMethod
 * @Description TODO 模板方法模式
 * @author tomsun28
 * @Date 2017年11月21日 上午1:57:31
 * @site usthe.com
 */
public abstract class TemplateMethod {

	public void takeNumber(){
		System.out.println("取号！");
	}
	
	//处理业务的具体方法，钩子方法
	public abstract void transact();
	
	public void evaluate(){
		System.out.println("反馈服务评分！");
	}
	
	public final void process(){
		this.takeNumber();
		
		this.transact();
		
		this.evaluate();
		
		
	}
}
