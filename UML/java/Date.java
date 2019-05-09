public class Date {

	private int day;
	private int month;
	private int year;

	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		throw new UnsupportedOperationException();
	}

	public int getDay() {
		return this.day;
	}

	/**
	 * 
	 * @param day
	 */
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return this.month;
	}

	/**
	 * 
	 * @param month
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return this.year;
	}

	/**
	 * 
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
	}

}