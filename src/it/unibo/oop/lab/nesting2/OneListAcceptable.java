package it.unibo.oop.lab.nesting2;

import java.util.ArrayList;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> list;
	
	public OneListAcceptable(final List<T> list) {
		this.list = new ArrayList<>(list);
	}
	
	@Override
	public Acceptor<T> acceptor() {
		// TODO Auto-generated method stub
		return null;
	}	
	
}
