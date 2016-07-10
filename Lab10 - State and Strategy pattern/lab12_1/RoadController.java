package lab12_1;

public class RoadController {
	private RoadState roadState;
	private RoadState gravelState;
	private RoadState iceState;
	private RoadState wetState;
	private RoadState regularState;

	public RoadController() {
		regularState = new RegularState(this);
		gravelState = new GravelState(this);
		wetState = new WetState(this);
		iceState = new IceState(this);
		roadState = regularState;
	}

	public void setRoadState(RoadState roadState) {
		this.roadState = roadState;
	}

	public RoadState getRoadState() {
		return roadState;
	}

	public void left() {
		roadState.left();
	}

	public void accelerate() {
		roadState.accelerate();
	}

	public void right() {
		roadState.right();
	}

	public void applyBreak() {
		roadState.applyBreak();
	}

	public RoadState getRegularState() {
		return regularState;
	}

	public RoadState getGravelState() {
		return gravelState;
	}

	public RoadState getWetState() {
		return wetState;
	}

	public RoadState getIceState() {
		return iceState;
	}
}
