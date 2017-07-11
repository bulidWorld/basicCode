package cn.com.curr;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 线程工厂类，用于产生线程对象，其中的threadGroup,prefixName便于标志
 * @author Administrator
 *
 */
public class ThreadFactory implements java.util.concurrent.ThreadFactory{
	
	private final ThreadGroup threadGroup;
	
	private AtomicInteger atomInt = new AtomicInteger(0);
	
	private String prefixName;
	
	public ThreadFactory(ThreadGroup threadGroup) {
		this.threadGroup = threadGroup;
	}
	
	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		atomInt.incrementAndGet();
		Thread th = new Thread(threadGroup, r, prefixName + atomInt);
		return th;
	}

}
