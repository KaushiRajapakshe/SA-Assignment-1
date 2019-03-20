package calculator;

public class CalculatorImpl implements CalculatorService {
	 public double add(CalculatorDTO calculatorDTO) {
	       return (calculatorDTO.getNumber1() + calculatorDTO.getNumber2());
	   }
	 public double min(CalculatorDTO calculatorDTO)  {
	       return (calculatorDTO.getNumber1() - calculatorDTO.getNumber2());
	   }
	 public double divide(CalculatorDTO calculatorDTO) {
	       return (calculatorDTO.getNumber1() / calculatorDTO.getNumber2());
	   }
	 public double multi(CalculatorDTO calculatorDTO) {
	       return (calculatorDTO.getNumber1() * calculatorDTO.getNumber2());
	   }
	 public double log(CalculatorDTO calculatorDTO) {
	       return Math.log(calculatorDTO.getNumber1());
	   }
	 public double cos(CalculatorDTO calculatorDTO) {
	       return Math.cos(calculatorDTO.getNumber1());
	   }
	 public double sin(CalculatorDTO calculatorDTO) {
	       return Math.sin(calculatorDTO.getNumber1());
	   }
	 public double tan(CalculatorDTO calculatorDTO) {
	       return Math.tan(calculatorDTO.getNumber1());
	   }
}
