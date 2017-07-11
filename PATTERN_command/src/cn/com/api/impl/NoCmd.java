package cn.com.api.impl;

import cn.com.api.Command;

public class NoCmd implements Command{

	@Override
	public void execute() {
		System.out.println("this cmd do nothing");
	}

	@Override
	public void undo() {
		System.out.println("this cmd do nothing");
	}
	
}
