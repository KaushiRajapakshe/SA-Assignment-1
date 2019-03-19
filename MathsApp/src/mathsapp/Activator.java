package mathsapp;

import java.util.Scanner;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import calculator.CalculatorDTO;
import calculator.ICalculatorService;
import converterlength.ConverterLengthDTO;
import converterlength.ConverterLengthService;
import convertermass.ConverterMassDTO;
import convertermass.IConverterMassService;
import convertertemperature.ConverterTemperatureDTO;
import convertertemperature.ConverterTemperatureService;

public class Activator implements BundleActivator {
	
	ServiceReference<ICalculatorService> calculator;
	ServiceReference<IConverterMassService> mass;
	ServiceReference<ConverterTemperatureService> temperature;
	ServiceReference<ConverterLengthService> length;
	
	private static BundleContext context;
	private String type;
	private int tool;
	private int conTool;
	private int conType;
	private double no1;
	private double no2;
	private char character;
	private char plus = '+';
	private char min = '-';
	private char div = '/';
	private char multi = '*';
	private double value;

	Scanner sc =new Scanner(System.in);
	
	static BundleContext getContext() {
		
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start Maths App Front Controller.");
        
        System.out.println("Choose a Mathematic Tool: ");
        System.out.println("1) Calculator ");
        System.out.println("2) Converter");
        System.out.println("3) Random Maths Quiz Generator ");
        int tool=sc.nextInt();
        
        calculator = bundleContext.getServiceReference(ICalculatorService.class); 
        ICalculatorService iCalculatorService = (ICalculatorService) bundleContext.getService(calculator);
        
        mass = bundleContext.getServiceReference(IConverterMassService.class); 
        IConverterMassService iConverterMassService = (IConverterMassService) bundleContext.getService(mass);
        length = bundleContext.getServiceReference(ConverterLengthService.class); 
        ConverterLengthService converterLengthService = (ConverterLengthService) bundleContext.getService(length);
        temperature = bundleContext.getServiceReference(ConverterTemperatureService.class); 
        ConverterTemperatureService converterTemperatureService = (ConverterTemperatureService) bundleContext.getService(temperature);
        
        if(tool==1) {
        	System.out.println("------Calculator------");
        	char a = 0;
	        
	        while(a!='q') {
	        	
		        System.out.print("No 1: ");
		        no1 = sc.nextDouble();
		        System.out.print("Operator : ");
		        character=sc.next().charAt(0);
		        System.out.print("No 2: ");
		        no2=sc.nextDouble();
		        
		        CalculatorDTO calculatorDTO = new CalculatorDTO();
		        calculatorDTO.setNo1(no1);
		        calculatorDTO.setNo2(no2);
		        calculatorDTO.setCharacter(character);
		        if(plus == character) {
		            System.out.println("Answer is : " + iCalculatorService.sum(calculatorDTO));
		        }else if(min == character) {
		            System.out.println("Answer is : " + iCalculatorService.min(calculatorDTO));
		        }else if(div == character) {
		            System.out.println("Answer is : " + iCalculatorService.divide(calculatorDTO));
		        }else if(multi == character) {
		            System.out.println("Answer is : " + iCalculatorService.multi(calculatorDTO));
		        }
		        break;
	        }
        }else if(tool== 2) {
        	System.out.println("------Converter------");
        	System.out.println("Enter the number of Menu to display the Conversion ");
    		System.out.println("----------------------------------------------------");
    		System.out.println("1. Length Conversion ");
    		System.out.println("2. Mass Conversion ");
    		System.out.println("3. Temperature Conversion ");
    		System.out.println("----------------------------------------------------");
    		System.out.print("Select the Conversion menu number : ");
    		conTool = sc.nextInt();
    		if(1 == conTool) {
    			displayConversionLengthSubmenu(converterLengthService);
    		}else if(2 == conTool) {
    			displayConversionMassSubmenu(iConverterMassService);
    		}else if(3 == conTool) {
    			displayConversionTemperatureSubmenu(converterTemperatureService);
    		}
        }
        else if(tool== 3) {
        	System.out.println("------Random Maths Quiz Generator------");
//	        System.out.println(s2.quiz());
        	
	    }
	}

	public void displayConversionLengthSubmenu(ConverterLengthService converterLengthService) {
		System.out.println("Enter the number of Type to calculate the Conversion ");
		System.out.println("----------------------------------------------------");
		System.out.println("1. KM To Miles ");
		System.out.println("2. Miles To KM ");
		System.out.println("3. Feet To Metres ");
		System.out.println("4. Metres To Feet ");
		System.out.println("----------------------------------------------------");
		System.out.print("Select the Calculation Conversion number : ");
		conType = sc.nextInt();
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
	public void displayConversionMassSubmenu(IConverterMassService iConverterMassService) {
		System.out.println("Enter the number of Type to calculate the Conversion ");
		System.out.println("----------------------------------------------------");
		System.out.println("1. Kg To Pounds ");
		System.out.println("2. Pounds To Kg ");
		System.out.println("----------------------------------------------------");
		System.out.print("Select the Calculation Conversion number : ");
		conType = sc.nextInt();
		
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
	public void displayConversionTemperatureSubmenu(ConverterTemperatureService converterTemperatureService) {
		System.out.println("Enter the number of Type to calculate the Conversion ");
		System.out.println("----------------------------------------------------");
		System.out.println("1. Celcius To Fahrenheit ");
		System.out.println("2. Fahrenheight To Celcius ");
		System.out.println("----------------------------------------------------");
		System.out.print("Select the Calculation Conversion number : ");
		conType = sc.nextInt();
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
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Good Bye !!!");
		//bundleContext.ungetService(calculator);
	}

}
