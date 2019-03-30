package mathsapp;

import java.text.DecimalFormat;
import java.util.Scanner;

import calculator.CalculatorDTO;
import calculator.CalculatorService;
import converterlength.ConverterLengthDTO;
import converterlength.ConverterLengthService;
import convertermass.ConverterMassDTO;
import convertermass.IConverterMassService;
import convertertemperature.ConverterTemperatureDTO;
import convertertemperature.ConverterTemperatureService;
import convertervolume.ConvertVolumeDTO;
import convertervolume.ConvertVolumeService;
import maths_quiz.EasyLevel;
import maths_quiz.HardLevel;
import maths_quiz.Level;
import maths_quiz.QuizService;


public class FrontController {
	
	private double value;
	private String a;
	DecimalFormat df = new DecimalFormat("####.####");
	
	Scanner sc = new Scanner(System.in);
	public void actionCalculator(CalculatorService iCalculatorService) {
	        
	        while(a!="quit") {
	        	 
		        
		        CalculatorDTO calculatorDTO = new CalculatorDTO();
		        System.out.println("-----------------------------------------------------");
		        System.out.println(" 	+  , -  , /  , *  , log , sin , tan , cos , quit");
		        System.out.println("-----------------------------------------------------");
		        System.out.print("Operator : ");
				a=sc.next();
				if(a.equalsIgnoreCase("quit")) {
					System.out.println("Caculator Closed");
					Activator activator = new Activator();
					activator.showStart();
				}
				else if(a.equals("log")) {
					System.out.print("Number: ");
			        double no1=sc.nextDouble();
					calculatorDTO.setNo1(no1);
					calculatorDTO.setCharacter("log");
			        System.out.println("Answer = " + df.format(iCalculatorService.log(calculatorDTO)));
			        
				}else if(a.equals("cos")) {
					System.out.print("Number: ");
			        double no1=sc.nextDouble();
					calculatorDTO.setNo1(no1);
					calculatorDTO.setCharacter("cos");
			        System.out.println("Answer = " + df.format(iCalculatorService.cos(calculatorDTO)));
			        
				}else if(a.equals("sin")) {
					System.out.print("Number: ");
			        double no1=sc.nextDouble();
					calculatorDTO.setNo1(no1);
					calculatorDTO.setCharacter("sin");
			        System.out.println("Answer = " + df.format(iCalculatorService.sin(calculatorDTO)));
			        
				}else if(a.equals("tan")) {
					System.out.print("Number: ");
			        double no1=sc.nextDouble();
					calculatorDTO.setNo1(no1);
					calculatorDTO.setCharacter("tan");
			        System.out.println("Answer = " + df.format(iCalculatorService.tan(calculatorDTO)));
				}else{
			        System.out.print("No 1: ");
			        double no1 = sc.nextDouble();
			        System.out.print("No 2: ");
			        double no2=sc.nextDouble();
			       
			        calculatorDTO.setNo1(no1);
			        calculatorDTO.setNo2(no2);
			        calculatorDTO.setCharacter(a);
			        if(a.equals("+")) {
			            System.out.println("Answer is : " + df.format(iCalculatorService.add(calculatorDTO)));
			        }else if(a.equals("-")) {
			            System.out.println("Answer is : " + df.format(iCalculatorService.min(calculatorDTO)));
			        }else if(a.equals("/")) {
			            System.out.println("Answer is : " + df.format(iCalculatorService.divide(calculatorDTO)));
			        }else if(a.equals("*")) {
			            System.out.println("Answer is : " + df.format(iCalculatorService.multi(calculatorDTO)));
			        }
				}
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
				}else if(conType == 0) {
					Activator activator = new Activator();
					activator.showStart();
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
				}else if(conType == 0) {
					Activator activator = new Activator();
					activator.showStart();
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
					converterTemperatureDTO.setType(2);
					converterTemperatureDTO.setTemperature(value);
					setTemperatureAction(converterTemperatureService, converterTemperatureDTO, conType);
				}else if(conType == 0) {
					Activator activator = new Activator();
					activator.showStart();
				}
	}
	
	public void actionConverterVolume(int conType, ConvertVolumeService convertVolumeService) {
		ConvertVolumeDTO convertVolumeDTO = new ConvertVolumeDTO();
		if(conType == 1) {
			System.out.print("Enter volume in Liters : ");
			value = sc.nextDouble();
			convertVolumeDTO.setConTo(1);
			convertVolumeDTO.setValueV(value);
			setVolumeAction(convertVolumeService, convertVolumeDTO, conType);
		}else if(conType == 2) {
			System.out.print("Enter volume in Mili Liters : ");
			value = sc.nextDouble();
			convertVolumeDTO.setConTo(2);
			convertVolumeDTO.setValueV(value);
			setVolumeAction(convertVolumeService, convertVolumeDTO, conType);
		}else if(conType == 3) {
			System.out.print("Enter volume in Liters : ");
			value = sc.nextDouble();
			convertVolumeDTO.setConTo(3);
			convertVolumeDTO.setValueV(value);
			setVolumeAction(convertVolumeService, convertVolumeDTO, conType);
		}else if(conType == 4) {
			System.out.print("Enter volume in Galoon : ");
			value = sc.nextDouble();
			convertVolumeDTO.setConTo(4);
			convertVolumeDTO.setValueV(value);
			setVolumeAction(convertVolumeService, convertVolumeDTO, conType);
		}else if(conType == 0) {
			Activator activator = new Activator();
			activator.showStart();
		}
	}
	
	public void actionQuiz(int tool, QuizService quizService) {
        
        Level l=null;
        
        switch(tool){
            case 1:
                l=new EasyLevel();
                break;
            case 2:
                l=new HardLevel();
                break;
            case 0:
            	Activator activator = new Activator();
    			activator.showStart();
    			break;
        }
    System.out.println("\n");
    l.runLevel();
	}

	
	public void setLengthAction(ConverterLengthService converterLengthService, ConverterLengthDTO converterLengthDTO, int conType) {
		if(1 == conType) {
            System.out.println("Answer is : " + df.format(converterLengthService.KMToMiles(converterLengthDTO)));
        }else if(2 == conType) {
            System.out.println("Answer is : " + df.format(converterLengthService.MilesToKM(converterLengthDTO)));
        }else if(3 == conType) {
            System.out.println("Answer is : " + df.format(converterLengthService.FeetToMetres(converterLengthDTO)));
        }else if(4 == conType) {
            System.out.println("Answer is : " + df.format(converterLengthService.MetresToFeet(converterLengthDTO)));
        }else if(conType == 0) {
        	actionConverterLength(1,converterLengthService);
        }
		Activator activator = new Activator();
		activator.showStart();
	}
	
	public void setMassAction(IConverterMassService converterMassService, ConverterMassDTO converterMassDTO, int conType) {
		if(1 == conType) {
            System.out.println("Answer is : " + df.format(converterMassService.KgToPounds(converterMassDTO)));
        }else if(2 == conType) {
            System.out.println("Answer is : " + df.format(converterMassService.PoundsToKg(converterMassDTO)));
        }else if(conType == 0) {
        	actionConverterMass(2,converterMassService);
        }
		Activator activator = new Activator();
		activator.showStart();
	}
	
	public void setTemperatureAction(ConverterTemperatureService converterTemperatureService, ConverterTemperatureDTO converterTemperatureDTO, int conType) {
		if(1 == conType) {
            System.out.println("Answer is : " + df.format(converterTemperatureService.CelciusToFahrenheit(converterTemperatureDTO)));
        }else if(2 == conType) {
            System.out.println("Answer is : " + df.format(converterTemperatureService.FahrenheightToCelcius(converterTemperatureDTO)));
        }else if(conType == 0) {
        	actionConverterTemperature(3,converterTemperatureService);
        }
		Activator activator = new Activator();
		activator.showStart();
	}
	public void setVolumeAction(ConvertVolumeService convertVolumeService, ConvertVolumeDTO convertVolumeDTO, int conType) {
		if(1 == conType) {
            System.out.println("Answer is : " + df.format(convertVolumeService.LiterToMeliLiter(convertVolumeDTO)));
        }else if(2 == conType) {
            System.out.println("Answer is : " + df.format(convertVolumeService.MiliLiterToLiter(convertVolumeDTO)));
        }else if(3 == conType) {
            System.out.println("Answer is : " + df.format(convertVolumeService.LiterToGaloon(convertVolumeDTO)));
        }else if(4 == conType) {
            System.out.println("Answer is : " + df.format(convertVolumeService.GaloonToLiter(convertVolumeDTO)));
        }else if(conType == 0) {
        	actionConverterVolume(4,convertVolumeService);
        }
		Activator activator = new Activator();
		activator.showStart();
	}
}
