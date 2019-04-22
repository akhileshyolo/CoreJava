package q3a;

public class Vehicle {
	
	private int vehicle_no;
	private String name;
	private String vehicle_type;
	private int release_year;
	
	public Vehicle(){
		
	}
	
	public Vehicle(int vehicle_no, String name, String vehicle_type,int release_year) {
		super();
		this.vehicle_no = vehicle_no;
		this.name = name;
		this.vehicle_type = vehicle_type;
		this.release_year = release_year;
	}

	public int getVehicle_no() {
		return vehicle_no;
	}

	public void setVehicle_no(int vehicle_no) {
		this.vehicle_no = vehicle_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public int getRelease_year() {
		return release_year;
	}

	public void setRelease_year(int release_year) {
		this.release_year = release_year;
	}
	

	
	

}