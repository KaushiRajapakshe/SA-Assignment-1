package convertermass;


public class ConverterMassImpl implements IConverterMassService{
	public double KgToPounds(ConverterMassDTO converterDTO) {
		if(converterDTO.getType() == 1) {
			return (2.2 * converterDTO.getWeight());
		}
		return -1;
	}
	public double PoundsToKg(ConverterMassDTO converterDTO) {
		if(converterDTO.getType() == 2) {
			return converterDTO.getWeight() / 2.2;
		}
		return -1;
	}
}
