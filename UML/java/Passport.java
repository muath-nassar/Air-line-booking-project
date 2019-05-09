public class Passport {

	private int No;
	private Country country;
	private Date expireDate;

	/**
	 * 
	 * @param No
	 * @param country
	 */
	public Passport(int No, Country country) {
		throw new UnsupportedOperationException();
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

	public Date getExpireDate() {
		return this.expireDate;
	}

	/**
	 * 
	 * @param expireDate
	 */
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

}