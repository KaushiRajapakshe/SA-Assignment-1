package converterlength;

public class ConverterLengthImpl implements ConverterLengthService{
	public double KMToMiles(ConverterLengthDTO converterLengthDTO) {
		if(converterLengthDTO.getType() == 1) {
			return (converterLengthDTO.getLength() / 1.609);
		}
		return -1;
	}
	public double MilesToKM(ConverterLengthDTO converterLengthDTO) {
		if(converterLengthDTO.getType() == 2) {
			return (converterLengthDTO.getLength() * 1.609);
		}
		return -1;
	}
	public double FeetToMetres(ConverterLengthDTO converterLengthDTO) {
		if(converterLengthDTO.getType() == 3) {
			return (converterLengthDTO.getLength() / 3.28);
		}
		return -1;
	}
	public double MetresToFeet(ConverterLengthDTO converterLengthDTO) {
		if(converterLengthDTO.getType() == 4) {
			return (converterLengthDTO.getLength() * 3.28);
		}
		return -1;
	}
}
