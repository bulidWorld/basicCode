package cn.com.curr;

import java.util.concurrent.LinkedBlockingQueue;

public class TaskQueue extends LinkedBlockingQueue<Runnable>{
	
	private ThreadPoolExecutor parent = null;
	
	boolean force(Runnable cmd) throws Exception{
		if(parent.isShutdown()) throw new Exception();
		return super.offer(cmd);
	}
	
	public void setParent(ThreadPoolExecutor threadExcutor){
		this.parent = threadExcutor;
	}
	
}
