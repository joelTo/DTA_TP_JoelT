package dta.chat.model;

import java.util.ArrayList;
import java.util.List;

public abstract class ChatObervable<T> {

	List<ChatObserver<T>> observer = new ArrayList<>();

	public void addObserver(ChatObserver<T> observer) {
		this.observer.add(observer);
	}

	public void removeObserver(ChatObserver<T> observer) {
		this.observer.remove(observer);
	}

	public void notifyObservers(T msg) {
		this.observer.forEach(obs -> obs.update(msg));
	}

}
