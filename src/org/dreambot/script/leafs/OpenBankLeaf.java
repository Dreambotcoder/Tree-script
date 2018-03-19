package org.dreambot.script.leafs;

import org.dreambot.api.NodeLeaf;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.MethodProvider;

public class OpenBankLeaf extends NodeLeaf {

    @Override
    public int onLoop(MethodContext context) {
        if (context.getBank().open()) {
            MethodProvider.sleepUntil(() -> context.getBank().isOpen(), 2000);
        }
        return 100;
    }
}
