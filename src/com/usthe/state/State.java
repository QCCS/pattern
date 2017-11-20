/**
 * 
 */
package com.usthe.state;

/**
 * @ClassName State
 * @Description TODO状态模式
 * @author tomsun28
 * @Date 2017年11月21日 上午2:11:34
 * @site usthe.com
 */
public interface State {

	public void handle();
}

class FreeState implements State{

	/* (non-Javadoc)
	 * @see com.usthe.state.State#handle()
	 */
	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("房间空闲状态！");
	}
	
}

class BookedState implements State{

	/* (non-Javadoc)
	 * @see com.usthe.state.State#handle()
	 */
	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("房间已经预定状态！");
	}
	
}

class CheckedState implements State{

	/* (non-Javadoc)
	 * @see com.usthe.state.State#handle()
	 */
	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("房间已经入住状态！");
	}
	
}