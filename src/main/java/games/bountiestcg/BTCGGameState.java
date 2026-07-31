package games.bountiestcg;

import core.AbstractGameStateWithTurnOrder;
import core.AbstractParameters;
import core.components.Component;
import core.turnorders.TurnOrder;
import games.GameType;

import java.util.List;

public class BTCGGameState extends AbstractGameStateWithTurnOrder {
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
    protected TurnOrder _createTurnOrder(int nPlayers) {
        return null;
    }

    @Override
    protected AbstractGameStateWithTurnOrder __copy(int playerId) {
        return null;
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
