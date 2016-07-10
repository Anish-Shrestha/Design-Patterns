package lab13_2;

import java.util.ArrayList;

public class ArrayListProfiler implements ListProfiler {
	private ArrayList<Object> decorator;

	public ArrayListProfiler() {
		this.decorator = new ArrayList<Object>();
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
