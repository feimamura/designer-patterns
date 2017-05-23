
public class TestTax {
	
	public static void main(String[] args) {
		
		Tax ICMS = new ICMS();
		Tax ISS = new ISS();
		
		Budget budget = new Budget(100.0);
		
		TaxCalcultor calcultor = new TaxCalcultor();
		
		calcultor.performCalculation(budget, ICMS);
		calcultor.performCalculation(budget, ISS);
		
	}

}
