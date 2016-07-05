import java.text.NumberFormat;

public class Mileage {

	public String mileageFormat(int miles) {
		// formats mileage with commas
		String mileage = "";
		mileage = NumberFormat.getIntegerInstance().format(miles);
		return mileage;
	}
	
} // end Class Mileage