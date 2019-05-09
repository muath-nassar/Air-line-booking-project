public class Timestamp {

	private Date date;
	private Time time;

	/**
	 * 
	 * @param date
	 * @param time
	 */
	public Timestamp(Date date, Time time) {
		throw new UnsupportedOperationException();
	}

	public Time getTime() {
		return this.time;
	}

	/**
	 * 
	 * @param time
	 */
	public void setTime(int time) {
		throw new UnsupportedOperationException();
	}

	public Date getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

}