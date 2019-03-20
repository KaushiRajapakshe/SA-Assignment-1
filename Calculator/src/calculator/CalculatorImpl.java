package calculator;

public class CalculatorImpl implements CalculatorService{
	private double answer;

	@Override
	public double add(CalculatorDTO calculatorDTO) {
		if("+" == calculatorDTO.getCharacter()) {
			answer = calculatorDTO.getNumber1() + calculatorDTO.getNumber2();
		}
		return answer;
	}

	@Override
	public double min(CalculatorDTO calculatorDTO) {
		if("-" == calculatorDTO.getCharacter()) {
			answer = calculatorDTO.getNumber1() - calculatorDTO.getNumber2();
		}
		return answer;
	}

	@Override
	public double divide(CalculatorDTO calculatorDTO) {
		if("/" == calculatorDTO.getCharacter()) {
			answer = calculatorDTO.getNumber1() / calculatorDTO.getNumber2();
		}
		return answer;
	}

	@Override
	public double multi(CalculatorDTO calculatorDTO) {
		if("*" == calculatorDTO.getCharacter()) {
			answer = calculatorDTO.getNumber1() * calculatorDTO.getNumber2();
		}
		return answer;
	}
	
	@Override
	public double log(CalculatorDTO calculatorDTO){
		if("log" == calculatorDTO.getCharacter()) {
			answer = Math.log(calculatorDTO.getNumber1());
		}
		return answer;
	}
	
	@Override
	public double sin(CalculatorDTO calculatorDTO){
		if("sin" == calculatorDTO.getCharacter()) {
			answer = Math.sin(calculatorDTO.getNumber1());
		}
		return answer;
	}
	
	@Override
	public double cos(CalculatorDTO calculatorDTO){
		if("cos" == calculatorDTO.getCharacter()) {
			answer = Math.cos(calculatorDTO.getNumber1());
		}
		return answer;
	}
	
	@Override
	public double tan(CalculatorDTO calculatorDTO){
		if("tan" == calculatorDTO.getCharacter()) {
			answer = Math.tan(calculatorDTO.getNumber1());
		}
		return answer;
	}

}
