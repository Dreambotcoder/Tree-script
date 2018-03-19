package org.dreambot.script.leafs;

import org.dreambot.api.NodeLeaf;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.api.methods.MethodProvider;
import org.dreambot.api.wrappers.items.Item;

public class TeleportLeaf extends NodeLeaf {

    @Override
    public int onLoop(MethodContext context) {
        Item teleport = context.getInventory().get("Varrock teleport");
        if (teleport != null && teleport.interact("Break")) {
            MethodProvider.sleep(600);
        }
        return 100;
    }
}
