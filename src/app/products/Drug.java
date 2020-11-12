package app.products;

public class Drug implements GeneralProduct{
    private String type,expirationDate;
    private double weight;
    private int index;

    public Drug(int index,String type,double weight, String expirationDate){
        this.index=index;
        this.type=type;
        this.weight=weight;
        this.expirationDate=expirationDate;
    }

    public String getProductInfo() {
        return null;
    }

    public String getName(){
        return DrugNames.values()[index].toString();
    }
    }
