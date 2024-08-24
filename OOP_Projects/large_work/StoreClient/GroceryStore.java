public class GroceryStore extends Store {

    private boolean is_chain;
    private double monthly_instore_income;
    
    public GroceryStore(String name, boolean is_chain, double monthly_instore_income){
        super(name);
        this.is_chain = is_chain;   
        this.monthly_instore_income = monthly_instore_income;
    }


    public boolean getIsChain(){
        return is_chain;
    }

    public double getMonthlyInstoreIncome(){
        return monthly_instore_income;
    }

    public double afterTaxIncome(){
        return monthly_instore_income*(1-SALE_TAX_RATE);
    }

    public String toString(){
        return "name: " + getName() + "; is_Chain: " + getIsChain();
    }


}
