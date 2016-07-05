import java.text.SimpleDateFormat;
import java.util.Date;

public class Epoch {
	
	public String convertFromEpoch(long Epoch) {
		// long Epoch to readable TimeStamp
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		String convertedEpoch = sdf.format(new Date(Epoch));
		return convertedEpoch;
	}
	
	public long convertToEpoch(String TimeStamp) throws Exception {
		// readable TimeStamp to long Epoch
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		Date date = sdf.parse(TimeStamp);
		long epoch = date.getTime();
		return epoch;
	}
	
}
