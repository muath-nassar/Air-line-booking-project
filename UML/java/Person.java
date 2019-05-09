public abstract class Person {

	private String name;
	private int ssn;
	private String sex;
	private Country nationality;
	private Date dateOfBirth;

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

	public int getSsn() {
		return this.ssn;
	}

	/**
	 * 
	 * @param ssn
	 */
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getSex() {
		return this.sex;
	}

	/**
	 * 
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	public Country getNationality() {
		return this.nationality;
	}

	/**
	 * 
	 * @param nationality
	 */
	public void setNationality(Country nationality) {
		this.nationality = nationality;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	/**
	 * 
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}