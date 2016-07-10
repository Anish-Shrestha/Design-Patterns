package lab12_1;

public class WetState implements RoadState {
	RoadController roadController;

	public WetState(RoadController roadController) {
		this.roadController = roadController;
	}

	@Override
	public void left() {
		System.out.println("4");
	}

	@Override
	public void accelerate() {
		System.out.println("9");
		roadController.setRoadState(roadController.getRegularState());
	}

	@Override
	public void right() {
		System.out.println("4");
	}

	@Override
	public void applyBreak() {
		System.out.println("7");
	}

}
