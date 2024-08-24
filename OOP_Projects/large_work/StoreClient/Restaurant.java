public class Restaurant extends Store implements HasWebsite {

    private String website;
    private int monthly_guests;
    private double average_price;

    public Restaurant(String name, int monthly_guests, double average_price, String website){
        super(name);
        this.monthly_guests = monthly_guests;
        this.average_price = average_price;
        this.website = website;
    }

    public int getMonthlyGuest(){
        return monthly_guests;
    }

    public double getAveragePrice(){
        return  average_price;
    }

    public String getWebsite(){
        return website;
    }
    
    public double afterTaxIncome(){
        return monthly_guests * average_price *(1-SALE_TAX_RATE);
    }

    public String toString(){
        return "name: " + getName() + "; website: " + getWebsite();
    }

}
