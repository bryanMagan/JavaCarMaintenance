import java.io.Serializable;

public class Service {

	Car myVehicle = new Car();
	ServiceType myServiceType = new ServiceType();
	Epoch theEpoch = new Epoch();
	Mileage theMileage = new Mileage();
	
	public int idTag = 0;
	public int idCar = 0;
	public int idType = 0;
	public Long date = null;
	public int mileage = 0;

//	private Service () {}
	
	public Service(int IDTAG, int IDCAR, int IDTYPE, Long DATE) {
		idTag = IDTAG;
		idCar = IDCAR;
		idType = IDTYPE;
		date = DATE;
	}

	public Service(int IDTAG, int IDCAR, int IDTYPE, Long DATE, int MILEAGE) { // overload
		idTag = IDTAG;
		idCar = IDCAR;
		idType = IDTYPE;
		date = DATE;
		mileage = MILEAGE;
	}

	public String toString () {
		return myServiceType.getServiceIDName(idType) + ", " + myVehicle.getCarIDName(idCar) 
		+ ", " + theEpoch.convertFromEpoch(date) + ", " + theMileage.mileageFormat(mileage);
	}
	
	public int getIDTag() { // getter idTag
		return idTag;
	}

	public int getIDCar() { // getter idVehicle
		return idCar;
	}
	
	public int getIDType() { // getter type
		return idType;
	}

	public Long getDate() { // getter date
		return date;
	}

	public int getMileage() { // getter mileage
		return mileage;
	}

} // end Class Service
