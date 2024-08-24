public class SuperGroceryStore extends GroceryStore implements CanShopOnline {
    
    private String website;
    private double monthly_online_income;

    public SuperGroceryStore(String name, double monthly_instore_income, String website, double monthly_online_income){
        super(name, true, monthly_instore_income);
        this.website = website;
        this.monthly_online_income = monthly_online_income;
    }

    public String getWebsite(){
        return website;
    }

    public double getMonthlyOnlineIncome(){
        return monthly_online_income;
    }

    public double afterTaxIncome(){
        return getMonthlyInstoreIncome() * (1-SALE_TAX_RATE) + monthly_online_income * (1-ONLINE_SALE_TAX_RATE);
    }

    public String toString(){
        return "name: " + getName() + "; is_Chain: true;" + " website: " + getWebsite();
     }

}
