public class MusicStore extends Store implements CanShopOnline{
    
    private String website;
    private int monthly_downloads;
    private double average_price;

    public MusicStore(String name, int monthly_downloads, double average_price, String website) { 
        super(name);
        this.monthly_downloads = monthly_downloads;
        this.average_price = average_price;
        this.website = website;
    }

    public int getMonthlyDownloads(){
        return monthly_downloads;
    }

    public double  getAveragePrice() {
        return average_price;
    }

    public String getWebsite() {
        return website;
    }

    public double getMonthlyOnlineIncome(){
        return monthly_downloads * average_price;
    }

    public double afterTaxIncome(){
        return getMonthlyOnlineIncome() * (1 - ONLINE_SALE_TAX_RATE);
    }

    public String toString(){
        return "name: " + getName() + "; website: " + getWebsite();
    }

}
