
public class TestTax {
	
	public static void main(String[] args) {
		
		Tax ICMS = new ICMS();
		Tax ISS = new ISS();
		Tax ICCC = new ICCC();
		
		Budget budget = new Budget(100.0);
		
		TaxCalcultor calcultor = new TaxCalcultor();
		
		calcultor.performCalculation(budget, ICMS);
		calcultor.performCalculation(budget, ISS);
		
		calcultor.performCalculation(new Budget(999.0), ICCC);
		calcultor.performCalculation(new Budget(1000.0), ICCC);
		calcultor.performCalculation(new Budget(2999.0), ICCC);
		calcultor.performCalculation(new Budget(3000.0), ICCC);
		calcultor.performCalculation(new Budget(3001.0), ICCC);
		
	}
}
