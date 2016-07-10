package chainofrespexam;

import java.util.List;

public abstract class TemplateHandler {
	protected TemplateHandler nextTemplate;

	public abstract void handleRequest(List<String> contents);

}