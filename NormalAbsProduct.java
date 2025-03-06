package store;

public class NormalAbsProduct extends AbsProduct implements Deliverable {
    public NormalAbsProduct(String name, int price){
        super(name, price);
    }

    @Override
    public void displayDeliv(){
        System.out.println("[通常送料500円]"+getNameAndPrice());

    }
    @Override
    public void display(){
        System.out.println(getNameAndPrice());
    }
}
