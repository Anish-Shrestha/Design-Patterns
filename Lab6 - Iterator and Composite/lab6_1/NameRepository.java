package lab6_1;

public class NameRepository implements Aggregate {
	private String names[][] = new String[][] { { "Robert", "Bruce" }, { "Jon", "Cena" }, { "Julie", "Sherry" },
			{ "-", "-" }, { "Pat", "George" } };

	@Override
	public Iterator getIterator(Predicate<String> predicate) {
		return new NameIterator(predicate);
	}

	private class NameIterator implements Iterator {
		int row;
		int col;
		private Predicate<String> predicate;

		public NameIterator(Predicate<String> predicate) {
			this.predicate = predicate;
		}

		@Override
		public boolean hasNext() {
			int rowTotal = names.length;
			int colTotal = names[row].length;
			if (col >= colTotal) {
				col = 0;
				row++;
			}
			if (row < rowTotal)
				return true;
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {

				String element = names[row][col];
				col++;
				if (predicate.check(element)) {
					return element;
				} else {
					return next();
				}
			}
			return null;
		}

	}
}
