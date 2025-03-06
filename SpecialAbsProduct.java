package store;

public class SpecialAbsProduct extends AbsProduct implements Deliverable {
    private int orgPrice;

    public SpecialAbsProduct(String name, int price, int orgPrice){
        super(name, price);
        this.orgPrice = orgPrice;
    }

    @Override
    public void displayDeliv(){
        System.out.println("[*特別送料300円*]"+getNameAndPrice());
    }
    @Override
    public void display(){

        System.out.println(getNameAndPrice()+"(定価："+this.orgPrice+"円)");
    }
}
