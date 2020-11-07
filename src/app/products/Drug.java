package app.products;

public class Drug implements GeneralProduct{
    private String name,type,expirationDate;
    private double weight;

    public Drug(String name,String type,double weight, String expirationDate){
        this.name=name;
        this.type=type;
        this.weight=weight;
        this.expirationDate=expirationDate;
    }

    public String getProductInfo() {
        return null;
    }
}
