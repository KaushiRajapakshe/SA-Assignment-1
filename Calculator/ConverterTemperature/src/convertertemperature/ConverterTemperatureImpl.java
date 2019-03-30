package convertertemperature;

public class ConverterTemperatureImpl implements ConverterTemperatureService{
	public double CelciusToFahrenheit(ConverterTemperatureDTO converterTemperatureDTO) {
		if(converterTemperatureDTO.getType() == 1) {
			return ((converterTemperatureDTO.getTemperature() * 9 / 5 ) + 32);
		}
		return -1;
	}
	public double FahrenheightToCelcius(ConverterTemperatureDTO converterTemperatureDTO) {
		if(converterTemperatureDTO.getType() == 2) {
			return ((converterTemperatureDTO.getTemperature() - 32 ) * 5 / 9);
		}
		return -1;
	}
}
