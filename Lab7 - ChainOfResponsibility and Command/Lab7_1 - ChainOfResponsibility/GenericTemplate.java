package chainofrespexam;

import java.util.List;

/**
 * @author Chandra Prakash Panday
 */
public class GenericTemplate extends TemplateHandler{

	@Override
	public void handleRequest(List<String> contents) {
		if(contents.contains("image") && contents.contains("post") && contents.contains("category")
				&& contents.contains("archive") && contents.contains("frontpage")){
			System.out.println("Handled by GenericTemplate");
		}else{
			if(this.nextTemplate != null){
				nextTemplate.handleRequest(contents);
			}else{
				System.err.println("Cannot Handle right now");
			}
			
		}
	}
}
