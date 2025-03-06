public class Main {
    public static void main(String[] args) {
        Player[] players = {
                new BaseLinePlayer("三野"),
                new NetPlayer("竹本")
        };
        NetPlayer[] netPlayer = new NetPlayer[players.length];
        int netPlayerMember = 0;
        for (int i = 0; i < players.length; i++){
            players[i].forehand();
            players[i].backhand();
            players[i].receive();
            players[i].serve();

            if( players[i] instanceof NetPlayer){
                netPlayer[netPlayerMember] = (NetPlayer) players[i];
                netPlayerMember++;
            }
        }

        allSmash(netPlayer);
    }

    public static void allSmash(NetPlayer[] netPlayers){
        for (int i = 0; i < netPlayers.length; i++) {
            if (netPlayers[i] == null) {
            } else {
                netPlayers[i].smash();
            }
        }
    }

}