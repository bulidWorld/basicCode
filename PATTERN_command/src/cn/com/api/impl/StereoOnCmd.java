package cn.com.api.impl;

import cn.com.api.Command;
import cn.com.dto.StereoDTO;

public class StereoOnCmd implements Command{
	
	private StereoDTO stereo;
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(22);
	}

	@Override
	public void undo() {
		stereo.offCD();
		stereo.off();
		stereo.setVolume(0);
	}

}
