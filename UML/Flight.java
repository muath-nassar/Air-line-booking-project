public class Flight {

	private Plane plane;
	private Pilot pilot;
	private Airport from;
	private Airport to;
	private TimeStamp departureTime;
	private TimeStamp arrivalTime;
	private float price;

	public Flight() {
		throw new UnsupportedOperationException();
	}

	public Plane getPlane() {
		return this.plane;
	}

	/**
	 * 
	 * @param plane
	 */
	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public Pilot getPilot() {
		return this.pilot;
	}

	/**
	 * 
	 * @param pilot
	 */
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public Airport getFrom() {
		return this.from;
	}

	/**
	 * 
	 * @param from
	 */
	public void setFrom(Airport from) {
		this.from = from;
	}

	public Airport getTo() {
		return this.to;
	}

	/**
	 * 
	 * @param to
	 */
	public void setTo(Airport to) {
		this.to = to;
	}

	public TimeStamp getDepartureTime() {
		return this.departureTime;
	}

	/**
	 * 
	 * @param departureTime
	 */
	public void setDepartureTime(TimeStamp departureTime) {
		this.departureTime = departureTime;
	}

	public TimeStamp getArrivalTime() {
		return this.arrivalTime;
	}

	/**
	 * 
	 * @param arrivalTime
	 */
	public void setArrivalTime(TimeStamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public float getPrice() {
		return this.price;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}

}