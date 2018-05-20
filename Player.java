package AP01;

public class Player {
    private String name;
    private int playerNumber;
    public Player(String name, int playerNumber)
    {
        this.name = name;
        this.playerNumber = playerNumber;
    }
    public int getPlayerNumber()
    {
        return playerNumber;
    }
}
