package store;

public class LimitedAbsProduct extends AbsProduct {
    private int dayCnt;

    public LimitedAbsProduct(String name, int price, int dayCnt){
        super(name,price);
    }
    public int minusDayCnt(int minus){
        return dayCnt-minus;
    }
    @Override
    public void display(){
        System.out.println(getNameAndPrice()+"（配送不可）（残り：["+dayCnt+"]日）");
    }

}
