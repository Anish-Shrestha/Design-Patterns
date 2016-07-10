package lab5_1;

public class FactoryMethodClient {
	public static void main(String[] args) {
		TraceFactory factory = TraceFactory.getFactory();
		Trace traceFile = factory.createTrace("trace.log");
		traceFile.setDebug(true);
		traceFile.debug("Debug write contents in file");
		traceFile.error("Error Write contents in file");
		
		Trace traceConsole = factory.createTrace("console");
		traceConsole.setDebug(true);
		traceConsole.debug("Debug write contents in console");
		traceConsole.error("Error Write contents in console");
	}
}