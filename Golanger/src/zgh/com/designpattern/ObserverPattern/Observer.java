package zgh.com.designpattern.ObserverPattern;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
