import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class ServiceList {

	private ArrayList<Service> serviceList;
	Epoch theEpoch = new Epoch();

	int intIDTag;
	String strType;
	long longDate;
	int intMileage;
	
	public ServiceList() {
		// fills ArrayList serviceList
		serviceList = new ArrayList<Service>();
		// idTag, type, date, mileage
		this.serviceList.add(new Service(111, "New Battery", 1388077200000L, 78500));
		this.serviceList.add(new Service(114, "Serpentine Belt", 1436112000000L, 95450));
		this.serviceList.add(new Service(113, "Tire Rotation", 1466524800000L, 103725));
//		this.serviceList.add(new Service(114, "Oil Change", 1467043200000L, 103825));
		
	}
		
	public int getServiceListSize() {
		// get size of ArrayList serviceList
		return this.serviceList.size();
	}
	
	public String toString() {
		String returnString = "";
		int numList = 1;
//		for (int i = 0; i > getServiceListSize(); i++) {
//			returnString += numList + ": " + serviceList + "\n";
//			numList++;
//		}
		for (Service serviceIterator: serviceList) {
			returnString += numList + ": " + serviceIterator.toString() + "\n";
			numList++;			
		}
		System.out.print(returnString);		
		return returnString;
	}
	
	public Service getService(int whichService) {
		// selects specific Event
		return this.serviceList.get(whichService);
	}
	
	public void addService() {
		// adds new Event to ArrayList serviceList
		this.serviceList.add(new Service(114, "Oil Change", 1467043200000L, 103825));
//		Service newService = new Service(intIDTag, strType, longDate, intMileage);
//		this.serviceList.add(newService);
	}

//	public void updateService() {
//		// updates selected existing Event 
//		int servicePosition = Integer.parseInt(s);
//		Service updateService = new Service(intIDTag, strType, longDate, intMileage);
//		this.serviceList.add(updateService);
//	}

//	public void deleteService() {
//		// deletes selected Event
//		int servicePosition = Integer.parseInt(s);
//		this.serviceList.remove(servicePosition);
//	}
	
	public void sortID() {
		// sorts by Event IDTag
		
	}
	
	public void sortType() {
		// sorts by Event Type
		Collections.sort(serviceList, new Comparator<Object>() {
			public int compare(Object type1, Object type2) {
				return ((Service)type1).type.compareTo(((Service)type2).type);
			}
		});
	}
	
	public void sortDate() {
		// sorts by Event Date
		
	}

	public void sortMileage() {
		// sorts by Event Mileage
		
	}
	
} // end Class ServiceList
