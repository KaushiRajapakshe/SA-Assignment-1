package calculator;

public interface CalculatorService extends IService{
	public double add(CalculatorDTO calculatorDTO);
	public double min(CalculatorDTO calculatorDTO);
	public double divide(CalculatorDTO calculatorDTO);
	public double multi(CalculatorDTO calculatorDTO);
	public double log(CalculatorDTO calculatorDTO);
	public double cos(CalculatorDTO calculatorDTO);
	public double sin(CalculatorDTO calculatorDTO);
	public double tan(CalculatorDTO calculatorDTO);
}
