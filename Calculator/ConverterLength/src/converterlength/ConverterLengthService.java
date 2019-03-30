package converterlength;

public interface ConverterLengthService extends IService{
	public double KMToMiles(ConverterLengthDTO converterLengthDTO);
	public double MilesToKM(ConverterLengthDTO converterLengthDTO);
	public double FeetToMetres(ConverterLengthDTO converterLengthDTO);
	public double MetresToFeet(ConverterLengthDTO converterLengthDTO);
}
