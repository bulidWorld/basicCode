package cn.com.dto;

import cn.com.api.Command;

public class CeilingFanDTO{
	private static final int SLOW = 1;
	private static final int MEDIUM = 2;
	private static final int HIGH = 3;
	private static final int OFF = 0;
	
	private int prevSpeed = 0;
	private int nowSpeed = 0;
	private String location;
	
	public CeilingFanDTO(String location) {
		this.location = location;
	}
	
	public void setSpeed(int speed){
		this.prevSpeed = nowSpeed;
		this.nowSpeed = speed;
	}
	
	public void high(){
		this.nowSpeed = HIGH;
	}
	
	public void off(){
		this.nowSpeed = OFF;
	}
	
	public void medium(){
		this.nowSpeed = MEDIUM;
	}
	
	public void slow(){
		this.nowSpeed = SLOW;
	}
	
	
	public void undo(){
		switch(prevSpeed){
			case OFF: off();break;
			case SLOW:slow();break;
			case MEDIUM:medium();break;
			case HIGH:high();break;
		}
		
	}
}
