package calculator;

public class CalculatorDTO {
	private double no1;
	private double no2;
	private String character;
	
	public void setNo1(double no1) {
		this.no1 = no1;
	}

	public void setNo2(double no2) {
		this.no2 = no2;
	}

	public void setCharacter(String character) {
		this.character = character;
	}
	
	public double getNumber1() {
		return this.no1;
	}

	public double getNumber2() {
		return this.no2;
	}
	
	public String getCharacter() {
		return this.character;
	}
}
