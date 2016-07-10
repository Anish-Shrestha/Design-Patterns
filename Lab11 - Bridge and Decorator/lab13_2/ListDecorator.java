package lab13_2;

public abstract class ListDecorator implements ListProfiler {

	protected ListProfiler listProfiler;

	public ListDecorator(ListProfiler decoratedList) {
		this.listProfiler = decoratedList;
	}

	@Override
	public boolean add(Object e) {
		return listProfiler.add(e);
	}

	@Override
	public boolean contains(Object e) {
		return listProfiler.contains(e);
	}

	@Override
	public boolean remove(Object e) {
		return listProfiler.remove(e);
	}

	@Override
	public int size() {
		return listProfiler.size();
	}

}
