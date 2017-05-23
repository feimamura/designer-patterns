
public class ISS implements Tax {

	@Override
	public double calculate(Budget budget) {
		return budget.getValor() * 0.350;
	}

}
