package lab5_1;

public class ConsoleTrace implements Trace {
	private boolean debug = false;

	@Override
	public void setDebug(boolean debug) {
		this.debug = debug;

	}

	@Override
	public void debug(String message) {
		if (debug) {
			System.out.println("CONSOLE DEBUG: setDebug():" + message);
		}

	}

	@Override
	public void error(String message) {
		System.err.println("CONSOLE ERROR: setDebug():" + message);

	}

}
