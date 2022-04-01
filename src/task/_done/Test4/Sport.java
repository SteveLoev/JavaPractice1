package task._done.Test4;

public class Sport {
    String name;
    int numOfPlayers;
    boolean teamBased;

    public void makeSport(String name, int players, boolean teams){
        name = name;
        numOfPlayers = players;
        teamBased = teams;
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numOfPlayers=" + numOfPlayers +
                ", teamBased=" + teamBased +
                '}';
    }

    public static void main(String[] args) {
        Sport soccer = new Sport();
        soccer.makeSport("Soccer",22,true);
        System.out.println(soccer);
    }
}
