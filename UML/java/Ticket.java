public class Ticket {

	private int ticketNo;
	private Flight flight;
	private Traveller passenger;

	public Ticket() {
		throw new UnsupportedOperationException();
	}

	public Flight selectFlight() {
		throw new UnsupportedOperationException();
	}

	public float calcPrice() {
		throw new UnsupportedOperationException();
	}

	public void printDetails() {
		throw new UnsupportedOperationException();
	}

	public Flight getFlight() {
		return this.flight;
	}

	/**
	 * 
	 * @param flight
	 */
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public int getTicketNo() {
		return this.ticketNo;
	}

	/**
	 * 
	 * @param ticketNo
	 */
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public Traveller getPassenger() {
		return this.passenger;
	}

	/**
	 * 
	 * @param passenger
	 */
	public void setPassenger(Traveller passenger) {
		this.passenger = passenger;
	}

}