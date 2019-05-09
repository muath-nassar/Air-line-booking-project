public final class Follower extends Person {

	private Passport passport;

	/**
	 * 
	 * @param name
	 * @param ssn
	 * @param sex
	 */
	public Follower(String name, int ssn, String sex) {
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

}