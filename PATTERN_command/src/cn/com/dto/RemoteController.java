package cn.com.dto;

import cn.com.api.Command;
import cn.com.api.impl.NoCmd;

public class RemoteController {
	private Command[] onCommonds;
	private Command[] offCommonds;
	private Command undoCmd;
	
	public RemoteController(){
		init();
	}
	
	public void pressOn(int slot){
		onCommonds[slot].execute();
		undoCmd = onCommonds[slot];
	}
	
	public void pressOff(int slot){
		offCommonds[slot].execute();
		undoCmd = offCommonds[slot];
	}
	
	public void pressUndo(){
		undoCmd.undo();
	}
	
	private void init() {
		onCommonds = new Command[7];
		offCommonds = new Command[7];
		
		Command noCmd = new NoCmd();
		
		for (int i = 0; i < offCommonds.length; i++) {
			onCommonds[i] = noCmd;
			offCommonds[i] = noCmd;
		}
		
		undoCmd = noCmd;
	}
	
	
	
	
}
