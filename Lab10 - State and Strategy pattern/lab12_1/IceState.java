package lab12_1;

public class IceState implements RoadState {
	RoadController roadController;

	public IceState(RoadController roadController) {
		this.roadController = roadController;
	}

	@Override
	public void left() {
		System.out.println("1");
	}

	@Override
	public void accelerate() {
		System.out.println("3");
		roadController.setRoadState(roadController.getWetState());
	}

	@Override
	public void right() {
		System.out.println("1");
	}

	@Override
	public void applyBreak() {
		System.out.println("2");
	}

}
