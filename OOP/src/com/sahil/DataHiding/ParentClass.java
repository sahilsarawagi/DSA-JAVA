package com.sahil.DataHiding;

import java.util.Objects;

public class ParentClass {
    private int iAmPrivate;
    protected int iAmProtected;
    int noModifier;
    public int iAmPublic;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParentClass that = (ParentClass) o;
        return iAmPrivate == that.iAmPrivate && iAmProtected == that.iAmProtected && noModifier == that.noModifier && iAmPublic == that.iAmPublic;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
