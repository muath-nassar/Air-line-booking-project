public class Airport {

	private Country country;
	private String city;
	private String name;

	/**
	 * 
	 * @param country
	 */
	public Airport(Country country) {
		throw new UnsupportedOperationException();
	}

	public String getCity() {
		return this.city;
	}

	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
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