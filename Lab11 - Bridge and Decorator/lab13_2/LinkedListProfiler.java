package lab13_2;

import java.util.LinkedList;

public class LinkedListProfiler implements ListProfiler {
	private LinkedList<Object> decorator;

	public LinkedListProfiler() {
		this.decorator = new LinkedList<Object>();
	}

	@Override
	public boolean add(Object e) {
		return decorator.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return decorator.remove(o);
	}

	@Override
	public boolean contains(Object o) {
		return decorator.contains(o);
	}

	@Override
	public int size() {
		return decorator.size();
	}

}
