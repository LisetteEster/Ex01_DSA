package de.unistuttgart.vis.dsass2019.ex01.p2;

public class SpeedList<T> implements ISpeedList<T> {

	private Node<T> head;
	
	@Override
	public int size() {
		
		return 0;
	}

	@Override
	public void prepend(T t) {
		head = new Node<>(t, head);
	}

	@Override
	public T getElementAt(int pos) {
		
		return null;
	}

	@Override
	public T getNext8thElementOf(int pos) {
		
		return null;
	}


}
