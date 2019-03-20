package convertertemperature;

public interface ConverterTemperatureService extends IService{
	public double CelciusToFahrenheit(ConverterTemperatureDTO converterTemperatureDTO);
	public double FahrenheightToCelcius(ConverterTemperatureDTO converterTemperatureDTO);
}
