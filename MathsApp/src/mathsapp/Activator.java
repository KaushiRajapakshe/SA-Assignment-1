package mathsapp;

import java.util.Scanner;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import calculator.CalculatorService;
import converterlength.ConverterLengthService;
import convertermass.IConverterMassService;
import convertertemperature.ConverterTemperatureService;
import convertervolume.ConvertVolumeService;
import maths_quiz.QuizService;

public class Activator implements BundleActivator {
	
	ServiceReference<CalculatorService> calculator;
	ServiceReference<IConverterMassService> mass;
	ServiceReference<ConverterTemperatureService> temperature;
	ServiceReference<ConverterLengthService> length;
	ServiceReference<ConvertVolumeService> volume;
	ServiceReference<QuizService> quiz;
	
	private static BundleContext context;
	private int tool;
	private int conTool;
	private int conType;
	BundleContext bundleContext;

	Scanner sc =new Scanner(System.in);
	


	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
        
        this.bundleContext = bundleContext;
        showStart();
	}
	
	public void showStart() {
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
        volume = bundleContext.getServiceReference(ConvertVolumeService.class); 
        ConvertVolumeService convertVolumeService = (ConvertVolumeService) bundleContext.getService(volume);
        quiz = bundleContext.getServiceReference(QuizService.class); 
        QuizService quizService = (QuizService) bundleContext.getService(quiz);
        
        if(tool==1) {
        	System.out.println("------Calculator------");
        
		    FrontController frontController = new FrontController();
		    frontController.actionCalculator(iCalculatorService);
	        
        }else if(tool== 2) {
        	System.out.println("------Converter------");
        	conTool = showConverter();
        	if(1 == conTool) {
    			displayConversionLengthSubmenu(converterLengthService);
    		}else if(2 == conTool) {
    			displayConversionMassSubmenu(iConverterMassService);
    		}else if(3 == conTool) {
    			displayConversionTemperatureSubmenu(converterTemperatureService);
    		}else if(4 == conTool) {
    			displayConversionVoumeSubmenu(convertVolumeService);
    		}else if(0 == conType) {
    			showStart();
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
            System.out.print("Enter Your Mode :  ");
        	tool = sc.nextInt();
        	FrontController frontController = new FrontController();
	        frontController.actionQuiz(tool, quizService);
        	// ToDo : implement the actionQuiz 
	    }
        bundleContext.ungetService(calculator);
		bundleContext.ungetService(length);
		bundleContext.ungetService(mass);
		bundleContext.ungetService(temperature);
		bundleContext.ungetService(volume);
		bundleContext.ungetService(quiz);
		
	}
	
	public int showConverter() {
		System.out.println("Enter the number of Menu to display the Conversion ");
		System.out.println("----------------------------------------------------");
		System.out.println("1. Length Conversion ");
		System.out.println("2. Mass Conversion ");
		System.out.println("3. Temperature Conversion ");
		System.out.println("4. Volume Conversion ");
		System.out.println("0. Exit ");
		System.out.println("----------------------------------------------------");
		System.out.print("Select the Conversion menu number : ");
		conTool = sc.nextInt();
		return conTool;
	}

	public void displayConversionLengthSubmenu(ConverterLengthService converterLengthService) {
		System.out.println("Enter the number of Type to calculate the Conversion ");
		System.out.println("----------------------------------------------------");
		System.out.println("1. KM To Miles ");
		System.out.println("2. Miles To KM ");
		System.out.println("3. Feet To Metres ");
		System.out.println("4. Metres To Feet ");
		System.out.println("0. Exit ");
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
		System.out.println("0. Exit ");
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
		System.out.println("0. Exit ");
		System.out.println("----------------------------------------------------");
		System.out.print("Select the Calculation Conversion number : ");
		conType = sc.nextInt();
		FrontController frontController = new FrontController();
        frontController.actionConverterTemperature(conType, converterTemperatureService);
	}
	public void displayConversionVoumeSubmenu(ConvertVolumeService convertVolumeService) {
		System.out.println("Enter the number of Type to calculate the Conversion ");
		System.out.println("----------------------------------------------------");
		System.out.println("1. Liter To Meli Liter ");
		System.out.println("2. Mili Liter To Liter ");
		System.out.println("3. Liter To Galoon ");
		System.out.println("4. Galoon To Liter ");
		System.out.println("0. Exit ");
		System.out.println("----------------------------------------------------");
		System.out.print("Select the Calculation Conversion number : ");
		conType = sc.nextInt();
		FrontController frontController = new FrontController();
        frontController.actionConverterVolume(conType, convertVolumeService);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Good Bye !!!");
		bundleContext.ungetService(calculator);
		bundleContext.ungetService(length);
		bundleContext.ungetService(mass);
		bundleContext.ungetService(temperature);
		bundleContext.ungetService(volume);
		bundleContext.ungetService(quiz);
	}

}
