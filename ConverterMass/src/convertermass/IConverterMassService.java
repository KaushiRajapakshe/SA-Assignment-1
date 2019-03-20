package convertermass;


public interface IConverterMassService extends IService{
	public double KgToPounds(ConverterMassDTO converterDTO);
	public double PoundsToKg(ConverterMassDTO converterDTO);
}
