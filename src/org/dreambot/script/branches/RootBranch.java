package org.dreambot.script.branches;

import org.dreambot.api.Node;
import org.dreambot.api.NodeBranch;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.script.leafs.DoBankLeaf;

public class RootBranch extends NodeBranch {

    private final Node bankLeaf = new DoBankLeaf();
    private final Node bankBranch = new BankBranch();

    @Override
    public Node isTrue() {
        return bankLeaf;
    }

    @Override
    public Node isFalse() {
        return bankBranch;
    }

    @Override
    public boolean validate(MethodContext context) {
        return context.getBank().isOpen();
    }
}
