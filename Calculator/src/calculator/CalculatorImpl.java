package calculator;

public class CalculatorImpl implements CalculatorService {
	 public double add(double a, double b) {
	       return a+ b;
	   }
	 public double min(double a, double b)  {
	       return a- b;
	   }
	 public double divide(double a, double b) {
	       return a/ b;
	   }
	 public double multi(double a, double b) {
	       return a* b;
	   }
	 public double log(double a) {
	       return Math.log(a);
	   }
	 public double cos(double a) {
	       return Math.cos(a);
	   }
	 public double sin(double a) {
	       return Math.sin(a);
	   }
	 public double tan(double a) {
	       return Math.tan(a);
	   }
}
