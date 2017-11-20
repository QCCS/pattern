/**
 * 
 */
package com.usthe.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FlyWeightFactory
 * @Description TODO享元工厂类
 * @author tomsun28
 * @Date 2017年11月21日 上午1:16:27
 * @site usthe.com
 */
public class FlyWeightFactory {

	private static Map<String,Flyweight> map = new HashMap<>();
	
	public static Flyweight getChess(String color){
		if(map.get(color)!=null){
			return map.get(color);
		}
		else{
			Flyweight instance = new ConcreateFlyweight(color);
			map.put(color,instance);
			return instance;
		}
	}
	
}
