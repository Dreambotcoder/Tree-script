package org.dreambot.script.branches;

import org.dreambot.api.Node;
import org.dreambot.api.NodeBranch;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.script.leafs.TeleportLeaf;
import org.dreambot.script.leafs.WalkToBankLeaf;

public class TraversalBranch extends NodeBranch {

    private final Node teleLeaf = new TeleportLeaf();
    private final Node bankLeaf = new WalkToBankLeaf();

    @Override
    public Node isTrue() {
        return teleLeaf;
    }

    @Override
    public Node isFalse() {
        return bankLeaf;
    }

    @Override
    public boolean validate(MethodContext context) {
        return context.getInventory().contains("Varrock teleport");
    }
}
