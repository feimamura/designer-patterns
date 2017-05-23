
public class ICCC implements Tax {

	@Override
	public double calculate(Budget budget) {
		
		double value =  budget.getValor();
		
		if (value < 1000.0) {
			return value * 0.05;
		}
		else if (value >= 1000.0 && value < 3000.0) {
			return value * 0.07;
		}
		else {
			return 30 + (value * 0.08);
		}
	}
	
	/*
	 * Crie o imposto que se chama ICCC,
	 *  que retorna 5% do valor total caso o orçamento seja menor do que R$ 1000,00 reais,
	 *   7% caso o valor esteja entre R$ 1000 e R$ 3000,00 com os limites inclusos,
	 *    ou 8% mais 30 reais, caso o valor esteja acima de R$ 3000,00.
	 * */

}
