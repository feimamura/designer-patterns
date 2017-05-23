
public class TaxCalcultor {
	
	public void performCalculation(Budget budget, Tax tax) {
		double value = tax.calculate(budget);
		System.out.println(value);
	}

}
