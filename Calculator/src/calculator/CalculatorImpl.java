package calculator;

public class CalculatorImpl implements ICalculatorService{
	private double answer;

	@Override
	public double sum(CalculatorDTO calculatorDTO) {
		if('+' == calculatorDTO.getCharacter()) {
			answer = calculatorDTO.getNumber1() + calculatorDTO.getNumber2();
		}
		return answer;
	}

	@Override
	public double min(CalculatorDTO calculatorDTO) {
		if('-' == calculatorDTO.getCharacter()) {
			answer = calculatorDTO.getNumber1() - calculatorDTO.getNumber2();
		}
		return answer;
	}

	@Override
	public double divide(CalculatorDTO calculatorDTO) {
		if('/' == calculatorDTO.getCharacter()) {
			answer = calculatorDTO.getNumber1() / calculatorDTO.getNumber2();
		}
		return answer;
	}

	@Override
	public double multi(CalculatorDTO calculatorDTO) {
		if('*' == calculatorDTO.getCharacter()) {
			answer = calculatorDTO.getNumber1() * calculatorDTO.getNumber2();
		}
		return answer;
	}

}
