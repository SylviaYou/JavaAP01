package AP01;

import java.util.List;

public class Tournament {
    private Player[] slots;
    private List<String> waitingList;
    public Player requestSlot(String playerName)
    {
        return  null;
    }
    public Player cancelAndReassignSlot(Player p)
    {
        int i = p.getPlayerNumber();
        return slots[i];
    }
}
