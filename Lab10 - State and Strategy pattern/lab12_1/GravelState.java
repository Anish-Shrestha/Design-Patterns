package lab12_1;

public class GravelState implements RoadState {
	RoadController roadController;

	public GravelState(RoadController roadController) {
		this.roadController = roadController;
	}

	@Override
	public void left() {
		System.out.println("3");
	}

	@Override
	public void accelerate() {
		System.out.println("7");
		roadController.setRoadState(roadController.getIceState());
	}

	@Override
	public void right() {
		System.out.println("3");
	}

	@Override
	public void applyBreak() {
		System.out.println("6");
	}
}
