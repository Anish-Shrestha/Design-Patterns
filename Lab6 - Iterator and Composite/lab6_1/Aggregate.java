package lab6_1;

public interface Aggregate {
	public Iterator getIterator(Predicate<String> functor);
}
