package lab5_1;

public class FileTrace implements Trace {
	private boolean debug = false;

	@Override
	public void setDebug(boolean debug) {
		this.debug = debug;

	}

	@Override
	public void debug(String message) {
		if (debug) {
			System.out.println("FILE DEBUG: setDebug():" + message);
		}

	}

	@Override
	public void error(String message) {
		System.err.println("FILE ERROR: setDebug():" + message);

	}

}
