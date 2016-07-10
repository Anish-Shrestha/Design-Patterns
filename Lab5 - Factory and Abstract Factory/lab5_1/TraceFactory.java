package lab5_1;

public class TraceFactory implements Factory {
	private static TraceFactory factory = new TraceFactory();

	private TraceFactory() {
	}

	public static TraceFactory getFactory() {
		return factory;
	}

	@Override
	public Trace createTrace(String traceType) {
		Trace trace = null;
		if (traceType.equals("trace.log")) {
			trace = new FileTrace();
		} else {
			if (traceType.equals("console")) {
				trace = new ConsoleTrace();
			}
		}
		return trace;
	}

}
