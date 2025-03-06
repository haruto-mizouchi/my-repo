package store;

public abstract class AbsProduct {
    private String name;
    private int price;
    private final String companyName = "速水PC販売店";
    private final int defaultChangeAMT = 1000;


    public AbsProduct(String name, int price){
        this.name = name;
        this.price = price;
    }

    public AbsProduct(String name){
        this(name,0);
    }

    public void displayStoreName(){
        System.out.println("■店舗名"+this.companyName);
    }

    public int up (int amt){
            return this.price+=amt;
    }



    public int down (int amt){
        return this.price-=amt;
    }



    public abstract void display();

    public int getPrice() {
        return price;
    }



    public String getNameAndPrice() {
        return "["+name+"]:["+price+"]円";
    }


}
