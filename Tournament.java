package AP01;

import java.util.List;

public class Tournament {
    private Player[] slots;
    private List<String> waitingList;

    public Tournament() {
        slots = new Player[100];
    }

    public Player requestSlot(String playerName) {
        for (int i = 0; i < slots.length; i++) {
            if(slots[i] == null)
            {
                Player p = new Player(playerName, i);
                slots[i] = p;
                return p;
            }
        }
        waitingList.add(playerName);
        return  null;
    }
    public Player cancelAndReassignSlot(Player p)
    {
        int i = p.getPlayerNumber();
        if(waitingList.size() != 0)
        {
            slots[i] = new Player(waitingList.get(0), i);
            waitingList.remove(0);

        }
        else
        {
            slots[i] = null;
        }
        return slots[i];
    }

}
