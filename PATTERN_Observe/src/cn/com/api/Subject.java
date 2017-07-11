package cn.com.api;

public interface Subject {
	void registerObserve(Observable notify);
	
	void notifyOberve();
	
	boolean removeObserve(Observable observe);

	void measureChanged();
	
}
