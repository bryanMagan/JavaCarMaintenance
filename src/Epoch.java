import java.text.SimpleDateFormat;
import java.util.Date;

public class Epoch {
	
	public String convertFromEpoch(long epoch) {
		// long Epoch to readable TimeStamp
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		String convertedEpoch = sdf.format(new Date(epoch));
		return convertedEpoch;
	}
	
	public long convertToEpoch(String timeStamp) throws Exception {
		// readable TimeStamp to long Epoch
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		Date date = sdf.parse(timeStamp);
		long epoch = date.getTime();
		return epoch;
	}
	
} // end Class Epoch
