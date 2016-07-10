package chainofrespexam;

public class ChainBuilder {
	private TemplateHandler handler;

	// other necessary code here
	private void buildChain() {
		TemplateHandler imageTemplate = new ImageTemplate();
		TemplateHandler singleTemplate = new SingleTemplate();
		TemplateHandler categoryTemplate = new CategoryTemplate();
		TemplateHandler archiveTemplate = new ArchiveTemplate();
		TemplateHandler genericTemplate = new GenericTemplate();
		imageTemplate.nextTemplate = singleTemplate;
		singleTemplate.nextTemplate = categoryTemplate;
		categoryTemplate.nextTemplate = archiveTemplate;
		archiveTemplate.nextTemplate = genericTemplate;
		handler = imageTemplate;
	}

	public TemplateHandler getHandler() {
		buildChain();
		return handler;
	}
}