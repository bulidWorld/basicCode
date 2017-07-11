package cn.com.api;

public interface Command {
	void execute();
	
	void undo();
}
