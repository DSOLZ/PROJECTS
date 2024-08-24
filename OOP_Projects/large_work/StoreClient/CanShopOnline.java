
public interface CanShopOnline extends HasWebsite{
	
	public final double ONLINE_SALE_TAX_RATE = 0.05;
	
	public abstract double getMonthlyOnlineIncome();
}