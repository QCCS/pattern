/**
 * 
 */
package com.usthe.composite;

/**
 * @ClassName Component
 * @Description TODO 组合模式：   抽象组件
 * @author tomsun28
 * @Date 2017年11月18日 下午3:55:52
 * @site usthe.com
 */
public interface Component {

	void operation();
}

//叶子节点
interface Leaf extends Component{
	
	
}

//容器节点
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}


