package app.products;

public enum DrugEnums {
    PARALEN("80g","Painkillers"),
    IBUPROFEN("200g","Painkillers"),
    IBALGIN("100g","Painkillers");

    private String  weight;
    private String type;

    DrugEnums(String weight,String type){
        this.weight=weight;
        this.type=type;
    }

    public static void getInfo(int index){
        DrugEnums drugs[] = DrugEnums.values();
        System.out.println("Name : "+drugs[index]+",  Weight:  "+drugs[index].weight + ",Type: "+drugs[index].type+"\n");
    }

    public static String getName(int index){
        return DrugEnums.values()[index].toString();
    }
}

