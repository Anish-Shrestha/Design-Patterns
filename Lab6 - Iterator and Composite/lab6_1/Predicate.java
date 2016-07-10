package lab6_1;

@FunctionalInterface
public interface Predicate<T> {
	public boolean check(T t);
}
