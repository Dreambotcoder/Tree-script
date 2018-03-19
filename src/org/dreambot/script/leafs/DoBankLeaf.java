package org.dreambot.script.leafs;

import org.dreambot.api.Node;
import org.dreambot.api.NodeLeaf;
import org.dreambot.api.methods.MethodContext;

public class DoBankLeaf extends NodeLeaf {

    @Override
    public int onLoop(MethodContext context) {
        if (context.getBank().depositAllItems()) {
            return 600;
        }
        return 100;
    }


}
