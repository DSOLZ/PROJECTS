import java.text.DecimalFormat;

public abstract class Store {

	public final double SALE_TAX_RATE = 0.0625;
	public final DecimalFormat MONEY = new DecimalFormat("$#,##0.00");
	private String name;

	public Store(String newName) {
		setName(newName);
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}
	
	public abstract double afterTaxIncome();
	public abstract String toString();

}