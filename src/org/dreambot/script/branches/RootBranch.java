package org.dreambot.script.branches;

import org.dreambot.api.Node;
import org.dreambot.api.NodeBranch;
import org.dreambot.api.methods.MethodContext;
import org.dreambot.script.leafs.DoBankLeaf;

public class RootBranch extends NodeBranch {

    @Override
    public Node isTrue() {
        return new DoBankLeaf();
    }

    @Override
    public Node isFalse() {
        return new BankBranch();
    }

    @Override
    public boolean validate(MethodContext context) {
        return context.getBank().isOpen();
    }
}
