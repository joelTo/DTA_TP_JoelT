package dta.chat.model;

public interface ChatObserver<T> {

	void update(T msg);
}
