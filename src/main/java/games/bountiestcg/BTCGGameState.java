package games.bountiestcg;

import core.AbstractGameState;
import core.AbstractGameStateWithTurnOrder;
import core.AbstractParameters;
import core.components.Component;
import core.components.Counter;
import core.components.Deck;
import core.turnorders.TurnOrder;
import games.GameType;
import games.bountiestcg.components.BTCGBoardSpace;
import games.bountiestcg.components.BTCGCard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BTCGGameState extends AbstractGameState {

    // Card Areas
    Deck<BTCGCard>[] decks;
    Deck<BTCGCard>[] hands;
    Deck<BTCGCard>[] discard;
    Deck<BTCGCard>[] graveyard;
    Deck<BTCGCard>[] stack;

    // Board Spaces
    HashSet<BTCGBoardSpace> stages;
    HashSet<BTCGBoardSpace>[] fighters;
    HashSet<BTCGBoardSpace>[] equipments;

    // Resources
    HashMap<BTCGTypes.Resource, Counter>[] bounties;
    HashMap<BTCGTypes.Resource, Counter>[] fadingBlood;
    HashMap<BTCGTypes.Resource, Counter>[] blood;

    // Game Variables
    BTCGTypes.GamePhase gamePhase;
    Counter turnNumber;




    /**
     * Constructor. Initialises some generic game state variables.
     *
     * @param gameParameters - game parameters.
     * @param nPlayers       - number of players in the game
     */
    public BTCGGameState(AbstractParameters gameParameters, int nPlayers) {
        super(gameParameters, nPlayers);
    }

    @Override
    protected GameType _getGameType() {
        return null;
    }

    @Override
    protected List<Component> _getAllComponents() {
        return List.of();
    }

    @Override
    protected AbstractGameState _copy(int playerId) {
        return null;
    }

    @Override
    protected double _getHeuristicScore(int playerId) {
        return 0;
    }

    @Override
    public double getGameScore(int playerId) {
        return 0;
    }

    @Override
    protected boolean _equals(Object o) {
        return false;
    }
}
