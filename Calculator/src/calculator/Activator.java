package calculator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class Activator implements BundleActivator {

	private static BundleContext context;
	 
	 
	   public void start(BundleContext bundleContext) throws Exception {
	       Activator.context = bundleContext;
	        
	       System.out.println("Calculator Started");
	        
	       this.registerSer();
	        
	      
	   }
	 
	   private void registerSer() {
	       CalculatorService service = new CalculatorImpl();
	       context.registerService(CalculatorService.class, service, null);
	   }
	 
	   public void stop(BundleContext bundleContext) throws Exception {
	       Activator.context = null;
	       System.out.println("Calculator Stoped");
	   }


}
