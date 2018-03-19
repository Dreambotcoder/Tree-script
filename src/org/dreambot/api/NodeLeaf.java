package org.dreambot.api;

import org.dreambot.api.methods.MethodContext;

public abstract class NodeLeaf extends Node {

    @Override
    public boolean validate(MethodContext context) {
        return true;
    }
}
