package chainofrespexam;

import java.util.List;

/**
 * @author Chandra Prakash Panday
 */
public class ImageTemplate extends TemplateHandler {

	@Override
	public void handleRequest(List<String> contents) {
		if (contents.contains("image") && !contents.contains("post") && !contents.contains("category")
				&& !contents.contains("archive") && !contents.contains("frontpage")) {
			System.out.println("Handled by ImageTemplate");
		} else {
			if (this.nextTemplate != null) {
				System.out.println("Forwared to SingleTemplate");
				nextTemplate.handleRequest(contents);
			}
		}

	}

}
