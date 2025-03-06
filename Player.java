public abstract class Player {
    private String name;

    public Player(String name){
        this.name = name;
    }
     public abstract void forehand();
    public abstract void backhand();
    public void serve(){
        System.out.println(getName()+"がサーブを打った！");
    }
    public void receive(){
        System.out.println(getName()+"がレシーブをした！");
    }
    public String getName(){
        return this.name;

    }



}
