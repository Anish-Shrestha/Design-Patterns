package lab13_2;

public class TimeProfiler extends ListDecorator {

	public TimeProfiler(ListProfiler listProfiler) {
		super(listProfiler);
	}
	
	@Override
	public boolean add(Object e) {
		long startTime = getCurrentTime();
		boolean addFlag = super.add(e);
		System.out.println("Time taken in Add() : " + (getCurrentTime() - startTime));
		return addFlag;
	}
	@Override
	public boolean contains(Object e) {
		long startTime = getCurrentTime();
		boolean checkContains = super.contains(e);
		System.out.println("Time taken in Contains() : " + (getCurrentTime() - startTime));
		return checkContains;
	}

	@Override
	public boolean remove(Object e) {
		long startTime = getCurrentTime();
		boolean removeFlag = super.remove(e);
		System.out.println("Time taken in Remove() : " + (getCurrentTime() - startTime));
		return removeFlag;
	}

	@Override
	public int size() {
		long startTime = getCurrentTime();
		int size = super.size();
		System.out.println("Time taken in Size() : " + (getCurrentTime() - startTime));
		return size;
	}
	
	//Extra functionality
	private long getCurrentTime(){
		return System.nanoTime();
	}

}