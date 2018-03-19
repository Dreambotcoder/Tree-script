package org.dreambot.script.leafs;

import org.dreambot.api.NodeLeaf;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.MethodProvider;
import org.dreambot.api.methods.map.Tile;
import org.dreambot.api.methods.walking.web.node.impl.bank.WebBankArea;

public class WalkToBankLeaf extends NodeLeaf {

    @Override
    public int onLoop(MethodContext context) {
        WebBankArea bank = WebBankArea.GRAND_EXCHANGE;
        if (context.getWalking().walk(bank.getArea().getRandomTile())) {
            MethodProvider.sleep(600);
            Tile dest = context.getClient().getDestination();
            if (dest != null) {
                MethodProvider.sleepUntil(
                        () -> {
                            MethodProvider.sleep(600);
                            return dest.distance() < 6 || context.getLocalPlayer().isStandingStill() || !context.getLocalPlayer().isMoving();
                        },
                        ((long)dest.distance() * (context.getWalking().isRunEnabled() ? 600 : 1200)));
            }
        }
        return 100;
    }
}
