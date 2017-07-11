package cn.com.api.impl;

import cn.com.api.Command;
import cn.com.dto.LightDTO;

public class LightOffCmd implements Command{
	
	private LightDTO light;
	
	public LightOffCmd(LightDTO light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
