package mathsapp;

import java.util.Scanner;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import calculator.CalculatorService;
import converterlength.ConverterLengthService;
import convertermass.IConverterMassService;
import convertertemperature.ConverterTemperatureService;
import maths_quiz.QuizService;

public class Activator implements BundleActivator {
	
	ServiceReference<CalculatorService> calculator;
	ServiceReference<IConverterMassService> mass;
	ServiceReference<ConverterTemperatureService> temperature;
	ServiceReference<ConverterLengthService> length;
	ServiceReference<QuizService> quiz;
	
	private static BundleContext context;
	private int tool;
	private int conTool;
	private int conType;
	private double no1;
	private double no2;
	private String character;

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
        tool=sc.nextInt();
        
        calculator = bundleContext.getServiceReference(CalculatorService.class); 
        CalculatorService iCalculatorService = (CalculatorService) bundleContext.getService(calculator);
        mass = bundleContext.getServiceReference(IConverterMassService.class); 
        IConverterMassService iConverterMassService = (IConverterMassService) bundleContext.getService(mass);
        length = bundleContext.getServiceReference(ConverterLengthService.class); 
        ConverterLengthService converterLengthService = (ConverterLengthService) bundleContext.getService(length);
        temperature = bundleContext.getServiceReference(ConverterTemperatureService.class); 
        ConverterTemperatureService converterTemperatureService = (ConverterTemperatureService) bundleContext.getService(temperature);
        quiz = bundleContext.getServiceReference(QuizService.class); 
        QuizService quizService = (QuizService) bundleContext.getService(quiz);
        if(tool==1) {
        	System.out.println("------Calculator------");
        	char a = 0;
	        
	        while(a!='q') {
	        	
		        System.out.print("No 1: ");
		        no1 = sc.nextDouble();
		        System.out.print("Operator : ");
		        character=sc.nextLine(); //charAt(0);
		        System.out.print("No 2: ");
		        no2=sc.nextDouble();
		        
		        FrontController frontController = new FrontController();
		        frontController.actionCalculator(no1,no2,character,iCalculatorService);
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
        	System.out.println("\t -----------------------------------------------");
            System.out.println("\t|\t\t\t\t\t\t|");
            System.out.println("\t|\t\tWelcome Maths Quiz\t\t|");
            System.out.println("\t|\t\t\t\t\t\t|");
            System.out.println("\t|\t\t  Easy mode : 1\t\t\t|");
            System.out.println("\t|\t\t  Hard mode : 2\t\t\t|");
            System.out.println("\t|\t\t\t\t\t\t|");
            System.out.println("\t -----------------------------------------------\n");
        	tool = sc.nextInt();
        	FrontController frontController = new FrontController();
	        frontController.actionQuiz(tool, quizService);
        	// ToDo : implement the actionQuiz 
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
		FrontController frontController = new FrontController();
        frontController.actionConverterLength(conType,converterLengthService);
	}
	public void displayConversionMassSubmenu(IConverterMassService iConverterMassService) {
		System.out.println("Enter the number of Type to calculate the Conversion ");
		System.out.println("----------------------------------------------------");
		System.out.println("1. Kg To Pounds ");
		System.out.println("2. Pounds To Kg ");
		System.out.println("----------------------------------------------------");
		System.out.print("Select the Calculation Conversion number : ");
		conType = sc.nextInt();
		FrontController frontController = new FrontController();
        frontController.actionConverterMass(conType, iConverterMassService);
	}
	public void displayConversionTemperatureSubmenu(ConverterTemperatureService converterTemperatureService) {
		System.out.println("Enter the number of Type to calculate the Conversion ");
		System.out.println("----------------------------------------------------");
		System.out.println("1. Celcius To Fahrenheit ");
		System.out.println("2. Fahrenheight To Celcius ");
		System.out.println("----------------------------------------------------");
		System.out.print("Select the Calculation Conversion number : ");
		conType = sc.nextInt();
		FrontController frontController = new FrontController();
        frontController.actionConverterTemperature(conType, converterTemperatureService);
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
