public class Traveller extends Person {

	private Passport passport;
	private ArrayList followers;
	private String reason;

	/**
	 * 
	 * @param name
	 * @param passport
	 */
	public Traveller(String name, Passport passport) {
		throw new UnsupportedOperationException();
	}

	public Passport getPassport() {
		return this.passport;
	}

	/**
	 * 
	 * @param passport
	 */
	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public String getReason() {
		return this.reason;
	}

	/**
	 * 
	 * @param reason
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	public void bookTicket() {
		throw new UnsupportedOperationException();
	}

	public void cancelTicket() {
		throw new UnsupportedOperationException();
	}

	public void pay() {
		throw new UnsupportedOperationException();
	}

	public void addFollowers() {
		throw new UnsupportedOperationException();
	}

}