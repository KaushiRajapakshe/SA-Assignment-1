package mathsapp;

import java.util.Scanner;

import calculator.CalculatorDTO;
import calculator.CalculatorService;
import converterlength.ConverterLengthDTO;
import converterlength.ConverterLengthService;
import convertermass.ConverterMassDTO;
import convertermass.IConverterMassService;
import convertertemperature.ConverterTemperatureDTO;
import convertertemperature.ConverterTemperatureService;
import maths_quiz.EasyLevel;
import maths_quiz.HardLevel;
import maths_quiz.Level;
import maths_quiz.QuizService;


public class FrontController {
	private final String plus = "+";
	private final String min = "-";
	private final String div = "/";
	private final String multi = "*";
	private final String log = "log";
	private final String sin = "sin";
	private final String cos = "cos";
	private final String tan = "tan";
	private double value;

	Scanner sc = new Scanner(System.in);
	public void actionCalculator(double no1, double no2, String character, CalculatorService iCalculatorService) {
		CalculatorDTO calculatorDTO = new CalculatorDTO();
        calculatorDTO.setNo1(no1);
        calculatorDTO.setNo2(no2);
        calculatorDTO.setCharacter(character);
        if(plus == character) {
            System.out.println("Answer is : " + iCalculatorService.add(calculatorDTO));
        }else if(min == character) {
            System.out.println("Answer is : " + iCalculatorService.min(calculatorDTO));
        }else if(div == character) {
            System.out.println("Answer is : " + iCalculatorService.divide(calculatorDTO));
        }else if(multi == character) {
            System.out.println("Answer is : " + iCalculatorService.multi(calculatorDTO));
        }else if(log == character) {
            System.out.println("Answer is : " + iCalculatorService.log(calculatorDTO));
        }else if(sin == character) {
            System.out.println("Answer is : " + iCalculatorService.sin(calculatorDTO));
        }else if(cos == character) {
            System.out.println("Answer is : " + iCalculatorService.cos(calculatorDTO));
        }else if(tan == character) {
            System.out.println("Answer is : " + iCalculatorService.tan(calculatorDTO));
        }
	}
	
	public void actionConverterLength(int conType, ConverterLengthService converterLengthService) {
		//create converter Length DTO object and set values
				ConverterLengthDTO converterLengthDTO = new ConverterLengthDTO();
				if(conType == 1) {
					System.out.print("Enter distance in Kilometres : ");
					value = sc.nextDouble();
					converterLengthDTO.setType(1);
					converterLengthDTO.setLength(value);
					setLengthAction(converterLengthService, converterLengthDTO, conType);
				}else if(conType == 2) {
					System.out.print("Enter distance in Miles : ");
					value = sc.nextDouble();
					converterLengthDTO.setType(2);
					converterLengthDTO.setLength(value);
					setLengthAction(converterLengthService, converterLengthDTO, conType);
				}else if(conType == 3) {
					System.out.print("Enter distance in Feet : ");
					value = sc.nextDouble();
					converterLengthDTO.setType(3);
					converterLengthDTO.setLength(value);
					setLengthAction(converterLengthService, converterLengthDTO, conType);
				}else if(conType == 4) {
					System.out.print("Enter distance in Metres : ");
					value = sc.nextDouble();
					converterLengthDTO.setType(4);
					converterLengthDTO.setLength(value);
					setLengthAction(converterLengthService, converterLengthDTO, conType);
				}
	}
	
	public void actionConverterMass(int conType, IConverterMassService iConverterMassService) {
		//create converterMassDTO object and set values
				ConverterMassDTO converterMassDTO = new ConverterMassDTO();
				if(conType == 1) {
					System.out.print("Enter weight in Kilograms : ");
					value = sc.nextDouble();
					converterMassDTO.setType(1);
					converterMassDTO.setWeight(value);
					setMassAction(iConverterMassService, converterMassDTO, conType);
				}else if(conType == 2) {
					System.out.print("Enter weight in Pounds : ");
					value = sc.nextDouble();
					converterMassDTO.setType(2);
					converterMassDTO.setWeight(value);
					setMassAction(iConverterMassService, converterMassDTO, conType);
				}
	}
	
	public void actionConverterTemperature(int conType, ConverterTemperatureService converterTemperatureService) {
		//create converterTemperatureDTO object and set values
				ConverterTemperatureDTO converterTemperatureDTO = new ConverterTemperatureDTO();
				if(conType == 1) {
					System.out.print("Enter temperature in Celcius : ");
					value = sc.nextDouble();
					converterTemperatureDTO.setType(1);
					converterTemperatureDTO.setTemperature(value);
					setTemperatureAction(converterTemperatureService, converterTemperatureDTO, conType);
				}else if(conType == 2) {
					System.out.print("Enter temperature in Fahrenheight : ");
					value = sc.nextDouble();
					converterTemperatureDTO.setType(1);
					converterTemperatureDTO.setTemperature(value);
					setTemperatureAction(converterTemperatureService, converterTemperatureDTO, conType);
				}
	}
	
	public void actionConverterVolume() {
		
	}
	
	public void actionQuiz(int tool, QuizService quizService) {
		int mode=0;
        
        System.out.print("Enter Your Mode :  ");
        Scanner sc=new Scanner(System.in);
        try{
            mode=sc.nextInt();
        }catch(Exception e){
            e.printStackTrace();
        }
        Level l=null;
        
        switch(mode){
            case 1:
                l=new EasyLevel();
                break;
            case 2:
                l=new HardLevel();
                break;
        }
    System.out.println("\n");
    l.runLevel();
	}

	
	public void setLengthAction(ConverterLengthService converterLengthService, ConverterLengthDTO converterLengthDTO, int conType) {
		if(1 == conType) {
            System.out.println("Answer is : " + converterLengthService.KMToMiles(converterLengthDTO));
        }else if(2 == conType) {
            System.out.println("Answer is : " + converterLengthService.MilesToKM(converterLengthDTO));
        }else if(3 == conType) {
            System.out.println("Answer is : " + converterLengthService.FeetToMetres(converterLengthDTO));
        }else if(4 == conType) {
            System.out.println("Answer is : " + converterLengthService.MetresToFeet(converterLengthDTO));
        }
	}
	
	public void setMassAction(IConverterMassService converterMassService, ConverterMassDTO converterMassDTO, int conType) {
		if(1 == conType) {
            System.out.println("Answer is : " + converterMassService.KgToPounds(converterMassDTO));
        }else if(2 == conType) {
            System.out.println("Answer is : " + converterMassService.PoundsToKg(converterMassDTO));
        }
	}
	
	public void setTemperatureAction(ConverterTemperatureService converterTemperatureService, ConverterTemperatureDTO converterTemperatureDTO, int conType) {
		if(1 == conType) {
            System.out.println("Answer is : " + converterTemperatureService.CelciusToFahrenheit(converterTemperatureDTO));
        }else if(2 == conType) {
            System.out.println("Answer is : " + converterTemperatureService.FahrenheightToCelcius(converterTemperatureDTO));
        }
	}
}
