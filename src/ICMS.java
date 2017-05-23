
public class ICMS implements Tax {

	@Override
	public double calculate(Budget budget) {
		return budget.getValor() * 0.1;
	}
	
}
