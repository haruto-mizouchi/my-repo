public class BaseLinePlayer extends Player{
    @Override
    public void forehand() {
        System.out.println(getName()+"がフォアを打った！");
    }

    @Override
    public void backhand() {
        System.out.println(getName()+"がバックを打った！");
    }
    public void topShoot(){
        System.out.println(getName()+"がトップ打ちをした！");
    }


    public BaseLinePlayer(String name){
        super(name);
    }
}
