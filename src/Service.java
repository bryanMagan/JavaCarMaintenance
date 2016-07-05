import java.io.Serializable;

public class Service {

	Car myVehicle = new Car();
	Epoch theEpoch = new Epoch();
	
	public int idTag = 0;
	public int idCar = 0;
	public String type;
	public Long date = null;
	public int mileage = 0;

//	private Service () {}
	
	public Service(int IDTAG, int IDCAR, String TYPE, Long DATE) {
		idTag = IDTAG;
		idCar = IDCAR;
		type = TYPE;
		date = DATE;
	}

	public Service(int IDTAG, int IDCAR, String TYPE, Long DATE, int MILEAGE) { // overload
		idTag = IDTAG;
		idCar = IDCAR;
		type = TYPE;
		date = DATE;
		mileage = MILEAGE;
	}

	public String toString () {
//		return type + " " + theEpoch.convertFromEpoch(date) + " " + mileage;
		return type + " " + myVehicle.getCarIDName(idCar) + " " + theEpoch.convertFromEpoch(date) + " " + mileage;
	}
	
	public int getIDTag() { // getter idTag
		return idTag;
	}

	public int getIDCar() { // getter idVehicle
		return idCar;
	}
	
	public String getType() { // getter type
		return type;
	}

	public Long getDate() { // getter date
		return date;
	}

	public int getMileage() { // getter mileage
		return mileage;
	}

} // end Class Service
