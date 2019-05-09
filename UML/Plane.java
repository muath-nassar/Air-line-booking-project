public class Plane {

	private int seatsNumber;
	private String name;
	private int id;

	public Plane() {
		throw new UnsupportedOperationException();
	}

	public int getSeatsNumber() {
		return this.seatsNumber;
	}

	/**
	 * 
	 * @param seatsNumber
	 */
	public void setSeatsNumber(int seatsNumber) {
		this.seatsNumber = seatsNumber;
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

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

}