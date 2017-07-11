package cn.com.curr;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor extends java.util.concurrent.ThreadPoolExecutor{
	
	
	
	public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
	}
	
	/**
	 * 如果任务拒绝执行，则放入队列中，留待下次
	 */
	@Override
	public void execute(Runnable command) {
		try{
			super.execute(command);
		}catch(RejectedExecutionException e){
			if(super.getQueue() instanceof TaskQueue){
				final TaskQueue que = (TaskQueue) super.getQueue();
				try {
					if(! que.force(command))
					{
						
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
			}
			
		}
	}
}
