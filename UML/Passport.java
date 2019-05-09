public class Passport {

	private int No;
	private Country country;

	/**
	 * 
	 * @param No
	 * @param country
	 */
	public Passport(int No, Country country) {

	}

	public int getNo() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param No
	 */
	public void setNo(int No) {
		throw new UnsupportedOperationException();
	}

	public Country getCountry() {
		return this.country;
	}

	/**
	 * 
	 * @param country
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

}