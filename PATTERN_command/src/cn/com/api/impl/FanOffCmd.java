package cn.com.api.impl;

import cn.com.api.Command;
import cn.com.dto.CeilingFanDTO;

public class FanOffCmd implements Command{
	
	private CeilingFanDTO ceilingFan;
	
	public FanOffCmd(CeilingFanDTO ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		ceilingFan.off();
	}

	@Override
	public void undo() {
		ceilingFan.undo();
	}

}
