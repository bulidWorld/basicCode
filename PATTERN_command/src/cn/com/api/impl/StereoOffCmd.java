package cn.com.api.impl;

import cn.com.dto.StereoDTO;

public class StereoOffCmd {
	
	private StereoDTO stereo;
	
	public StereoOffCmd(StereoDTO stereo) {
		this.stereo = stereo;
	}
	
	public void off(){
		stereo.offCD();
		stereo.off();
		stereo.setVolume(0);
	}
	
	public void undo(){
		stereo.on();
		stereo.setCD();
		stereo.setVolume(22);
	}
}
