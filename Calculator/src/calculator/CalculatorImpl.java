package calculator;

public class CalculatorImpl implements CalculatorService{
	private double answer;

	@Override
	public double add(CalculatorDTO calculatorDTO) {
		if(calculatorDTO.getCharacter().equals("+")) {
			answer = calculatorDTO.getNumber1() + calculatorDTO.getNumber2();
		}
		return answer;
	}

	@Override
	public double min(CalculatorDTO calculatorDTO) {
		if(calculatorDTO.getCharacter().equals("-")) {
			answer = calculatorDTO.getNumber1() - calculatorDTO.getNumber2();
		}
		return answer;
	}

	@Override
	public double divide(CalculatorDTO calculatorDTO) {
		if(calculatorDTO.getCharacter().equals("/")) {
			answer = calculatorDTO.getNumber1() / calculatorDTO.getNumber2();
		}
		return answer;
	}

	@Override
	public double multi(CalculatorDTO calculatorDTO) {
		if(calculatorDTO.getCharacter().equals("*")) {
			answer = calculatorDTO.getNumber1() * calculatorDTO.getNumber2();
		}
		return answer;
	}
	
	@Override
	public double log(CalculatorDTO calculatorDTO){
		if(calculatorDTO.getCharacter().equals("log")) {
			answer = Math.log(calculatorDTO.getNumber1());
		}
		return answer;
	}
	
	@Override
	public double sin(CalculatorDTO calculatorDTO){
		if(calculatorDTO.getCharacter().equals("sin")) {
			answer = Math.sin(calculatorDTO.getNumber1());
		}
		return answer;
	}
	
	@Override
	public double cos(CalculatorDTO calculatorDTO){
		if(calculatorDTO.getCharacter().equals("cos")) {
			answer = Math.cos(calculatorDTO.getNumber1());
		}
		return answer;
	}
	
	@Override
	public double tan(CalculatorDTO calculatorDTO){
		if(calculatorDTO.getCharacter().equals("tan")) {
			answer = Math.tan(calculatorDTO.getNumber1());
		}
		return answer;
	}

}
