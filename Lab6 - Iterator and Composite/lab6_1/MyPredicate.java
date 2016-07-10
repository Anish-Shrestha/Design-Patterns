package lab6_1;

public class MyPredicate implements Predicate<String> {

	@Override
	public boolean check(String s) {
		if (s.equalsIgnoreCase("-"))
			return false;
		return true;
	}
}
