package lab12_1;

public class Client {
	public static void main(String[] args) {
		try {
			RoadController roadController = new RoadController();

			System.err.println("=====" + roadController.getRoadState().getClass().getName() + " State=====\n");
			roadController.left();
			roadController.right();
			roadController.applyBreak();
			roadController.accelerate();

			Thread.sleep(1000);
			System.err.println("=====" + roadController.getRoadState().getClass().getName() + " State=====");
			roadController.left();
			roadController.right();
			roadController.applyBreak();
			roadController.accelerate();
			
			Thread.sleep(1000);
			System.err.println("=====" + roadController.getRoadState().getClass().getName() + " State=====");
			roadController.left();
			roadController.right();
			roadController.applyBreak();
			roadController.accelerate();
			
			Thread.sleep(1000);
			System.err.println("=====" + roadController.getRoadState().getClass().getName() + " State=====");
			roadController.left();
			roadController.right();
			roadController.applyBreak();
			roadController.accelerate();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
