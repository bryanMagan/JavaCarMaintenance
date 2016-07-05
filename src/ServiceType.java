
public class ServiceType {

	public String getServiceIDName(int typeID) {
//		String serviceName = "";
		switch (typeID) {
		case 1:		return "Oil Change";
		case 2:		return "Tire Rotation";
		case 3:		return "New Battery";
		case 4:		return "Serpentine Belt";
		default:	return "ERROR";
		}
//		return serviceName;
	}
	
}
