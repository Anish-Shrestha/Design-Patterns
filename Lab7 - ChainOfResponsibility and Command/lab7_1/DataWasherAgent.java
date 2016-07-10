package lab7_1;

import java.util.List;

/**
 * The Data Washer will do some analysis on each request and generate sales
 * leads before passing them to the third/last process, called Reporter.
 */
public class DataWasherAgent extends AbstractAgent {

	@Override
	public void handleRequest(List<CallRecord> callRecords) {
		System.out.println("\n\nINFO: Analysing Requests. . .");
		for(CallRecord callRecord: callRecords){
			callRecord.setASalesLead(true);
		}
		if (this.nextAgent != null)
			this.nextAgent.handleRequest(callRecords);
	}
	
}
