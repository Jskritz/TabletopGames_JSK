package games.bountiestcg;

public class BTCGTypes {

    // Enums
    public enum CardType {
        Fighter,
        Trick,
        Stage,
        Equipment
    }

    public enum BoardArea{
        Stage,
        Fighter,
        Equipment
    }

    public enum Resource{
        Bounty,
        Blood,
        FadingBlood
        // TODO: add images
    }

    public enum GamePhase{
        StartTurn,
        Scramble,
        Brawl,
        EndTurn
    }
}
