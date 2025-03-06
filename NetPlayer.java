public class NetPlayer extends Player{
    @Override
    public void backhand() {
        System.out.println(getName()+"がバックを打った！");
    }

    @Override
    public void forehand() {
        System.out.println(getName()+"がフォアを打った！");

    }
    public void smash(){
        System.out.println(getName()+"がスマッシュを打った！");
    }
    public void bore(){
        System.out.println(getName()+"がボレーを打った！");
    }


    public NetPlayer(String name){
        super(name);
    }
}
