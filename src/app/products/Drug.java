package app.products;

public class Drug implements GeneralProduct{
    private int index;

    public Drug(int index){
        this.index=index;
    }

    public String getProductInfo() {
        return DrugEnums.values()[index].toString();
    }

    public int getIndex(){
        return index;
    }
    }
