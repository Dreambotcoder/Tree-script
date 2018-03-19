package org.dreambot.script.branches;

import org.dreambot.api.Node;
import org.dreambot.api.NodeBranch;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.script.leafs.TeleportLeaf;
import org.dreambot.script.leafs.WalkToBankLeaf;

public class TraversalBranch extends NodeBranch {

    @Override
    public Node isTrue() {
        return new TeleportLeaf();
    }

    @Override
    public Node isFalse() {
        return new WalkToBankLeaf();
    }

    @Override
    public boolean validate(MethodContext context) {
        return context.getInventory().contains("Varrock teleport");
    }
}
