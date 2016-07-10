package lab12_1;

public class RegularState implements RoadState {
	RoadController roadController;

	public RegularState(RoadController roadController) {
		this.roadController = roadController;
	}

	@Override
	public void left() {
		System.out.println("5");
	}

	@Override
	public void accelerate() {
		System.out.println("9");
		roadController.setRoadState(roadController.getGravelState());
	}

	@Override
	public void right() {
		System.out.println("5");
	}

	@Override
	public void applyBreak() {
		System.out.println("8");
	}
}