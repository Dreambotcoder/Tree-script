package org.dreambot.api;

import org.dreambot.api.script.AbstractScript;

public abstract class TreeScript extends AbstractScript {

    /*
     * Our starting root branch
     */
    public abstract NodeBranch getRootBranch();


    @Override
    public int onLoop() {
        return getRootBranch().onLoop(this);
    }
}
