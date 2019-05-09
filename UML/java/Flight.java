public class Flight {

	private Plane plane;
	private Pilot pilot;
	private Airport from;
	private Airport to;
	private Timestamp departureTime;
	private Timestamp arrivalTime;
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

	public Timestamp getDepartureTime() {
		return this.departureTime;
	}

	/**
	 * 
	 * @param departureTime
	 */
	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}

	public Timestamp getArrivalTime() {
		return this.arrivalTime;
	}

	/**
	 * 
	 * @param arrivalTime
	 */
	public void setArrivalTime(Timestamp arrivalTime) {
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

	/**
	 * 
	 * @param passportExpireDate
	 * @param flightDepartureDate
	 */
	private static boolean isValidFlightDate(Date passportExpireDate, Date flightDepartureDate) {
		throw new UnsupportedOperationException();
	}

}