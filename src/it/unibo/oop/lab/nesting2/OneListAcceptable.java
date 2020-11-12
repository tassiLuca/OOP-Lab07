package it.unibo.oop.lab.nesting2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> list;
	
	public OneListAcceptable(final List<T> list) {
		this.list = new ArrayList<>(list);
	}
	
	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			/* [NOTE] Access the filed via enclosign istance */
			final Iterator<T> it = OneListAcceptable.this.list.iterator();
			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if (!newElement.equals(it.next())) {
					throw new Acceptor.ElementNotAcceptedException(newElement);
				}
			}

			@Override
			public void end() throws EndNotAcceptedException {
				if (it.hasNext()) {
					throw new Acceptor.EndNotAcceptedException();
				}
			}			
		};
	}	
	
}
