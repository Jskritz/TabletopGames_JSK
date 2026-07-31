package games.bountiestcg;

import core.AbstractGameState;
import core.StandardForwardModel;
import core.actions.AbstractAction;

import java.util.List;

public class BTCGForwardModel extends StandardForwardModel {
    @Override
    protected void _afterAction(AbstractGameState currentState, AbstractAction actionTaken) {

    }

    @Override
    protected void _setup(AbstractGameState firstState) {

    }

    @Override
    protected List<AbstractAction> _computeAvailableActions(AbstractGameState gameState) {
        return List.of();
    }
}
